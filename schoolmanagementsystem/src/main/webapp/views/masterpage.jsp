<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="resource" value="/resources" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SMS-${pageTitle}</title>

<!-- Bootstrap Core CSS -->
<link href="${resource}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="${resource}/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${resource}/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="${resource}/vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="${resource}/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<script>
	window.menu = '${pageTitle}';
</script>




<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation  cums here -->
		<%@include file="shared/navbar.jsp"%>

		<div id="page-wrapper">
			<%-- 	<%@include file="pages/home.jsp" %> --%>
			<c:if test="${page==null}">  
 			${page="login"}
 			</c:if>
			<jsp:include page="${page}.jsp" />

		</div>

		<!-- footer  cums here -->
		<%@include file="shared/footer.jsp"%>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="${resource}/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${resource}/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="${resource}/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="${resource}/vendor/raphael/raphael.min.js"></script>
	<script src="${resource}/vendor/morrisjs/morris.min.js"></script>
	<script src="${resource}/data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="${resource}/dist/js/sb-admin-2.js"></script>

	<!-- My App JavaScript -->
	<script src="${resource}/js/myapp.js"></script>

</body>

</html>
