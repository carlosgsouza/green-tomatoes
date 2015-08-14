module.exports = function(grunt) {
	grunt.initConfig({
		pkg: grunt.file.readJSON("package.json"),
		sass: {
			dist: {
				files: [{
					expand: true,
					cwd: 'grails-app/stylesheets/scss',
					src: ['*.scss'],
					dest: 'grails-app/stylesheets/',
					ext: '.css'
				}]
			}
		},
		karma: {
			dev: {
				configFile: 'grails-app/conf/karma/unit.conf.js',
				singleRun: false
			},
			build: {
				configFile: 'grails-app/conf/karma/unit.conf.js',
				preprocessors: {
					'grails-app/assets/javascripts/**/*.js': 'coverage'
				},
				singleRun: true
			}
		},
		watch: {
			css: {
				files: ['grails-app/stylesheets/**/*.scss'],
				tasks: ['sass'],
				options: {
					nospawn: true
				}
			}
		}
	});

	grunt.loadNpmTasks('grunt-contrib-sass');
	grunt.loadNpmTasks('grunt-contrib-watch');
	grunt.loadNpmTasks('grunt-karma');

	grunt.registerTask('default', ['sass']);
	grunt.registerTask('test', ['karma:dev']);
	grunt.registerTask('build', ['karma:build']);
};
