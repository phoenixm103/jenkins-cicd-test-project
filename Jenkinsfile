def CONTAINER_NAME="jenkins-cicd-test"
def CONTAINER_TAG="latest"
def DOCKER_HUB_USER="moin123456"      // Change with you'r DockerHub username.
def DOCKER_HUB_PASSWORD="moin123456"
def HTTP_PORT="6090"                // This is related to application port

pipeline {
    agent any
    stages {
    	stage('Checkout') {
        	steps {
        		checkout scm
    		}
    	}
    	stage ('Compile Stage') {
	    steps {
      		sh "mvn clean package"        	
            }            
            
            
            
        }
        stage ('Testing Stage') {
            steps {
            	sh 'mvn test'
            }
        }
        stage('Image Build'){
        	steps {
        		imageBuild(CONTAINER_NAME, CONTAINER_TAG)
    		}
		}
    	stage('Push to Docker Registry'){
        	steps {
            	pushToImage(CONTAINER_NAME, CONTAINER_TAG, DOCKER_HUB_USER, DOCKER_HUB_PASSWORD)
        	}
        }
    }
    post {
        always {
            echo 'message sent to given mail addresses'
           	   mail bcc: '', 
		   body: "${currentBuild.fullDisplayName} Job: ${env.JOB_NAME}"+
			   "\n Check console output at: $BUILD_URL/console"+
			   "\n Check Test output1 : " +readFile("target/surefire-reports/com.example.jenkinscicdtestproject.controller.HelloControllerTest.txt")+
			   "\n Check Test output2 : " +readFile("target/surefire-reports/com.example.jenkinscicdtestproject.JenkinsCicdTestProjectApplicationTests.txt")+
			   "\n Check Test output3 : " +readFile("target/surefire-reports/com.example.jenkinscicdtestproject.service.MessageServiceTest.txt"),
		   cc: '', 
		   charset: 'UTF-8', 
		   from: 'moin123456.m@gmail.com', 
		   mimeType: 'text/html', 
		   replyTo: '', 
		   subject: "ERROR CI: ${currentBuild.fullDisplayName} Job: ${env.JOB_NAME} ", 
		   to: "moin123456.m@gmail.com,moinuddinm103@gmail.com";
	}
   
        failure {
            mail to: 'moin123456.m@gmail.com',
            subject: "Failed Pipeline: ${currentBuild.fullDisplayName} Job: ${env.JOB_NAME} ",
             body: "Something is wrong with ${env.BUILD_URL}"
        }
   
    }

}


def imageBuild(containerName, tag){
    sh "docker build -t $containerName:$tag  -t $containerName --pull --no-cache ."
    echo "Image build complete"
}

def pushToImage(containerName, tag, dockerUser, dockerPassword){
    sh "docker login -u $dockerUser -p $dockerPassword"
    sh "docker tag $containerName:$tag $dockerUser/$containerName:$tag"
    sh "docker push $dockerUser/$containerName:$tag"
    echo "Image push complete"
}

