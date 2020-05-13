#!/usr/bin/env groovy
pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world')
    }
    environment {
        NEXUS_CREDENTIALS = credentials('NEXUS_CREDENTIALS')
    }
    stages {
        stage('Examples') {
            steps {
                echo "${params.Greeting} World!!!"
                echo "NEXUS_CREDENTIALS_USR = ${env.NEXUS_CREDENTIALS_USR}"
                echo "NEXUS_CREDENTIALS_PSW = ${env.NEXUS_CREDENTIALS_PSW}"
            }
        }
        stage('Initialize') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    pwd
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
            }
        }
        stage('Deploy') {
            when {
                branch 'pipeline'
            }
            steps {
                echo 'Deploying..'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}