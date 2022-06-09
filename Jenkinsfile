pipeline {
    agent none
    tools {
        // Install the Maven version configured as "install Maven" and add it to the path.
        maven "install Maven"
    }

    stages {
        stage('Build') {
            agent { node { label 'slave-01' } }
            steps{
            checkout scm
            sh "mvn clean install -DskipTests"
            }
        }

        stage('test') {
            agent { node { label 'slave-02' } }
            steps{
            checkout scm
            sh "mvn test"
            }
        }
    }
}
