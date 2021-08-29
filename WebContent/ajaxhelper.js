

function postDataToServer(){
	postDataToServer("/MovieWebApp/addMovie", requestParameters, processAddResponse);
	alert(getData + "getDataFromServer failed: " + errorText);
}



