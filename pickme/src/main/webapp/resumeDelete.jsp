<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/typeahead.js/0.11.1/typeahead.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/corejs-typeahead/0.11.1/bloodhound.js"></script>
<script type="text/javascript">
function add_div(){
    var div = document.createElement('div');

    div.innerHTML = document.getElementById('room_type').innerHTML;
    document.getElementById('field').appendChild(div);
}

function remove_div(obj){
document.getElementById('field').removeChild(obj.parentNode);
}
</script>
</head>
<body>
<div class="container">
<input type="button" value="추가" onclick="add_div()"><br/>
<div class="row" id="room_type">
					<div class="col-sm-12">
						<table class="table">
							<thead>
								<tr>
									<td><h4>가족사항</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">관계</td>
									<td class="col-sm-2"><input type="text" class="form-control" id="familyRelation" name="familyRelation" placeholder="ex) 부, 모, 남동생, 여동생"></td>
									<td class="col-sm-1">이름</td>
									<td class="col-sm-2"><input type="text" class="form-control" id="familyName" name="familyName" placeholder="이름 입력"></td>
									<td class="col-sm-1">생년월일</td>
									<td class="col-sm-2"><input type="date" class="form-control" id="familyBirthdate" name="familyBirthdate"></td>
								</tr>
								<tr>
									<td class="col-sm-1">학력</td>
									<td class="col-sm-2"><input type="text" class="form-control" id="familyEducation" name="familyEducation" placeholder="ex) 고졸, 대졸, 대재"></td>
									<td class="col-sm-1">직업</td>
									<td class="col-sm-2"><input type="text" class="form-control" id="familyJob" name="familyJob" placeholder="ex) 자영업, 회사원, 가사"></td>
									<td class="col-sm-1">동거여부</td>
									<td class="col-sm-2">
										<select class="form-control" id="familyCohabit" name="familyCohabit">
											<option value="">::선택::</option>
											<option value="예">예</option>
											<option value="아니요">아니요</option>
										</select>
									</td>	
								</tr>
							</tbody>
						</table>
					</div>
<input type="button" value="삭제" onclick="remove_div(this)">
</div>
<div id="field"></div>
</div>
</body>
</html>