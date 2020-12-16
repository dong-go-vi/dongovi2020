<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- sidebar -->
		<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a class="sidebar-brand d-flex align-items-center justify-content-center" href="${pageContext.request.contextPath}/admin/index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-dove"></i><!-- 동고비 -->
				</div>
				<div class="sidebar-brand-text mx-3">동고비 운영 <sup>2020</sup></div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active">
				<a class="nav-link" href="index.html">
					<i class="fas fa-fw fa-tachometer-alt"></i>
					<span>Dashboard</span></a>
			</li>

			<!-- Divider -->
			<hr class="sidebar-divider">

<!-- 			<!-- Heading -->
<!-- 			<div class="sidebar-heading"> -->
<!-- 				Interface  -->
<!-- 			</div> -->
			
			
			<!-- 수업 관리 -->
			<li class="nav-item">
				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#clpsLsn"
				aria-expanded="true" aria-controls="clpsLsn">
					<span>수업 관리</span></a>
					
				<div id="clpsLsn" class="collapse" aria-labelledby="hdLsn" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="#">수업 현황</a>
						<a class="collapse-item" href="#">수업 등록 - 신규</a>
						<a class="collapse-item" href="#">수업 등록 - 연장</a>
						<a class="collapse-item" href="#">미납</a>
						<a class="collapse-item" href="#">종료</a>
						<a class="collapse-item" href="#">지역 관리</a>
						<a class="collapse-item" href="#">장소 관리</a>
						<a class="collapse-item" href="#">수업 형태 관리</a>
					</div>
				</div>	
					
			</li>
			
			<!-- 안내 발송 관리 -->
			<li class="nav-item">
				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#clpsSnd"
				aria-expanded="true" aria-controls="clpsSnd">
					<span>안내 발송 관리</span></a>
					
				<div id="clpsSnd" class="collapse" aria-labelledby="hdSnd" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="#">발송 확인</a>
						<a class="collapse-item" href="#">발송 안내</a>
						<a class="collapse-item" href="#">미납 발송</a>
						<a class="collapse-item" href="#">발송 내역 조회</a>
					</div>
				</div>	
					
			</li>
			
			<!-- 교사 / 팀 관리 -->
			<li class="nav-item">
				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#clpsTchr"
				aria-expanded="true" aria-controls="clpsTchr">
					<span>교사 / 팀 관리</span></a>
					
				<div id="clpsTchr" class="collapse" aria-labelledby="hdTchr" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="#">팀 관리</a>
						<a class="collapse-item" href="#">교사 정보</a>
						<a class="collapse-item" href="#">수업 시간표</a>
						<a class="collapse-item" href="#">월별 강사료 관리(관리자)</a>
						<a class="collapse-item" href="#">월별 강사료 관리(교사)</a>
						<a class="collapse-item" href="#">강사료 지급 내역</a>
					</div>
				</div>	
			</li>
			
			<!-- 재무 / 정산 조회 -->
			<li class="nav-item">
				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#clpsFnc"
				aria-expanded="true" aria-controls="clpsFnc">
					<span>재무 / 정산 조회</span></a>
					
				<div id="clpsFnc" class="collapse" aria-labelledby="hdFnc" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="#">일일 수강료 관리</a>
						<a class="collapse-item" href="#">매출 관리</a>
						<a class="collapse-item" href="#">일일 자금 흐름</a>
					</div>
				</div>	
			</li>
			
			<!-- 시스템 관리 -->
			<li class="nav-item">
				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#clpsSys"
				aria-expanded="true" aria-controls="clpsSys">
					<span>시스템 관리</span></a>
					
				<div id="clpsSys" class="collapse" aria-labelledby="hdSys" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="#">사용자 관리</a>
						<a class="collapse-item" href="#">로그인 관리</a>
						<a class="collapse-item" href="#">화면 관리</a>
						<a class="collapse-item" href="#">화면 권한 관리</a>
						<a class="collapse-item" href="#">공통 코드 관리</a>
					</div>
				</div>	
			</li>
			
			<li class="nav-item">
				<a class="nav-link" href="#">
 					<span>학생 조회</span></a>
			</li>
			

			<!-- Nav Item - Pages Collapse Menu -->
<!-- 			<li class="nav-item"> -->
<!-- 				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" -->
<!-- 					aria-expanded="true" aria-controls="collapseTwo"> -->
<!-- 					<i class="fas fa-fw fa-cog"></i> -->
<!-- 					<span>Components</span> -->
<!-- 				</a> -->
<!-- 				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar"> -->
<!-- 					<div class="bg-white py-2 collapse-inner rounded"> -->
<!-- 						<h6 class="collapse-header">Custom Components:</h6> -->
<!-- 						<a class="collapse-item" href="buttons.html">Buttons</a> -->
<!-- 						<a class="collapse-item" href="cards.html">Cards</a> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</li> -->

			<!-- Nav Item - Utilities Collapse Menu -->
<!-- 			<li class="nav-item"> -->
<!-- 				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" -->
<!-- 					aria-expanded="true" aria-controls="collapseUtilities"> -->
<!-- 					<i class="fas fa-fw fa-wrench"></i> -->
<!-- 					<span>Utilities</span> -->
<!-- 				</a> -->
<!-- 				<div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" -->
<!-- 					data-parent="#accordionSidebar"> -->
<!-- 					<div class="bg-white py-2 collapse-inner rounded"> -->
<!-- 						<h6 class="collapse-header">Custom Utilities:</h6> -->
<!-- 						<a class="collapse-item" href="utilities-color.html">Colors</a> -->
<!-- 						<a class="collapse-item" href="utilities-border.html">Borders</a> -->
<!-- 						<a class="collapse-item" href="utilities-animation.html">Animations</a> -->
<!-- 						<a class="collapse-item" href="utilities-other.html">Other</a> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</li> -->

			<!-- Divider -->
<!-- 			<hr class="sidebar-divider"> -->

			<!-- Heading -->
<!-- 			<div class="sidebar-heading"> -->
<!-- 				Addons -->
<!-- 			</div> -->

			<!-- Nav Item - Pages Collapse Menu -->
<!-- 			<li class="nav-item"> -->
<!-- 				<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" -->
<!-- 					aria-expanded="true" aria-controls="collapsePages"> -->
<!-- 					<i class="fas fa-fw fa-folder"></i> -->
<!-- 					<span>Pages</span> -->
<!-- 				</a> -->
<!-- 				<div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar"> -->
<!-- 					<div class="bg-white py-2 collapse-inner rounded"> -->
<!-- 						<h6 class="collapse-header">Login Screens:</h6> -->
<!-- 						<a class="collapse-item" href="login.html">Login</a> -->
<!-- 						<a class="collapse-item" href="register.html">Register</a> -->
<!-- 						<a class="collapse-item" href="forgot-password.html">Forgot Password</a> -->
<!-- 						<div class="collapse-divider"></div> -->
<!-- 						<h6 class="collapse-header">Other Pages:</h6> -->
<!-- 						<a class="collapse-item" href="404.html">404 Page</a> -->
<!-- 						<a class="collapse-item" href="blank.html">Blank Page</a> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</li> -->

			<!-- Nav Item - Charts -->
<!-- 			<li class="nav-item"> -->
<!-- 				<a class="nav-link" href="charts.html"> -->
<!-- 					<i class="fas fa-fw fa-chart-area"></i> -->
<!-- 					<span>Charts</span></a> -->
<!-- 			</li> -->

			<!-- Nav Item - Tables -->
<!-- 			<li class="nav-item"> -->
<!-- 				<a class="nav-link" href="tables.html"> -->
<!-- 					<i class="fas fa-fw fa-table"></i> -->
<!-- 					<span>Tables</span></a> -->
<!-- 			</li> -->

			<!-- Divider -->
<!-- 			<hr class="sidebar-divider d-none d-md-block"> -->


			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

			<!-- Sidebar Message -->
<!-- 			<div class="sidebar-card"> -->
<!-- 				<img class="sidebar-card-illustration mb-2" src="img/undraw_rocket.svg" alt=""> -->
<!-- 				<p class="text-center mb-2"><strong>SB Admin Pro</strong> is packed with premium features, components, and more!</p> -->
<!-- 				<a class="btn btn-success btn-sm" href="https://startbootstrap.com/theme/sb-admin-pro">Upgrade to Pro!</a> -->
<!-- 			</div> -->

		</ul>