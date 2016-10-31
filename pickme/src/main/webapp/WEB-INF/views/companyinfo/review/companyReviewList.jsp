<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>관리자 승인페이지(기업리뷰)</title>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/module/modHeader.jsp"/>
	<div class="container">
		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th>승인대기번호</th>
						<th>기업코드</th>
						<th>작성자</th>
						<th>기업한줄평</th>
						<th>등록일</th>
						<th>승인상태</th>
					<tr>
				</thead>
				<tbody>
					<c:forEach var="companyReviewList" items="${reviewUnreceivedList}" varStatus="i">
						<tr class="tablehover" onClick="location.href='/review/companyReviewDetail?companyReviewCd=${companyReviewList.companyReviewCd}'" style="cursor:pointer;">
							<td>${i.count }</td>
							<td>${companyReviewList.companyCd }</td>
							<td>${companyReviewList.loginId }</td>
							<td>${companyReviewList.reviewComment }</td>
							<td>${companyReviewList.reviewRegDate }</td>
							<td>미승인</td>
						</tr>
						
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>