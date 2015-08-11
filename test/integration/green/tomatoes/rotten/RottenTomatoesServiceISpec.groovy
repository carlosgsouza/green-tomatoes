package green.tomatoes.rotten



import grails.test.mixin.TestFor;

import java.security.Provider.Service;

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication
import spock.lang.*

class RottenTomatoesServiceISpec extends Specification {

	static grailsApplication

	RottenTomatoesService service
	
   def setupSpec() {
		def filePath = new File('grails-app/conf/Config.groovy').toURL()
		def config = new ConfigSlurper(System.properties.get('grails.env')).parse(filePath)

		grailsApplication = new DefaultGrailsApplication()
		grailsApplication.config = config
	}
	
	def setup() {
		service = new RottenTomatoesService()
		service.grailsApplication = grailsApplication
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
