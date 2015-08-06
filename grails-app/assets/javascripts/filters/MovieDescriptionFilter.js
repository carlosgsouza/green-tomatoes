app.filter('description', function() {
	var MAX_SIZE = 400;
	
	return function(input) {
		if(input === undefined) {
			return "";
		} 

		var result = input.trim();
		if(result.length <= MAX_SIZE){
			return result;
		} else {
			return result.substring(0, MAX_SIZE) + "...";
		}
	};
});