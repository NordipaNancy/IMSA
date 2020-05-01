pipeline {
   agent any

   stages {
      
	  stage('Compile') {
         steps {
            bat 'javac Main.java'
			bat 'java Main'
         }
      }
	  
	  stage('TestArquillian') {
         steps {
			dir('/Arquillian-Test-Bloquant'){
			 //mvn '-Dmaven.test'
			 //mvn '-Dtest=Arquillian-Test-Bloquant'	
			 mvn '-P test -Dmaven.test.failure.ignore=true verify'
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