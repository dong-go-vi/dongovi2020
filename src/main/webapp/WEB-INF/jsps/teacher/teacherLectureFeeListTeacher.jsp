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
				월별 강사료 관리 (교사용)
			</h1>
		</div>
		
		<!-- content -->
		
		
		<!-- 버튼 영역 -->
		<div class="w-25 d-inline-block float-right">
			<div class="card py-1 border-left-primary">
				<div class="card-body py-2 text-justify">
					<div class="d-flex justify-content-between">
						<a href="" class="btn btn-primary btn-sm font-weight-bold">
							추가
						</a> 
						<a href="" class="btn btn-primary btn-sm font-weight-bold">
							수정
						</a>
						<a href="" class="btn btn-primary btn-sm font-weight-bold">
							제출
						</a>
					</div>		
				</div>
			</div>
		</div>
		
		<!-- 테이블 영역 -->
		<div class="card w-50 pt-3 px-3 mb-4 border-left-primary">
			<form id="" class="form-inline" role="form">
				<table class="table table-bordered">
					<tr>
						<th class="bg-gray-100 text-dark w-50 p-2">일반 수업 개수</th>
						<!-- 수업 개수는 수업 리스트의 총 수업 횟수로 입력 -->
						<td class="p-2">1</td>
					</tr>
					
					<tr>
						<th class="bg-gray-100 text-dark p-2">일반 수업 총액</th>
						<!-- 수업 총액은 각 수업별 단위 강의료(수정분 계산 후)*수업 횟수의 총합 -->
						<td class="p-2">
							80,000
						</td>
					</tr>
					<tr>
						<!-- 관리자가 입력 -->
						<th class="bg-gray-100 text-dark p-2" colspan="2">추가 및 공제 내역</th>
					</tr>
					<tr>
						<td class="p-2">어린이집</td>
						<td class="p-2">150,000</td>
					</tr>
					<tr>
						<th class="bg-gray-100 text-dark p-2">합계</th>
						<td class="p-2">230,000</td>
					</tr>
				</table>
			</form>
		</div>	
		
		
		<!-- 그리드 영역 -->		
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
		rlyLsnDy : '',
		lsnCnt : '',
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
		header: '수업 일자',
		name: 'rlyLsnDy'
    },
    // 수업 횟수 column 체크
    {
		header: '수업 횟수',
		name: 'lsnCnt'
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