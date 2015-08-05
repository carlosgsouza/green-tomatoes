<html>
    <head>
        <title>Movies</title>
        <meta name="layout" content="main" />
    </head>
    <body>
    	<h2>Box Office Movies</h2>
    	<div ng-controller="MoviesController" ng-init="getBoxOfficeTitles()">
	    	
    		<div ng-repeat="movie in movies">
    			<movie info="movie"></movie>
    		</div>
	    	
	    	<div class="showMore" ng-show="canShowMore()"><a href="#" ng-click="showMore()">Show More</a></div>
    		<div class="pagination">
    			<div class="currentStep">{{ movies.length }} movies found</div>
    		</div>
    	</div>
    </body>
</html>
