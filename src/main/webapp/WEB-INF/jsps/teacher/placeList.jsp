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
				장소 관리
			</h1>
		</div>
		
		<!-- content -->
		<div class="row">
			<div class="col-md-4 mr-auto">
				<div class="card mb-4 py-2 border-left-primary">
					<div class="card-body py-0">
						<form class="form-inline" role="form">
							<div class="form-group">
								<label for="placeName" class="col-md-4 font-weight-bold text-primary">
									장소 이름
								</label>
								<input id="placeName" type="text" class="form-control col-md-6 small">
								<div class="col-md-2 pl-3 float-right">
									<button class="btn btn-primary btn-sm btn-circle">
										<i class=" fas fa-search"></i>
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>	
			</div>
			
			<div class="col-md-4 mr-auto">
				<div class="card mb-4 py-2 border-left-primary">
					<div class="card-body py-0">
						<form class="form-inline" role="form">
							<div class="form-group">
								<label for="placeName" class="col-md-4 font-weight-bold text-primary">
									주소
								</label>
								<input id="placeName" type="text" class="form-control col-md-6 small">
								<div class="col-md-2 pl-3 float-right">
									<button class="btn btn-primary btn-sm btn-circle">
										<i class=" fas fa-search"></i>
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>	
			</div>
			
			<div class="col-md-3">
				<div class="card mb-4 py-3 border-left-primary">
					<div class="card-body pt-0 pb-0 text-justify">
						<div class="d-flex justify-content-between">
							<a href="" class="btn btn-success btn-sm font-weight-bold">
							추가
						</a> 
						<a href="" class="btn btn-warning btn-sm font-weight-bold">
							수정
						</a>
						<a href="" class="btn btn-danger btn-sm font-weight-bold">
							삭제
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
		placeId: '1',
		placeName : '판교도서관',
		placeAddress : '경기 성남시 분당구 운중로225번길 37',
		areaId : '1'
	},
	{
		placeId: '1',
		placeName : '판교도서관',
		placeAddress : '경기 성남시 분당구 운중로225번길 37',
		areaId : '1'
	},
	{
		placeId: '1',
		placeName : '판교도서관',
		placeAddress : '경기 성남시 분당구 운중로225번길 37',
		areaId : '1'
	},
	{
		placeId: '1',
		placeName : '판교도서관',
		placeAddress : '경기 성남시 분당구 운중로225번길 37',
		areaId : '1'
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
			header: '수업 장소 ID',
			name: 'placeId'
		},
		{
			header: '수업 장소 이름',
			name: 'placeName'
		},
		{
			header: '수업 장소 주소',
			name: 'placeAddress'
		},
		{
			header: '수업 지역 ID',
			name: 'areaId'
		}		
	],
	columnOptions: {
		minWidth:100
	}
});

grid.resetData(data);

</script>
</html>