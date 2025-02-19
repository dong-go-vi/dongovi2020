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
				팀 관리
			</h1>
		</div>
		<div class="w-25">
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
		<!-- content -->
		<div id="grid" class="w-50">
		
		</div>
		
		
	</div>
	
</body>

<script type="text/javascript">
class CustomTextEditor {
    constructor(props) {
      const el = document.createElement('input');
      const { maxLength } = props.columnInfo.editor.options;

      el.type = 'text';
      el.maxLength = maxLength;
      el.value = String(props.value);

      this.el = el;
    }

    getElement() {
      return this.el;
    }

    getValue() {
      return this.el.value;
    }

    mounted() {
      this.el.select();
    }
  }

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
  rowHeaders: ['checkbox'],
  columns: [
	{
		header: '팀 ID',
		name: 'id'
    },
	{
		header: '팀 이름',
		name: 'name',
		editor : {
			type: CustomTextEditor,
			options : {
				maxLength:10
				}
		}
    },
    {
      header: '팀장 교사',
      name: 'teacher',
      formatter: 'listItemText',
      editor: {
    	  type: 'select',
    	  options: {
    		  listItems: [
				{ text : "초롱이", value:'1'},
				{ text : "풍뎅이", value:'2'},
				{ text : "민들레", value:'3'}
        		  
				]
    	  }
      }
    }
  ]
});

grid.on('beforeChange', ev => {
    console.log('before change:', ev);
  });
  grid.on('afterChange', ev => {
    console.log('after change:', ev);
  })
grid.resetData(data);

</script>
</html>