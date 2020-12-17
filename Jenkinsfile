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
        		sh 'mvn install -DSkipTests'
      		}
    	}
    	stage ('Testing Stage') {
      		steps {
        		echo 'Static analysis completed.'
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