package green.tomatoes.rotten

import grails.test.mixin.*
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication
import org.codehaus.groovy.grails.commons.GrailsApplication

import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(RottenTomatoesService)
class RottenTomatoesServiceSpec extends Specification {

	static ConfigObject config
	
	def setupSpec() {
		def filePath = new File('grails-app/conf/Config.groovy').toURL()
		config = new ConfigSlurper(System.properties.get('grails.env')).parse(filePath)
	}
	
	def setup() {
		service.grailsApplication = new DefaultGrailsApplication()
		service.grailsApplication.config = config
		
		service.rest = Mock(RESTClient)
	}
	
	def "should request the box office titles from rotten tomatoes"() {
		given:
		config.rottenTomatoes.api.key = "the-api-key"
		
		when:
		def result = service.getBoxOfficeTitles(5)
		
		then:
		1 * service.rest.get({
			assert it.path == "/api/public/v1.0/lists/movies/box_office.json"
			assert it.query == [limit:5, country:"br", apikey:"the-api-key"]
			assert it.contentType == ContentType.JSON
			true
		}) >> [
			status: 200,
			data: [
				movies : "..."
			]
		]
		
		and:
		result == [
			movies : "..."
		]
	}
	
	
	
}
