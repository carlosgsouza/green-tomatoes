
package green.tomatoes

import grails.test.mixin.TestFor
import green.tomatoes.rotten.RottenTomatoesService;
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MoviesService)
class MoviesServiceSpec extends Specification {
	
	def setup() {
		service.rottenTomatoesService = Mock(RottenTomatoesService)
	}

    def "should return the movies in the box office"() {
		when:
		def result = service.getBoxOffice()
		
		then:
		1 * service.rottenTomatoesService.getBoxOfficeTitles() >> [
			movies : [
				[title:"Ant-Man", synopsis:"A movie about a tiny guy", posters:[thumbnail:"ant-man.png"], another:"field"],
				[title:"Pixels", synopsis:null, posters:[]],
				[title:"Minions"],
				[title:"Trainwreck", synopsis:"A movie about a train built without proper tests", posters:[thumbnail:"thumbnail.png", profile:"profile.png"]],
				[title:"Southpaw", synopsis:""]
			]
		]
		
		and: "an entry is created for every movie retrieved from rotten tomatoes"
		result.movies.size() == 5
		
		and: "the result is converted to match our own API"
		result.movies[0] == [title:"Ant-Man", description:"A movie about a tiny guy", thumbnail:"ant-man.png"]
		result.movies[1] == [title:"Pixels", description:"", thumbnail:null]
		result.movies[2] == [title:"Minions", description:"", thumbnail:null]
		result.movies[3] == [title:"Trainwreck", description:"A movie about a train built without proper tests", thumbnail:"thumbnail.png"]
		result.movies[4] == [title:"Southpaw", description:"", thumbnail:null]
		
	}
}
