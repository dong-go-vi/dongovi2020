<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<script src="https://uicdn.toast.com/grid/v4.10.1/tui-grid.js"></script>
<link rel="stylesheet" href="https://uicdn.toast.com/grid/v4.10.1/tui-grid.css" />

</head>
<body>
	
	<div class="container-fluid">
		
		<!-- 페이지 이름 -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">
				수업 현황
			</h1>
		</div>
		
		<!-- content -->
		
		<!-- 수업 번호 검색 -->
		<div class="card w-100 mb-4 py-0 border-left-primary">
			<div class="card-body py-2">
				<form class="form-inline d-inline-block" role="form" id="lessonNumber">
					<div class="form-group">
						<label for="placeName" class="font-weight-bold text-primary col-md-4">
							수업 번호
						</label>
						<input id="placeName" type="text" class="form-control w-25 small col-md-4">
						<div class="float-right col-md-2">
							<button class="btn btn-primary btn-sm btn-circle">
								<i class=" fas fa-search"></i>
							</button>
						</div>
					</div>
				</form>
				
				<a href="#collapseSearchBox" class="d-inline-block py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseSearchBox">
					<span class="m-0 font-weight-bold text-primary">상세 검색</span>
				</a>
				<div class="d-inline-block float-right mt-2">
					<div class="d-inline-block pr-3">
					<a href="#" class="btn btn-sm btn-primary font-weight-bold">
						연장
					</a>
					</div>
					<div class="d-inline-block pr-3">
					<a href="#" class="btn btn-sm btn-primary font-weight-bold">
						수정
					</a>
					</div>
					<div class="d-inline-block">
					<a href="#" class="btn btn-sm btn-primary font-weight-bold">
						삭제
					</a>
					</div>
				</div>
			<!-- 상세 내용 검색 -->
				<div class="collapse pt-3" id="collapseSearchBox">
				
					<form id="lessonSearch" class="form-inline" role="form">
						<table class="table table-bordered">
							<tr>
								<th class="bg-gray-200 text-dark" style="width:10%;">교사 정보</th>
								<td style="width:40%;">
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
									<input id="teacherNick" type="text" class="w-25">
								</td>
								<th class="bg-gray-200 text-dark" style="width:10%;">학생 정보</th>
								<td style="width:40%;">
									<label for="studentName" class="d-inline-block font-weight-bold text-primary pl-3">
										이름
									</label>
									<input id="studentName" type="text" class="w-25">
									<label for="studentTel" class="d-inline-block font-weight-bold text-primary pl-3">
										연락처
									</label>
									<input id="studentTel" type="text" class="w-25">
								</td>
								
							</tr>
							
							<tr>
								<th class="bg-gray-200 text-dark">수업 시간</th>
								<td>
									<select id="week" class="ml-3">
										<option>전체</option>
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
									</select>
									<label for="week" class="d-inline-block font-weight-bold text-primary pr-3">
										주
									</label>
									
									<select id="day">
										<option>토</option>
										<option>일</option>
										<option>월</option>
									</select>
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
								<th class="bg-gray-200 text-dark">수업 장소</th>
								<td>
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
									<input id="lessonPlace" type="text" class="w-25">
								</td>
								
								</tr>
								<tr>
								<th class="bg-gray-200 text-dark">수업 형태</th>
								<td class=" text-gray-900" >
									<input type="checkbox" name="lessonType" id="lsnType1" class="ml-3">
									<label for="lsnType1" class="d-inline-block pr-3">
										생태
									</label>							
									<input type="checkbox" name="lessonType" id="lsnType2">
									<label for="lsnType2" class="d-inline-block pr-3">
										숲마실
									</label>
									<input type="checkbox" name="lessonType" id="lsnType3">
									<label for="lsnType3" class="d-inline-block pr-3">
										특강
									</label>
									<input type="checkbox" name="lessonType" id="lsnType4">
									<label for="lsnType4" class="d-inline-block pr-3">
										밤곤충
									</label>	
								</td>
								<th class="bg-gray-200 text-dark">입금 금액</th>
								<td>
									<label for="lessonFee" class="d-inline-block font-weight-bold text-primary pl-3">
										금액
									</label>
									<input id="lessonPlace" type="text" class="w-25">							
									<label for="area3" class="d-inline-block font-weight-bold text-primary pl-3">
										형태
									</label>
									<select id="area3">
										<option>전체</option>
										<option>일괄</option>
										<option>개별</option>
									</select>
								</td>
							</tr>
						</table>
						
						<button class="btn btn-sm bg-primary text-white font-weight-bold mx-auto mb-2">
								검색
						</button>
					</form>
				</div>
			</div>
			
		</div>
	
				
		<div id="grid" class="mb-4">
		
		</div>
</div>					
		
		
	
</body>

<script type="text/javascript">

const data = [
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	},
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	},
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	},
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	},
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	},
	{
		rlyLsnNo: '1',
		araNm : '강동구',
		plcNm : '올림픽공원',
		teamNm : '강동',
		thcrNk : '초롱이',
		affOrgNm : '초등부',
		grdCd : '1학년',
		lsnFrmNm : '생태',
		stdntNo : '6',
		stdntNm : '김학생',
		wkCd : '1',
		dowCd : '토',
		hhMm : '12:00',
		ctrtLsnCnt : '6',
		schdStrtDy : '2021-01-01',
		schdEndDy : '',
		rlyStrtDy : '2021-01-03',
		rlyEndDy : '',
		psntPrgsLsnCnt : '0',
		leftLsnCnt : '6',
		allTtn : '720000',
		cltFrmCd : '개별',
		gudAcntCd : '신한',
		gudDy : '2020-12-31',
		ttnDpstFnshDy : '2021-01-12',
		untLtrFee : '90000',
		lsnRmks : ''
	}
       
    ];
    
const grid = new tui.Grid({
  el: document.getElementById('grid'),
  scrollX: true,
  scrollY: true,
  bodyHeight:400,
  rowHeaders: ['checkbox'],
  columns: [
	{
		header: '수업 번호',
		name: 'rlyLsnNo'
    },
    {
		header: '지역',
		name: 'araNm'
    },
    {
		header: '장소',
		name: 'plcNm'
    },
    {
		header: '팀',
		name: 'teamNm'
    },
    {
		header: '선생님',
		name: 'thcrNk'
    },
    {
		header: '소속 기관',
		name: 'affOrgNm'
    },
    {
		header: '학년',
		name: 'grdCd'
    },
    {
		header: '수업 형태',
		name: 'lsnFrmNm'
    },
    {
		header: '수업 인원',
		name: 'stdntNo'
    },
    {
		header: '대표 학생',
		name: 'stdntNm'
    },
    {
		header: '주',
		name: 'wkCd'
    },
    {
		header: '요일',
		name: 'dowCd'
    },
    {
		header: '시간',
		name: 'hhMm'
    },
    {
		header: '계약 횟수',
		name: 'ctrtLsnCnt'
    },
    {
		header: '예정 시작일자',
		name: 'schdStrtDy'
    },
    {
		header: '예정 종료일자',
		name: 'schdEndDy'
    },
    {
		header: '실제 시작일자',
		name: 'rlyStrtDy'
    },
    {
		header: '실제 종료일자',
		name: 'rlyEndDy'
    },
    {
		header: '현재 진행 회차',
		name: 'psntPrgsLsnCnt'
    },
    {
		header: '잔여 회차',
		name: 'leftLsnCnt'
    },
    {
		header: '전체 수강료',
		name: 'allTtn'
    },
    {
		header: '수금 형태',
		name: 'cltFrmCd'
    },
    {
		header: '안내 계좌',
		name: 'gudAcntCd'
    },
    {
		header: '안내 일자',
		name: 'gudDy'
    },
    {
		header: '입금일',
		name: 'ttnDpstFnshDy'
    },
    {
		header: '단위 강의료',
		name: 'untLtrFee'
    },
    {
		header: '비고',
		name: 'lsnRmks'
    }
  ],
  columnOptions: {
      frozenCount: 1,
      frozenBorderWidth: 1,
      minWidth:80,
      resizable: true
    }
});

grid.resetData(data);

</script>
</html>