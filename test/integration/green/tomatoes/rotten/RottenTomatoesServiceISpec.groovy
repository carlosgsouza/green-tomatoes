package green.tomatoes.rotten



import grails.test.mixin.TestFor;

import java.security.Provider.Service;

import spock.lang.*

class RottenTomatoesServiceISpec extends Specification {

	RottenTomatoesService service
	
	def setup() {
		service = new RottenTomatoesService()
	}

	def "should get the box office titles from rotten tomatoes"() {
		when:
		def result = service.getBoxOfficeTitles()
		
		then:
		result.movies.size() == 5
		result.movies.every{ it.title != null }
	}
}
