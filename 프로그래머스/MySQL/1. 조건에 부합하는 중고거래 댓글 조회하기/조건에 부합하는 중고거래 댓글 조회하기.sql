SELECT A.TITLE, A.BOARD_ID, B.REPLY_ID, B.WRITER_ID, B.CONTENTS, B.CREATED_DATE
FROM USED_GOODS_BOARD A
INNER JOIN USED_GOODS_REPLY B
ON A.BOARD_ID = B.BOARD_ID
-- INNER JOIN으로 해야, 교집합에 해당하는 행만 가져옴
WHERE DATE_FORMAT(A.CREATED_DATE, '%Y-%m') = '2022-10'
-- DATE_FORMAT 사용시, 매개변수로 행, 형식지정자를 넘겨줌
-- 형식지정자 -> %Y, %m, %d -> 년의 경우 대문자 Y
ORDER BY B.CREATED_DATE ASC, A.TITLE ASC
-- 조건 2개를 바탕으로 정렬해야 할 경우, (조건1 정렬방식), (조건2 정렬방식)의 형태로 사용