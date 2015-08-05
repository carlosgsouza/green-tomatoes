app.controller('MoviesController', ['$scope', 
	function($scope){
		$scope.movies = [
	      {
	         "title":"Mission: Impossible Rogue Nation",
	         "description":"With the IMF disbanded, and Ethan (Tom Cruise) out in the cold, the team now faces off against a network of highly skilled special agents, the Syndicate. These highly trained operatives are hellbent on creating a new world order through an escalating series of terrorist attacks. Ethan gathers his team and joins forces with disavowed British agent Ilsa Faust (Rebecca Ferguson), who may or may not be a member of this rogue nation, as the group faces their most impossible mission yet.",
	         "thumbnail":"http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg"
	      },
	      {
	         "title":"Vacation",
	         "description":"Ed Helms stars in the New Line Cinema reboot of the Vacation film series as Rusty Griswald, the son of Chevy Chase's iconic character of the original four films. Horrible Bosses' helmers John Francis Daley and Jonathan Goldstein write and direct. ~ Jeremy Wheeler, Rovi",
	         "thumbnail":"http://resizing.flixster.com/2uvBtA3XqNqqYV5v3LeHlusSFnQ=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/14/11191450_ori.jpg"
	      },
	      {
	         "title":"Ant-Man",
	         "description":"The next evolution of the Marvel Cinematic Universe brings a founding member of The Avengers to the big screen for the first time with Marvel Studios' \"Ant-Man.\" Armed with the astonishing ability to shrink in scale but increase in strength, master thief Scott Lang must embrace his inner-hero and help his mentor, Dr. Hank Pym, protect the secret behind his spectacular Ant-Man suit from a new generation of towering threats. Against seemingly insurmountable obstacles, Pym and Lang must plan and pull off a heist that will save the world. -- (C) Marvel",
	         "thumbnail":"http://resizing.flixster.com/_bifC--YxXyDN9XjqQ_yi176WAY=/54x80/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/12/11191270_ori.png"
	      },
	      {
	         "title":"Minions",
	         "description":"The story of Universal Pictures and Illumination Entertainment's Minions begins at the dawn of time. Starting as single-celled yellow organisms, Minions evolve through the ages, perpetually serving the most despicable of masters. Continuously unsuccessful at keeping these masters-from T. rex to Napoleon-the Minions find themselves without someone to serve and fall into a deep depression. But one Minion named Kevin has a plan, and he-alongside teenage rebel Stuart and lovable little Bob-ventures out into the world to find a new evil boss for his brethren to follow. The trio embarks upon a thrilling journey that ultimately leads them to their next potential master, Scarlet Overkill (Academy Award (R) winner Sandra Bullock), the world's first-ever female super-villain. They travel from frigid Antarctica to 1960s New York City, ending in mod London, where they must face their biggest challenge to date: saving all of Minionkind...from annihilation. (c) Universal",
	         "thumbnail":"http://resizing.flixster.com/bFCtTtYrISyOAIG5NTTqvJmVZfA=/51x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/18/13/11181319_ori.jpg"
	      },
	      {
	         "title":"Pixels",
	         "description":"As kids in the 1980s, Sam Brenner (Adam Sandler), Will Cooper (Kevin James), Ludlow Lamonsoff (Josh Gad), and Eddie \"The Fire Blaster\" Plant (Peter Dinklage) saved the world thousands of times - at 25 cents a game in the video arcades. Now, they're going to have to do it for real. In Pixels, when intergalactic aliens discover video feeds of classic arcade games and misinterpret them as a declaration of war, they attack the Earth, using the video games as the models for their assaults -- and now-U.S. President Cooper must call on his old-school arcade friends to save the world from being destroyed by PAC-MAN, Donkey Kong, Galaga, Centipede, and Space Invaders. Joining them is Lt. Col. Violet Van Patten (Michelle Monaghan), a specialist supplying the arcaders with unique weapons to fight the aliens.(C) Sony",
	         "thumbnail":"http://resizing.flixster.com/K104iTuJRhb8EofICj3E_yYJAYg=/53x75/dkpu1ddg7pbsk.cloudfront.net/movie/11/18/90/11189074_ori.jpg"
	      }];
		
		$scope.getMovieCount = function() {
			return $scope.movies.length;
		}
	}
]);