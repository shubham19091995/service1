node {
stage('clone'){
git clone https://github.com/shubham871234/service1.git
}
    stage('clean') {
       bat "mvn clean"
    }
    stage('test'){
    "mvn test"
    }
    stage("build"){
    "mvn build"
    }


}