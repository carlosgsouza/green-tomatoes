app.controller('MoviesController', ['$scope', 'MoviesService', function($scope, moviesService) {
	
	$scope.totalMovies = 5;
	
	$scope.getBoxOfficeTitles = function() {
		moviesService.boxOffice.get({count:$scope.totalMovies, ts:Date.now()}, function(data) {
			$scope.movies = data.movies
		});
	};
	
	$scope.showMore = function() {
		$scope.totalMovies += 5;
		$scope.getBoxOfficeTitles();
	};
	
	$scope.canShowMore = function() {
		return ($scope.totalMovies < 50);
	}
}]);
