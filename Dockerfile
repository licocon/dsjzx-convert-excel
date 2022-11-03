#这个也得有
FROM openjdk:8-jre-alpine
LABEL maintainer="lijie@champion-credit.com"
#复制打好的jar包
COPY target/*.jar /app.jar
RUN echo -e http://mirrors.ustc.edu.cn/alpine/v3.7/main/ >> /etc/apk/repositories \
    cat /etc/apk/repositories \
 apk add -U tzdata; \
ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime; \
echo 'Asia/Shanghai' >/etc/timezone; \
touch /app.jar;

ENV JAVA_OPTS=""
ENV PARAMS=""

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /app.jar $PARAMS" ]