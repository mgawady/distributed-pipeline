node(){

    stage('checkout'){
	checkout scm
}

    stage('Build'){
        sh "mvn clean install"
    }

}
