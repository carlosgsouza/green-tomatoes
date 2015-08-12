describe("MovieDescriptionFilter", function() {
	beforeEach(module("greenTomatoes"));
	
	it("should format the output cutting the description with description bigger than 400 characters and concatenating ... at the and of it", inject(function(descriptionFilter) {
		//given: there is a input string bigger than 400 characters
		var input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin elementum non ligula a faucibus. Sed vel accumsan risus, nec efficitur erat. Praesent ornare, erat sed commodo rutrum, turpis lacus posuere nisi, non luctus ligula dui sit amet nulla. Quisque vel eros condimentum enim tincidunt dapibus. Mauris venenatis augue vel felis sagittis pharetra. Vivamus euismod, lorem at ultrices sodales, ipsum posuere.";
		
		//when: applying the filter for the given input
		var result = descriptionFilter(input);
		
		//then: the resultant string should have 403 characters
		expect(result.length).toBe(403);
		
		//and: the resultant string should be cut and ... should be concatenated with the and of it.
		expect(result.substr(result.length - 3)).toEqual("...");
	}));
	
	it("it should not change the input when the string is smallest than 400 characters", inject(function(descriptionFilter) {
		//given: there is a input string smallest than 400 characters
		var input = "Lorem ipsum.";
		
		//when: applying the filter for the given input
		var result = descriptionFilter(input);
		
		//then: the resultant string should not be modified.
		expect(result).toEqual("Lorem ipsum.");
	}));
});