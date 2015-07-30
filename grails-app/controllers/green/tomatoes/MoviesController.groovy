package green.tomatoes

import grails.converters.JSON

class MoviesController {

    MoviesService moviesService
	
	def getBoxOffice() {
		def result = moviesService.getBoxOffice()
		
		response.status = 200
		response.contentType = "application/json"
		render result as JSON
	}
}
