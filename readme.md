###How to execute JS testing code

* Install those dependencies:
  * Karma (npm install -g karma)
  * Karma Jasmine (npm install -g karma-jasmine)
  * Karma launchers (npm install -g karma-chrome-launcher karma-firefox-launcher karma-phantomjs-launcher)
  * Karma JUnit report (npm install -g karma-junit-reporter)
  * Karma JUnit report (npm install -g karma-html-reporter)
  * Karma coverage report (npm install -g karma-coverage)
  
* From root folder, on cmd (terminal) execute this command:
```karma start grails-app/conf/karma/unit.conf.js```


###How to compile SASS files within CLI
Ok, there is several ways to automate it, but you can run this command in your terminal:
```sass grails-app\assets\stylesheets\main.scss > grails-app\assets\stylesheets\main.css```