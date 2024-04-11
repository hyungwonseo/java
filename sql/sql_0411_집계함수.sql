-- count 데이터 열의 갯수를 세는 함수(null은 제외)
select count(*),
	count(고객번호),
	count(도시),
	count(지역)
from 고객;
select * from 고객;

-- sum 합계
-- avg 평균
-- min 최소값
-- max 최대값
select sum(마일리지),
	avg(마일리지),
	min(마일리지),
	max(마일리지)
from 고객;

-- group by 그룹별로 묶어주는 명령어(중요!!)
select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시;

select 담당자직위,
	도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 담당자직위, 도시
order by 담당자직위, 도시;

-- having
select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시
having count(*) >= 4;

select 도시,
	sum(마일리지)
from 고객
where 고객번호 like 'T%'-- where는 select에 지정된 컬럼이외도 사용가능
group by 도시
having sum(마일리지) >= 1000;-- having은 select에 지정된 컬럼만 사용 

-- with rollup 그룹별 소계와 전체 총계를 표시
select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시
with rollup; -- 고객수 총계

select 담당자직위,
	도시,
	count(*) as 고객수
from 고객
group by 담당자직위, 도시
with rollup; -- 담당자직위별 소계 + 총계

-- group_concat 컬럼내의 값을 결합해서 표시
select 도시,
	group_concat(고객회사명) as 고객회사명목록
from 고객
group by 도시;















