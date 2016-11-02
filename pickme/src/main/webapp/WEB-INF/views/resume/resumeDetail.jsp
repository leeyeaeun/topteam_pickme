<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>PICKME 이력서 상세보기</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/css/jasny-bootstrap.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/js/jasny-bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../common/module/modHeader.jsp"/>
	<div class="container">	
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>등록일</th>
					<th>수정일</th>
				<tr>
			</thead>
			<tbody>
				<tr>
					<td>${resumeDetail.loginId}</td>
					<td>${resumeDetail.resumeRegdate}</td>
					<td>${resumeDetail.resumeModidate}</td>
				</tr>
			</tbody>
		</table>
		<div class="row">
			<div class="col-sm-5">
				<h3>나의 이력서</h3>
				${resumeDatail.resumeName}
			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-sm-2">
				<h4 align="center">증명사진</h4>
				<table class="table table-striped">
					<tr>
						<td>
							<div class="fileinput fileinput-new" data-provides="fileinput">
			  					<div class="fileinput-preview thumbnail" id="personalPhoto" data-trigger="fileinput" style="width: 160px; height: 220px;"></div>
			  					<div align="center">
			    					<span class="btn btn-default btn-file"><span class="fileinput-new">사진선택</span>
			    					<span class="fileinput-exists">변경</span>
			    					<input type="file" name="personalPhoto"></span>
			    					<a href="#" class="btn btn-default fileinput-exists" data-dismiss="fileinput">삭제</a>
			  					</div>
							</div>
						</td>
					</tr>
				</table>
			</div>
			<div class="col-sm-10">
				<h4>개인신상정보</h4>
				<table class="table table-striped">
					<tr>
						<th class="col-sm-3">한글이름</th>
						<th class="col-sm-3">영문이름</th>
						<th class="col-sm-3">성별</th>
						<th class="col-sm-3">생년월일</th>
					</tr>
					<tr>
						<td class="col-sm-3">${resumeDatail.personalKorname}</td>
						<td class="col-sm-3">${resumeDatail.personalEngname}</td>
						<td class="col-sm-3">${resumeDatail.personalGender}</td>
						<td class="col-sm-3">${resumeDatail.personalBirthdate}</td>
					</tr>
					<tr>
						<th class="col-sm-3">일반전화</th>
						<th class="col-sm-3">휴대전화</th>
						<th class="col-sm-3">이메일</th>
						<th class="col-sm-3">SNS</th>
					</tr>
					<tr>
						<td class="col-sm-3">${resumeDatail.personalPhone}</td>
						<td class="col-sm-3">${resumeDatail.personalCellphone}</td>
						<td class="col-sm-3">${resumeDatail.personalEmail}</td>
						<td class="col-sm-3">${resumeDatail.personalSns}</td>
					</tr>
					<tr>
						<th colspan="12">주소</th>
					</tr>
					<tr>
						<td colspan="12">${resumeDetail.personalAddr}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>		
	<jsp:include page="../common/module/modFooter.jsp"/>
</body>
</html>
