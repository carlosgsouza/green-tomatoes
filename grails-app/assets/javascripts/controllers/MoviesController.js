app.controller('MoviesController', ['$scope', 
	function($scope){
		$scope.movies = [];
		
		$scope.getMovieCount = function() {
			return 5;
		}
	}
]);