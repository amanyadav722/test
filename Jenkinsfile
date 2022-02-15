node {
    def server
    def buildInfo
    def rtMaven
    
    stage ('Clone') {
        git url: 'https://github.com/amanyadav722/test.git'
    }
 
    stage ('Artifactory configuration') {
        }
 
    stage ('Test') {
        rtMaven.run pom: 'maven-example/pom.xml', goals: 'clean test'
    }
        
    stage ('Install') {
        rtMaven.run pom: 'maven-example/pom.xml', goals: 'install', buildInfo: buildInfo
    }
 
    stage ('Deploy') {
        rtMaven.deployer.deployArtifacts buildInfo
    }
        
    stage ('Publish build info') {
        server.publishBuildInfo buildInfo
    }
}
