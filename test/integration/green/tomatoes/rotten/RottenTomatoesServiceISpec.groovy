package green.tomatoes.rotten



import grails.test.mixin.TestFor;

import java.security.Provider.Service;

import spock.lang.*

class RottenTomatoesServiceISpec extends Specification {

	RottenTomatoesService service
	
	def setup() {
		service = new RottenTomatoesService()
	}

	@Unroll
	def "should get #numberOfResults box office titles from rotten tomatoes"() {
		when:
		def result = service.getBoxOfficeTitles(numberOfResults)
		
		then:
		result.movies.size() == numberOfResults
		result.movies.every{ it.title != null }
		
		where:
		numberOfResults << [
			1, 
			5, 
			10	
		]
	}
}
