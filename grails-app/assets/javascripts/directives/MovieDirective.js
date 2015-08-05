app.directive('movie', function() {
	return {
		restrict: 'E',
		scope: {
			info: '='
		},
		templateUrl: '/green-tomatoes/assets/directives/MovieDirective.html'
	};
});
