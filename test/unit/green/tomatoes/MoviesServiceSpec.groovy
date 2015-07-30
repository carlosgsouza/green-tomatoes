package green.tomatoes

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MoviesService)
class MoviesServiceSpec extends Specification {

    def "should return the movies in the box office"() {
		when:
		def result = service.getBoxOffice()
		
		then:
		result.movies.size() == 5
	}
}
