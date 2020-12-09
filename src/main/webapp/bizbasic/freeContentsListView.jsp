
<%
	/* 
	 * 파일명 : /web/curation/work/freeContentsListView.jsp
	 * 내용 : 큐레이션 / 큐레이션 작업 / 무료 컨텐츠 / 목록 보기
	 * 변경이력 :
		 - 2020-10-20 jskim : 최초작성 
	 */
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link type="text/css" rel="stylesheet" href="/statics/css/common/curationDev.css?version=20201026" /><%-- 임시 css --%>
<script type="text/javascript" src="/statics/js/common/jquery/jquery-3.3.1.min.js"></script><%-- jquery --%>
<script type="text/javascript" src="/statics/js/common/common.min.js"></script><%-- common js --%>


큐레이션 / 큐레이션 작업 / 무료 컨텐츠 / 목록 보기<br/>
<br/>

	<%-- <a href="/web/curation/work/freeContentsListView">목록 보기</a> 
	| <a href="/web/curation/work/freeContentsDetailView?cntsIdx=<%//=cntsIdx %>">상세 보기</a>
	| <a href="/web/curation/work/freeContentsUpdate?cntsIdx=<%//=cntsIdx %>">수정하기</a>
	| <a href="/web/curation/work/freeContentsNewWrite">새로 작성</a>
	<br/>
	<br/> --%>

<section class="section">
	<h2>무료 컨텐츠 목록</h2>
	<br/>
	<div>
		<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/work/freeContentsListView';" value="목록 보기" />
		<input type="button" class="small-submit-btn btn" onclick='location.href="/web/curation/work/freeContentsNewWrite"' value='새로 작성'/>
	</div><br/>
	
	<table class="curation-list-table">
		<thead class="curation-list-table__head">
			<th width="60">번호</th>
			<th width="300">제목</th>
			<th width="200">채널명</th>
			<th width="100">난이도</th>
			<th width="100">공개상태</th>
			<!-- <th width="100">미리보기</th> -->
		</thead>
		<tbody id="list">
			<tr class="curation-list-table__row">
				<td>@{cntsIdx}</td>
				<td style="text-align:left"><a href="/web/curation/work/freeContentsDetailView?cntsIdx=@{cntsIdx}">@{cntsTitl}</a></td>
				<td>@{cntsIssChnlNm}</td>
				<td>@{dodKnCdNm}</td>
				<td>@{opngStatCdNm}</td>
				<!-- <td><input type="button" onclick="popupCommonWin('무료 컨텐츠 미리보기', 600, 400, '/web/curation/work/freeContentsPreviewPopup?cntsIdx=@{cntsIdx}');" value="미리보기" width="100px"></td> -->
			</tr>
			<tr class="curation-list-table__row">
				<td colspan="5">해당 데이터가 없습니다. </td>
			</tr>
			<%--
			<tr class="curation-list-table__row">
				<td>478</td>
				<td><a href="/web/curation/work/freeContentsDetailView">레배뉴 3화 | 레슨몬 배싸부의 뉴스리포트</a></td>
				<td>레슨몬TV</td>
				<td>입문</td>
				<td>전체공개</td>
				<td><input type="button" onclick="popUp('/web/curation/work/freeContentsPreviewPopup','무료컨텐츠 미리보기')" value="미리보기"></td>
			</tr>
			<tr class="curation-list-table__row">
				<td>477</td>
				<td>
					<a href="/web/curation/work/freeContentsDetailView">레배뉴 2화 | 레슨몬 배싸부의 뉴스리포트</a>
				</td>
				<td>레슨몬TV</td>
				<td>입문</td>
				<td>전체공개</td>
				<td>
					<input type="button" onclick="popUp('/web/curation/work/freeContentsPreviewPopup','무료컨텐츠 미리보기')" value="미리보기">
				</td>
			</tr>
			<tr class="curation-list-table__row">
				<td>476</td>
				<td>
					<a href="/web/curation/work/freeContentsDetailView">레배뉴 1화 | 레슨몬 배싸부의 뉴스리포트</a>
				</td>
				<td>레슨몬TV</td>
				<td>입문</td>
				<td>전체공개</td>
				<td>
					<input type="button" onclick="popUp('/web/curation/work/freeContentsPreviewPopup','무료컨텐츠 미리보기')" value="미리보기">
				</td>
			</tr>
			 --%>
		</tbody>
	</table>
</section>

<div id="grid"></div>

<script>
	function popUp(url, name) {
		window.open(url, name, "width=870, height=450");
	}
</script>

<script type="text/javascript">

$(document).ready(function() {
	getTbodyListUnit();
	removeTbodyList();
	searchContentsList();
});


/**
 * getTbodyListUnit
 */
let _listUnitStr = "";
let _listUnitNoRecord = "";
function getTbodyListUnit(){
	try {
		var trCount = $('.curation-list-table__row').length;
		if ( trCount > 0){
			_listUnitStr = $('.curation-list-table__row')[0].outerHTML;
		}
		if ( trCount > 1){
			_listUnitNoRecord = $('.curation-list-table__row')[1].outerHTML;
		}
	} catch(e){ console.log(e); }
}

function removeTbodyList(){
	var trCount = $('.curation-list-table__row').length;
	// console.log(trCount);
	$('.curation-list-table__row').remove();
}

function searchContentsList(){
	var param = {};
	$.ajax({
		url : "/web/curation/work/api/searchContentsList",
		type : "get",
		data : param,
		success : function(data){
			// console.log(data);
			var str;
			// data.list = [];
			if ( data.list.length <= 0 ) {
				$('#list').append(_listUnitNoRecord);
			} else {
				for(i=0; i<data.list.length; i++){
					str = _listUnitStr;
					str = replaceAll(str, "@{cntsIdx}", data.list[i].cntsIdx);
					if ( data.list[i].cntsTitl.trim().length == 0){
						str = replaceAll(str, "@{cntsTitl}", '(제목 없음)');
					} else {
						str = replaceAll(str, "@{cntsTitl}", data.list[i].cntsTitl);
					}
					str = replaceAll(str, "@{cntsIssChnlNm}", data.list[i].cntsIssChnlNm);
					str = replaceAll(str, "@{dodKnCdNm}", data.list[i].dodKnCdNm);
					str = replaceAll(str, "@{opngStatCdNm}",data.list[i].opngStatCdNm);
					$('#list').append(str);
				}
			}
		},
		error : function(jqXHR, textStatus, errorThrown){
			var responseText = jQuery.parseJSON(jqXHR.responseText);
			alert(responseText.msg.msg);
		}
	});
}

/// ==== 공통 ===
function replaceAll(str, a, b){
	for(var i=0; i<100; i++){
		str = str.replace(a, b);
		if ( str.indexOf(a) < 0 ) {
			break;
		}
	}
	return str;
}
</script>