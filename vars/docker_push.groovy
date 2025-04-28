def call(String appName, String dockerUsername, String credentialsId, String version = 'latest') {
    withDockerRegistry(credentialsId: credentialsId) {
        sh "docker tag ${appName}:${version} ${dockerUsername}/${appName}:${version}"
        sh "docker push ${dockerUsername}/${appName}:${version}"
        // withDockerRegistry(credentialsId: 'private-registry', url: 'https://3.83.177.175:5000')  {
        //   sh 'docker tag django-app:latest 3.83.177.175:5000/django-app:latest'
        //   sh 'docker push 3.83.177.175:5000/django-app:latest'
    }
}



















