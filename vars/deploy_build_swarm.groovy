def deploy_build_swarm() {
    sh '''
        docker stack deploy -c docker-compose.yml microservices_stack
    '''
}
