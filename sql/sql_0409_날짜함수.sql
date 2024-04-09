-- now 현재 날짜와 시간
-- sysdate 현재 시스템의 날짜와 시간 (대부분 now와 동일)
-- curdate 현재 날짜
-- curtime 현재 시간
select now(), sysdate(), curdate(), curtime();   

-- 연도,분기,월,일,시,분,초 반환 함수
select now(), 
	year(now()),
	quarter(now()),
	month(now()),
	day(now()),
	hour(now()),
	minute(now()),
	second(now());

-- datediff 날짜간의 일수 차이
-- timestampdiff 두 날짜의 시간을 기준시간으로 변환하여 차를 계산하고
-- 다시 날짜로 변환하는 내부 프로세스를 따름
select now(),
	datediff('2025-12-20', now()), -- 620
	datediff(now(), '2025-12-20'),
	timestampdiff(year, now(), '2025-12-20'),
	timestampdiff(month, now(), '2025-12-20'),
	timestampdiff(day, now(), '2025-12-20'); -- 619
	
-- adddate 특정날짜에 기간을 더한 날짜 반환
-- subdate 특정날짜에 기간을 뺀 날짜 반환
select now(),
	adddate(now(), 50),
	adddate(now(), -50),
	subdate(now(), 50),
	adddate(now(), interval 50 day),
	adddate(now(), interval 50 month),
	adddate(now(), interval 50 year),
	subdate(now(), interval 50 hour);

-- last_day 그 달의 마지막 날
-- dayofyear 현재 연도에서 며칠이 지났는지
-- monthname 월을 영문으로
-- weekday 요일을 정수로 (MySql의 경우, 월요일 0 ~ 일요일 6)
select now(),
	last_day(now()),
	dayofyear(now()),
	monthname(now()),
	weekday(now()); 











