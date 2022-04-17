pipeline {
    agent any

    stages {
        // stage('Stage 1: Git clone') {
        //     steps {
        //         git url: 'https://github.com/vinayakagarwal12/Calculator.git',branch:'main'
        //     }
        // }
        stage ('Stage 2 : Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Stage 3: Docker Build Image')
        {
            steps{
                script{
                    imageName = docker.build "vinayakagarwal11/calculator:latest"
                }
            }
        }
        stage('Stage 4: Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", 'calculator' ){
                        imageName.push()
                    }
                }
            }
        }
        stage('Stage 5: Ansible pull img') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventoryDetails', playbook: 'deployConfig.yml', sudoUser: null
            }    
        }
    }
}