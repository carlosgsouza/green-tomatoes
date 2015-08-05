app.factory('MoviesService', ['$resource', function($resource) {
	return {
		boxOffice: $resource('http://localhost:8080/green-tomatoes/movies/getBoxOffice?ts=:ts')
	};
}]);
