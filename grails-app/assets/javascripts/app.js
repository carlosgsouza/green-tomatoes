var app = angular.module("greenTomatoes", ['ngResource', 'ngRoute']);

app.config(function($routeProvider) {
	console.log("configuring");
	$routeProvider
		.when('/movies/', {
			controller: 'MoviesController',
			templateUrl: '/green-tomatoes/movies/index.gsp'
		})
		.otherwise({
			redirectTo: '/movies/'
		});
});
