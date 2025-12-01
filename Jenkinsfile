pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven 3.9.11'
    }

    stages {
        stage('Show Messages'){
            steps {
                bat 'echo "Primer stage del pipeline"'
            }
        }
    }
}