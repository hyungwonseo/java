-- 서브쿼리는 where절 뿐만 아니라 select, from, having 에도 사용 가능

-- having에 사용하는 예제
-- 고객 전체의 평균마일리지보다 평균마일리지가 큰 도시
select 도시,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시
having avg(마일리지) > (select avg(마일리지) from 고객);

-- from에 사용하는 예제 ('인라인뷰'라고 부름)
-- 담당자명, 고객회사명, 마일리지, 도시, 해당 도시의 평균마일리지
-- 도시의 평균마일리지와 각 고객의 마일리지의 차(-)도 함께 표현 
select 담당자명,
	고객회사명,
	마일리지,
	고객.도시,
	도시평균마일리지,
	(도시평균마일리지 - 마일리지) as 차이
from 고객, (select 도시, avg(마일리지) as 도시평균마일리지
			 from 고객 group by 도시) as 도시별요약
where 고객.도시 = 도시별요약.도시;

-- 서브쿼리만 따로 실행
select 도시, 
	avg(마일리지) as 도시평균마일리지
from 고객 
group by 도시

-- inner join으로 바꾼 예제
select 담당자명,
	고객회사명,
	마일리지,
	고객.도시,
	도시평균마일리지,
	(도시평균마일리지 - 마일리지) as 차이
from 고객
inner join (select 도시, avg(마일리지) as 도시평균마일리지
			 from 고객 group by 도시) as 도시별요약
on 고객.도시 = 도시별요약.도시;

-- select에 사용하는 예제
-- 하나의 컬럼 값만 반환하는 쿼리여야 함(Scalar SubQuery)
-- 고객번호, 담당자명, 고객의 최종주문일
select 고객번호,
	담당자명,
	(select max(주문일) from 주문 
	where 주문.고객번호 = 고객.고객번호) as 최종주문일 
from 고객;

-- 다중컬럼 서브쿼리 : 서브쿼리에서 여러개의 컬럼을 사용하는 경우
-- 각 도시마다 최고 마일리지를 보유한 고객의 정보
select 도시,
	담당자명,
	고객회사명,
	마일리지
from 고객
where (도시, 마일리지) in (select 도시, max(마일리지) 
						from 고객
						group by 도시);

select 도시, max(마일리지) 
from 고객
group by 도시;











