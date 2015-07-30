package green.tomatoes

import grails.converters.JSON

class MoviesController {

    MoviesService moviesService
	
	def getBoxOffice() {
		int count = params.count ?: 5
		
		def result = moviesService.getBoxOffice(count)
		
		response.status = 200
		response.contentType = "application/json"
		render result as JSON
	}
}
