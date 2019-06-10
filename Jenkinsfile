
pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2 --privileged=true'
			//args '-v /root/.m2:/usr/share/maven/ref --user root'
        }
    }
    stages {
        stage('Build') {
            steps {
				sh 'whoami'
				echo '-----------------------------------------------------------------'
				//sh 'who'
				//echo '-----------------------------------------------------------------'
				//sh 'mvn help:effective-settings'
				//echo '-----------------------------------------------------------------'
				//sh 'mvn help:system'
				//echo '-----------------------------------------------------------------'
                sh 'mvn --settings /root/.m2/settings.xml -X -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}