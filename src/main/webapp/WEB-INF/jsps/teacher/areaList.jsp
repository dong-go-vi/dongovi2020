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
				지역 관리
			</h1>
		</div>
		
		<!-- content -->
		<div class="row">
			<div class="col-md-5 mr-auto">
				<div class="card mb-4 py-3 border-left-primary">
					<div class="card-body py-0">
						<form class="form-inline" role="form">
								<label class="font-weight-bold text-primary col-sm-3">
									지역 선택
								</label>
							<div class="form-group col-sm-2">
								<label for="area1" class="sr-only"></label>
								<select id="area1" class="form-control-sm" placeholder=".col-xs-8">
									<option value="">전체</option>
									<option value="">강동</option>
									<option value="">강남</option>
								</select>
							</div>
							<div class="form-group col-sm-2">
								<label for="area2" class="sr-only"></label>
								<select id="area2 "class="form-control-sm" placeholder=".col-xs-8">
									<option value="">전체</option>
									<option value="">강동</option>
									<option value="">강남</option>
								</select>
							</div>
							<div class="form-group col-sm-2">
								<label for="area3" class="sr-only"></label>
								<select id="area3" class="form-control-sm" placeholder=".col-xs-8">
									<option value="">전체</option>
									<option value="">강동</option>
									<option value="">강남</option>
								</select>
							</div>	
							<div class="col-sm-3 pl-5" >
								<button class="btn btn-primary btn-sm btn-circle">
										<i class=" fas fa-search"></i>
								</button>
							</div>
						</form>	
					</div>
				</div>
			</div>	
			
			<div class="col-md-2">
				<div class="card mb-4 py-3 border-left-success">
					<div class="card-body pt-0 pb-0 text-justify">
						<div class="d-flex justify-content-between">
							<a href="#" class="btn btn-success btn-sm btn-circle">
							<i class="fas fa-plus"></i>
							</a>
							<a href="#" class="btn btn-warning btn-sm btn-circle">
							<i class="fas fa-edit"></i>
							</a>
							<a href="#" class="btn btn-danger btn-sm btn-circle">
							<i class="fas fa-trash"></i>
							</a>
						</div>		
					</div>
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
		areaId: '1',
		areaName : '서울시',
		upperAreaName : '',
		areaDivDepth : '0'
	},
	{
		areaId: '2',
		areaName : '경기도',
		upperAreaName : '',
		areaDivDepth : '0'
	},
	{
		areaId: '3',
		areaName : '강남구',
		upperAreaName : '서울시',
		areaDivDepth : '1'
	},
	{
		areaId: '4',
		areaName : '용인시',
		upperAreaName : '경기도',
		areaDivDepth : '1'
	}
];

const grid = new tui.Grid({
	el: document.getElementById('grid'),
	scrollX: false,
	scrollY: true,
	bodyHeight:400,
	rowHeaders: ['checkbox'],
	columns: [
		{
			header: '수업 지역 ID',
			name: 'areaId'
		},
		{
			header: '수업 지역 이름',
			name: 'areaName'
		},
		{
			header: '상위 수업 지역 이름',
			name: 'upperAreaName'
		},
		{
			header: '지역 구분 깊이',
			name: 'areaDivDepth'
		}		
	],
	columnOptions: {
		minWidth:100
	}
});

grid.resetData(data);

</script>
</html>