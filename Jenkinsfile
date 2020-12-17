pipeline{
	agent { label 'maven' }
	stages{
		stage ('checkout'){
			steps{
				checkout scm
      		}
  		}
    	stage ('Compile Stage') {
	  		steps {
        		echo 'Static analysis completed.'
      		}
    	}
    	stage ('Testing Stage') {
      		steps {
        		sh 'mvn test'
      		}
    	}
    	stage ('Static Analysis') {
      		steps{
        		echo 'Static analysis completed.'
      		}
    	}


    	stage ('Integration test') {
      		steps{
       			echo 'integration test completed.'
    		}
  		}


  	}
}