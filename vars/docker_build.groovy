def call(String ImageName, String version, String contextDir = '.') {
    sh "docker build -t ${ImageName}:${version} ${contextDir}"
}
