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
						<h6 class="text-gray-900">팀 선택</h6>
					</div>
					<div class="col-xs-8 mr-4">
						<select class="form-control-sm" placeholder=".col-xs-8">
							<option value="">전체</option>
							<option value="">강동</option>
							<option value="">강남</option>
						</select>
					</div>
					<div>
						<a href="#" class="btn btn-success btn-sm btn-circle">
						<i class="fas fa-check"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
		
		<div id="grid" class="mb-4">
		
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
		empNoId: '1',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '2',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '3',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '4',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '5',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '6',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '7',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '8',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '9',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '10',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '10',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '10',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	},
	{
		empNoId: '10',
		teamNm : '강동',
		tchrNk : '초롱이',
		rlyNm : '김초롱',
		gdrCd : '여',
		mobNo : '010-1234-5678',
		eml : 'chorong@gmail.com',
		addr : '경기도 부천시 부일로 222',
		acntBnkCd : '신한은행',
		acntNo : '1001001001',
		jonDy : '20120101',
		untLtrFee : '90000',
		usrDiv : '사용',
		useApprSts : '승인'
	}
       
    ];
    
const grid = new tui.Grid({
  el: document.getElementById('grid'),
  scrollX: true,
  scrollY: true,
  bodyHeight:350,
  columns: [
	{
		header: '교사 사번 ID',
		name: 'empNoId'
    },
	{
		header: '소속 팀',
		name: 'teamNm',
          editor: {
            type: CustomTextEditor,
            options: {
              maxLength: 10
            }
          }

    },
    {
		header: '닉네임',
		name: 'tchrNk',
          editor: {
            type: CustomTextEditor,
            options: {
              maxLength: 10
            }
          }
    },
    {
		header: '실제 이름',
		name: 'rlyNm'
    },
    {
        header: '성별',
        name: 'gdrCd'
	},
    {
        header: '전화번호',
        name: 'mobNo'
	},
    {
        header: '이메일',
        name: 'eml'
	},
    {
        header: '주소',
        name: 'addr'
	},
    {
        header: '은행',
        name: 'acntBnkCd'
	},
    {
        header: '계좌 번호',
        name: 'acntNo'
	},
    {
        header: '입사 일자',
        name: 'jonDy'
	},
    {
        header: '단위 강의료',
        name: 'untLtrFee'
	},
    {
        header: '사용자 구분',
        name: 'usrDiv'
	},
    {
        header: '사용 승인 상태',
        name: 'useApprSts'
	}		
  ],
  columnOptions: {
      frozenCount: 1,
      frozenBorderWidth: 1,
      minWidth:120,
      resizable: true
    }
});

grid.resetData(data);

</script>
</html>