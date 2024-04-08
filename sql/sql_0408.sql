/* SQL (Structured Query Langauge) 
: 구조화된 요청 언어
: Database에서 필요한 기능을 실행시키기 위한 명령어 모음
: 형태는 간단한 프로그래밍 명령어와 유사함
*/
use testdb; -- use 명령어는 database를 선택한다는 뜻

select * from 고객; -- 고객테이블의 모든 데이터 요청

select 고객번호, 담당자명, 고객회사명, 마일리지	
	from 고객; -- 특정 컬럼명을 명시하여 요청
	
select 고객번호, 담당자명, 고객회사명, 마일리지 as 포인트,
	마일리지 * 1.1 as "10% 인상된 마일리지"
	from 고객;
-- as는 별명. 인용부호""는 별명에 특수문자가 있을 경우 사용
-- 테이블내의 컬럼이외에 새로운 컬럼을 보여줄 수 있다(실제 저장안됨)

select 고객번호, 담당자명, 마일리지 from 고객
where 마일리지 >= 100000;
-- 원하는 데이터를 필터링하여 가져오고 싶을때 where를 사용함
-- 순서가 중요. select from where 순서대로 사용함

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc;
-- 역시 키워드 사용 순서가 중요함. order by가 제일 뒤
-- order by는 디폴트가 오름차순이므로 내림차순은 desc를 사용해야함
/* '서울특별시'처럼 단따옴표가 기본. 쌍따옴표는 대소문자가 구별되어야하는 
경우에만 사용하는것이 권장됨 */

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 10;  -- limit은 읽어오는 데이터의 갯수를 제한함

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 10, 10;  
/*내림차순이므로 상위 10명을 제외하고 그 이후 10명의 데이터를 읽는 방법임
**/

-- 고객들이 위치한 도시정보만 보도 싶은 경우
select 도시 from 고객;
select distinct 도시 from 고객; -- distinct는 중복제거








