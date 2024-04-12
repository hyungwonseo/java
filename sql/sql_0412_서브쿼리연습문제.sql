/* 1. 제품테이블에 있는 제품 중 단가가 가장 높은 제품명 */
select 제품명	
from 제품
where 단가 = (select max(단가) from 제품);

/* 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합 */
select sum(주문수량) 수량합
from 주문세부
where 제품번호 = (select 제품번호 from 제품 
				where 단가 = (select max(단가) from 제품));
			
/* 3. '아이스크림'제품의 주문수량합 */
select sum(주문수량) 주문수량합
from 주문세부
where 제품번호 in (select 제품번호 from 제품
				where 제품명 like '%아이스크림%');
				
/* 4. '서울특별시'고객들에 대한 주문년도별 주문건수 */
select year(주문일) as 주문년도,
	count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from	고객
				where 도시 = '서울특별시')
group by year(주문일);	

			
			
			
			