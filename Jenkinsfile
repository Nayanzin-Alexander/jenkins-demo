#!/usr/bin/env groovy

pipeline {
    agent any
    environment {
        OUPUT_PATH = './outputs/'
    }
    stages {
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    echo "pwd = ${pwd}"
                '''
            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
                junit 'target/surefire-reports/**/*.xml'
            }
        }
//        stage('Deploy') {
//            when {
//                branch 'pipeline'
//            }
//            steps {
//                echo 'Deploying..'
//            }
//        }
    }
}