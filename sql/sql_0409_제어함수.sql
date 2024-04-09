-- cast 데이터타입을 변경시킴
/* MySql/Maria의 데이터타입
char, signed, unsigned, date, datetime, time, binary
**/
select cast('1' as unsigned),
	cast(2 as char);
	
-- if (조건식, 참인 경우, 거짓인 경우)
select if(12500 * 450 > 500000, '초과달성', '미달성');

-- ifnull(A, B)
-- A가 null이면 B, A가 null이 아니면 A를 반환
select ifnull(5, 'null'),
	ifnull(null, '값이 없음'),
	ifnull(1/0, null); 

-- case
-- 'case when 조건 then 실행'의 형태로 조건에 따른 실행을 여러개 설정가능
-- 조건의 마지막에 나머지를 의미하는 else 사용(사용하지 않아도 됨)
-- case문의 마지막을 의미하는 end 반드시 사용!!
select case when 12500 * 450 > 500000 then '초과달성'
			when 2500 * 450 > 400000 then '달성'
			else '미달성'
		end;











