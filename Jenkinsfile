//import hudson.tasks.test.AbstractTestResultAction

pipeline {
     
   
   agent any
 			
	options { 
        checkoutToSubdirectory('scripts') 
    }

	//environment { 
        //SOCLE_REPOSITORY = 'https://git.agora.msanet/stc/g2/sg2-root.git'
        //APPLI_REPOSITORY = 'https://git.agora.msanet/stc/g2/sg2-integration.git'
        //G_M2_SETTINGS_FILE = "$WORKSPACE/scripts/maven/settings-jenkins.xml"
        //M2_DIFFUSION = " "
        //JDK6_HOME = 'D:\\\\jdk1.6.0_24'
		//JDK8_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_251'
        //MAVEN_OPTS = '-Xms256m -Xmx1024m'
        //M2_REPO = 'D:\\data\\soft\\icw\\apache-maven-3.0.3\\m2repo-stc'
		//M2_REPO = 'D:\\platformsg2_R_64\\.m2\\repository'
    //}    
	//tools {
    //  jdk 'JDK 1.8.0_251'
  	//  maven 'Maven 3.6.3'
	//  }	  

   stages {
     
	  stage('Compile 1er stage') {
         steps {
		 
		    bat 'javac Main.java'
			bat 'java Main'
			}
		}
	   
	 
	  stage('TestArquillian') {
          steps {
		  script{
		  	try{	  
			
			bat 'mvn -f Arquillian-Test-Bloquant/pom.xml test'
			 //bat 'mvn -P test -Dmaven.test.failure.ignore=true verify'
			 //junit 'target/**/TEST-*.xml'
		  	}catch(Exception e){
			  echo 'Bersi TestArquillian'
			  bat 'mvn -P test -Dmaven.test.failure.ignore=false
			}
				}
	  		}
		}
		
  
     stage('3eme stage') {
         steps {
			
            echo 'Hello World2'
			
         }
	}
	  
	  stage('dernier stage') {
         steps {
            echo 'Hello Matthieu'
			echo "c'est pas bien il y a des erreurs"
					
                }
		      }
      }
	}
	  post {
        always {
            archive "target/**/*"
            junit 'target/surefire-reports/*.xml'
        }
    }

 
    
 

