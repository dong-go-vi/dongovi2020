<%
/* 
 * 파일명 : /web/curation/curationMain.jsp 
 * 내용 : 큐레이션 메인(임시)
 * 변경이력 :
	 - 2020-10-20 jskim : 최초작성 
 */ 
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% //TODO it - css  %>
<!-- 임시 css -->
<style>
	body {font-size:10pt}
	table {border:1px}
	td {font-size:10pt}
	input {font-size:9pt; width:250px; border:1px solid #bbbbbb}
</style>

큐레이션 메인(임시)


<hr/>
<h2>임시 메뉴</h2>

<div>
	<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/curationMain';" value="메인 페이지" />
	<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/curationMemberJoin';" value="회원 가입" />
	<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/curationMemberLogin';" value="회원 로그인" />
	<input type="button" class="small-submit-btn btn" onclick="location.href='/web/curation/curationMemberInfoModify';" value="회원 정보 수정" />
</div><br/>

<ul>
	<li><a target="_blank" href="/web/curation/curationMain">큐레이션 메인</a></li>
	<li>큐레이션 작업 (로그인 사용자가 자신의 큐레이션을 작성/관리)
		<ul>
			<li><a target="_blank" href="/web/curation/work/basicInformationUpdate">기본 정보 업데이트</a></li>
			<li><a target="_blank" href="/web/curation/work/freeContentsListView">무료 콘텐츠</a></li>
			<li><a target="_blank" href="/web/curation/work/successStoryListView">성공 스토리</a></li>
		</ul>
	</li>
	<li>큐레이션 열람 (일반 사용자가 다른 사용자들이 작성한 큐레이션을 열람)
		<ul>
			<li><a target="_blank" href="/web/curation/peruse/freeContentsListView">무료 콘텐츠</a></li>
			<li><a target="_blank" href="/web/curation/peruse/successStoryListView">성공 스토리</a></li>
		</ul>
	</li>
</ul>

<hr/>
<a target="_blank" href="/web/curation/curationMainForDevelop">개발용 페이지</a>
<hr/>