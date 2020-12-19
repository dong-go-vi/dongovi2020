
// 로그 출력 도구
var __logUse = true;
function __log(){
	if ( __logUse ) {
		console.log(arguments);
	}
}

// 이메일 체크
function checkEmail(str){
	var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
	if(!reg_email.test(str)) {                            
		return false;
	} else {
		return true;
	}
}

// replaceAll
function replaceAll(str, a, b){
	for(var i=0; i<100; i++){
		str = str.replace(a, b);
		if ( str.indexOf(a) < 0 ) {
			break;
		}
	}
	return str;
}

// form to Json
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