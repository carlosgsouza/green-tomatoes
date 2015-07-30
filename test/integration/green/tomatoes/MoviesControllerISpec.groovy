package green.tomatoes



import grails.test.mixin.TestFor

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
   }

    def "should return the movies in box office"() {
		when:
		controller.getBoxOffice()
		
		then:
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
