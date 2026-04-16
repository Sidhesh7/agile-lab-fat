pipeline {
    agent any

    tools {
        maven 'Maven3' 
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/Sidhesh7/agile-lab-fat.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'SUCCESS: The Library System was built and packaged!'
        }
        failure {
            echo 'FAILURE: Check the Console Output to see what went wrong.'
        }
    }
}
