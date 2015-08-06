<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Green Tomatoes</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
  		<asset:stylesheet src="application.css"/>
		
		
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-resource.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-route.js"></script>
		<g:layoutHead/>
	</head>
	<body ng-app="greenTomatoes" >
		<div id="grailsLogo" role="banner"><h1 class="blink_me">Green Tomatoes</h1></div>
		<div ng-view></div>
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
		
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
