def numberStageFailed() {
    bat "set numberStageFailed = 0"
	}


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
		post {
                success {
                    echo 'Compile Bersi stage successful'
                }
                failure {
                    echo 'Compile Bersi stage failed'
                }
            } 
	   }
	  
	  stage('TestArquillian') {
         steps {
			
			catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
			 bat 'mvn -f Arquillian-Test-Bloquant/pom.xml test'
			 }
		}
		
		post {
                success {
                    echo 'TestArquillian Bersi stage successful'
                }
                failure {
                    echo 'TestArquillian Bersi stage failed'
                }
            }
		}
  
  
     stage('Hello2') {
         steps {
			catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
            echo 'Hello World2'
			}
         }
		 
		post {
                success {
                    echo 'Hello2 Bersi stage successful'
					
                }
                failure {
                    echo 'Hello2 Bersi stage failed'
                }
            } 

      }
	  
	  stage('Hello Matthieu') {
         steps {
            echo 'Hello Matthieu'
			script {
                    def tabStage = ['Compile', 'TestArquillian', 'Hello2']
					def tabStageResult = []
					
                    for (int i = 0; i < tabStage.size(); ++i) {
					
						//if(tabStage[i].catchError().stageResult() == "FAILURE")
							echo "c'est pas bien ${tabStage[i]} est en erreur"
                    }
         }
      }
	}
 }
 }   

