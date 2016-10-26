<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(document).ready(function(){
		var availableTags = new Array();
		/* for(var i=0; i<${companyInfoList.size()}; i++){
			availableTags.push(${companyInfoList[i].companyName});
			console.log(availableTags[i]);
		} */
		<c:forEach var="companyInfoList" items="${companyInfoList}" >
			availableTags.push("${companyInfoList.companyName}");
		</c:forEach>
		$("#companyName").autocomplete({
		      source: availableTags,
		      selectFirst: true,
		      minLength : 2
		      
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/module/modHeader.jsp"/>
	<div class="container">
		<form action="/review/companyReviewInsert" id="companyReviewInsertForm" method="post">
			<div class="form-group">
				<label for="companyName">기업명:</label> 
				<input type="text" id="companyName"/>
			</div>
			<div class="form-group">
				<label for="jobTopIndex">직무중분류:</label>
				 <select class="form-control" id="jobTopIndex">
				 	<c:forEach var="jobTopIndexList" items="${jobTopIndexList}" >
				 		<option value="${jobTopIndexList.jobTopIndexCd }">${jobTopIndexList.jobTopIndexName }</option>
				 	</c:forEach>
				 </select>
			</div>
		</form>
	</div>
	
</body>
</html>