package green.tomatoes

import grails.transaction.Transactional

@Transactional
class MoviesService {

    def getBoxOffice() {
		[
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

