# 미션 - 온보딩

## 기능 목록

### PROBLEM 1
- 각 자리수를 구한다. <br />
  - 책은 1페이지부터 400페이지까지 존재하므로, 최대 세자릿수까지 존재한다.
- 각 자리수의 합을 구한다. 
- 각 자리수의 곱을 구한다. 
  - 0이 존재하면 바로 0을 리턴한다.
- 구한 값 중 최댓값을 구한다. 
- 포비와 크롱의 최댓값을 비교하여 승부를 가린다. 

- **입력** 
  - 포비가 펼친 페이지가 들어있는 정수 리스트/배열 pobi
  - 크롱이 펼친 페이지가 들어있는 정수 리스트/배열 crong

- **출력** 
  - 포비가 이긴다면 1
  - 크롱이 이긴다면 2
  - 무승부는 0 
- **예외 처리** 
  - 예외 사항은 -1을 출력한다. 
  - 시작 면이나 마지막 면이 나오도록 책을 펼칠 시 예외 처리 
  - 왼쪽 페이지와 오른쪽 페이지의 차이가 1 이상일 때 예외 처리 
  - 왼쪽 페이지가 홀수가 아니거나, 오른쪽 페이지가 짝수가 아닐 때 예외 처리 

---

### PROBLEM 2
- 중복되는 문자를 찾는다. 
  - 중복되는 문자가 2개일 때 
  - 중복되는 문자가 3개 이상일 때 
- 중복되는 문자를 제거한다. 
- 중복되는 문자가 없을 때 까지 반복한다. 
- **입력**
  - 임의의 문자열 cryptogram이 매개변수로 주어진다.
- **출력**
  - 연속하는 중복 문자를 삭제한 결과를 return 한다.
  - 빈문자열도 return 한다. 

---

### PROBLEM 3
- 각 수의 자리수를 구한다. 
- 각 자리수가 3, 6, 9 중 하나에 해당하는지 확인한다.
- **입력** 
  - 숫자 number가 매개변수로 주어진다. 1부터 number까지 손뼉을 친다. 
- **출력** 
  - 손뼉을 치는 횟수를 return 한다.
---
### PROBLEM 4
- 문자열을 각 문자를 아스키코드로 변환한다. 
  - 문자가 알파벳인 경우에만 변환한다. 
- 청개구리 사전을 참고해 반대 문자 아스키코드로 변환한다. 
- 아스키코드를 다시 문자로 변환한 뒤 문자열로 변환한다. 
- **입력**
  - 길이가 1이상 1,000이하인 문자열
- **출력**
  - 청개구리 사전으로 변환한 문자열을 리턴한다.
  
---
### PROBLEM 5
- 오만원권부터 일원까지의 동전을 리스트에 넣는다. 
- 오만원권부터 차례대로 화폐의 개수를 구한다. 
- 화폐의 개수를 리스트/배열에 담는다. 

- **입력**
  - 1이상 1,000,000 이하의 자연수
- **출력**
  - 출금하는 화폐 개수를 리스트로 리턴한다. 

---

### PROBLEM 6
- 각 닉네임에서 문자 두 글자씩 빼내온다. 
  - 두 글자인 문자를 해시맵에 저장한다. 
  - key : 닉네임 2 글자
  - value: 빼내온 닉네임의 인덱스 번호 
  - 만약 이미 존재하는 닉네임이라면 result에 해당 이메일을 추가한다. 
- 결과값을 오름차순으로 정렬하고 중복은 제거한다. 
- **입력**
  - 이메일과 닉네임 목록이 이차원 리스트로 입력된다. 
- **출력**
  - 경고할 이메일 주소를 포함한 리스트를 출력한다. 
- **예외 처리**
  - 이메일이 형식에 부합하는지 확인한다.
    - `email.com`도메인으로 되어있는지 확인한다.
    - 이메일의 길이가 11자 이상, 20자 미만인지 확인한다.
  - 닉네임이 형식에 부합하는지 확인한다.
    - 닉네임은 한글로만 구성되어야 한다.
---
### PROBLEM 7
- user의 친구 목록을 추출한다. 
- 친구의 친구 목록을 만든 뒤 점수를 계산한다. 
- user이 방문한 사람들 점수를 계산한다. 
- 점수가 가장 높은 5명을 추출한다. 

- **입력**
  - 사용자 아이디 "user", 친구 관계 정보 "friends", 타임라인 방문 기록 "visitors"가 매개변수로 주어진다. 
- **출력**
  - 추천할 친구 목록을 리턴한다. 
  - **예외처리**
    - 사용자의 아이디가 알파벳 소문자로만 이루어져있다.
    - 길이가 1 이상 30이하의 문자열이다. 
---

## 🔍 진행 방식

- 미션은 **기능 요구 사항, 프로그래밍 요구 사항, 과제 진행 요구 사항** 세 가지로 구성되어 있다.
- 세 개의 요구 사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.
- 기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.

## 📮 미션 제출 방법

- 미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.
    - GitHub을 활용한 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고해
      제출한다.
- GitHub에 미션을 제출한 후 [우아한테크코스 지원](https://apply.techcourse.co.kr) 사이트에 접속하여 프리코스 과제를 제출한다.
    - 자세한 방법은 [제출 가이드](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 참고
    - **Pull Request만 보내고 지원 플랫폼에서 과제를 제출하지 않으면 최종 제출하지 않은 것으로 처리되니 주의한다.**

## 🚨 과제 제출 전 체크 리스트 - 0점 방지

- 기능 구현을 모두 정상적으로 했더라도 **요구 사항에 명시된 출력값 형식을 지키지 않을 경우 0점으로 처리**한다.
- 기능 구현을 완료한 뒤 아래 가이드에 따라 테스트를 실행했을 때 모든 테스트가 성공하는지 확인한다.
- **테스트가 실패할 경우 0점으로 처리**되므로, 반드시 확인 후 제출한다.

### 테스트 실행 가이드

- 터미널에서 `java -version`을 실행하여 Java 버전이 11인지 확인한다. 또는 Eclipse 또는 IntelliJ IDEA와 같은 IDE에서 Java 11로 실행되는지 확인한다.
- 터미널에서 Mac 또는 Linux 사용자의 경우 `./gradlew clean test` 명령을 실행하고,   
  Windows 사용자의 경우  `gradlew.bat clean test` 명령을 실행할 때 모든 테스트가 아래와 같이 통과하는지 확인한다.

```
BUILD SUCCESSFUL in 0s
```

---

## 🚀 기능 요구 사항
아래의 7가지 기능 요구 사항을 모두 해결해야 한다.

1. [문제 1](./docs/PROBLEM1.md)
2. [문제 2](./docs/PROBLEM2.md)
3. [문제 3](./docs/PROBLEM3.md)
4. [문제 4](./docs/PROBLEM4.md)
5. [문제 5](./docs/PROBLEM5.md)
6. [문제 6](./docs/PROBLEM6.md)
7. [문제 7](./docs/PROBLEM7.md)

---

## 🎯 프로그래밍 요구 사항

- JDK 11 버전에서 실행 가능해야 한다. **JDK 11에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- `build.gradle`을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.

---

## ✏️ 과제 진행 요구 사항

- 미션은 [java-onboarding](https://github.com/woowacourse-precourse/java-onboarding) 저장소를 Fork & Clone해 시작한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고한다.
