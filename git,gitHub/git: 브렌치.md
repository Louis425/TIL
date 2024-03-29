# git: 브런치

## Branch: 분기된 가지

- 프로젝트를 하나 이상의 모습으로 관리해야 할 때
- 예) 실베포용, 테스트사버용, 새로운 시도용
- 여러 작업들이 각각 독립되어 진행될 때
- 예) 신기능 1, 신기능 2, 코드개선, 긴급수정 등등
- 긱각의 차원에서 작업한 뒤 확정된 것을 메인 차원에 통합

### 브렌치 생성 / 이동 / 삭제하기

브랜치 생성

```
git branch 브랜치명
```

브랜치 목록 확인

```
git branch
```

브랜치 이동

```
git switch 생성이름
```
- checkout 명령어가 Git 2.23 버전부터 switch, restore로 분리

브랜치 생성과 동시에 이동하기

```
git switch -c 뉴 브랜치명
```

브랜치 삭제하기

```
git branch -d 삭제할 브랜치명
```

```
git branch -D 강제삭제할 브랜치명
```

브랜치 이름 바꾸기

```
git branch -m 기존 브랜치명 새 브랜치명
```