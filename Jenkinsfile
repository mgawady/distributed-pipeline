node(){

    stage('checkout'){
	checkout scm
}

}

node('slave01')
    stage('Build'){
        sh "mvn clean install"
    }

}
