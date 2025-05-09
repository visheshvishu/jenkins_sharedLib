def call(String scannerHome, String sonarInstanceName, String projectKey, String projectName, String projectVersion, String sources) {
    withSonarQubeEnv("${sonarInstanceName}") {
        sh """
            ${scannerHome}/bin/sonar-scanner \
              -Dsonar.projectKey=${projectKey} \
              -Dsonar.projectName=${projectName} \
              -Dsonar.projectVersion=${projectVersion} \
              -Dsonar.sources=${sources} \
              -Dsonar.java.binaries=customer-service/target/classes,order-service/target/classes,config-server/target/classes,eureka-server/target/classes,zuul-server/target/classes,oauth2-server/target/classes,admin-server/target/classes
        """
    }
}
