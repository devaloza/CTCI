pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        //timeout(time: 1, unit: 'SECONDS')
    }
    tools {
        maven 'Maven'  // Make sure this matches the name in Global Tool Configuration
    }
    stages {
        
        stage('Build') {
                    steps {
                        echo 'Building..'
                        sh 'mvn clean install'
                         sh 'mvn clean compile'
                    }
                }
                stage('Test') {
                    steps {
                        echo 'Testing..'
                         /* `make check` returns non-zero on test failures,
                                        * using `true` to allow the Pipeline to continue nonetheless
                         */
                        
                        sh 'mvn test'
                    }
                }
         stage('Post-Build Actions') {
            steps {
                // Archive test results, coverage reports, etc. (optional)
                junit '**/target/surefire-reports/*.xml'
            }
        }
                stage('Deploy') {
                    steps {
                        echo 'Deploying....'
                    }
                }
    }
    post {
        always {
            // Cleanup or notifications
            echo 'Build finished'
        }
        success {
            echo 'Build succeeded'
        }
        failure {
            echo 'Build failed'
        }
    }
}
