FROM erdonline/jdk8-yum-go:latest

MAINTAINER martin114@foxmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /martin-biz-sso

WORKDIR /martin-biz-sso

EXPOSE 9402

ADD ./martin-biz/martin-biz-sso/target/martin-biz-sso.xjar ./

ADD ./martin-biz/martin-biz-sso/target/xjar.go ./

RUN go version

RUN go build xjar.go

ENTRYPOINT ./xjar java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar martin-biz-sso.xjar
