<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
  
<html>
<head>
<meta charset="UTF-8">
<title>step1.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">

   $(function(){
      $('#btn').click(function(){
         //console.log('click');
         // location.href = '<c:url value="/register/step2.do"></c:url>'; 
         // 프론트앤드 처리 방법 1
         // 이렇게하면 약관 동의 눌러도 페이지 자체는 안바뀜
         // location : 페이지만 이동하는 객체
         // ../register/step2.do --> 상대주소 쓰는걸 권장하지 않음
         // jstl 사용함
         // location.href = "../register/step2.do";
         // location.href = '<c:url value="/register/step2.do"></c:url>';
         /* if($('#agree')[0].checked){
            location.href = '<c:url value="/register/step2.do"></c:url>';
         } */
         
         // 처리 방법 2
         document.frm.action = '<c:url value="/register/step2.do"></c:url>';
         document.frm.submit();
         
      });
      
   });

</script>
</head>
<body>

	<h2>step1.jsp</h2>
	<h1>약관</h1>
	<textarea name="txtArea" id="txtArea" cols="30" rows="10">고객 님의 소중한 정보를 잘 쓰겠습니다.</textarea>
	<form action="#" name="frm">
		<input type="checkBox" name="ck" id="agree" />
		<span>약관동의</span>
		<input type="button" value="다음" id="btn" />		
	</form>
</body>
</html>