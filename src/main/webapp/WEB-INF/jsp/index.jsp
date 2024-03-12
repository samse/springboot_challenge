<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
	function fnCurrTime() {
		$.ajax({
			type: 'GET',
			url: '/testValue',
			success: (data) => {
				alert(data);	
			}
		});
	}
	function fnCurrTime2() {
		$.ajax({
			type: 'GET',
			url: '/testValue2',
			success: (data) => {
				alert(data);	
			}
		});
	}
    </script>
</head>
<body>
	<p>Hello Boot world!</p>
	<button onClick="fnCurrTime()">현재 시간</button>
	<button onClick="fnCurrTime2()">현재 시간 가져오기</button>
</body>
</html>