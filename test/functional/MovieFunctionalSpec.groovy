import geb.spock.GebReportingSpec
import pages.MoviePage
import spock.lang.Stepwise

@Stepwise
class MovieFunctionalSpec extends GebReportingSpec {

	def "when the user opens movie list page it should display the blinking title"(){
		when:
		to MoviePage
		
		then:
		waitFor("slow"){
			blinkingPageTitle.displayed
		}
	}
	
	def "when the user opens movie list page it should show a list with 5 or more titles"(){
		when:
		at MoviePage
		
		then:
		waitFor("slow"){
			movieList.size() >= 5
		}
	}
	
	def cleanupSpec(){
	}
	
}
