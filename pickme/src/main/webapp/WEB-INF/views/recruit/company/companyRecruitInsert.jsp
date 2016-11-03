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
<script src="https://cdnjs.cloudflare.com/ajax/libs/typeahead.js/0.11.1/typeahead.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/corejs-typeahead/0.11.1/bloodhound.js"></script>
<script>
$(document).ready(function(){
	var states = new Bloodhound({
		  datumTokenizer: Bloodhound.tokenizers.whitespace,
		  queryTokenizer: Bloodhound.tokenizers.whitespace,
		  // `states` is an array of company names defined in "The Basics"
		  local: states
		});
	var substringMatcher = function(strs) {
		  return function findMatches(q, cb) {
		    var matches, substringRegex;
		    // an array that will be populated with substring matches
		    matches = [];
		    // regex used to determine if a string contains the substring `q`
		    substrRegex = new RegExp(q, 'i');

		    // iterate through the pool of strings and for any string that
		    // contains the substring `q`, add it to the `matches` array
		    $.each(strs, function(i, str) {
		      if (substrRegex.test(str)) {
		        matches.push(str);
		      }
		    });
		    cb(matches);
		  };
		};
		
	//db에서 가져온 기업명 리스트
	var list = new Array();
	<c:forEach items="${companyList}" var="item">
	list.push("${item}");
	</c:forEach>
	var states =  list; 

	$('#the-basics .typeahead').typeahead({
		hint: true,
		highlight: true,
		minLength: 1
	}, {
	  name: 'states',
	  source: substringMatcher(states)
	}).on('typeahead:open', function() {
	}).on('typeahead:rendered', function(element, data) { // 검색 결과 화면 생성 이벤트
	}).on('typeahead:cursorchanged', function(element, data) { // 위 아래 커서 이동시 이벤트
	}).on('typeahead:selected', function(element, data) { // 선택 이벤트
	}).on('typeahead:autocompleted', function(element, data) { // 검색어 자동완성 이벤트
	});
	/* 이거는 검색결과가 없을때 메세지 출력할수있던데 어떻게 하는지 모르겠음 
	사이트 주소 : http://twitter.github.io/typeahead.js/examples/
	
	$('#custom-templates .typeahead').typeahead(null, {
		  name: 'best-pictures',
		  display: 'value',
		  source: bestPictures,
		  templates: {
		    empty: [
		      '<div class="empty-message">',
		        'unable to find any Best Picture winners that match the current query',
		      '</div>'
		    ].join('\n'),
		    suggestion: Handlebars.compile('<div><strong>{{value}}</strong> – {{year}}</div>')
		  }
		});
	*/		 		
	//직무추가 버튼 클릭시
	$('#jobAddBtn').click(function(){
		if($('#recruitJobWorkstatus').val()==''||$('#recruitJobJobdetail').val()==''||$('#recruitJobEducation').val()==''){
			$('#jobAddError').text('모든항목 입력후 추가할수있습니다.');
		}else{
			 $('#job').append(
						'<hr/><div id="job">'+
						'<div class="form-group">직무선택(직무중분류코드)/'+
							'<c:forEach var ="jobIndex" items="${jobIndex}">'+
								'<input type="radio" name="jobMidindexCd" value="${jobIndex.jobMidIndexCd}">${jobIndex.jobMidIndexName}'+
							'</c:forEach>'+
						'</div>'+
						'<div class="form-group">'+
							'채용형태(선택)'+
							'<select name="recruitJobWorkstatus" id="recruitJobWorkstatus">'+
								'<option value="신입">신입</option>'+
								'<option value="경력">경력</option>'+
								'<option value="인턴">인턴</option>'+
								'<option value="계약직">계약직</option>'+
							'</select>'+
						'</div>'+
						'<div class="form-group">'+
							'채용상세직무'+
							'<input type="text" name="recruitJobJobdetail" id="recruitJobJobdetail"class="form-control">'+
						'</div>'+
						'<div class="form-group">'+
							'학력'+
							'<select name="recruitJobEducation" id="recruitJobEducation"class="form-control">'+
								'<option value="학력무관">학력무관</option>'+
								'<option value="고졸">고졸</option>'+
								'<option value="전문대졸">전문대졸</option>'+
								'<option value="4년대졸">4년대졸</option>'+
							'</select>'+
						'</div>'+
					'</div>'	 
			 );
		}
		
		/* 	
		이거는 사진파일 유효성검사 
		var flag= true;
		$('.boardImg').each(function(item,index){
			if($(this).val()==''){
				flag=false;
				$('#error').text('파일을 선택하세요');
			}
		});
		// if(file)  파일이 선택된게 없으면 파일 선택버튼이 늘어나지않게& 유효성검사
		if(flag){
		 $('#fileSection').append('<div> <input type="file" name="boardImg" multiple="multiple" class="boardImg"/> </div>');
		}	 */
	});
	
	
		$("#jobTopIndexCd").change(function(){
			<c:forEach items="${jobIndex}" var ="jobMid">
				if($('#jobTopIndexCd').val()==${jobMid.jobTopIndexCd}){
					$('#jobMidIndexCd').append(
							'<option value="${jobMid.jobMidIndexCd}">"${jobMid.jobMidIndexName}"</option>');
				}
			</c:forEach>	
		});

	
	//등록버튼 클릭시 유효성검사
 	$('#recruitAdd').click(function(){
		
		$('#recruitJobFile').each(function(item,index){
			if($(this).val()==''){
				$(this).remove();
			}
		});		
		if($('#CompanyName').val()==''){
			$('#error').text('기업명을 입력하세요');
			$('#CompanyName').focus();	
		}else if($('#recruitName').val()==''){
			$('#error').text('공고명을 입력하세요');
			$('#recruitName').focus();
		}else if($('#recruitBegindate').val()==''){
			$('#error').text('채용시작일을 입력하세요');
			$('#recruitBegindate').focus();
		}else if($('#recruitEnddate').val()==''){
			$('#error').text('채용종료일을 입력하세요');
			$('#recruitEnddate').focus();
		}else if($('#jobMidindexName').val()==''){
			$('#error').text('직무를 입력하세요');
			$('#jobMidindexName').focus();
		}else if($('#recruitJobWorkstatus').val()==''){
			$('#error').text('채용형태를 입력하세요');
			$('#recruitJobWorkstatus').focus();
		}else if($('#recruitJobJobdetail').val()==''){
			$('#error').text('채용상세직무 입력하세요');
			$('#recruitJobJobdetail').focus();
		}else if($('#recruitJobEducation').val()==''){
			$('#error').text('학력을 입력하세요');
			$('#recruitJobEducation').focus();
		}else{
		$('#recruitInsertForm').submit();
		}
	}); 
});
</script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/module/modHeader.jsp"/>
	<form id="recruitInsertForm" action="/recruitInsert"  class="form-horizontal" method="post" enctype="multipart/form-data" >
		<h1>채용입력</h1>
		<div class="form-group" id="the-basics">
			채용기업<input class="typeahead" type="text"  class="form-control" name="CompanyName" id="CompanyName" placeholder="기업명을 입력하세요" value="${recruit.companyName}">
		</div>
		<div class="form-group">
			채용공고명<input type="text" name="recruitName" id="recruitName"  class="form-control" value="${recruit.recruitName}">
		</div>
		
		<div class="form-group">
			채용시작일<input type="date" name="recruitBegindate"id="recruitBegindate" class="form-control" value="${recruit.recruitBegindate}">
		</div>
		
		<div class="form-group">
			채용마감일<input type="date" name="recruitEnddate" id="recruitEnddate"class="form-control" value="${recruit.recruitEnddate}">
		</div>

	 	<div class="form-group">
			공고문(사진파일1장)
		<input type="file" name="recruitJobFile" id="recruitJobFile" >
		<span style="color:red">${errorMsg}</span>
		</div> 
		
		<!-- 직무등록--하나 기본으로 보이고 추가누를시 추가됨 -->
		<hr/>
		<h1>직무별 상세입력</h1>
		<div id="job">
			<div class="form-group">
			직무선택 : 
				<select name="jobTopIndexCd" id="jobTopIndexCd" >
					<option value="">대분류</option>
					<c:forEach var ="jobTopIndex" items="${jobTopIndex}">
						<option value="${jobTopIndex.jobTopIndexCd}">${jobTopIndex.jobTopIndexName}</option>
					</c:forEach>
				</select>
				<select name="jobMidIndexCd" id="jobMidIndexCd" >
					<option value="">소분류</option>
						<%-- <option value="${jobIndex.jobMidIndexCd}">${jobIndex.jobMidIndexName}</option> --%>
				</select>

			</div>
			
			<div class="form-group">
				채용형태(선택)
				<select name="recruitJobWorkstatus" id="recruitJobWorkstatus" >
					<option value="신입">신입</option>
					<option value="경력">경력</option>
					<option value="인턴">인턴</option>
					<option value="계약직">계약직</option>
				</select>
			</div>
			
			<div class="form-group">
				채용상세직무
				<%-- 리스트로 들어가니까 value="${recruit.recruitEnddate}"를 하면 [ㅇㄹㅇ]이런 형식으로 들어간당 --%>
				<input type="text" name="recruitJobJobdetail" id="recruitJobJobdetail" class="form-control">
			</div>
			
			<div class="form-group">
				학력
				<select name="recruitJobEducation" id="recruitJobEducation" class="form-control" >
					<option value="학력무관">학력무관</option>
					<option value="고졸">고졸</option>
					<option value="전문대졸">전문대졸</option>
					<option value="4년대졸">4년대졸</option>
				</select>
			</div>
		</div>
		<hr/>
		<div class="form-group">
			<input type="button" id="jobAddBtn" value="직무추가" > 
			<span id="jobAddError"></span>
		</div>
		
		<div class="form-group">
			<input type="button" id="recruitAdd"value="등록">
			<span id="error" style="color:red"></span>
		</div>
	</form>
</div>
</body>
</html>