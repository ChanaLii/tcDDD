# Version 1.0.0
FROM registry.cn-hangzhou.aliyuncs.com/dragonwell/dragonwell8:8.5.5-FP1_alpine_x86_64_8u275-b2

MAINTAINER xxx@qq.com

RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories
RUN apk --update add --no-cache tzdata ttf-dejavu fontconfig curl tini ospd-netstat
RUN rm -rf /var/cache/apk/*

ENV TZ='Asia/Shanghai'
ENV JAVA_OPTS = ""

RUN mkdir -p /triascloud/app
WORKDIR /triascloud/app
ADD ./example-start/target/example-start.jar ./app.jar

EXPOSE 8080

# ENTRYPOINT 处理pid=1的问题
ENTRYPOINT ["/sbin/tini", "--"]

CMD ["/bin/sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar"]