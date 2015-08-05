<html>
    <head>
        <title>Movies</title>
        <meta name="layout" content="main" />
    </head>
    <body>
    	<h2>Box Office Movies</h2>
    	<div ng-controller="MoviesController">
	    	<table>
	    		<tr ng-repeat="movie in movies">
	    			<td class="thumbnail"><img ng-src="{{ movie.thumbnail }}" /></td>
	    			<td>
	    				<h3>{{ movie.title }}</h3>
	    				<div>{{ movie.description }}</div>
	    		</tr>
	    	</table>
    		<div class="pagination">{{ getMovieCount() }} movies found</div>
    	</div>
    </body>
</html>
