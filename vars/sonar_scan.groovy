def call(String scannerHome, String sonarInstanceName, String projectKey, String projectName, String projectVersion, String sources) {
    withSonarQubeEnv("${sonarInstanceName}") {
        sh """
            ${scannerHome}/bin/sonar-scanner \
              -Dsonar.projectKey=${projectKey} \
              -Dsonar.projectName=${projectName} \
              -Dsonar.projectVersion=${projectVersion} \
              -Dsonar.sources=${sources}
        """
    }
}
