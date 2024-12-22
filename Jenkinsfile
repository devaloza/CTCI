pipeline {
    agent any
    tools {
        maven 'Maven'  // Make sure this matches the name in Global Tool Configuration
    }
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 100, unit: 'SECONDS')
    }
    stages {
        
        stage('Build') {
                    steps {
                        echo 'Building..'
                     //   sh 'mvn clean install'
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
    success {
        emailext(
            subject: "SUCCESS: ${currentBuild.fullDisplayName}",
            body: "<p>The build was successful.</p>",
            to: 'devaloza93@gmail.com'
        )
    }
    failure {
        emailext(
            subject: "FAILURE: ${currentBuild.fullDisplayName}",
            body: "<p>The build failed. Check console output at ${env.BUILD_URL}.</p>",
            to: 'devaloza93@gmail.com'
        )
    }
}
}
