pipeline {
   agent any

   stages {
      
	  stage('Compile') {
         steps {
            bat 'javac Main.java'
			bat 'java Main'
         }
      }
	  
	  stage('Test') {
         steps {
			dir('Arquillian-Test-Bloquant')
            mvn '-P test -Dmaven.test.failure.ignore=true'
			
         }
      }
      
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }  
   }
}