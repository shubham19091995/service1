node {
stage('clone'){
 bat "git clone https://github.com/shubham871234/service1.git"
}
    stage('clean') {
       bat "mvn clean:service1"
    }
    stage('test'){
    bat "mvn test:service1"
    }
    stage("build"){
    bat "mvn build:service1"
    }


}