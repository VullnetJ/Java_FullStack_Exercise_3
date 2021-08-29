
function postDataToServer(){

var form = document.forms["formStudent"]; 
var requestParameters =
"id=" + form["txtId"].value +
"&firstname=" + form["txtFirstname"].value + 
"&lastname=" + form["txtLastname"].value + 
"&street=" + form["txtStreet"].value;
"&postcode=" + form["txtPostcode"].value;
"&postoffice=" + form["txtPostoffice"].value;	

alert("postDataToServer failed: " + errorText);	

}
return postDataToServer();