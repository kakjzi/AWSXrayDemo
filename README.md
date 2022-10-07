# AWS X-Ray Demo

> MSA이나 서버리스와 같은 분산환경에서 애플리케이션 성능측정이나 디버깅하는 데 유용한 서비스입니다.

<br>

자세한 서비스에 대한 설명 : [AWS Xray Service](https://aws.amazon.com/ko/xray/)


## 프로젝트 환경구성
JAVA 11 <p>
Spring Boot 2.7.4 <p>
Spring AOP <p>
Spring Data JPA <p>
AWS EC2 (Region : ap-northeast-2) <p>
AWS X-RAY <p>
Docker <p>
MySQL 8.0 <p>

---
## Test Settings

```bash
yum -y update

sudo yum list | grep jdk

yum install -y java-11

yum install -y docker

systemctl start docker

docker pull mysql

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 $(docker images | grep -v awk | awk '/mysql/ {print $3}')

curl https://s3.ap-northeast-2.amazonaws.com/aws-xray-assets.ap-northeast-2/xray-daemon/aws-xray-daemon-3.x.rpm -o /home/ec2-user/xray.rpm

yum install -y /home/ec2-user/xray.rpm

java -jar <배포할 jar 파일>
```

## X-Ray Console 예시
<img width="1260" alt="image" src="https://user-images.githubusercontent.com/82758364/194591284-5983441c-24fa-4e96-8fbd-81873114c5d0.png">
