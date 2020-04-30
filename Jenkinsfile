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
			dir('/Arquillian-Test-Bloquant'){
       //     mvn '-Dmaven.test'
			 mvn '-Dtest=Arquillian-Test-Bloquant'	
			 }
         }
      }
      
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }  
   }
}