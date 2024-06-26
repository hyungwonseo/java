-- <SQL 연습문제>
-- 1. 모든 사원의 이름과 부서번호를 조회하세요.
SELECT 이름, 부서번호 FROM 사원;

-- 2. 사원 중에서 직위가 과장인 사원들의 이름과 직위를 사원번호의 내림차순으로 조회하세요.
SELECT 이름, 직위 FROM 사원 WHERE 직위 = '과장'
ORDER BY 사원번호 DESC;

-- 3. 고객번호가 'CCOPI'인 고객의 고객회사명과 담당자명을 조회하세요.
SELECT 고객회사명, 담당자명 FROM 고객
WHERE 고객번호 = 'CCOPI';

-- 4. 주문일이 2021년 5월 1일 이후인 주문의 주문번호와 주문일을 최신 주문일 순으로 조회하세요.
SELECT 주문번호, 주문일 FROM 주문 WHERE 주문일 > '2021-05-01'
ORDER BY 주문일 DESC;

-- 5. 제품의 재고가 50개 미만인 제품들의 제품명과 재고를 조회하세요.
SELECT 제품명, 재고 FROM 제품 WHERE 재고 < 50;

-- 6. 사원 중에서 남성 사원의 이름과 성별을 조회하세요.
SELECT 이름, 성별 FROM 사원 WHERE 성별 = '남';

-- 7. 고객의 마일리지가 1000 이상인 고객들의 고객회사명과 마일리지를 조회하세요. 결과는 마일리지가 높은 순으로 정렬하세요.
SELECT 고객회사명, 마일리지 FROM 고객 WHERE 마일리지 >= 1000
ORDER BY 마일리지 DESC;

-- 8. 주문세부에서 제품번호가 77인 제품의 주문번호와 주문수량을 조회하세요.
SELECT 주문번호, 주문수량 FROM 주문세부 
WHERE 제품번호 = 77;

-- 9. 주문일이 2021년 1월 1일이전인 주문의 주문번호와 주문일을 조회하세요.
SELECT 주문번호, 주문일 FROM 주문
WHERE 주문일 < '2021-01-01';

-- 10. 사원의 성별이 여성이고, 직위가 '사원'인 사원들의 이름과 성별, 직위를 조회하세요.
SELECT 이름, 성별, 직위 FROM 사원
WHERE 성별 = '여' AND 직위 = '사원';

-- 11. 제품의 단가가 8000원 이상인 제품들 중에서 제품명 순으로 정렬하여 조회하세요.
SELECT 제품명 FROM 제품 WHERE 단가 >= 8000
ORDER BY 제품명 ASC;

-- 12. 주문세부에서 주문수량이 5개 이상인 주문의 주문번호와 주문수량을 조회하세요. 결과는 주문수량이 많은 순으로 정렬하세요.
SELECT 주문번호, 주문수량 FROM 주문세부 WHERE 주문수량 >= 5
ORDER BY 주문수량 DESC;

-- 13. 사원의 생일이 1990년 1월 1일 이후인 사원들의 이름과 생일을 조회하세요.
SELECT 이름, 생일 FROM 사원 
WHERE 생일 > '1990-01-01';

-- 14. 사원의 직위가 '사원'인 사람들 중에서 가장 최근에 입사한 사원의 이름과 입사일을 조회하세요.
SELECT 이름, 입사일 FROM 사원 WHERE 직위 = '사원'
ORDER BY 입사일 desc LIMIT 1;

-- 15. 고객들 중에서 도시가 '대전광역시'인 고객들의 고객번호와 고객회사명을 조회하세요.
SELECT 고객번호, 고객회사명 FROM 고객 WHERE 도시 = '대전광역시'
ORDER BY 고객번호;
