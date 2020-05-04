pipeline {
   agent any
   
   options { 
        checkoutToSubdirectory('scripts') 
        
    }

   stages {
      
	  stage('Compile') {
         steps {
            bat 'javac Main.java'
			bat 'java Main'
         }
      }
	  
	  stage('TestArquillian') {
         steps {
			
			catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
			 bat 'mvn -f Arquillian-Test-Bloquant/pom.xml test'
			  }
		}
      }
  
  
     stage('Hello2') {
         steps {
            echo 'Hello World2'
         }
      }
	  
	  stage('Hello Matthieu') {
         steps {
            echo 'Hello Matthieu'
			script {
                    def browsers = ['chrome', 'firefox']
                    for (int i = 0; i < browsers.size(); ++i) {
                        echo "Testing the ${browsers[i]} browser"
                    }
         }
      }
	}
   }
 }  

