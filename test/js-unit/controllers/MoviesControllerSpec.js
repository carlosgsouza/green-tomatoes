describe("MoviesController", function() {
	var scope, ctrl, timestamp;
	
	beforeEach(module("greenTomatoes"));
	
	beforeEach(inject(function(_$httpBackend_, $rootScope,$controller, MoviesService) {
		$httpBackend = _$httpBackend_;
		scope = $rootScope.$new();
		timestamp = Date.now();
		
		ctrl = $controller(
			"MoviesController",
			{
				$scope : scope,
			});
	}));
	
	it("it should request box office titles", function() {
		//given: Now is a fixed integer
		spyOn(Date, "now").and.returnValue(timestamp);
		
		//and: we're expecting a request on the specified url, with the specified parameters. We can return the mock response we want to work with.
		$httpBackend.expectGET("http://localhost:8080/green-tomatoes/movies/getBoxOffice?count=5&ts=" + timestamp).respond(200, {"movies" : {"title": "Potato with cream cheese"}});
		
		//when: the method getBoxOfficeTitles is invoked
		scope.getBoxOfficeTitles();
		
		//then: the backend flushes the response
		$httpBackend.flush();
		
		//and: the object scope.movies.title should be filled with the mocked response we've sent.
		expect(scope.movies.title).toEqual("Potato with cream cheese")
		
	});
	
	it("it should request more 5 items", function() {
		//given: we're injecting a spy on the method getBoxOfficeTitles because we don't wanna actually call it
		spyOn(scope, "getBoxOfficeTitles");
		
		//when: showMore method is invoked
		scope.showMore();
		
		//then: we expect to call the method getBoxOfficeTitles method
		expect(scope.getBoxOfficeTitles).toHaveBeenCalled();
		
		//and: the value on scope.totalMovies should be updated to 10
		expect(scope.totalMovies).toEqual(10);
	});
});