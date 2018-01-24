pipeline {
    agent { docker 'maven:3.5.2' }
    stages {
        stage('build') {
            steps {
                bat 'mvn -v'
            }
        }
    }
}
