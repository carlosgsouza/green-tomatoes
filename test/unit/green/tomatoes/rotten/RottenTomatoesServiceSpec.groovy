package green.tomatoes.rotten

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(RottenTomatoesService)
class RottenTomatoesServiceSpec extends Specification {

	def setup() {
		service.rest = Mock(RESTClient)
	}
	
	def "should request the box office titles from rotten tomatoes"() {
		when:
		def result = service.getBoxOfficeTitles()
		
		then:
		1 * service.rest.get({
			assert it.path == "/api/public/v1.0/lists/movies/box_office.json"
			assert it.query == [limit:5, country:"br", apikey:"7ecm6k2vrdxzsfkkjn3gw8mp"]
			assert it.contentType == ContentType.JSON
			true
		}) >> [
			statys: 200,
			data: [
				movies : [
					[title:"Ant-Man"],
					[title:"Pixels"],
					[title:"Minions"],
					[title:"Trainwreck"],
					[title:"Southpaw"]
				]
			]
		]
		
		and:
		result == [
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
