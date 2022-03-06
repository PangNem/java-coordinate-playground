## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---

## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---

1. 피드백 강의 전까지 미션 진행

> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---

2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---

3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

### 좌표계산기(선 길이)

ToDo

- [ ] InputView#input(String coordinate) - double distance
    - [ ] 좌표 입력받기 `(10,10)-(14,15)`
        - x, y 최대 24
        - 입력범위 초과시 다시 입력
        - 좌표값 두 개 입력 시 두 점을 잇는 직선으로 가정
    - [ ] 두 점 사이의 거리를 double 형태로 리턴한다.
- [ ] OutputView#output(double distance) - String result
    - [ ] 두 점 사이의 거리를 입력받는다. `6.403124`
    - [ ] 문구와 함께 리턴한다. `두 점 사이 거리는 6.403124`
- [ ] Coordinate
    - 좌표 클래스. x, y 좌표를 가짐
