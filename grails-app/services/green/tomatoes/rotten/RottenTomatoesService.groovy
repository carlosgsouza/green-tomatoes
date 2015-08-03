package green.tomatoes.rotten

import org.codehaus.groovy.grails.commons.GrailsApplication;

import grails.transaction.Transactional
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

class RottenTomatoesService {

	RESTClient rest
	GrailsApplication grailsApplication
	
	public RottenTomatoesService() {
		rest = new RESTClient("http://api.rottentomatoes.com")
		
		rest.setProxy("www-proxy.exu.ericsson.se", 8080, 'http')
	}
	
    def getBoxOfficeTitles(int count) {
		def response = rest.get(
			path :"/api/public/v1.0/lists/movies/box_office.json",
			query : [limit:count, country:"br", apikey:grailsApplication.config.rottenTomatoes.api.key],
			contentType : ContentType.JSON
		)
		
		return response.data
	}
}
