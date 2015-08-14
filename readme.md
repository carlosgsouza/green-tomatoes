###Installing required dependencies
Once you have NodeJs installed you can go to the project folder and run:
  ```npm install```

###How to execute JS testing code
You could do it on two ways:

1- From root folder, on cmd (terminal) execute the bellow command which will run karma directly:
```karma start grails-app/conf/karma/unit.conf.js```

2- Or, also from the root folder you can you GruntJS to run the automated tests for you. Just type the below code in the cmd (terminal):
```grunt test```

###How to compile SASS files within CLI
We're using GruntJS to automate the SASS compilation and we have two ways to do that:

1- From root folder, on cmd (terminal) execute the command below so you can compile all the scss files in css files:
```grunt sass```

2- When developing and styling green-tomatoes you'd probably wanna see the changes being executed as fast as possible, so you don't wanna compile manually the files all the time, so you can you the ```watch```. ```watch``` basically compile all the scss into css files whenever there is a change on them. So you can execute the command below into your root folder on cmd (terminal):
```grunt watch```
