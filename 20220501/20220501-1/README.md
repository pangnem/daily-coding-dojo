# 20220501-1

## 2. 대소문자 변환

### 설명

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

### 입력

첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.

### 출력

첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

### 예시 입력 1

```
StuDY
```

### 예시 출력 1

```
sTUdy
```

### 후기
처음에는 문자열을 char array로 쪼개고 다시 string으로 합치는 과정을 거쳐서 비효율적이였지만, stringBuilder를 쓰면 간단하게 해결될 문제였었다.  

처음부터 과정을 너무 세세하게 쪼개도 그리 좋지많은 않은 것 같다.
### Sources

- https://cote.inflearn.com/contest/10/problem/01-02 