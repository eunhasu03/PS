-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_OF_BIRTH # 출력 컬럼 정의
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL
# 1. 전화번호 NULL 제외
# -> = NULL, != NULL XXX / IS NULL 혹은 IS NOT NULL
AND GENDER = 'W' # 2. 여성회원
AND DATE_FORMAT(DATE_OF_BIRTH, '%m') = 3 # 3. 3월만 추출
# 숫자 형태의 날짜 추출법
# DATE_FORMAT(컬럼명, '형식 지정자')
# 형식 지정자 %d, %m, %y 3가지 존재
ORDER BY MEMBER_ID ASC; # 오름차순 정렬 