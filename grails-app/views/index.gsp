<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<div ng-app="greenTomatoes" >
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
		</div>
	</body>
</html>
