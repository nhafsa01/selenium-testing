<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Form Validation</title>

<script type="text/javascript">
	// Form validation code will come here.
	function validate() {

		if (document.myForm.Name.value == "") {
			alert("Please provide your name!");
			document.myForm.Name.focus();
			return false;
		}
		if (document.myForm.EMail.value == "") {
			alert("Please provide your Email!");
			document.myForm.EMail.focus();
			return false;
		}
		if (document.myForm.Zip.value == "" || isNaN(document.myForm.Zip.value)
				|| document.myForm.Zip.value.length != 5) {

			alert("Please provide a zip in the format #####.");
			document.myForm.Zip.focus();
			return false;
		}
		if (document.myForm.Country.value == "-1") {
			alert("Please provide your country!");
			return false;
		}
		return (true);
	}

	function validateEmail() {
		var emailID = document.myForm.EMail.value;
		atpos = emailID.indexOf("@");
		dotpos = emailID.lastIndexOf(".");

		if (atpos < 1 || (dotpos - atpos < 2)) {
			alert("Please enter correct email ID")
			document.myForm.EMail.focus();
			return false;
		}
		return (true);
	}
</script>
<style>
/* Popup container */
.popup {
	position: relative;
	display: inline-block;
	cursor: pointer;
}

/* The actual popup (appears on top) */
.popup .popuptext {
	visibility: hidden;
	width: 160px;
	background-color: #555;
	color: #fff;
	text-align: center;
	border-radius: 6px;
	padding: 8px 0;
	position: absolute;
	z-index: 1;
	bottom: 125%;
	left: 50%;
	margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
	content: "";
	position: absolute;
	top: 100%;
	left: 50%;
	margin-left: -5px;
	border-width: 5px;
	border-style: solid;
	border-color: #555 transparent transparent transparent;
}

/* Toggle this class when clicking on the popup container (hide and show the popup) */
.popup .show {
	visibility: visible;
	-webkit-animation: fadeIn 1s;
	animation: fadeIn 1s
}

/* Add animation (fade in the popup) */
@
-webkit-keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}

}
@
keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}
}
</style>

<script>
	// When the user clicks on <div>, open the popup
	function myFunction() {
		var popup = document.getElementById("myPopup");
		popup.classList.toggle("show");
	}
</script>

</head>

<body>
	<br />
	<br />
	<br />
	<div class="popup" onclick="myFunction()">
		Click Me! <span class="popuptext" id="myPopup">Popup text...</span>
	</div>

	<div>
		<a href="https://www.w3schools.com/html/">Anchor Link 1</a> <br>
		<a href="https://www.w3schools.com/html/html_links.asp">Anchor
			Link 2</a> <br> <a
			href="https://www.w3schools.com/html/html_links.asp">Anchor Link
			3</a>

	</div>

	<h1 style="text-align: left">REGISTRATION FORM</h1>
	<form action="/cgi-bin/test.cgi" name="myForm"
		onsubmit="return(validate());">
		<table cellspacing="2" cellpadding="2" border="1">

			<tr>
				<td align="right">Name</td>
				<td><input type="text" name="Name" id="Name" /></td>
			</tr>

			<tr>
				<td align="right">EMail</td>
				<td><input type="text" name="EMail" id="EMail" /></td>
			</tr>

			<tr>
				<td align="right">Zip Code</td>
				<td><input type="text" name="Zip" id="Zip" /></td>
			</tr>

			<tr>
				<td align="right">Country</td>
				<td><select name="Country" id="Country">
						<option value="-1" selected>[choose yours]</option>
						<option value="1">USA</option>
						<option value="2">UK</option>
						<option value="3">INDIA</option>
				</select></td>
			</tr>

			<tr>
				<td><input type="radio" id="1" name="gender" id="a"
					value="1" />Male</td>

				<td><input type="radio" id="1" name="gender" id="b"
					value="2" />Female</td>

			</tr>

			<tr>
				<td><input type="checkbox" name="vehicle" id="1"
					value="Bike"> Bike</td>

				<td><input type="checkbox" name="vehicle" id="2"
					value="Car"> Car</td>

			</tr>

			<tr>
				<td align="right"></td>
				<td><input type="submit" id="subBtn" value="Submit" /></td>
			</tr>

		</table>
	</form>

	<h2>Test Button Element</h2>
	<button type="button" id="altBtn" onclick="alert('Hello world!')">Click
		Me!</button>


</body>
</html>