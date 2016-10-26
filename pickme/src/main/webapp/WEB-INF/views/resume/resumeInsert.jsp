<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>이력서</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../common/module/modHeader.jsp"/>
	<div class="container">
		<h1>이력서</h1>
		<div class="row">
			<h4>개인신상정보</h4>
			<p>입력하신 정보는 절대 사용자 동의 없이 외부로 유출,공개되지 않습니다.</p>
			<div class="col-sm-2">사진입력예정</div>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>한글 이름</th>
							<td><input type="text" class="form-control" id="personalKorName" placeholder="한글이름 입력"></td>
							<th>영문 이름</th>
							<td><input type="text" class="form-control" id="personalEngName" placeholder="영문이름 입력"></td>
						</tr>
						<tr>	
							<th>생년월일</th>
							<td><input type="text" class="form-control" id="personlBirthdate" placeholder="생년월일 8자리 입력"></td>
							<th>성별</th>
							<td>
								<select class="form-control" id="personlGender">
									<option value="">::선택::</option>
									<option value="male">남자</option>
									<option value="female">여자</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>일반전화</th>
							<td><input type="text" class="form-control" id="personlPhone" placeholder="일반전화번호 입력"></td>
							<th>휴대전화</th>
							<td><input type="text" class="form-control" id="personlCellphone" placeholder="휴대전화번호 입력"></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><input type="text" class="form-control" id="personlEmail" placeholder="이메일주소 입력"></td>
							<th>SNS</th>
							<td><input type="text" class="form-control" id="personlSns" placeholder="sns계정 또는 url 입력"></td>
						</tr>
						<tr>
							<th>주소</th>
							<td><input type="text" class="form-control" id="personlAddr" placeholder="주소 입력"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>고등학교</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
						<th>기간</th>
							<td>
								<input type="text" class="form-control" id="educationBegindate" placeholder="입학일자 8자리입력">~
								<input type="text" class="form-control" id="educationEnddate" placeholder="졸업일자 8자리입력">
							</td>
						</tr>
						<tr>
							<th>학교명</th>
							<td colspan="9"><input type="text" class="form-control" id="educationName" placeholder="학교명 입력 : ex)서울고등학교"></td>
							<th>분류</th>
							<td>
								<select class="form-control">
									<option value="">::선택::</option>
									<option value="문과">문과</option>
									<option value="이과">이과</option>
									<option value="전문(실업)계">전문(실업)계</option>
									<option value="예체능">예체능</option>
								</select>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>대학교</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>기간</th>
							<td>
								<input type="text" class="form-control" id="educationBegindate" placeholder="입학일자 8자리입력">~
								<input type="text" class="form-control" id="educationEnddate" placeholder="졸업일자 8자리입력">
							</td>
						</tr>
						<tr>
							<th>학교명</th>
							<td><input type="text" class="form-control" id="educationName" placeholder="학교명 입력 : ex)서울대학교"></td>
							<th>분류</th>
							<td>
								<select class="form-control">
									<option value="">::선택::</option>
									<option value="2년제">2년제</option>
									<option value="3년제">3년제</option>
									<option value="4년제">4년제</option>
									<option value="대학원">대학원</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>주전공</th>
							<td><input type="text" class="form-control" id="educationMajor" placeholder="전공명 입력 : ex)영어영문학과"></td>
						</tr>
						<tr>
							<th>복수전공/부전공</th><!-- 변경사항 -->
							<td>
								<select class="form-control">
									<option value="">::선택::</option>
									<option value="doublemajor">복수전공</option>
									<option value="minor">부전공</option>
								</select>
								<input type="text" class="form-control" id="educationMinor" placeholder="복수/부전공명 입력 : ex)경영학과">
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>가족사항</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>관계</th>
							<td><input type="text" class="form-control" id="familyRelation" placeholder="가족관계 입력 : ex) 부, 모, 남동생, 여동생"></td>
							<th>이름</th>
							<td><input type="text" class="form-control" id="familyName" placeholder="이름 입력"></td>
						</tr>
						<tr>
							<th>생년월일</th>
							<td><input type="text" class="form-control" id="familyBirthdate" placeholder="생년월일 8자리 입력"></td>
							<th>학력</th>
							<td><input type="text" class="form-control" id="familyEducation" placeholder="학력 입력 : ex) 고졸, 대졸, 대재"></td>
						</tr>
						<tr>
							<th>직업</th>
							<td><input type="text" class="form-control" id="familyJob" placeholder="직업 입력 : ex) 자영업, 회사원, 가사"></td>
						</tr>
						<tr>
							<th>동거여부</th>
							<td>
								<select class="form-control" id="familyCohabit">
									<option value="">::선택::</option>
									<option value="y">예</option>
									<option value="n">아니요</option>
								</select>
							</td>	
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>병역</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>병역구분</th>
							<td>
								<select class="form-control" id="militaryserviceState">
									<option value="">::선택::</option>
									<option value="현역">현역</option>
									<option value="예비역">예비역</option>
									<option value="보충역">보충역</option>
									<option value="제1국민역">제1국민역</option>
									<option value="제2국민역">제2국민역</option>
									<option value="해당없음">해당없음</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>군별</th>
							<td>
								<select class="form-control" id="militaryserviceGroup">
									<option value="">::선택::</option>
									<option value="육군">육군</option>
									<option value="공군">공군</option>
									<option value="해군">해군</option>
									<option value="기타">기타</option>
								</select>
							</td>
							<th>계급</th>
							<td>
								<select class="form-control" id="militaryserviceLevel">
									<option value="">::선택::</option>
									<option value="이병">이병</option>
									<option value="일병">일병</option>
									<option value="상병">상병</option>
									<option value="병장">병장</option>
									<option value="하사">하사</option>
									<option value="중사">중사</option>
									<option value="상사">상사</option>
									<option value="원사">원사</option>
									<option value="준위">준위</option>
									<option value="소위">소위</option>
									<option value="중위">중위</option>
									<option value="대위">대위</option>
									<option value="소령">소령</option>
									<option value="중령">중령</option>
									<option value="대령">대령</option>
									<option value="준장">준장</option>
									<option value="소장">소장</option>
									<option value="중장">중장</option>
									<option value="대장">대장</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>입영일자</th>
							<td><input type="text" class="form-control" id="militaryserviceBegindate" placeholder="입영일자 8자리 입력"></td>
							<th>전역일자</th>
							<td><input type="text" class="form-control" id="militaryserviceEnddate" placeholder="전역일자 8자리 입력"></td>
						</tr>	
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>자격면허</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>자격증명</th>
							<td><input type="text" class="form-control" id="certificateName" placeholder="자격증 입력 : ex)정보처리기사"></td>
						</tr>
						<tr>
							<th>발행기관</th>
							<td><input type="text" class="form-control" id="certificateHost" placeholder="발행기관 입력 : ex)한국산업인력공단"></td>
							<th>등급</th>
							<td><input type="text" class="form-control" id="certificateGrade" placeholder="등급 입력 : ex)1급, 1종, 최종합격"></td>
						</tr>
						<tr>
							<th>취득일자</th>
							<td><input type="text" class="form-control" id="certificateBegindate" placeholder="취득일자 8자리 입력"></td>
							<th>만료일자</th>
							<td><input type="text" class="form-control" id="certificateEnddate" placeholder="만료일자 8자리 입력"></td>
						</tr>	
						<tr>
							<th>등록번호</th>
							<td><input type="text" class="form-control" id="certificateRegnum" placeholder="자격증 등록번호 또는 자격번호 입력"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>경력사항</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>회사명</th>
							<td><input type="text" class="form-control" id="careerCompany" placeholder="회사 또는 근무처 입력"></td>
							<th>근무기간</th>
							<td>
								<input type="text" class="form-control" id="careerBegindate" placeholder="근무시작일자 8자리 입력">~
								<input type="text" class="form-control" id="careerEnddate" placeholder="근무종료일자 8자리 입력">
							</td>
						</tr>
						<tr>
							<th>직급</th>
							<td><input type="text" class="form-control" id="careerLevel" placeholder="직급 입력 : ex) 대리, 인턴, 아르바이트 사원"></td>
							<th>부서</th>
							<td><input type="text" class="form-control" id="careerDepartment" placeholder="부서 입력 : ex) 영업, 생산, 품질관리"></td>
						</tr>
						<tr>
							<th>담당업무</th>
							<td><textarea class="form-control" rows="3" id="careerTask" placeholder="담당업무에 대한 간략한 설명"></textarea></td>
						</tr>
						<tr>
							<th>퇴사사유</th>
							<td><input type="text" class="form-control" id="careerResign" placeholder="퇴사사유 입력"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>어학</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>외국어명</th>
							<td><input type="text" class="form-control" id="languageName" placeholder="외국어명 입력 : ex) 영어, 중국어, 일본어"></td>
							<th>외국어시험명</th>
							<td><input type="text" class="form-control" id="languageTest" placeholder="시험명 입력 : ex) TOEIC, HSK, JLPT"></td>
						</tr>
						<tr>
							<th>점수/등급</th>
							<td><input type="text" class="form-control" id="languageGrade" placeholder="외국어 시험점수/등급 입력 ex) 990, 3급"></td>
							<th>취득일자/만료일자</th>
							<td>
								<input type="text" class="form-control" id="languageBegindate" placeholder="취득일자 8자리 입력">~
								<input type="text" class="form-control" id="languageEnddate" placeholder="만료일자 8자리 입력">
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>수상경력</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>수상명</th>
							<td>
								<input type="text" class="form-control" id="awardName" placeholder="수상명 입력">
							</td>
							<th>수상내용</th>
							<td><input type="text" class="form-control" id="awardContent" placeholder="수상내용 입력"></td>
						</tr>
						<tr>
							<th>수여기관</th>
							<td><input type="text" class="form-control" id="awardHost" placeholder="수여기관 입력"></td>
							<th>수상일자</th>
							<td><input type="text" class="form-control" id="awardDate" placeholder="수여일자 8자리 입력"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h4>국내외 연수사항</h4>
			<div class="col-sm-10">
				<table class="table">
					<tbody>
						<tr>
							<th>국가</th>
							<td><input type="text" class="form-control" id="trainingCountry" placeholder="연수국가 입력 : ex) 대한민국, 중국, 미국"></td>	
							<th>기관</th>
							<td><input type="text" class="form-control" id="trainingAcademy" placeholder="연수기관 입력"c></td>
						</tr>
						<tr>
							<th>연수내용</th>
							<td><textarea class="form-control" rows="3" id="trainingContent" placeholder="연수사항에 대한 간략한 설명"></textarea></td>
							<th>연수기간</th>
							<td>
								<input type="text" class="form-control" id="trainingBegindate" placeholder="연수시작일자 8자리 입력">~
								<input type="text" class="form-control" id="trainingEnddate" placeholder="연수종료일자 8자리 입력">
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>

