-- DML(데이터조작어)
-- select, insert, update, delete

-- insert into 테이블명 values(값1, 값2, ...);
insert into 부서
values('A5', '마케팅부'); -- 컬럼순서대로 작성해야함

insert into 제품
values (91, '연어피클소스', null, 5000, 40);

/* insert into 테이블명(컬럼1, 컬럼2, ...)
	values(값1, 값2, ...);
이 경우, values는 위의 컬럼 순서대로만 써주면 됨 */
insert into 제품(제품번호, 제품명, 단가, 재고)
values(90, '연어핫소스', 4000, 50);

-- 여러개의 데이터를 한번에 입력
insert into 사원(사원번호, 이름, 직위, 성별, 입사일)
values('E20', '김사과', '수습사원', '남', curdate()),
	('E21', '박바나나', '수습사원', '여', curdate()),
	('E22', '정오렌지', '수습사원', '여', curdate());

-- update
/* update 테이블명 set 컬럼1 = 값1, 컬럼2 = 값2,...
	where 조건; */
update 사원
set 이름 = '김레몬'
where 사원번호 = 'E20'; -- where조건이 없으면 모든 열이 변경됨!!

update 제품
set 포장단위 = '200 ml bottles'
where 제품번호 = 91;

update 제품
set 단가 = 단가 * 1.1,
	재고 = 재고 - 10
where 제품번호 = 91;

-- delete 
-- delete from 테이블명 where 조건;
delete from 제품
where 제품번호 = 91;

-- 가장 최근 입사자 순서로 정렬하고 위에서 3개 row를 삭제
delete from 사원
order by 입사일 desc 
limit 3;

-- insert on duplicate key update
-- 레코드(=열, row, 튜플)가 없으면 새롭게 추가하고, 있으면 변경
insert into 제품(제품번호, 제품명, 단가, 재고)
values(91, '연어피클핫소스', 6000, 50)
on duplicate key update
제품명 = '연어피클핫소스', 단가 = 6000, 재고 = 50;




















