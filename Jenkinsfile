pipeline {
   agent any

   stages {
      stage('Compile') {
         steps {
            javac Main.java
			java Main
         }
      }
      
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }  
   }
}