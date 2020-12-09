<%
	/* 
	 * 파일명 : /web/curation/work/freeContentsDetailView.jsp
	 * 내용 : 큐레이션 / 큐레이션 작업 / 무료 컨텐츠 / 상세 보기
	 * 변경이력 :
		 - 2020-10-20 jskim : 최초작성 
	 */
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String cntsIdx = request.getParameter("cntsIdx");
	if (cntsIdx == null || cntsIdx.trim().equals("") ){ cntsIdx = "0"; }
%>
<link type="text/css" rel="stylesheet" href="/statics/css/common/curationDev.css?version=20201026" /><%-- 임시 css --%>
<script type="text/javascript" src="/statics/js/common/jquery/jquery-3.3.1.min.js"></script><%-- jquery --%>
<script type="text/javascript" src="/statics/js/common/common.min.js"></script><%-- common js --%>

큐레이션 / 큐레이션 작업 / 무료 컨텐츠 / 상세 보기<br/>
<br/>

	<%-- <a href="/web/curation/work/freeContentsListView">목록 보기</a> 
	| <a href="/web/curation/work/freeContentsDetailView?cntsIdx=<%=cntsIdx %>">상세 보기</a>
	| <a href="/web/curation/work/freeContentsUpdate?cntsIdx=<%=cntsIdx %>">수정하기</a>
	| <a href="/web/curation/work/freeContentsNewWrite">새로 작성</a>
	<br/>
	<br/> --%>

<!-- 큐레이션 무료 컨텐츠 상세 보기 -->
<section class="section curation">
	<h2>무료 컨텐츠 상세 보기</h2>
	<br/>
	<div>
		<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/work/freeContentsListView';" value="목록 보기" />
		<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/work/freeContentsNewWrite';" value="새로 작성" />
		<input type="button" class="small-submit-btn btn" id="btnContentsDetailView" name="btnContentsDetailView" onclick="goToDetailViewPage();" value="상세 보기" style="display:none" />
		<input type="button" class="small-submit-btn btn" id="btnContentsUpdate" name="btnContentsUpdate" onclick="goToUpdatePage();" value="수정하기" style="display:none" />
		<input type="button" class="small-submit-btn btn" id="btnContentsRemove" name="btnContentsRemove" onclick="removeContents();" value="삭제하기" style="display:none" />
	</div><br/>

	<form class="form" id="frm1" name="frm1">
	<table >
		<tr>
			<td width="150">URL(유튜브)</td>
			<td width="450">
				유튜브 동영상 ID : <input type="text"  id="cntsNatvId" class="freecontents-title" name="cntsNatvId" value="" placeholder="유튜브 동영상 ID를 입력하세요!" readonly /> 
					<br/><span style="color:white">HSG3R8mkedc GbtXavOLL5o FJIBsIt3LhM uIGRg2jRBGo</span> <%-- --%>
				
				<br/><input type="text" id="cntsUrl" name="cntsUrl" value=""  readonly/>
				
				<input type="hidden" id="cntsIdx" name="cntsIdx" value="<%=cntsIdx %>" />
				<input type="hidden" id="cntsIssMnNm" name="cntsIssMnNm" value="" />
				<input type="hidden" id="cntsQty" name="cntsQty" value="" />
				<input type="hidden" id="cntsQtyUnitNm" name="cntsQtyUnitNm" value=""/>
				
				<input type="hidden" id="crnMbrNo" name="crnMbrNo" value="282"/>
				<input type="hidden" id="cntsKnCd" name="cntsKnCd" value="605001"/>
				<input type="hidden" id="dmstFrnKnCd" name="dmstFrnKnCd" value="602001"/>
				<input type="hidden" id="frnsChnlGrpTpKnCd" name="frnsChnlGrpTpKnCd" value="603001"/>
				<input type="hidden" id="cmtPermYn" name="cmtPermYn" value="N"/>
			</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>
				<input type="text" id="cntsTitl" name="cntsTitl" value="" readonly/>
				<% //TODO 제목 자동으로 가져오기 %>
			</td>
		</tr>
		<tr>
			<td>채널명</td>
			<td>
				<input type="text" id="cntsIssChnlNm" name="cntsIssChnlNm" value="" readonly/>
				<% //TODO 채널명 자동으로 가져오기 %>
			</td>
		</tr>
		<tr>
			<td>난이도</td>
			<td>
				<input type="radio" id="dodKnCd300001" name="dodKnCd" value="300001" disabled/><label for="dodKnCd300001">모든 수준</label> 
				<input type="radio" id="dodKnCd300002" name="dodKnCd" value="300002" disabled/><label for="dodKnCd300002">입문</label> 
				<input type="radio" id="dodKnCd300003" name="dodKnCd" value="300003" disabled/><label for="dodKnCd300003">초급</label> 
				<input type="radio" id="dodKnCd300004" name="dodKnCd" value="300004" disabled/><label for="dodKnCd300004">중급</label> 
				<input type="radio" id="dodKnCd300005" name="dodKnCd" value="300005" disabled/><label for="dodKnCd300005">고급</label> 
			</td>
		</tr>
		<tr>
			<td>공개 상태</td>
			<td>
				<input type="radio" id="opngStatCd604001" name="opngStatCd" value="604001" disabled/><label for="opngStatCd604001">미공개</label> 
				<input type="radio" id="opngStatCd604002" name="opngStatCd" value="604002" disabled/><label for="opngStatCd604002">전체공개</label> 
				<input type="radio" id="opngStatCd604003" name="opngStatCd" value="604003" disabled/><label for="opngStatCd604003">구독자 공개</label> 
			</td>
		</tr>
		<tr>
			<td>댓글 허용</td>
			<td>
				<input type="radio" id="cmtPermYnY" name="cmtPermYn" value="Y" disabled /><label for="cmtPermYnY">허용</label> 
				<input type="radio" id="cmtPermYnN" name="cmtPermYn" value="N" disabled /><label for="cmtPermYnN">허용 안함</label> 
			</td>
		</tr>
		<tr>
			<td>요약/설명</td>
			<td>
				<textarea name="brifExpl" id="brifExpl" cols="60" rows="7" readonly></textarea>
			</td>
		</tr>
	</table>
	</form>
	
	<form class="curation-form" id="frm2" name="frm2">
	<table >
		<tr>
			<td width="150">구간 인덱스</td>
			<td width="450">
				<div class="yt-video">
					<div id="player" style="display:block; visibility:hidden"></div><!-- https://www.youtube.com/embed/GbtXavOLL5o -->
					<!-- <iframe id="ifrm2" width="420" height="280" src="" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> -->
				</div>
				<!-- <div>
					<input type="text"  id="sectLoctHhmmss" name="sectLoctHhmmss" style="width:58px" value="" readonly/>
					<input type="hidden"  id="sectLoct" name="sectLoct" style="width:58px" value="0" />
					<input type="text"  id="sectCn" name="sectCn" value="" placeholder="(구간 내용을 입력하고 등록 버튼을 클릭하세요.)" style="width:316px" disabled="disabled" />
					<input type="button" id="btnSectionContentsSave" name="btnSectionContentsSave" value="등록" disabled="disabled" />
				</div> -->
				<div>
					<%--
					<table id="list2">
						<tr id="record2"><td><a onclick="goToTimePostion(@{sectLoct});">@{sectLoctHhmmss}</a> </td><td> @{sectCn}</td><td> <input type="button" onclick="removeSectionContents(@{sectCnIdx});" value="삭제" width="80px"></td></tr>
						<tr><td>0:48</td><td>증시 동향</td><td> <input type="button" onclick="" value="삭제" width="80px"></td></tr>
						<tr><td>1:12</td><td>주요 이슈</td><td> <input type="button" onclick="" value="삭제" width="80px"></td></tr>
						<tr><td>3:58</td><td>대응 전략</td><td> <input type="button" onclick="" value="삭제" width="80px"></td></tr>
					</table>
					 --%>
					<ul id="list2">
						<li id="record2"><input type="button" class="preview-btn" style="display:inline-block" onclick="goToTimePostion(@{sectLoct});" value="@{sectLoctHhmmss}" /> @{sectCn}</li>
						<%-- <li>2:30 목표설정</li>
						<li>5:30 설명</li>
						<li>9:20 결론</li> --%>
					</ul>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<!-- <input type="button" id="btnSave" name="btnSave" value="저장" /> -->
				<!-- <input type="button" id="btnCancel" name="btnCancel" value="취소" /> -->
			</td>
		</tr>
	</table>
	</form>
</section>

<%-- youtube api --%>
<script type="text/javascript" src="https://www.youtube.com/iframe_api"></script>
<script type="text/javascript">

// console.log(YT);

let player;
function onYouTubeIframeAPIReady() {
	// var cntsNatvId = $('#cntsNatvId').val();
	// console.log(cntsNatvId);
	player = new YT.Player('player', {
		height : '280',
		width : '420',
		videoId : '', //'u1zgFlCw8Aw', // cntsNatvId,
		playerVars: { 'autoplay': 1, 'controls': 1 },
		events : {
			'onReady' : onPlayerReady,
			'onStateChange' : onPlayerStateChange
		}
	});
	// console.log(player);
}
let videoReady = false;
function onPlayerReady(event) {
	event.target.playVideo();
	videoReady = true;
}
var done = false;
function onPlayerStateChange(event) {
	if (event.data == YT.PlayerState.PLAYING && !done) {
		//setTimeout(stopVideo, 6000);
		done = true;
	}
	if (event.data == YT.PlayerState.PLAYING 
		//	|| YT.PlayerState.BUFFERING 
		//	|| YT.PlayerState.PAUSED 
			|| YT.PlayerState.CUED
		){
		// getCurrentTime(true);
	}
}
function stopVideo() {
	player.stopVideo();
}
function playerCheck() {
	console.log(player);
}

function playerLoad(id, startSeconds, quality) {
	if ( startSeconds == null) { startSeconds = 0; } 
	if ( quality == null) { quality='large'; }
	if ( player ){
		player.loadVideoById(id, startSeconds, quality);
	}
}
</script>


<script type="text/javascript">

let cntsIdx = <%=cntsIdx%>;

$(document).ready(function() {
	// $('head').append('<meta http-equiv="X-Frame-Options" content="allow" name="xfo">');

	searchContentsDetail(cntsIdx);

	getList2Unit(); // list2 요소 구하기
	removeList2Element(); // list2 요소 제거
	
	// 구간 인덱스 등록 버튼 활성화, 구간 인덱스 내용 목록 가져오기
	if ( $('#cntsIdx').val().length > 0 ){
		$('#btnSectionContentsSave').attr("disabled", false);
		$('#sectCn').attr("disabled", false);
		searchSectionContentsList();
	} 
});

function searchContentsDetail(cntsIndx){
	$.ajax({
		url: '/web/curation/work/api/searchContents?cntsIdx=' + cntsIndx,
		type : 'POST',
		success : function(data) {
			console.log('searchContentsDetail data : ', JSON.stringify(data));
			// console.log(data);
			var vo = data.vo;
			if ( vo ){
				console.log( vo );
				var keys = Object.getOwnPropertyNames(vo); // Object.keys(vo);
				keys.forEach(function(key){
					// try { if ( $('#'+key) ) { $('#'+key).val(eval('vo.'+key)); } } catch(e){}
					try { if ( $('input[name='+key+']') ) { $('input[name='+key+']').val(eval('vo.'+key)); } } catch(e){}
					try { if ( $('textarea[name='+key+']') ) { $('textarea[name='+key+']').val(eval('vo.'+key)); } } catch(e){}
					// console.log( $('#'+key),  $('#'+key).tagName, $('#'+key).attr('type') );
				});
				keys = null;

				try { $('#dodKnCd' + vo.dodKnCd).prop('checked', true); } catch(e){}
				try { $('#opngStatCd' + vo.opngStatCd).prop('checked', true); } catch(e){}
				try { $('#cmtPermYn' + vo.cmtPermYn).prop('checked', true); } catch(e){}
				
				// video load
				if ( $('#cntsNatvId').val().length > 0 ){
					// playerLoad($('#cntsNatvId').val());
					// player.loadVideoById($('#cntsNatvId').val());
					tryLoadVideo();
					// console.log(videoReady);
				}

				$('#btnContentsDetailView').attr("style", "display:inline");
				$('#btnContentsUpdate').attr("style", "display:inline");
				$('#btnContentsRemove').attr("style", "display:inline");

			}
		}
	})
}

// video load setTimeout 재귀 호출
function tryLoadVideo(){
	// console.log($('#cntsNatvId').val());
	var ok = false;
	if ( videoReady ) {
		playerLoad($('#cntsNatvId').val());
		$('#player').css('visibility','visible');
	} else {
		setTimeout('tryLoadVideo();', 100);
	}
	
	return ok; 
}

var oldVal = $("#cntsNatvId").val().trim(); 
$("#cntsNatvId").on("propertychange change", function() { // propertychange change keyup paste input
	var currentVal = $(this).val().trim();
	if(currentVal == oldVal) { return; }
	oldVal = currentVal;
	// console.log("changed!" + " / " + oldVal);
	
	if ( currentVal.length > 0){
		var url = 'https://www.youtube.com/embed/' + currentVal;
		$("#cntsUrl").val(url);
		// $('#ifrm2').attr('src', url);
		playerLoad(currentVal);
	}
	
});

// 저장 버튼 클릭
$('#btnSave').click(function(){ 
	saveContents(); 
});

// 저장 처리
function saveContents(){
	var data = formSerializeObjectToJson($('#frm1'));
	console.log(data);

	$.ajax({
		url : '/web/curation/work/api/saveContents',
		type : 'POST',
		data : JSON.stringify(data),
		dataType: "json",
		contentType: "application/json",
		beforeSend : function(xhr) {
			xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}'); // 데이터 전송 전 헤더에 csrf값 설정
		},
		success : function(data) {
			try {
				console.log(data);
				$('#cntsIdx').val(data.vo.cntsIdx);
				// cntsIdx = data.vo.cntsIdx;
				if ( $('#cntsIdx').val().length > 0 ){
					$('#btnSectionContentsSave').attr("disabled", false);
					$('#sectCn').attr("disabled", false);
					$('#btnContentsDetailView').attr("style", "display:inline");
					$('#btnContentsRemove').attr("style", "display:inline");
				}	
			} catch(e){}
			alert(data.msg.msg);
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('Error : ' + textStatus + '[' + jqXHR.status + ']');
		}
	});
}

// 구간 인덱스, 등록 버튼 클릭
$('#btnSectionContentsSave').click(function(){ 
	saveSectionContents(); 
});

//저장 처리
function saveSectionContents(){
	var param = formSerializeObjectToJson($('#frm2'));
	param.cntsIdx = $('#cntsIdx').val();
	console.log(param);

	$.ajax({
		url : '/web/curation/work/api/saveSectionContents',
		type : 'POST',
		data : JSON.stringify(param),
		dataType: "json",
		contentType: "application/json",
		beforeSend : function(xhr) {
			xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}'); // 데이터 전송 전 헤더에 csrf값 설정
		},
		success : function(data) {
			try {
				console.log(data);
				// $('#cntsIdx').val(data.vo.cntsIdx);
			} catch(e){}
			// alert(data.msg.msg);
			searchSectionContentsList();
			sectCnOldVal = '';
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('Error : ' + textStatus + '[' + jqXHR.status + ']');
		}
	});
	
	$('#sectCn').select();
	$('#sectCn').focus();
}

// listUnit
let _listUnitStr = "";
let _listUnitNoRecord = "";
function getList2Unit(){
	try {
		var recordCount = $('#list2').length;
		if ( recordCount > 0){
			_listUnitStr = $('#record2')[0].outerHTML;
			console.log(_listUnitStr);
		}
		if ( recordCount > 1){
			_listUnitNoRecord = $('#record2')[1].outerHTML;
		}
	} catch(e){ console.log(e); }
}

function removeList2Element(){
	//var trCount = $('.curation-list-table__row').length;
	// console.log(trCount);
	$('#record2').remove();
	// $('#list2').remove();
}

// 상세 보기 이동
function goToDetailViewPage(){
	location.href='/web/curation/work/freeContentsDetailView?cntsIdx='+cntsIdx;
}

//수정하기 이동
function goToUpdatePage(){
	location.href='/web/curation/work/freeContentsUpdate?cntsIdx='+cntsIdx;
}

// 컨텐츠 삭제
function removeContents(){

	$.ajax({
		url : '/web/curation/work/api/removeContents?cntsIdx='+cntsIdx,
		type : 'GET',
		// data : {}, // param, // JSON.stringify(param),
		dataType: "json",
		contentType: "application/json",
		beforeSend : function(xhr) {
			xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}'); // 데이터 전송 전 헤더에 csrf값 설정
		},
		success : function(data) {
			try {
				console.log(data);
				// $('#cntsIdx').val(data.vo.cntsIdx);
			} catch(e){}
			// alert(data.msg.msg);
			location.href = '/web/curation/work/freeContentsListView';
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('Error : ' + textStatus + '[' + jqXHR.status + ']');
		}
	});
}

// 구간 인덱스 목록
function searchSectionContentsList(){
	var param = {};
	param.cntsIdx = $('#cntsIdx').val();
	console.log(param);
	
	$.ajax({
		url : "/web/curation/work/api/searchSectionContentsList",
		type : "get",
		data : param,
		success : function(data){
			console.log(data);
			var str;
			// data.list = [];
			if ( data.list.length <= 0 ) {
				$('#list2 *').remove();
				// $('#list2').append(_listUnitNoRecord);
			} else {
				// removeList2Element();
				$('#list2 *').remove();
				for(i=0; i<data.list.length; i++){
					str = _listUnitStr;
					str = replaceAll(str, "@{sectCnIdx}", data.list[i].sectCnIdx);
					str = replaceAll(str, "@{sectLoct}", data.list[i].sectLoct);
					str = replaceAll(str, "@{sectLoctHhmmss}", convertTimeString(data.list[i].sectLoct));
					str = replaceAll(str, "@{sectCn}", data.list[i].sectCn);
					// console.log(str);
					$('#list2').append(str);
				}
			}
			$('#sectLoct').val("");
			$('#sectCn').val("");
			$('#sectLoctHhmmss').val("");
		},
		error : function(jqXHR, textStatus, errorThrown){
			var responseText = jQuery.parseJSON(jqXHR.responseText);
			alert(responseText.msg.msg);
		}
	});
}

let sectCnOldVal = ''; //$('#sectCn').val().trim();
$("#sectCn").on("change keyup", function() { // propertychange change keyup paste input
	var currentVal = $(this).val().trim();
	// console.log( sectCnOldVal +  ' / ' + currentVal);
	if ( sectCnOldVal.length == 0 && currentVal.length > 0 ){
		var tm = player.getCurrentTime(); /// from youtube api 
		// if (tm > 1){ tm = tm - 1; } // 1초전으로 
		console.log(tm); // GbtXavOLL5o
		tm = tm + '';
		$('#sectLoct').val(tm.split(".")[0]);
		$('#sectLoctHhmmss').val(convertTimeString(tm.split(".")[0]));

	}
	sectCnOldVal = currentVal;
	
	if (currentVal.length > 0 && window.event.keyCode == 13){
		saveSectionContents();
	}
});

function removeSectionContents(sectCnIdx){

	$.ajax({
		url : '/web/curation/work/api/removeSectionContents' + '?sectCnIdx='+sectCnIdx,
		type : 'GET',
		// data : {}, // param, // JSON.stringify(param),
		dataType: "json",
		contentType: "application/json",
		beforeSend : function(xhr) {
			xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}'); // 데이터 전송 전 헤더에 csrf값 설정
		},
		success : function(data) {
			try {
				console.log(data);
				// $('#cntsIdx').val(data.vo.cntsIdx);
			} catch(e){}
			// alert(data.msg.msg);
			searchSectionContentsList();
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('Error : ' + textStatus + '[' + jqXHR.status + ']');
		}
	});
}

// youtube 해당 second 위치로 이동하기
function goToTimePostion(sec){
	player.seekTo(sec,true);
}

</script>
<script type="text/javascript">
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


function formSerializeObjectToJson(_form) {
	var obj = null;
	try {
		var arr = _form.serializeArray();
		if (arr) {
			obj = {};
			$.each(arr, function() {
				obj[this.name] = this.value;
			});
		}
	} catch (e) {
		console.log(e.message);
	} finally {
	}
	return obj;
};

/**
 * 초 숫자 => 시:분:초 
 * ex) 312 => 5:12
 */
function convertTimeString(sec){
	var tmHH = Math.floor(sec / (60*60)); // console.log(tmHH);
	var tmMI = Math.floor( ( sec - (tmHH*60*60) ) / 60 ); // console.log(tmMI);
	var tmSS = Math.floor(sec - (tmHH*60*60) - (tmMI*60)); // console.log(tmSS);
	
	if (tmHH>0){ tmHH = (tmHH>9?"":"0") + tmHH + ":"; } else { tmHH = ""; }
	tmMI = (tmMI>9?"":"0") + tmMI + ":"; 
	tmSS = (tmSS>9?"":"0") + tmSS + ""; 
	
	console.log(tmHH + tmMI + tmSS);
	return tmHH + tmMI + tmSS;  
}
</script>

<% //===== end of jsp ==================================================================== %>