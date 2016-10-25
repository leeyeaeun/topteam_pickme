<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
 $(document).ready(function(){
	 $('#jobAddBtn').click(function(){
		 document.getElementById("job").innerHTML = "hello"
				//'직무선택 (직무중분류코드)/<input type='radio'name='jobMidindexName'>db에서 채용형태(선택)<select name='recruitJobWorkstatus'><option></option></select>채용상세직무<input type='text' name='recruitJobJobdetail'>학력<select name='recruitJobEducation'><option></option></select>';
	 });
 });
</script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="/recruitInsert" enctype="multipart/form-data"class="form-horizontal" method="post" >
		<div class="form-group">
			기업선택(기업코드) : 검색
		 </div>
		
		<div class="form-group">
			채용공고명<input type="text" name="recruitName"  class="form-control">
		</div>
		
		<div class="form-group">
			채용시작일<input type="date" name="recruitBegindate" class="form-control">
		</div>
		
		<div class="form-group">
			채용마감일<input type="date" name="recruitEnddate" class="form-control">
		</div>
		
		<div id="job"><!-- 직무등록--하나 기본으로 보이고 추가누를시 추가됨 -->
			<div class="form-group">
				직무선택 (직무중분류코드)/
				<input type="radio" name="jobMidindexName" >db에서 
			</div>
			
			<div class="form-group">
				채용형태(선택)
				<select name="recruitJobWorkstatus">
					<option value="신입">신입</option>
					<option value="경력">경력</option>
					<option value="인턴">인턴</option>
				</select>
			</div>
			
			<div class="form-group">
				채용상세직무
				<input type="text" name="recruitJobJobdetail" class="form-control">
			</div>
			
			<div class="form-group">
				학력
				<select name="recruitJobEducation" class="form-control">
					<option>고졸</option>
					<option>전문대졸</option>
					<option>4년대졸</option>
				</select>
			</div>
		</div>
		
		<div class="form-group">
			<input type="button" id="jobAddBtn" value="직무추가" > 
		</div>
		
		<div class="form-group">
			공고문(사진파일1장)
			<input type="file" name="recruitJobFile" value="사진파일등록" >
		</div>
		
		<div class="form-group">
			<input type="submit" value="등록">
		</div>
	</form>
</div>
</body>
</html>