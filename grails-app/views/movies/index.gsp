<html>
    <head>
        <title>Movies</title>
        <meta name="layout" content="main" />
    </head>
    <body>
    	<h2>Box Office Movies</h2>
    	<div ng-controller="MoviesController" ng-init="getBoxOfficeTitles()">
	    	<table>
	    		<tr ng-repeat="movie in movies">
	    			<td class="thumbnail"><img ng-src="{{ movie.thumbnail }}" /></td>
	    			<td>
	    				<h3>{{ movie.title }}</h3>
	    				<div>{{ movie.description }}</div>
	    		</tr>
	    	</table>
    		<div class="pagination">
    			<div class="currentStep">{{ movies.length }} movies found</div>
    		</div>
    	</div>
    </body>
</html>
