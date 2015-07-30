package green.tomatoes

import grails.transaction.Transactional
import green.tomatoes.rotten.RottenTomatoesService;

@Transactional
class MoviesService {

	RottenTomatoesService rottenTomatoesService
	
    def getBoxOffice() {
		def boxOfficeTitles = rottenTomatoesService.getBoxOfficeTitles()
		
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

