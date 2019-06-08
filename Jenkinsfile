
pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2 --user root'
			//args '-v /root/.m2:/usr/share/maven/ref --user root'
        }
    }
    stages {
        stage('Build') {
            steps {
				sh 'mvn help:effective-settings'
				echo '-----------------------------------------------------------------'
				sh 'mvn help:system'
				echo '-----------------------------------------------------------------'
                sh 'mvn -X -B -DskipTests clean package'
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