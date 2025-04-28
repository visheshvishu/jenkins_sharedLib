def call(String ImageName, String version) {
    sh "docker build -t ${ImageName}:${version} ."
}