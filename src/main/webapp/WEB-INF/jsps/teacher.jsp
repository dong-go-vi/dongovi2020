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
		<div class="card mb-4 py-3 border-left-primary">
		
			<div class="card-body pt-0 pb-0">
				<div class="row">
					<div class="col-xs-3">
						<h5 class="h5 mr-5 text-gray-900">팀 선택</h5>
					</div>
					<div class="col-xs-6">
						<select class="form-control" placeholder=".col-xs-6">
							<option value="">전체</option>
							<option value="">강동</option>
							<option value="">강남</option>
						</select>
					</div>
					<div class="col-xs-3">
						<a href="#" class="mr-5 btn btn-primary btn-icon-split">
							<span class="text">확인</span>
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
		header: '팀 ID',
		name: 'id'
    },
	{
		header: '팀 이름',
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