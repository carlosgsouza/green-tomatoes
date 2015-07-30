package green.tomatoes



import grails.test.mixin.TestFor
import green.tomatoes.rotten.RottenTomatoesService

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication

import spock.lang.*

@TestFor(MoviesController)
class MoviesControllerISpec extends Specification {

	static grailsApplication
	
   	def setupSpec() {
		def filePath = new File('grails-app/conf/Config.groovy').toURL()
		def config = new ConfigSlurper(System.properties.get('grails.env')).parse(filePath)

		grailsApplication = new DefaultGrailsApplication()
		grailsApplication.config = config
    }
	   
   def setup() {
	   controller.moviesService = new MoviesService()
	   controller.moviesService.rottenTomatoesService = new RottenTomatoesService()
   }

    def "should return the movies in box office"() {
		when:
		controller.getBoxOffice()
		
		then:
		controller.response.status == 200
		controller.response.contentType == "application/json;charset=UTF-8"
		controller.response.json.movies.size() == 5
		controller.response.json.movies.every{ it.title }
		controller.response.json.movies.every{ it.description }
		controller.response.json.movies.every{ it.thumbnail }
	}
}
