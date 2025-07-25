pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/NeelamSyaa/OEMDeshTopProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
