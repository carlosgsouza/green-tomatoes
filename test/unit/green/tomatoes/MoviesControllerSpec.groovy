package green.tomatoes

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MoviesController)
class MoviesControllerSpec extends Specification {

    def setup() {
		controller.moviesService = Mock(MoviesService)
    }

    def "should return the movies in box office"() {
		when:
		controller.getBoxOffice()
		
		then:
		1 * controller.moviesService.getBoxOffice() >> [
			movies : [
				[title:"Ant-Man"],
				[title:"Pixels"],
				[title:"Minions"],
				[title:"Trainwreck"],
				[title:"Southpaw"]
			]
		]
		
		and:
		controller.response.status == 200
		controller.response.json == [
			movies : [
				[title:"Ant-Man"],
				[title:"Pixels"],
				[title:"Minions"],
				[title:"Trainwreck"],
				[title:"Southpaw"]
			]
		]
	}
}
