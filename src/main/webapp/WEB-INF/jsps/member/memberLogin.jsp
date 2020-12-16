<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="row justify-content-center">

	<div class="col-xl-10 col-lg-12 col-md-9">

		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
					<div class="col-lg-6">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">동고비 운영 시스템 로그인</h1>
							</div>
							<form class="user">
								<div class="form-group">
									<input type="email" class="form-control form-control-user"ㅌ`
										id="exampleInputEmail" aria-describedby="emailHelp"
										placeholder="로그인 계정(아이디 번호)">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-user"
										id="exampleInputPassword" placeholder="비밀번호">
								</div>
								<!-- <div class="form-group">
									<div class="custom-control custom-checkbox small">
										<input type="checkbox" class="custom-control-input" id="customCheck">
										<label class="custom-control-label" for="customCheck">기억하기</label>
									</div>
								</div> -->
								<a href="index.html" class="btn btn-primary btn-user btn-block">로그인</a>
							</form>
							<hr>
							<% //TODO 비밀번호 분실시 찾기 기능  %>
							<div class="text-center">
								로그인 계정 생성은, 동고비 사무실로 문의 바랍니다.
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

</div>
