app.controller('MoviesController', ['$scope', 'MoviesService', function($scope, moviesService) {
	$scope.getBoxOfficeTitles = function() {
		moviesService.boxOffice.get({ts:Date.now()}, function(data) {
			$scope.movies = data.movies
		});
	};
}]);
