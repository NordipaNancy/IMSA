pipeline {
   agent any

   stages {
      
	  stage('Compile') {
         steps {
            bat 'javac Main.java'
			bat 'java Main'
         }
      }
      
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }  
   }
}