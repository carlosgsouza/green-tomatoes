package green.tomatoes

import grails.transaction.Transactional
import green.tomatoes.rotten.RottenTomatoesService;

class MoviesService {

	RottenTomatoesService rottenTomatoesService
	
    def getBoxOffice(int count) {
		def boxOfficeTitles = rottenTomatoesService.getBoxOfficeTitles(count)
		
		def result= [movies:[]]
		boxOfficeTitles.movies.each { movie ->
			result.movies << [
				title : movie.title ?: null,
				description : movie.synopsis ?: "",
				thumbnail : movie.posters?.thumbnail ?: null
			]
		}
		
		return result
    }
}

