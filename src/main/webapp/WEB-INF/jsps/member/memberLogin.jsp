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
							<form class="user" id="frm1">
								<div class="form-group">
									<input type="text" class="form-control form-control-user"
										id="tchrEmpNoId" name="tchrEmpNoId" aria-describedby="emailHelp"
										placeholder="로그인 계정(아이디 번호)" value="ZZZ1">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-user"
										id="usrPwd" name="usrPwd" placeholder="비밀번호" value="1111">
								</div>
								<!-- <div class="form-group">
									<div class="custom-control custom-checkbox small">
										<input type="checkbox" class="custom-control-input" id="customCheck">
										<label class="custom-control-label" for="customCheck">기억하기</label>
									</div>
								</div> -->
								<a href="#" class="btn btn-primary btn-user btn-block" id="btnLogin">로그인</a>
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


<%-- javascript area ------------------------------------------------------------------------------------------ --%>

<script type="text/javascript">

// ------ onLoad ------
$(document).ready(function() {
});

// ------ event ------
// 저장 버튼 클릭 - 
$('#btnLogin').click(function(){ 
	loginMember();
	$('#btnLogin').attr('disabled', true);
	setTimeout("$('#btnLogin').attr('disabled', false);", 3000);
});

// ----- process functions -----
// 저장 처리
function loginMember(){

	// ----- trim values

	$('#tchrEmpNoId').val($('#tchrEmpNoId').val().trim());
	$('#usrPwd').val($('#usrPwd').val().trim());
	
	// ----- validation check

	// var isOk = false;
	// isOk = checkEmail( $('#mbrEmlId').val() );
	// if ( !isOk ) { alert("아이디로 사용할 이메일 주소가 유효하지 않습니다."); return; }

	// ----- call api
	
	var data = formSerializeObjectToJson($('#frm1'));
	__log("send data : ", data);

	$.ajax({
		url : '/api/member/loginMember.ajax',
		type : 'POST',
		data : JSON.stringify(data),
		dataType: "json",
		contentType: "application/json",
		success : function(data) {
			__log(data); // return;
			if ( data.isConfirmed ){
				alert("로그인에 성공하였습니다.");
				location.href = "${pageContext.request.contextPath}/index"; // index page
			} else {
				// alert(data.message);
				alert('로그인에 실패하였습니다. \n확인 후 다시 시도하여 주시기 바랍니다. ');
			}
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('처리 중 에러가 발생하였습니다. '
					+ '\n확인 후 다시 시도하여 주시기 바랍니다. '
					+ '\n'
					+ '\nError : ' + textStatus + '[' + jqXHR.status + ']'
			);
		}
	});
}

</script>
<%-- / javascript area ------------------------------------------------------------------------------------------ --%>
