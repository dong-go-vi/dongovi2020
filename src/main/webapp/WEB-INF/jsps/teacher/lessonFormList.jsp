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
				수업 형태 관리
			</h1>
		</div>
		
		<!-- content -->
		<div class="row">
			
			
			
			
			<div class="col-md-2 float-right">
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
		
		<div id="grid" class="w-50 mb-4">
		
		</div>
		
	</div>
	
</body>

<script type="text/javascript">

const data = [
	{
		formId: '1',
		formAbbrName : '생태',
		formName : '생태 수업'
	},
	{
		formId: '2',
		formAbbrName : '숲마실',
		formName : '숲마실 수업'
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
			header: '수업 형태 ID',
			name: 'formId'
		},
		{
			header: '수업 형태 축약 이름',
			name: 'formAbbrName'
		},
		{
			header: '수업 형태 이름',
			name: 'formName'
		}		
	],
	columnOptions: {
		minWidth:100
	}
});

grid.resetData(data);

</script>
</html>