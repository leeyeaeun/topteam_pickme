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
				<h1>기업정보 메인</h1>
			</section>
		</div>
		<ul>
			<li><a href="/review/companyReviewInsertForm">기업리뷰 등록</a></li>
			<li><a href="/review/companyReviewUnreceivedList">기업리뷰 미승인 목록</a></li>			
			<li><a href="/review/companyReviewListAllow">기업리뷰 승인 목록</a></li>			
			<li><a href="/interview/companyInterviewUnreceivedList">면접후기 비승인 목록</a></li>			
		</ul>
	</div>
</body>
</html>