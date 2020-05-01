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
			//dir('Arquillian-Test-Bloquant'){
			//bat 'cd Arquillian-Test-Bloquant/'{
			catchError('SUCCESS', 'FAILURE')
			{
			 bat 'mvn -f Arquillian-Test-Bloquant/pom.xml test'
			 //mvn "test"
			 //mvn '-Dtest=Arquillian-Test-Bloquant'	
			 //mvn '-P CalculatorTest -Dmaven.test.failure.ignore=true verify'
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