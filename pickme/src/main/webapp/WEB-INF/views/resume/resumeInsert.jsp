<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>이력서</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/css/jasny-bootstrap.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/js/jasny-bootstrap.min.js"></script>
<script>
	//자격증 및 어학 검색 버튼 클릭시 팝업창띄우기
	function openPop() { 
	    window.open("/resumeCertilangIndex", "CertifiLang", "top=0, left=0, width=500, height=300, scrollbars=no, resizable=no ,status=no ,toolbar=no"); 
		}
</script>
</head>
<body>
	<jsp:include page="../common/module/modHeader.jsp"/>
	<div class="container" >
		<div class="jumbotron" align="center">
		<h1>이력서</h1>
		<p><strong>Pick Me</strong>는 절대 사용자 동의 없이 입력하신 정보를 외부로 유출,공개하지 않습니다.</p>
		</div>
			<form id="resumeInsert" action="/resumeList" method="post" enctype="multipart/form-data">	
				<div class="row">
						<div class="col-sm-2">
							<table class="table">
								<thead>
									<tr>
										<td><h4 align="center">이력서사진</h4><td>
									</tr>
								</thead>
								<tbody>
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
								</tbody>	
							</table>
						</div>
					<div class="col-sm-8">
						<table class="table">
							<thead>
								<tr><td colspan="2"><h4>개인신상정보</h4><td></tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">한글 이름</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personalKorName" name="personalKorName" placeholder="한글이름 입력"></td>
									<td class="col-sm-1">영문 이름</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personalEngName" name="" placeholder="영문이름 입력"></td>
								</tr>
								<tr>	
									<td class="col-sm-1">생년월일</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="personlBirthdate" name="" placeholder="생년월일 8자리 입력"></td>
									<td class="col-sm-1">성별</td>
									<td class="col-sm-3">
										<select class="form-control" id="personlGender" name="">
											<option value="">::선택::</option>
											<option value="male">남자</option>
											<option value="female">여자</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">일반전화</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personlPhone" name="" placeholder="일반전화번호 입력"></td>
									<td class="col-sm-1">휴대전화</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personlCellphone" name="" placeholder="휴대전화번호 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">이메일</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personlEmail" name="" placeholder="이메일주소 입력"></td>
									<td class="col-sm-1">SNS</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="personlSns" name="" placeholder="sns계정 또는 url 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">주소</td>
									<td colspan="5"><input type="text" class="form-control" id="personlAddr" name="" placeholder="주소 입력"></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td colspan="2"><h4>고등학교</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">학교명</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="highschoolName" name="" placeholder="학교명 입력 : ex)서울고등학교"></td>
									<td class="col-sm-1">분류</td>
									<td class="col-sm-3">
										<select class="form-control" class="form-control" id="highschoolCategory" name="">
											<option value="">::선택::</option>
											<option value="문과">문과</option>
											<option value="이과">이과</option>
											<option value="전문(실업)계">전문(실업)계</option>
											<option value="예체능">예체능</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">입학일자</td>
									<td class="col-sm-5"><input type="date" class="form-control" id="highschoolBegindate" name="" placeholder="입학일자 8자리입력"></td>
									<td class="col-sm-1">졸업일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="highschoolEnddate" name="" placeholder="졸업일자 8자리입력"></td>
								</tr>	
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>대학교</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">학교명</td>
									<td class="col-sm-2"><input type="text" class="form-control" id="universityName" name="universityName" placeholder="학교명 입력 : ex)서울대학교"></td>
									<td class="col-sm-1">분류</td>
									<td class="col-sm-2">
										<select class="form-control" id="universityCategory" name="universityCategory">
											<option value="">선택</option>
											<option value="2년제">2년제</option>
											<option value="3년제">3년제</option>
											<option value="4년제">4년제</option>
											<option value="대학원">대학원</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">입학일자</td>
									<td class="col-sm-2">
										<input type="date" class="form-control" id="universityBegindate" name="universityBegindate"  placeholder="입학일자 8자리입력">
									</td>
									<td class="col-sm-1">졸업일자</td>
									<td class="col-sm-2">	
										<input type="date" class="form-control" id="universityEnddate" name="universityEnddate" placeholder="졸업일자 8자리입력">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">주전공</td>
									<td class="col-sm-2">
										<input type="text" class="form-control" id="uiniversityMajor" name="uiniversityMajor" placeholder="ex)영어영문학과">
									</td>
									<td class="col-sm-2">복수전공/부전공</td>
									<td class="col-sm-1">
										<select class="form-control" id="uiniversityDmajorminor" name="uiniversityDmajorminor">
											<option value="">::선택::</option>
											<option value="복수전공">복수전공</option>
											<option value="부전공">부전공</option>
										</select>
									</td>
									<td class="col-sm-2">
										<input type="text" class="form-control" id="uiniversityDmajorminorName" name="uiniversityDmajorminorName" placeholder="ex)경영학과">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">학점</td>
									<td class="col-sm-2">
										<input type="text" class="form-control" id="uiniversityCredit" name="uiniversityCredit" placeholder="ex) 3.1/4.5">
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>가족사항</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">관계</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="familyRelation" name="familyRelation" placeholder="가족관계 입력 : ex) 부, 모, 남동생, 여동생"></td>
									<td class="col-sm-1">이름</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="familyName" name="familyName" placeholder="이름 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">생년월일</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="familyBirthdate" name="familyBirthdate" placeholder="생년월일 8자리 입력"></td>
									<td class="col-sm-1">학력</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="familyEducation" name="familyEducation" placeholder="학력 입력 : ex) 고졸, 대졸, 대재"></td>
								</tr>
								<tr>
									<td class="col-sm-1">직업</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="familyJob" name="familyJob" placeholder="직업 입력 : ex) 자영업, 회사원, 가사"></td>
									<td class="col-sm-1">동거여부</td>
									<td class="col-sm-3">
										<select class="form-control" id="familyCohabit" name="familyCohabit">
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
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>병역사항</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">병역구분</td>
									<td class="col-sm-3">
										<select class="form-control" id="militaryserviceState" name="militaryserviceState">
											<option value="">::선택::</option>
											<option value="현역">현역</option>
											<option value="예비역">예비역</option>
											<option value="보충역">보충역</option>
											<option value="제1국민역">제1국민역</option>
											<option value="제2국민역">제2국민역</option>
											<option value="해당없음">해당없음</option>
										</select>
									</td>
									<td class="col-sm-1">군별</td>
									<td class="col-sm-3">
										<select class="form-control" id="militaryserviceGroup" name="militaryserviceGroup">
											<option value="">::선택::</option>
											<option value="육군">육군</option>
											<option value="공군">공군</option>
											<option value="해군">해군</option>
											<option value="기타">기타</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">계급</td>
									<td class="col-sm-3">
										<select class="form-control" id="militaryserviceLevel" name="militaryserviceLevel">
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
									<td class="col-sm-1">병과</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="militaryserviceBranch" name="militaryserviceLevel" placeholder="ex) 소총수, 공병, 통신병">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">입영일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="militaryserviceBegindate" name="militaryserviceBegindate" placeholder="입영일자 8자리 입력"></td>
									<td class="col-sm-1">전역일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="militaryserviceEnddate" name="militaryserviceEnddate" placeholder="전역일자 8자리 입력"></td>
								</tr>	
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>자격면허</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">자격증명</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="certificateName" name="certificateName" placeholder="ex)정보처리기사">
										<a class="btn btn-default" href="javascript:openPop()" role="button">검색</a>
									</td>
									<td class="col-sm-1">발행기관</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="certificateHost" name="certificateHost" placeholder="ex)한국산업인력공단"></td>
								</tr>
								<tr>
									<td class="col-sm-1">등급</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="certificateGrade" name="certificateGrade" placeholder="ex)1급, 1종, 최종합격"></td>
									<td class="col-sm-1">등록번호</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="certificateRegnum" name="certificateRegnum" placeholder="등록번호 또는 자격번호 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">취득일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="certificateBegindate" name="certificateBegindate" placeholder="취득일자 8자리 입력"></td>
									<td class="col-sm-1">만료일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="certificateEnddate" name="certificateEnddate" placeholder="만료일자 8자리 입력"></td>
								</tr>	
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>경력사항</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">회사명</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="careerCompany" name="careerCompany" placeholder="회사 또는 근무처 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">입사일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="careerBegindate" name="careerBegindate" placeholder="근무시작일자 8자리 입력">
									</td>
									<td class="col-sm-1">퇴사일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="careerEnddate" name="careerEnddate" placeholder="근무종료일자 8자리 입력">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">근무기간</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="careerPeriod" name="careerPeriod" placeholder="퇴사사유 입력"></td>
									<td class="col-sm-1">퇴사사유</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="careerResign" name="careerResign" placeholder="퇴사사유 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">직급</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="careerLevel" name="careerLevel" placeholder="직급 입력 : ex) 대리, 인턴, 아르바이트 사원"></td>
									<td class="col-sm-1">부서</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="careerDepartment" name="careerDepartment" placeholder="부서 입력 : ex) 영업, 생산, 품질관리"></td>
								</tr>
								<tr>
									<td class="col-sm-1">담당업무</td>
									<td colspan="5"><textarea class="form-control" rows="3" id="careerTask" name="careerTask" placeholder="담당업무에 대한 간략한 설명"></textarea></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>어학</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">외국어명</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="languageName" name="languageName" placeholder="ex) 영어, 중국어, 일본어"></td>
									<td class="col-sm-1">구사수준</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="languageLevel" name="languageLevel" placeholder="ex) 일상회화가능, 비지니스회화 가능"></td>
								</tr>
								<tr>
									<td class="col-sm-1">외국어시험명</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="languageTest" name="languageTest" placeholder="ex) TOEIC, HSK, JLPT">
										<a class="btn btn-default" href="javascript:openPop()" role="button">검색</a>
									</td>	
									<td class="col-sm-1">공인점수</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="languageGrade" name="languageGrade" placeholder="ex) 990, 3급, AL"></td>
								</tr>
								<tr>
									<td class="col-sm-1">시행기관</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="languageHost" name="languageHost" placeholder="ex) 한국토익위원회">
									</td>	
									<td class="col-sm-1">등록번호</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="languageRegnum" name="languageRegnum" placeholder="등록번호 입력">
									</td>
								</tr>
								<tr>	
									<td class="col-sm-1">취득일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="languageBegindate" name="languageBegindate" placeholder="취득일자 8자리 입력">
									</td>
									<td class="col-sm-1">만료일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="languageEnddate" name="languageEnddate" placeholder="만료일자 8자리 입력">
									</td>
								</tr>
								
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>수상경력</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">수상명</td>
									<td class="col-sm-3">
										<input type="text" class="form-control" id="awardName" name="awardName" placeholder="수상명 입력">
									</td>
									<td class="col-sm-1">수상내용</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="awardContent" name="awardContent" placeholder="수상내용 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">수여기관</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="awardHost" name="awardHost" placeholder="수여기관 입력"></td>
									<td class="col-sm-1">수상일자</td>
									<td class="col-sm-3"><input type="date" class="form-control" id="awardDate" name="awardDate" placeholder="수여일자 8자리 입력"></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td colspan="3"><h4>국내외 연수 및 교육</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">국가</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="trainingCountry" name="trainingCountry" placeholder="연수국가 입력 : ex) 대한민국, 중국, 미국"></td>	
									<td class="col-sm-1">기관/단체</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="trainingAcademy" name="trainingAcademy" placeholder="연수기관 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">시작일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="trainingBegindate" name="trainingBegindate" placeholder="연수시작일자 8자리 입력">
									</td>
									<td class="col-sm-1">종료일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="trainingEnddate" name="trainingEnddate" placeholder="연수종료일자 8자리 입력">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">연수내용</td>
									<td colspan="3"><textarea class="form-control" rows="3" id="trainingContent" name="trainingContent" placeholder="연수사항에 대한 간략한 설명"></textarea></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td colspan="3"><h4>동아리 및 대외활동</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-1">동아리/대외활동명</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="activeName" name="activeName" placeholder="동아리/활동명 입력"></td>	
									<td class="col-sm-1">주관기관</td>
									<td class="col-sm-3"><input type="text" class="form-control" id="activeHost" name="activeHost" placeholder="주관기관 입력"></td>
								</tr>
								<tr>
									<td class="col-sm-1">활동시작일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="activeBegindate" name="activeBegindate" placeholder="활동시작일자 8자리 입력">
									</td>
									<td class="col-sm-1">활동종료일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="activeEnddate" name="activeEnddate" placeholder="활동종료일자 8자리 입력">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">활동내용</td>
									<td colspan="5"><textarea class="form-control" rows="3" id="activeContent" name="activeContent" placeholder="활동내용 대한 간략한 설명"></textarea></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<table class="table">
							<thead>
								<tr>
									<td><h4>기타 및 포트폴리오</h4><td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="col-sm-2">기타 및 포트폴리오명</td>
									<td colspan="5"><input type="text" class="form-control" id="etcTitle" name="etcTitle" placeholder="기타 및 포트폴리오명 입력"></td>
								</tr>
								<tr>	
									<td class="col-sm-1">시작일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="etcBegindate" name="etcBegindate" placeholder="시작일자 8자리 입력">
									</td>
									<td class="col-sm-1">종료일자</td>
									<td class="col-sm-3">
										<input type="date" class="form-control" id="etcEnddate" name="etcEnddate" placeholder="종료일자 8자리 입력">
									</td>
								</tr>
								<tr>
									<td class="col-sm-1">내용</td>
									<td colspan="5"><textarea class="form-control" rows="3" id="etcContent" name="etcContent" placeholder="간략한 설명"></textarea></td>
								</tr>
								<tr>	
									<td class="col-sm-2">첨부파일</td>
									<td class="col-sm-2">
										<div class="fileinput fileinput-new input-group" data-provides="fileinput">
  											<div class="form-control" data-trigger="fileinput"><i class="glyphicon glyphicon-file fileinput-exists"></i> 
  												<span class="fileinput-filename"></span>
  											</div>
	  											<span class="input-group-addon btn btn-default btn-file"><span class="fileinput-new">파일선택</span>
	  											<span class="fileinput-exists">변경</span>
	  											<input type="file" name="etcFile"></span>
	  											<a href="#" class="input-group-addon btn btn-default fileinput-exists" data-dismiss="fileinput">삭제</a>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			<input type="submit" class="btn btn-primary btn" id="insertBtn" value="이력서 저장"/>
		</form>	
	</div>
	<jsp:include page="../common/module/modFooter.jsp"/>
</body>
</html>

