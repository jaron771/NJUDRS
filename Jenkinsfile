#!groovy
pipeline{
    agent any
    //定义仓库地址
    environment {
            REPOSITORY = "git@github.com:jaron771/NJUDRS.git"
            project = "oasisplus" //项目名称
            image_name = "oasisplus" //镜像名称
    }
    
    stages {

        stage('代码分析'){
            steps {
                echo "从 git:${REPOSITORY} 拉取代码"
                //清空当前目录
                deleteDir()
                //拉取代码
                git "${REPOSITORY}"
                sh 'mvn clean package'
                withSonarQubeEnv('sonarqube') {
                    sh "mvn org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true -DskipTests=false sonar:sonar -Dproject.settings=sonar-project.properties"
                }
            }
        }


        stage('远程服务器部署'){
            steps {
                script{
                    echo "查看当前目录"
                    sh 'scp -r ../oasisplus root@172.19.241.102:/root/'
                    echo "连接后端服务器"
                    sh "ssh -tt root@172.19.241.102 'cd /root/oasisplus;sh build.sh'"
//                     echo "开始构建"
//                     //构建镜像
//                     sh 'mvn clean package'
//                     withSonarQubeEnv('sonarqube') {
//                         sh "mvn org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true -DskipTests=false sonar:sonar -Dproject.settings=sonar-project.properties"
//                     }
//                     sh 'cp target/springbootdemo-0.0.1-SNAPSHOT.war .'
//                     sh 'docker rm -f ${project}'
//                     sh 'docker image rm ${image_name}'
//                     sh 'docker build -f Dockerfile -t springbootdemo .'
                }

            }
        }

    }
}
