# Wanted Pre-Onboarding Backend Internship



## 요구사항

- 기업 채용을 위한 웹서비스
- 사측에서는 채용공고를 생성 / 사용자는 이를 지원하는 형태

1. 필수항목
   1. 채용공고 등록
      - 회사 id / 공고 내용으로 구성된 JSON을 받으면 이를 DB에 저장
   2. 채용공고 수정
      - 변경된 공고 내용을 수신하면 이를 기존의 DB 데이터를 업데이트
      - (추가방안) 회사 id를 비교하며 같을 경우에만 작동하도록
   3. 채용공고 삭제
      - (추가방안) 요청한 회사의 id와 공고의 회사 id가 일치하는지 확인
      - 해당 공고를 삭제함
   4. 채용공고 목록
      - 모든 공고를 가져오는 과정에서 공고 내용 중 `채용 내용` 부분은 제외
   5. 채용상세 페이지
      - 채용공고의 모든 내용을 표시
      - (추가사항) 회사가 올린 다른 채용공고의 id들을 표시
2. 선택항목
   1. 채용공고 검색
      - 특정 단어를 전송받으면 공고 내용 중 해당 단어를 포함하는 공고 반환
   2. 사용자 지원
      - 채용공고 id와 사용자 id를 받고 이를 연결함 / 사용자는 1회만 지원 가능



## 구현과정

### 



## 기타

### Commit Convention

- 구조: `(형식) : (변경내용)`
- 형식
  - feat: 새로운 기능 추가
  - fix: 기능 수정
  - docs: 문서 수정
  - refact: 코드 리펙토링