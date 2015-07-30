package green.tomatoes

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MoviesController)
class MoviesControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "should return the movies in box office"() {
		when:
		controller.getBoxOffice()
		
		then:
		response.status == 200
		response.json == [:]
	}
}
