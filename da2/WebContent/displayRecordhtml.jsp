<!-- P Sheetal Reddy 22MIC0080 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Display Records</title>
		<style>
	        body {
	        	margin: 0;
	        	width: 100%;
	        	height: 100%;
	        }
	        
	        .container {
	            display: flex;
	            flex-direction: column;
	            justify-content: center;
	            align-items: center;
	            gap: 10%;
	            background-color: aliceblue;
	        }
	
	        .header {
	            display: flex;
	            justify-content: center;
	            align-items: center;
	            font-size: 50px;
	        }
	
	        .formContainer {
	            display: flex;
	            flex-direction: column;
	            justify-content: center;
	            align-items: center;
	            background-color: bisque;
	            width: 40%;
	            height: fit-content;
				padding:2%;
	        }
	
	        .label {
	            display: flex;
	            flex-direction: column;
	            justify-content: space-between;
	            font-weight: 1000;
	        }
		</style>
	</head>
	<body class = "container">
		<div class="header">
        	<h1 class="heading">Display the Records</h1>
    	</div>
    	<div class = "formContainer">
    		<form action = "displayRecordsJDBC">
    			<input type = "submit" value = "DISPLAY RECORDS">
    		</form>
    	</div>
	</body>
</html>