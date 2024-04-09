-- ceiling 올림
-- floor 내림
-- round 반올림, 두번째 매개변수 자리에 반올림 자릿수 표시가능
-- truncate 버림, 지정한 위치에서 버림
select ceiling(123.16),
	floor(123.56),
	round(123.56),
	round(123.56, 1),
	truncate(123.56, 1);

-- abs 절대값
-- sign 음수면 -1, 양수면 1
select abs(-120),
	sign(-120),
	sign(120);

-- power 제곱
-- sqrt 제곱근
-- rand 랜덤넘버, 매개변수는 seed의 의미. seed가 같으면 랜덤값이 동일함
select power(2, 3),
	sqrt(16),
	rand(),
	rand(100),
	rand(200);





