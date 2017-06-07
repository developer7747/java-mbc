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
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
 <meta name="ROBOTS" content="Index, FOLLOW">
<meta name="ROBOTS" content="Index, ALL">
<meta name="author" content="MedicalBillersandCoders.com,  http://www.medicalbillersandcoders.com" /> 
<meta name="copyright" content="MedicalBillersandCoders.com, http://www.medicalbillersandcoders.com/, All right reserved 2015." /> 
<meta name="classification" content="Medical Billing Services" /> 
<meta name="distribution" content="Global" /> 
<meta name="language" content="EN" /> 
<meta name="document-classification" content=" Medical Billing Services" /> 
<meta name="document-type" content="Public" /> 
<meta name="Page-Topic" content=" Medical Billing Services" /> 
<meta name="Audience" content="All, Healthcare, ICD 10, Hospitals" /> 
<!-- <base href=" http://www.medicalbillersandcoders.com/ " />   -->
<link rel="shortcut icon" href="/img1/fevicon.ico" type="image/x-icon" />

 <!-- Bootstrap 3.3.6 -->
 <link rel="stylesheet" href="<c:url value="/resources/admin/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

<link href="<c:url value="/resources/ui/css/bootstrap.min.css"/>" rel="stylesheet">


<link href="<c:url value="/resources/ui/css/libraries/plugins/fancybox/source/jquery.fancybox.css" />" rel="stylesheet" type="text/css" >

<script async src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script>

<link href="<c:url value="/resources/ui/css/style-menu.css"/>" rel="stylesheet" >

<link href="<c:url value="/resources/ui/css/style.css"/>" rel="stylesheet" >

<link href="<c:url value="/resources/ui/css/custom.css"/>" rel="stylesheet" >

<script src="https://www.google.com/recaptcha/api.js"></script>
<!-- <meta name="p:domain_verify" content="e99f97d685f0ba7be10516c8c57ed96a"/> -->


<!-- DO NOT MODIFY -->
<!-- End Facebook Pixel Code --> 
  
<style>

  
        @media only screen and (max-width: 800px) {
    .modal-content {
        width:300%;
    }

    
}



.pagelisting table td a {
 background: white;
    border: 1px solid;
	padding:3px 9px;
}
</style>

<%--number counter--%> 
    <script type="text/jscript">
        $(function () {

            jQuery({ someValue: 0 }).animate({ someValue: 16 }, {
                duration: 3000,
                easing: 'swing', // can be anything
                step: function () { // called on every step
                    // Update the element's text with rounded-up value:
                  
                    $('#i').text(Math.ceil(this.someValue) + "");
                }
            })
        }

        );
        $(function () {

            jQuery({ someValue: 0 }).animate({ someValue: 40 }, {
                duration: 3000,
                easing: 'swing', // can be anything
                step: function () { // called on every step
                    // Update the element's text with rounded-up value:

                    $('#i2').text(Math.ceil(this.someValue) + "");
                }
            })
        }

        );
        $(function () {

            jQuery({ someValue: 0 }).animate({ someValue: 50 }, {
                duration: 3000,
                easing: 'swing', // can be anything
                step: function () { // called on every step
                    // Update the element's text with rounded-up value:

                    $('#i3').text(Math.ceil(this.someValue) + "");
                }
            })
        }

        );



    </script>
   <%--zooin effect--%>
   
  

<!--end-->
  
  
 </head>
  

<body>
 <!-- Slide trigger start here -->
<!--         <div:SlideTrigger ID="oSlideTrigger" runat="server" /> -->
        <!-- Slide trigger end here -->
        
        <jsp:include page="/WEB-INF/views/UI/Common/ui/side-trigger.jsp"/>

      <!-- pop up content start-->
    <div id="responsive_request_call_back" class="modal fade" tabindex="-1" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div style="background: #088389" class="modal-header">
                    
                    <center><h4 style="padding-top: 7px;color: white" class="modal-title">Request a Call Back</h4></center>
                     <a style="color: white" href="javascript:void(0)" data-dismiss="modal" class="closeme side-content-close">X</a>
                        <br/>

                </div>
                <div class="modal-body">
                    <div class="scroller" style="; overflow: auto;" data-always-visible="1" data-rail-visible1="1">


<!--    <CP:set_of_requiremtnt_new ID="oSetRequirements001" runat="server" /> -->
                       

                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- pop up content start-->

<main class="cd-main-content">












  
  
  
  
  
  
  
  
  
  
  
  
  
  
