pipeline{
	tools{
		jdk 'java'
		maven 'maven'
		}
		agent any
		stages{
			stage('checkout'){
				agent any
				steps{
					echo 'CLONING....'
					git 'https://github.com/chandini0204/gitfeb04.git'
				}
			}	
			stage('compile'){
				agent any
				steps{
					echo 'COMPILING...'
					sh 'mvn compile'
				}
			}
			stage('codereview'){
				agent any
				steps{
					echo 'CODEREVIEW'
					sh 'mvn pmd:pmd'
				}
			}
			stage('unitTest'){
				agent any
				steps{
					sh 'mvn test'
				}
				
			}
			/*metric test is here but pending */
			stage('package'){
				agent any
				steps{
					sh 'mvn test'
				}
			}
		}
}		
		
