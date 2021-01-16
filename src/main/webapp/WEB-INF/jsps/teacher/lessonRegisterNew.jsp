<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<link rel="stylesheet" href=  
"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
      
<script src="https://uicdn.toast.com/grid/v4.10.1/tui-grid.js"></script>
<link rel="stylesheet" href="https://uicdn.toast.com/grid/v4.10.1/tui-grid.css" />

</head>
<body>
	
	<div class="container-fluid">
		
		<!-- 페이지 이름 -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">
				수업 등록 - 신규
			</h1>
		</div>
		
		<!-- content -->
		<div class="card pt-3 px-3 mb-4 border-left-primary">
			<form id="" class="form-inline" role="form">
				<table class="table table-bordered initialism">
					<tr>
						<th class="bg-gray-200 text-dark">수업 번호</th>
						<th class="text-center">1</th>
						<th class="bg-gray-200 text-dark">수업 장소</th>
						<td class="p-2">
							<select id="area1" class="ml-3">
								<option>전체</option>
								<option>강동</option>
								<option>강남</option>
							</select>
							<select id="area2">
								<option>전체</option>
								<option>강동</option>
								<option>강남</option>
							</select>
							<select id="area3">
								<option>전체</option>
								<option>강동</option>
								<option>강남</option>
							</select>
							<label for="lessonPlace" class="d-inline-block font-weight-bold text-primary pl-3">
								장소
							</label>
							<input id="lessonPlace" type="text" style="width:100px;">
						</td>
						<th class="bg-gray-200 text-dark">교사 정보</th>
						<td class="p-2">
							<label for="team" class="d-inline-block font-weight-bold text-primary pl-3">
								팀
							</label>
							<select id="team">
								<option>전체</option>
								<option>강동</option>
								<option>강남</option>
							</select>
							<label for="teacherNick" class="d-inline-block font-weight-bold text-primary pl-3">
								이름
							</label>
							<input id="teacherNick" type="text" style="width:100px;">
						</td>
					</tr>
					<tr>
						<th class="bg-gray-200 text-dark">소속 기관</th>
						<td class="p-2">
							<input id="" class="ml-3" type="text" style="width:100px;">
						</td>
						<th class="bg-gray-200 text-dark">수업 형태</th>
						<td class="p-2">
							<label for="grade" class="d-inline-block font-weight-bold text-primary pl-3">
								학년
							</label>
							<select id="grade">
								<option>전체</option>
								<option>유치부</option>
								<option>초등부</option>
								<option>혼합</option>
								<option>4세</option>
								<option>5세</option>
								<option>6세</option>
								<option>7세</option>
								<option>초1</option>
								<option>초2</option>
								<option>초3</option>
							</select>
							<label for="lessonForm" class="d-inline-block font-weight-bold text-primary pl-3">
								형태
							</label>
							<select id="lessonForm">
								<option>전체</option>
								<option>생태</option>
								<option>특강</option>
							</select>
							<label for="studentCount" class="d-inline-block font-weight-bold text-primary pl-3">
								인원
							</label>
							<input id="studentCount" type="text" style="width:60px;">
						</td>
						<th class="bg-gray-200 text-dark">수업 횟수</th>
						<td class="p-2">
							<label for="" class="d-inline-block font-weight-bold text-primary pl-3">
								계약 횟수
							</label>
							<input id="" type="text" style="width:35px;">
							<label for="" class="d-inline-block font-weight-bold text-primary pl-3">
								현재 진행
							</label>
							<input id="" type="text" style="width:35px;">
						</td>
						
					</tr>
					<tr>
						<th class="bg-gray-200 text-dark">대표 학생</th>
						<td class="p-2">
							<input id="" type="text" class="ml-3" style="width:100px;">
						</td>
						<th class="bg-gray-200 text-dark">예정 일시</th>
						<td class="p-2">
							<label for="" class="d-inline-block font-weight-bold text-primary pl-3">
								시작
							</label>
							<input id="planStartDate" class="datepicker" type="text" style="width:115px;">
							<label for="" class="d-inline-block font-weight-bold text-primary pl-3">
								종료
							</label>
							<input id="planEndDate" class="datepicker" type="text" style="width:115px;">
						</td>
						<th class="bg-gray-200 text-dark">수업 일시</th>
						<td class="p-2">
							<input id="week" type="text" class="ml-3" style="width:40px;">
							<label for="week" class="d-inline-block font-weight-bold text-primary pr-3">
								주
							</label>
							<input id="week" type="text" style="width:40px;">
							<label for="day" class="d-inline-block font-weight-bold text-primary pr-3">
								요일
							</label>
							<select>
								<option>전체</option>
								<option>00</option>
								<option>01</option>
							</select>
							:
							<select>
								<option>전체</option>
								<option>00</option>
								<option>10</option>
							</select>						
						</td>
					</tr>
					<tr>
						<th class="bg-gray-200 text-dark">수강료</th>
						<td class="p-2">
							<input id="" type="text" class="ml-3" style="width:100px;">
						</td>
						<th class="bg-gray-200 text-dark">입금 방식</th>
						<td class="p-2 align-middle">
							<label for="collectForm" class="d-inline-block font-weight-bold text-primary pl-3">
								형태
							</label>
							<select id="collectForm">
								<option>개별</option>
								<option>일괄</option>
							</select>
							<label for="guideAccount" class="d-inline-block font-weight-bold text-primary pl-3">
								안내
							</label>
							<select id="guideAccount" class="mr-2">
								<option>신한</option>
								<option>우리</option>
							</select>
							<input id="guideDay" class="datepicker" type="text" style="width:115px;">
						</td>
						<th class="bg-gray-200 text-dark">강의료</th>
						<td class="p-2 align-middle">
							<input id="" class="ml-3" type="text" style="width:100px;">
							<label for="updateUnitLecFee" class="d-inline-block font-weight-bold text-primary pl-3">
								수정
							</label>
							<input id="updateUnitLecFee" type="text" style="width:100px;">
						</td>
					</tr>
					<tr>
						<th class="bg-gray-200 text-dark">비고</th>
						<td class="p-2 align-middle" colspan="5">
							<input type="text" class="ml-3" style="width:580px;">
						</td>
					</tr>
				</table>
			</form>
		</div>	
		
		<!-- 학생 정보 -->
		<div class="card w-50 pt-3 px-3 mb-4 border-left-primary d-inline-block">
			<div class="w-100 mb-3">
				<a href="" class="btn btn-primary btn-sm font-weight-bold">
					학생 추가
				</a>
				<a href="" class="btn btn-primary btn-sm font-weight-bold ml-3">
					학생 검색
				</a>
			</div>
			
			<form id="" class="form-inline" role="form">
				<table class="table table-bordered initialism text-center">
					<tr>
						<th class="bg-gray-200 text-dark">이름</th>
						<td class="p-0 align-middle text-dark">
							<input class="ml-3" type="text" style="width:100px"></td>
						<th class="bg-gray-200 text-dark">연락처</th>
						<td class="p-0 align-middle text-dark">
							<input class="ml-3" type="text" style="width:120px">
						</td>
						<th class="bg-gray-200 text-dark">대표</th>
						<td class="text-center">
							<input type="checkbox">
						</td>
					</tr>
					
				</table>
			</form>
		</div>
			
		<!-- 등록 버튼 -->	
		<div class="col-md-3 mb-4 float-right align-baseline">
			<a href="" class="btn btn-primary btn-block font-weight-bold">
				등록
			</a> 
		</div>	
</div>					
		
		
	
</body>
</html>