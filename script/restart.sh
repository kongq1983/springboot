#!/bin/bash
NAME=springboot
VERSION=1.0
#JAVA_PATH=/usr/local/jdk1.8.0_172/bin
# LOCAL_JAR_PATH=/root/.jenkins/workspace/springboot/target
# jenkins root path ： /root/.jenkins/workspace/pipeline-springboot
LOCAL_JAR_PATH=/dist/microservice/lib
START_LOG_PATH=/tmp/startlog
APPNAME=${NAME}-${VERSION}

mkdir -p ${START_LOG_PATH}


echo 'appname='${APPNAME}
#ps -ef | grep ${APPNAME}  | grep -v grep | awk '{print $2}'  | xargs kill -9;
#echo '---------------------'
#nohup ${JAVA_PATH}/java -jar ${LOCAL_JAR_PATH}/${APPNAME}.jar > /dev/null 2>&1 &


ps -ef | grep ${APPNAME}  | grep -v grep
if [ $? -eq 0 ]
then
        echo "running...."
        ps -ef | grep ${APPNAME}  | grep -v grep | awk '{print $2}'  | xargs kill -9;
        echo 'kill process result :'$?;
fi
echo " nohup java -jar ${LOCAL_JAR_PATH}/${APPNAME}.jar & "
nohup java -jar ${LOCAL_JAR_PATH}/${APPNAME}.jar > ${START_LOG_PATH}/start.log 2>&1 &
# nohup ${JAVA_PATH}/java -jar ${LOCAL_JAR_PATH}/${APPNAME}.jar > /dev/null 2>&1 &
echo "pid=$!";
