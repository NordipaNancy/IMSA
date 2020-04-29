pipeline {
   agent any

   stages {
      
	  stage('Compile') {
         steps {
            cmd 'javac Main.java'
			cmd 'java Main'
         }
      }
      
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }  
   }
}