module.exports = function(config) {
	config.set({
		basePath : '../../../',
		frameworks : [ 'jasmine' ],

		files : [
			'http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.js',
			'http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-resource.js',
			'http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-route.js',
			'http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-mocks.js',
			'grails-app/assets/javascripts/**/*.js',
			'test/js-unit/**/*Spec.js'
		],
		exclude : [],
		
		preprocessors : {
			'grails-app/assets/javascripts/**/*.js': 'coverage'
		},

		reporters : [ 'progress', 'junit', 'coverage', 'html'],

		junitReporter : {
			outputDir  : 'target/test-reports/karma/'
		},
		htmlReporter: {
			outputDir: 'target/test-reports/karma/html/'
		},
		coverageReporter: {
			reporters: [
				{type : 'html', dir : 'target/test-reports/karma/html/coverage/'},
				{type : 'cobertura', dir : 'target/test-reports/karma/coverage/'}
			]
		},

		port : 3560,
		colors : true,
		logLevel : config.LOG_INFO,
		autoWatch : true,

		// Start these browsers, currently available:
		// - Chrome
		// - ChromeCanary
		// - Firefox
		// - Opera
		// - Safari (only Mac)
		// - PhantomJS
		// - IE (only Windows)
		browsers : [ 'PhantomJS' ],

		captureTimeout : 30000,
		singleRun : false,
		
		plugins : [
			'karma-jasmine',
			'karma-chrome-launcher',
			'karma-firefox-launcher',
			'karma-phantomjs-launcher',
			'karma-junit-reporter',
			'karma-html-reporter',
			'karma-coverage'
       ]
	});
};