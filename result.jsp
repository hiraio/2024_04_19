<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  jquery 사용을 위한 스크립트 -->
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript">
		$(document).ready(function(){
			const result = '${result}';
			
			if(result == 'success'){
				alert('전송 성공!');
			}
			
		});
	
	</script>

</body>
</html>