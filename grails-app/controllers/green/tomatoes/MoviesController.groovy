package green.tomatoes

import grails.converters.JSON

class MoviesController {

    MoviesService moviesService
	
	def index() {
		
	}
	
	def getBoxOffice() {
		int count = params.count != null ? params.count.toInteger() : 5
		
		if(count < 1) {
			throw new IllegalArgumentException("count should be >= 1")
		}
		
		def result = moviesService.getBoxOffice(count)
		
		response.status = 200
		response.contentType = "application/json"
		render result as JSON
	}
}
