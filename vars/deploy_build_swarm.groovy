def call() {
    sh '''
        docker stack deploy -c docker-compose-swarm.yml microservices_stack
    '''
}
