package green.tomatoes

import grails.test.mixin.*
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MoviesController)
class MoviesControllerSpec extends Specification {

    def setup() {
		controller.moviesService = Mock(MoviesService)
    }

    def "should return the movies in box office"() {
		given:
		controller.params.count = 5
		
		when:
		controller.getBoxOffice()
		
		then:
		1 * controller.moviesService.getBoxOffice(5) >> [
			movies : [
				[title:"Ant-Man"],
				[title:"Pixels"],
				[title:"Minions"],
				[title:"Trainwreck"],
				[title:"Southpaw"]
			]
		]
		
		and:
		response.status == 200
		response.json == [
			movies : [
				[title:"Ant-Man"],
				[title:"Pixels"],
				[title:"Minions"],
				[title:"Trainwreck"],
				[title:"Southpaw"]
			]
		]
	}
	
	@Unroll
	def "should fail when trying to use invalid parameter count=#count to get box office movies"() {
		given:
		controller.params.count = count
		
		when:
		controller.getBoxOffice()
		
		then:
		thrown Exception
		
		where:
		count << [
			-1,
			0,
			"five"
		]
	}

    def "should return 5 box office titles if no count parameter is provided"() {
		expect:
		controller.params.count == null
		
		when:
		controller.getBoxOffice()
		
		then:
		1 * controller.moviesService.getBoxOffice(5)
	}
}
