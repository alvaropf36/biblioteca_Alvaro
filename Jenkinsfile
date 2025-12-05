pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven 3.9.11'
    }

    environment{
        VERSION_BACK = "2.0.1"
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

        stage('Comandos Maven'){
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Crear directorio'){
            steps{
                bat 'mkdir v%VERSION_BACK%'
            }
        }
    }
}