# 🚀 네고왕 선착순 쿠폰 이벤트 요구사항

- 이벤트 기간 내에 발급
- 선착순 이벤트는 유저당 1번의 쿠폰 발급
- 선착순 쿠폰의 최대 쿠폰 발급 수량 설정

- 쿠폰발급 기능
  - 쿠폰 발급 기간 검증
  - 쿠폰 발급 수량 검증
    - 쿠폰 전체 발급 수량
    - 중복 발급 요청 검증
  - 쿠폰 발급
    - 쿠폰 발급 수량 증가
    - 쿠폰 발급 기록 저장
      - 쿠폰 ID
      - 유저 ID

- 쿠폰 발급 기능 구현의 목표
  - 정확한 발급 수량 제어(동시성 이슈 처리)
  - 높은 처리량

## 🚀 Locust를 이용한 성능 테스트 방법.

1. 도커 설정 작성(파이썬 파일명에 맞게 작성하기)
```
services:
  master:
    image: locustio/locust
    ports:
      - "8089:8089"
    volumes:
      - ./:/mnt/locust
    command: -f /mnt/locust/locustfile-hello.py --master -H http://host.docker.internal:8080

  worker:
    image: locustio/locust
    volumes:
      - ./:/mnt/locust
    command: -f /mnt/locust/locustfile-hello.py --worker --master-host master
```
2. 테스트할 요청(request)를 설정. 파이썬 코드로 작성
```
from locust import task, FastHttpUser, stats

stats.PERCENTILES_TO_CHART = [0.95, 0.99]

class HelloWorld(FastHttpUser):
    connection_timeout = 10.0
    network_timeout = 10.0

    @task
    def hello(self):
        response = self.client.get("/hello")
```
3. 웹 어플리케이션 실행
<br/><br/>
4. locust 설정한 도커 파일 실행
```
docker-compose up -d
```

5. locust 로컬 사이트 접속
```
localhost:8089
```