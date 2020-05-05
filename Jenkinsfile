pipeline {
   agent any
 
	options { 
        checkoutToSubdirectory('scripts') 
    }

   stages {
     
	  stage('Compile') {
         steps {
		 
		 catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
            bat 'javac Main.java'
			bat 'java Main'
			}
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
			catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
            echo 'Hello World2'
			}
         }
      }
	  
	  stage('Hello Matthieu') {
         steps {
            echo 'Hello Matthieu'
			script {
                    def tabStage = [nombreStage]
                    for (int i = 0; i < nombreStage.size(); ++i) {
                        echo "Testing the ${nombreStage[i]} erreur"
                    }
         }
      }
	}
   }
 }  

