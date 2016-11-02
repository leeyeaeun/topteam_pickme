<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css">
<!-- <script>
	$(document).ready(function(){
		const $tablehover = $('.tablehover');
		$tablehover.click(function(){
			location.href = 
		});
	});
</script> -->
<title>기업리뷰 승인 리스트</title>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/module/modHeader.jsp"/>
	<div class="container">
		<div class="jumbotron text-center">
			<h1>기업리뷰 리스트</h1>
		</div>
		<div class="companyReviewList">
			<c:forEach var="reviewListAllow" items="${reviewListAllow}">
				<div class="review">
					<div class="row">
						<div class="media">
							<div class="media-left">
								<img src="/img/company/company.png" class="media-object" style="width:60px">
							</div>
							<div class="media-body">
								<h4 class="media-heading">${reviewListAllow.companyName } | ${reviewListAllow.jobTopIndexName } </h4>
								<p>${reviewListAllow.reviewRegDate }</p>
							</div>
						</div>					
					</div>
					<div id="reviewComment" class="row">
						<div class="media-left">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<div class="media-body">
							<h3 class="media-heading">"${reviewListAllow.reviewComment }"</h3>
						</div>
					</div>
					<div id="reviewStrength" class="row">
						<div class="panel panel-success">
							<div class="panel-heading">장점</div>
      						<div class="panel-body">${reviewListAllow.reviewStrength }</div>		
						</div>
					</div>
					<div id="reviewWeak" class="row">
						<div class="panel panel-danger">
							<div class="panel-heading">단점</div>
      						<div class="panel-body">${reviewListAllow.reviewWeak }</div>		
						</div>
					</div>
				</div>
			</c:forEach>		
		</div>
	</div>
</body>
</html>