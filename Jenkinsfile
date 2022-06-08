pipeline {
    agent none
    checkout scm
    tools {
        // Install the Maven version configured as "install Maven" and add it to the path.
        maven "install Maven"
    }

    stages {
        stage('Build') {
            agent { node { label 'slave01' } }
            steps{
            sh "mvn clean install -DskipTests"
            }
        }

        stage('test') {
            agent { node { label 'slave02' } }
            steps{
            sh "mvn test"
            }
        }
    }
}
