package pages

import geb.Page

class MoviePage extends Page {

	static url = "#/movies/"
	
	static at = {
		waitFor("slow"){driver.currentUrl.contains(url)}
	}

	static content = {
		blinkingPageTitle(wait: true) { $(".blink_me") }
		movieList(wait: true) { $(".ft-movies") }
	}
}
