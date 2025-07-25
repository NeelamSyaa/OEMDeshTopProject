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
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        // Optional Deployment Stage
        // stage('Deploy') {
        //     steps {
        //         sh 'scp target/myapp.jar user@server:/deploy/path/'
        //     }
        // }
    }
}
