<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %><!-- tiles 라는 이름으로 uri 내용에 태그 라이브러리 사용  -->
<!DOCTYPE html>
<html>

	<head>
    	<meta charset="UTF-8">
    	<title><tiles:getAsString name="title"/></title>
    
	    <link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
	    <style>
    
       		#visual .content-container{	
	            height:inherit;
	            display:flex; 
	            align-items: center;
	            
	            background: url("../../images/customer/visual.png") no-repeat center;
	        }
	    </style>
	</head>
	
	<body>
	    <!-- header 부분 -->
	    <tiles:insertAttribute name = "header"/><!-- tiles.xml에서 name header인거 가져옴 아래에 내용들도 사용법 같음  -->
	        
	            <!-- ---------------------------<header>--------------------------------------- -->
	
	            
		<!-- --------------------------- <visual> --------------------------------------- -->
		<!-- visual 부분 -->
		  <tiles:insertAttribute name = "visual"/>
		
		
		<!-- --------------------------- <body> --------------------------------------- -->
		<div id="body">
			<div class="content-container clearfix">
			
	
				<!-- --------------------------- aside --------------------------------------- -->
				<!-- aside 부분 -->
	    		<tiles:insertAttribute name = "aside"/>
	
	
				<!-- --------------------------- main --------------------------------------- -->
				<tiles:insertAttribute name = "body"/>
				
	
	
		
			</div>
		</div>
	
	    <!-- ------------------- <footer> --------------------------------------- -->
	
	    <tiles:insertAttribute name = "footer"/>
	
	
	        
	    </body>
	    
</html>
			