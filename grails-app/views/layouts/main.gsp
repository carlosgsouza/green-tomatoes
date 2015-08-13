<!DOCTYPE html>
	<head>
		<title>Green Tomatoes</title>
		<g:layoutHead/>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-resource.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-route.js"></script>
	</head>
	<body ng-app="greenTomatoes">
		<div class="header" role="banner"><h1>Green Tomatoes</h1></div>
		
		<g:layoutBody/>
		
		<div class="footer" role="contentinfo"></div>
		
		<!-- Modules -->
	    <asset:javascript src="app.js"/>
	
	    <!-- Controllers -->
	    <asset:javascript src="controllers/MoviesController.js"/>
	
	    <!-- Services -->
	    <asset:javascript src="services/MoviesService.js"/>
	
	    <!-- Filters -->
	    <asset:javascript src="filters/MovieDescriptionFilter.js"/>
	    
	    <!-- Directives -->
	    <asset:javascript src="directives/MovieDirective.js"/>
	</body>
</html>
