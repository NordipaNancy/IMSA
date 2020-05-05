pipeline {
   agent any
   script{
	 int nombreStage = 0
   }
   options { 
        checkoutToSubdirectory('scripts') 
        
    }

   stages {
     
	  stage('Compile') {
         steps {
            bat 'javac Main.java'
			bat 'java Main'
			nombreStage++
         }
      }
	  
	  stage('TestArquillian') {
         steps {
			
			catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
			 bat 'mvn -f Arquillian-Test-Bloquant/pom.xml test'
			 nombreStage++
			  }
		}
      }
  
  
     stage('Hello2') {
         steps {
            echo 'Hello World2'
			nombreStage++
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

