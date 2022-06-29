node {
stage('clone'){
 bat "git clone https://github.com/shubham871234/service1.git"
}
stage("service1"){
bat "cd service1"
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