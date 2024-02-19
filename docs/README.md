# Computer
## 기능
- N자리 수의 각 자리가 중복되지 않는 랜덤 넘버 생성.

## 예외
- N이 0 혹은 10이상일 경우 IllegalArgumentException 발생.

## 테스트
- N 길이의 랜덤 넘버가 생성되는지 테스트.
- 랜덤 넘버의 각 자리가 중보되지 않는지 테스트.
- N이 0 혹은 10이상일 경우 IllegalArgumentException이 발생하는지 테스트.

# GameProcessor
## 기능
- 게임의 흐름 및 재시작 여부를 반환.
- 입력 값을 Judge에게 전달하여 결과를 출력.
## 예외
X
## 테스트
X

# Judge
## 기능
- 볼 판정.
- 스트라이크 판정.
- 게임 종료 판정.
## 예외
X
## 테스트
- 숫자는 일치하지만 자리가 일치하지 않을 경우 볼 Count가 증가하는지 테스트.
- 숫자도 일치하고 자리도가 일치하지는 경우 스트라이크 Count가 증가하는지 테스트.
- 스트라이크 Count와 랜덤 넘버의 길이가 일치할 경우 게임 종료 판정이 되는지 테스트.

# InputView
## 기능
- 게임 시작 메세지 출력.
- 숫자 입력 메세지 출력 및 입력.
- 재시작 메세지 출력 및 입력.

## 예외
X
## 테스트
X

# ResultView
## 기능
- 게임 판정 메세지 출력.
- 게임 종료 메세지 출력.
- 
## 예외
X
## 테스트
X

# InputValidator
## 기능
- 입력 값이 모두 숫자인지 검증.
- 입력 한 수의 길이라 랜덤 넘버의 크기와 같은지 검증.
- 입력 한 수 들이 모두 중복되지 않는지 검증.

## 예외
- 입력 값이 모두 숫자가 아닐 경우 IllegalArgumentException이 발생.
- 랜덤 넘버보다 크거나 작은 사이즈를 입력 했을 경우 IllegalArgumentException이 발생.
- 중복된 숫자가 존재할 경우 IllegalArgumentException이 발생.

## 테스트
- 입력 값이 모두 숫자가 아닐 경우 IllegalArgumentException이 발생하는지 테스트.
- 랜덤 넘버보다 크거나 작은 사이즈를 입력 했을 경우 IllegalArgumentException이 발생하는지 테스트.
- 중복된 숫자가 존재할 경우 IllegalArgumentException이 발생하는지 테스트.