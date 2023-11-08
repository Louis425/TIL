# TCP/UDP

## TCP/IP 패킷 정보

```
ㅣ 출발지 IP, 목적지 IP, 기타... ㅣ
ㅣ 출발지 PORT, 목적지 PORT     ㅣ
ㅣ 전송 제어, 순서, 검증 정보...  ㅣ
ㅣ    ---  전송데이터 ----     ㅣ
ㅣ--------------------------ㅣ
```

## TCP 특징 
전송 제어 프로토콜 (Transmission Control Protocol)

- 연결지향 - TCP 3 wey handshake (가상연결)

- 데이터 전달 보증

- 순서 보장

- 신뢰할 수 있는 프로토콜

- 현재는 대부분 TCP 사용

## UDP 특징
사용자 데이터그램 프로토콜(User Datagram Protocol)

- 하얀 도화지에 비유(기능이 거의 없음)

- 연결 지향 - TCP 3 wey handshake X

- 데이터 전달 보증 X

- 순서 X

- 데이터 전달 및 순서가 보증되지 않지만, 단순하고 빠름

- 정리
  - IP와 거의 같다. +PORT +체크섬 정도만 추가
  - 애플리케이션에서 추가 작업 필요 