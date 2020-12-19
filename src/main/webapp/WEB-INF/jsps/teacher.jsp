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
				교사 정보
			</h1>
		</div>
		
		<!-- content -->
		<div class="card mb-4 py-3 w-25 border-left-success">
		
			<div class="card-body pt-0 pb-0">
				<div class="row justify-content-between">
					<div class="mr-4">
						<h4 class="text-gray-900">팀 선택</h4>
					</div>
					<div class="col-xs-8 mr-4">
						<select class="form-control" placeholder=".col-xs-8">
							<option value="">전체</option>
							<option value="">강동</option>
							<option value="">강남</option>
						</select>
					</div>
					<div>
						<a href="#" class="btn btn-success btn-circle">
						<i class="fas fa-check"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
		
		<div id="grid" class="mb-4">
		
		</div>
		
		<!-- 버튼 -->
		<div class="btnArea">
			<a href="#" class="btn btn-sm btn-primary btn-icon-split" style="float:right;">
				<span class="text">수정</span>
			</a>
		</div>
	</div>
	
</body>

<script type="text/javascript">

const data = [
	{
		id: 'id1',
		name : '팀이름',
		teacher : '초롱이'
	},
	{
		id: 'id2',
		name : '팀이름2',
		teacher : '풍뎅이'
	},
	{
		id: 'id3',
		name : '팀이름3',
		teacher : '민들레'
	}
       
    ];
    
const grid = new tui.Grid({
  el: document.getElementById('grid'),
  scrollX: false,
  scrollY: false,
  data,
  columns: [
	{
		header: '교사 사번 ID',
		name: 'id'
    },
	{
		header: '소속 팀명',
		name: 'name'

    },
    {
      header: '팀장 교사',
      name: 'teacher'
    }
  ]
});

grid.resetData(data);

</script>
</html>