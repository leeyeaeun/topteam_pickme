<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/module/modHeader.jsp"/>
	<div class="container">
		<div class="companyHeader">
			<section>
				<h1>������� ����</h1>
			</section>
		</div>
		<ul>
			<li><a href="/review/companyReviewInsertForm">������� ���</a></li>
			<li><a href="/review/companyReviewUnreceivedList">������� �̽��� ���</a></li>			
			<li><a href="/review/companyReviewListAllow">������� ���� ���</a></li>			
			<li><a href="/interview/companyInterviewUnreceivedList">�����ı� ����� ���</a></li>			
		</ul>
	</div>
</body>
</html>