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

개발용 페이지 - 큐레이션 메인(임시)


<hr/>
<h2>임시 메뉴</h2>
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
<h2>작업 목록</h2>

<table>
	<tr>
		<td>
			<a target="ifrmPage" href="/web/curation/curationMain">큐레이션 / 큐레이션 메인 (임시)</a><br/>
			<br/>
			<a target="ifrmPage" href="/web/curation/work/basicInformationUpdate">큐레이션 / 큐레이션 작업 / 기본 정보 업데이트</a><br/>
			<br/>
			<a target="ifrmPage" href="/web/curation/work/freeContentsListView">큐레이션 / 큐레이션 작업 / 무료 콘텐츠 / 목록 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/freeContentsNewWrite">큐레이션 / 큐레이션 작업 / 무료 콘텐츠 / 새로 작성</a><br/>
			<a target="ifrmPage" href="/web/curation/work/freeContentsPreviewPopup">큐레이션 / 큐레이션 작업 / 무료 콘텐츠 / 미리 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/freeContentsDetailView">큐레이션 / 큐레이션 작업 / 무료 콘텐츠 / 상세 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/freeContentsUpdate">큐레이션 / 큐레이션 작업 / 무료 콘텐츠 / 수정하기</a><br/>
			<br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryListView">큐레이션 / 큐레이션 작업 / 성공 스토리 / 목록 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryNewWrite">큐레이션 / 큐레이션 작업 / 성공 스토리 / 새로 작성</a><br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryCurriculumAdd">큐레이션 / 큐레이션 작업 / 성공 스토리 / 커리큘럼 추가</a><br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryPreviewPopup">큐레이션 / 큐레이션 작업 / 성공 스토리 / 미리 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryDetailView">큐레이션 / 큐레이션 작업 / 성공 스토리 / 상세 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/work/successStoryUpdate">큐레이션 / 큐레이션 작업 / 성공 스토리 / 수정하기</a><br/>
			<br/>
			<a target="ifrmPage" href="/web/curation/peruse/freeContentsListView">큐레이션 / 큐레이션 열람 / 무료 콘텐츠 / 목록 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/peruse/freeContentsDetailView">큐레이션 / 큐레이션 열람 / 무료 콘텐츠 / 상세 보기</a><br/>
			<br/>
			<a target="ifrmPage" href="/web/curation/peruse/successStoryListView">큐레이션 / 큐레이션 열람 / 성공 스토리 / 목록 보기</a><br/>
			<a target="ifrmPage" href="/web/curation/peruse/successStoryDetailView">큐레이션 / 큐레이션 열람 / 성공 스토리 / 상세 보기</a><br/>
		</td>
		<td height="100%">
			<iframe id="ifrmPage" name="ifrmPage" style="width:720px; height:320px"></iframe>
		</td>
	</tr>
</table>

<hr/>

<h2>curation work api 목록</h2>

<table>
	<tr>
		<td>
			- session에서 본인 것만 권한 설정 해야함(적용 완료) <br/>
			
			O 큐레이터 - 단건 조회 : <a href="/web/curation/work/api/searchCurator?crnMbrNo=282" target="ifrmWork">/web/curation/work/api/searchCurator?crnMbrNo=282</a>  
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchCurator?crnMbrNo=282'/> <br/> 
			<!-- O 큐레이터 - 목록 조회 : <a href="/web/curation/work/api/searchCuratorList" target="ifrmWork">/web/curation/work/api/searchCuratorList - ok</a><br/> -->	
			<!-- O 큐레이터 - 건수 조회 : <a href="/web/curation/work/api/searchCuratorListCount" target="ifrmWork">/web/curation/work/api/searchCuratorListCount - ok</a><br/> -->
			O 큐레이터 - 단건 저장 : /web/curation/work/api/saveCurator  
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"crnMbrNo\":282,\"bsisIf\":\"TEST\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/saveCurator' /> 
			<!-- X 큐레이터 - 단건 등록 : /web/curation/work/api/addCurator &nbsp;&nbsp; | &nbsp;&nbsp;	curl -k -d "{\"crnMbrNo\":282,\"bsisIf\":\"TEST\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/addCurator<br/> -->
			<!-- X 큐레이터 - 단건 수정 : <a href="/web/curation/work/api/modifyCurator" target="ifrmWork">/web/curation/work/api/modifyCurator</a><br/> -->	
			<!-- X 큐레이터 - 단건 삭제 : <a href="/web/curation/work/api/removeCurator" target="ifrmWork">/web/curation/work/api/removeCurator</a><br/> -->
			<br/>
			 	
			O 콘텐츠 - 단건 조회 : <a href="/web/curation/work/api/searchContents?cntsIdx=54" target="ifrmWork">/web/curation/work/api/searchContents?cntsIdx=54</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchContents?cntsIdx=54' /> <br/>
			O 콘텐츠 - 목록 조회 : <a href="/web/curation/work/api/searchContentsList" target="ifrmWork">/web/curation/work/api/searchContentsList</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k /web/curation/work/api/searchContentsList' /> <br/>
			<!-- 콘텐츠 - 건수 조회 : <a href="/web/curation/work/api/searchContentsListCount" target="ifrmWork">/web/curation/work/api/searchContentsListCount</a><br/> -->	
			* 콘텐츠 - 단건 저장 : /web/curation/work/api/saveContents
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"cntsIdx\":1,\"crnMbrNo\":282,\"cntsKnCd\":\"605001\",\"cntsUrl\":\"111\",\"cntsNatvId\":\"112\",\"cntsTitl\":\"113\",\"cntsIssChnlNm\":\"114\",\"cntsIssMnNm\":\"115\",\"cntsQty\":\"116\",\"cntsQtyUnitNm\":\"117\",\"ctgrCd\":\"118\",\"dodKnCd\":\"300001\",\"cntsCnKnNm01\":\"120\",\"cntsCnKnNm02\":\"121\",\"cntsCnKnNm03\":\"122\",\"dmstFrnKnCd\":\"602001\",\"frnsChnlGrpTpKnCd\":\"603001\",\"evalDlvPwrPnt5\":4,\"evalCnFdltPnt5\":3,\"brifExpl\":\"126\",\"opngStatCd\":\"604001\",\"cmtPermYn\":\"Y\",\"useYn\":\"Y\",\"rgntNo\":282,\"regDt\":\"2020-10-23 13:46:19\",\"updtMnNo\":282,\"updtDt\":\"2020-10-23 13:46:19\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/saveContents' /> <br/>
			<!-- 콘텐츠 - 단건 등록 : <a href="/web/curation/work/api/addContents" target="ifrmWork">/web/curation/work/api/addContents</a><br/> -->	
			<!-- 콘텐츠 - 단건 수정 : <a href="/web/curation/work/api/modifyContents" target="ifrmWork">/web/curation/work/api/modifyContents</a><br/> -->	
			* 콘텐츠 - 단건 삭제 : <a href="/web/curation/work/api/removeContents" target="ifrmWork">/web/curation/work/api/removeContents</a><br/>	
			<br/>
			
			O 콘텐츠 구간 - 단건 조회 : <a href="/web/curation/work/api/searchSectionContents?sectCnIdx=1" target="ifrmWork">/web/curation/work/api/searchSectionContents?sectCnIdx=1</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSectionContents?sectCnIdx=1' /> <br/>
			O 콘텐츠 구간 - 목록 조회 : <a href="/web/curation/work/api/searchSectionContentsList" target="ifrmWork">/web/curation/work/api/searchSectionContentsList</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSectionContentsList' /> <br/>
			<!-- 콘텐츠 구간 - 건수 조회 : <a href="/web/curation/work/api/searchSectionContentsListCount" target="ifrmWork">/web/curation/work/api/searchSectionContentsListCount</a><br/> -->	
			* 콘텐츠 구간 - 단건 저장 : /web/curation/work/api/saveSectionContents
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"sectCnIdx\":1,\"cntsIdx\":1,\"sectLoct\":24,\"sectCn\":\"aaaaa\",\"useYn\":\"Y\",\"rgntNo\":282,\"regDt\":\"2020-10-23 14:28:35\",\"updtMnNo\":282,\"updtDt\":\"2020-10-23 14:28:35\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/saveSectionContents ' /> <br/>
			<!-- 콘텐츠 구간 - 단건 등록 : <a href="/web/curation/work/api/addSectionContents" target="ifrmWork">/web/curation/work/api/addSectionContents</a><br/> -->	
			<!-- 콘텐츠 구간 - 단건 수정 : <a href="/web/curation/work/api/modifySectionContents" target="ifrmWork">/web/curation/work/api/modifySectionContents</a><br/> -->	
			* 콘텐츠 구간 - 단건 삭제 : <a href="/web/curation/work/api/removeSectionContents" target="ifrmWork">/web/curation/work/api/removeSectionContents</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='' /> <br/>
			<br/>
			
			O 성공 커리큘럼 - 단건 조회 : <a href="/web/curation/work/api/searchSuccessCurriculum?crclIdx=77" target="ifrmWork">/web/curation/work/api/searchSuccessCurriculum?crclIdx=77</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSuccessCurriculum?crclIdx=77' /> <br/>
			O 성공 커리큘럼 - 목록 조회 : <a href="/web/curation/work/api/searchSuccessCurriculumList" target="ifrmWork">/web/curation/work/api/searchSuccessCurriculumList</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSuccessCurriculumList' /> <br/>
			<!-- 성공 커리큘럼 - 건수 조회 : <a href="/web/curation/work/api/searchSuccessCurriculumListCount" target="ifrmWork">/web/curation/work/api/searchSuccessCurriculumListCount</a><br/> -->	
			* 성공 커리큘럼 - 단건 저장 : /web/curation/work/api/saveSuccessCurriculum	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"crclIdx\":1,\"stryIdx\":1,\"cntsIdx\":1,\"crclSq\":1,\"crclTitl\":\"title 111\",\"crclEvalPnt5Avg\":5,\"crclLikeCnt\":8,\"crclDislCnt\":9,\"useYn\":\"Y\",\"rgntNo\":282,\"regDt\":\"2020-10-23 14:36:59\",\"updtMnNo\":282,\"updtDt\":\"2020-10-23 14:36:59\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/saveSuccessCurriculum' /> <br/>
			<!-- 성공 커리큘럼 - 단건 등록 : <a href="/web/curation/work/api/addSuccessCurriculum" target="ifrmWork">/web/curation/work/api/addSuccessCurriculum</a><br/> -->	
			<!-- 성공 커리큘럼 - 단건 수정 : <a href="/web/curation/work/api/modifySuccessCurriculum" target="ifrmWork">/web/curation/work/api/modifySuccessCurriculum</a><br/> -->	
			* 성공 커리큘럼 - 단건 삭제 : <a href="/web/curation/work/api/removeSuccessCurriculum" target="ifrmWork">/web/curation/work/api/removeSuccessCurriculum</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='' /> <br/>
			<br/>
			
			O 성공 스토리 - 단건 조회 : <a href="/web/curation/work/api/searchSuccessStory?stryIdx=110" target="ifrmWork">/web/curation/work/api/searchSuccessStory?stryIdx=110</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSuccessStory?stryIdx=110' /> <br/>
			O 성공 스토리 - 목록 조회 : <a href="/web/curation/work/api/searchSuccessStoryList" target="ifrmWork">/web/curation/work/api/searchSuccessStoryList</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/work/api/searchSuccessStoryList' /> <br/>
			<!-- 성공 스토리 - 건수 조회 : <a href="/web/curation/work/api/searchSuccessStoryListCount" target="ifrmWork">/web/curation/work/api/searchSuccessStoryListCount</a><br/> -->	
			* 성공 스토리 - 단건 저장 : /web/curation/work/api/saveSuccessStory
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"stryIdx\":1,\"crnMbrNo\":282,\"stryTitl\":\"qqq 111\",\"trgtCn\":\"ttt\",\"rsltCn\":\"rrr\",\"methCn\":\"mmm\",\"opngStatCd\":\"604001\",\"useYn\":\"Y\",\"rgntNo\":282,\"regDt\":\"2020-10-23 14:30:24\",\"updtMnNo\":282,\"updtDt\":\"2020-10-23 14:30:24\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/work/api/saveSuccessStory' /> <br/>
			<!-- 성공 스토리 - 단건 등록 : <a href="/web/curation/work/api/addSuccessStory" target="ifrmWork">/web/curation/work/api/addSuccessStory</a><br/> -->	
			<!-- 성공 스토리 - 단건 수정 : <a href="/web/curation/work/api/modifySuccessStory" target="ifrmWork">/web/curation/work/api/modifySuccessStory</a><br/> -->	
			* 성공 스토리 - 단건 삭제 : <a href="/web/curation/work/api/removeSuccessStory" target="ifrmWork">/web/curation/work/api/removeSuccessStory</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='' /> <br/>
			<br/>
		</td>
		
		<td height="100%">
			<iframe id="ifrmWork" name="ifrmWork" style="width:490px; height:420px"></iframe>
		</td>
	</tr>
</table>

<hr/>

<h2>curation peruse api 목록</h2>

<table>
	<tr>
		<td>
			O 큐레이터 - 단건 조회 : <a href="/web/curation/peruse/api/searchCurator?crnMbrNo=282" target="ifrmPeruse">/web/curation/peruse/api/searchCurator?crnMbrNo=282</a>  
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchCurator?crnMbrNo=282'/> <br/> 
			<!-- O 큐레이터 - 목록 조회 : <a href="/web/curation/peruse/api/searchCuratorList" target="ifrmPeruse">/web/curation/peruse/api/searchCuratorList - ok</a><br/> -->	
			<!-- O 큐레이터 - 건수 조회 : <a href="/web/curation/peruse/api/searchCuratorListCount" target="ifrmPeruse">/web/curation/peruse/api/searchCuratorListCount - ok</a><br/> -->
			<br/>
			 	
			O 콘텐츠 - 단건 조회 : <a href="/web/curation/peruse/api/searchContents?cntsIdx=54" target="ifrmPeruse">/web/curation/peruse/api/searchContents?cntsIdx=54</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContents?cntsIdx=54' /> <br/>
			O 콘텐츠 - 목록 조회 : <a href="/web/curation/peruse/api/searchContentsList" target="ifrmPeruse">/web/curation/peruse/api/searchContentsList</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k /web/curation/peruse/api/searchContentsList' /> <br/>
			<!-- 콘텐츠 - 건수 조회 : <a href="/web/curation/peruse/api/searchContentsListCount" target="ifrmPeruse">/web/curation/peruse/api/searchContentsListCount</a><br/> -->	
			<br/>
			
			O 콘텐츠 구간 - 단건 조회 : <a href="/web/curation/peruse/api/searchSectionContents?sectCnIdx=1" target="ifrmPeruse">/web/curation/peruse/api/searchSectionContents?sectCnIdx=1</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSectionContents?sectCnIdx=1' /> <br/>
			O 콘텐츠 구간 - 목록 조회 : <a href="/web/curation/peruse/api/searchSectionContentsList?cntsIdx=54" target="ifrmPeruse">/web/curation/peruse/api/searchSectionContentsList?cntsIdx=54</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSectionContentsList?cntsIdx=54' /> <br/>
			<!-- 콘텐츠 구간 - 건수 조회 : <a href="/web/curation/peruse/api/searchSectionContentsListCount" target="ifrmPeruse">/web/curation/peruse/api/searchSectionContentsListCount</a><br/> -->	
			<br/>
			
			O 성공 커리큘럼 - 단건 조회 : <a href="/web/curation/peruse/api/searchSuccessCurriculum?crclIdx=77" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessCurriculum?crclIdx=77</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSuccessCurriculum?crclIdx=77' /> <br/>
			O 성공 커리큘럼 - 목록 조회 : <a href="/web/curation/peruse/api/searchSuccessCurriculumList?stryIdx=127" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessCurriculumList?stryIdx=127</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSuccessCurriculumList?stryIdx=127' /> <br/>
			<!-- 성공 커리큘럼 - 건수 조회 : <a href="/web/curation/peruse/api/searchSuccessCurriculumListCount" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessCurriculumListCount</a><br/> -->	
			<br/>
			
			O 성공 스토리 - 단건 조회 : <a href="/web/curation/peruse/api/searchSuccessStory?stryIdx=110" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessStory?stryIdx=110</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSuccessStory?stryIdx=110' /> <br/>
			O 성공 스토리 - 목록 조회 : <a href="/web/curation/peruse/api/searchSuccessStoryList" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessStoryList</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchSuccessStoryList' /> <br/>
			<!-- 성공 스토리 - 건수 조회 : <a href="/web/curation/peruse/api/searchSuccessStoryListCount" target="ifrmPeruse">/web/curation/peruse/api/searchSuccessStoryListCount</a><br/> -->	
			<br/>

			O 콘텐츠 댓글 - 단건 조회 : <a href="/web/curation/peruse/api/searchContentsComment?cmtIdx=1" target="ifrmPeruse">/web/curation/peruse/api/searchContentsComment?cmtIdx=1</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContentsComment?cmtIdx=1' /> <br/>
			O 콘텐츠 댓글 - 목록 조회 : <a href="/web/curation/peruse/api/searchContentsCommentList?cntsIdx=1" target="ifrmPeruse">/web/curation/peruse/api/searchContentsCommentList?cntsIdx=1</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContentsCommentList' /> <br/>
			O 콘텐츠 댓글 - 하위 댓글 목록 조회 : <a href="/web/curation/peruse/api/searchContentsCommentList?cntsIdx=46&upCmtIdx=75" target="ifrmPeruse">/web/curation/peruse/api/searchContentsCommentList?cntsIdx=46&upCmtIdx=75</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContentsCommentList?cntsIdx=46&upCmtIdx=75' /> <br/>
			<!-- 콘텐츠 댓글 - 건수 조회 : <a href="/web/curation/peruse/api/searchContentsCommentListCount" target="ifrmWork">/web/curation/peruse/api/searchContentsCommentListCount</a><br/> -->	
			* 콘텐츠 댓글 - 단건 저장 : /web/curation/peruse/api/saveContentsComment
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"cmtIdx\":1,\"cntsIdx\":1,\"upCmtIdx\":0,\"cmtCn\":\"FIRST\",\"cmtWritMbn\":282,\"cmtLikeCnt\":0,\"cmtDislCnt\":0,\"useYn\":\"Y\",\"rgntNo\":282,\"regDt\":\"2020-11-17 10:50:08\",\"updtMnNo\":282,\"updtDt\":\"2020-11-17 10:50:10\",\"mbrNkNm\":\"백락\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/peruse/api/saveContentsComment' /> <br/>
			<!-- 콘텐츠 댓글 - 단건 등록 : <a href="/web/curation/peruse/api/addContentsComment" target="ifrmWork">/web/curation/peruse/api/addContentsComment</a><br/> -->	
			<!-- 콘텐츠 댓글 - 단건 수정 : <a href="/web/curation/peruse/api/modifyContentsComment" target="ifrmWork">/web/curation/peruse/api/modifyContentsComment</a><br/> -->	
			* 콘텐츠 댓글 - 단건 삭제 : <a href="/web/curation/peruse/api/removeContentsComment" target="ifrmPeruse">/web/curation/peruse/api/removeContentsComment</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='' /> <br/>
			<br/>

			O 콘텐츠 댓글 좋아요 상세 - 단건 조회 : <a href="/web/curation/peruse/api/searchContentsCommentLikeDetail?cmtLikeDtlIdx=1" target="ifrmPeruse">/web/curation/peruse/api/searchContentsCommentLikeDetail?cmtLikeDtlIdx=1</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContentsCommentLikeDetail?cmtLikeDtlIdx=1' /> <br/>
			O 콘텐츠 댓글 좋아요 상세 - 목록 조회 : <a href="/web/curation/peruse/api/searchContentsCommentLikeDetailList?cntsIdx=1" target="ifrmPeruse">/web/curation/peruse/api/searchContentsCommentLikeDetailList?cntsIdx=1</a>
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k https://127.0.0.1:8443/web/curation/peruse/api/searchContentsCommentLikeDetailList?cntsIdx=1' /> <br/>
			<!-- 콘텐츠 댓글 좋아요 상세 - 건수 조회 : <a href="/web/curation/peruse/api/searchContentsCommentLikeDetailListCount" target="ifrmWork">/web/curation/peruse/api/searchContentsCommentLikeDetailListCount</a><br/> -->	
			* 콘텐츠 댓글 좋아요 상세 - 단건 저장 : /web/curation/peruse/api/saveContentsCommentLikeDetail
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='curl -k -d "{\"cmtLikeDtlIdx\":1,\"cmtIdx\":8,\"mbrNo\":282,\"likeYn\":\"N\",\"dislYn\":\"N\",\"useYn\":\"Y\",\"rgntNo\":0,\"regDt\":\"2020-11-20 10:17:21\",\"updtMnNo\":0,\"updtDt\":\"2020-11-20 10:17:24\"}" -H "Content-Type: application/json" -X POST https://127.0.0.1:8443/web/curation/peruse/api/saveContentsCommentLikeDetail' /> <br/>
			<!-- 콘텐츠 댓글 좋아요 상세 - 단건 등록 : <a href="/web/curation/peruse/api/addContentsCommentLikeDetail" target="ifrmWork">/web/curation/peruse/api/addContentsCommentLikeDetail</a><br/> -->	
			<!-- 콘텐츠 댓글 좋아요 상세 - 단건 수정 : <a href="/web/curation/peruse/api/modifyContentsCommentLikeDetail" target="ifrmWork">/web/curation/peruse/api/modifyContentsCommentLikeDetail</a><br/> -->	
			* 콘텐츠 댓글 좋아요 상세 - 단건 삭제 : <a href="/web/curation/peruse/api/removeContentsCommentLikeDetail" target="ifrmPeruse">/web/curation/peruse/api/removeContentsCommentLikeDetail</a>	
				&nbsp; &nbsp; :: >  <input type="text" ondblclick="this.select(); document.execCommand('copy');" value='' /> <br/>
			<br/>

		</td>
		
		<td height="100%">
			<iframe id="ifrmPeruse" name="ifrmPeruse" style="width:490px; height:320px"></iframe>
		</td>
	</tr>
</table>

<hr/>