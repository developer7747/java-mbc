<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Admin </title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link href="<c:url value="/resources/admin/bootstrap/css/bootstrap.min.css"/>">
  <!-- Font Awesome -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link  href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
<!--   <link rel="stylesheet" href="../resources/admin/dist/css/AdminLTE.min.css"> -->
  
  <link  href="<c:url value="/resources/admin/dist/css/AdminLTE.min.css"/>">
  
   <link  href="<c:url value="/resources/admin/common-cs/common.css"/>">
   
<!--   <link rel="stylesheet" href="../resources/admin/common-cs/common.css"> -->
  
  
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link href="<c:url value="/resources/admin/dist/css/skins/_all-skins.min.css"/>">
<%--   <script src="<c:url value="/resources/admin/plugins/jQuery/jquery-2.2.3.min.js"/>"> </script> --%>
  
    <script src="<c:url value="/resources/admin/plugins/jQuery/jquery-2.2.3.min.js" />"></script>
  
  
  
  
   <script src="http://cdn.ckeditor.com/4.6.2/standard-all/ckeditor.js"></script>
   <link href="<c:url value="/resources/admin/adminscript/date-picker/bootstrap-datepicker3.min.css"  type="text/css" />"> 
    <script src="<c:url value="/resources/admin/adminscript/date-picker/bootstrap-datepicker.min.js" type="text/javascript"/>"> </script>        
   
   <script type="text/javascript">
   var hosting_url="http://localhost:8080/MBC-Java/"; 
       $(function () {
       	$('.datepicker').datepicker();
       });
   </script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>A</b>LT</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Admin</b></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

      <div class="navbar-custom-menu">
      
      </div>
    </nav>
  </header>
