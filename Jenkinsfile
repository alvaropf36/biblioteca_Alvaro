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
                bat 'echo "A continuacion hacemos checkout del proyecto"'
            }
        }

        stage('Checkout proyecto'){
            steps {
                git branch: 'master',
                url: 'https://github.com/alvaropf36/biblioteca_Alvaro.git'
            }
        }

        stage('Maven clean'){
            steps {
                bat 'mvn clean'
            }
        }
    }
}