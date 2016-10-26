<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="/css/modern-business.css" rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- <script src="/js/jquery.js"></script> -->
    <!-- Bootstrap Core JavaScript -->
<script src="/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function(){
		 $('.carousel').carousel({
		        interval: 5000 //changes the speed
		 });
	});
   
    </script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/module/modHeader.jsp"/>
<div class="container">
	<div class="jumbotron text-center">
		<h1>PICK ME</h1>
	</div>
	 <header id="myCarousel" class="carousel slide">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="item active">
                <div id="section1" class="container-fluid">
					<h1>채용달력 소개</h1>
					<p>실시간 채용정보는 물론<br>나에게 딱 맞는 공고도 <br> 추천받을 수 있어요! </p>
				</div>
            </div>
            <div class="item">
            	<div id="section2" class="container-fluid">
					<h1>이력서</h1>
						<p>자기소개서 문항 찾으러 헤매지 마세요! <br> 빠르고 정확하게 알려드릴게요~ </p>
				</div>
            </div>
            <div class="item">
            	<div id="section3" class="container-fluid">
				  	<h1>자기소개서</h1>
					<p>!!!!!!!!!!!!!!!!!!!!</p>
				</div>
        	</div>
        </div>
        <!-- Controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="icon-next"></span>
        </a>
    
    </header>
	<footer>
		<div class="text-center">
	    	<a href="http://blog.anchoreer.com/220470732604" target="_blank">회사소개</a> | <a href="" ng-click="inquiry()">문의하기</a> | <a href="/privacy">개인정보취급방침</a> | <a href="" ng-click="partnership()">제휴/광고</a>
	    	<div>
	      		<span>(주)PICK ME(대표: 윤상섭)</span> |
	      		<span>개인정보보호관리자: 윤상섭</span>
	    	</div>
	    	<div>
	      		<span>전북 전주시 덕진구 기린대로 446</span> |
	      		<span>전화번호: 063-717-1008</span>
	    	</div>
	    	<div>
	      		<span>사업자등록 : 000-0000-00000</span> |
	      		<span>직업정보제공사업 : J1200020160017</span> | 
	      		<span>통신판매업 : 2016-서울강남-00784</span>
	    	</div>
	    	<div>
	     		<span>Copyright Anchoreer Co., Inc. All rights reserved.</span>
	    	</div>
	    </div>
	</footer>
</div>
</body>
</html>
