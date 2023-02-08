# 基础镜像使用java
FROM openjdk:8
# 作者
MAINTAINER tinkouka
# VOLUME 指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为tinkouka_docker.jar
ADD docker_boot-1.0-SNAPSHOT.jar tinkouka_docker.jar
# 运行jar包
RUN bash -c 'touch /tinkouka_docker.jar'
ENTRYPOINT ["java","-jar","/tinkouka_docker.jar"]
#暴露6001端口作为微服务
EXPOSE 6001
