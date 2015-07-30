package green.tomatoes.rotten

import grails.transaction.Transactional
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

class RottenTomatoesService {

	RESTClient rest
	
	public RottenTomatoesService() {
		rest = new RESTClient("http://api.rottentomatoes.com")
		
		rest.setProxy("www-proxy.exu.ericsson.se", 8080, 'http')
	}
	
    def getBoxOfficeTitles() {
		def response = rest.get(
			path :"/api/public/v1.0/lists/movies/box_office.json",
			query : [limit:5, country:"br", apikey:"7ecm6k2vrdxzsfkkjn3gw8mp"],
			contentType : ContentType.JSON
		)
		
		return response.data
	}
}
