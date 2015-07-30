package green.tomatoes

import grails.converters.JSON

class MoviesController {

    def index() { }
	
	def getBoxOffice() {
		def result = [:]
		render [:] as JSON
	}
}
