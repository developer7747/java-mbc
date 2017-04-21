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

<meta name="p:domain_verify" content="e99f97d685f0ba7be10516c8c57ed96a"/>

<script type="text/javascript">
_atrk_opts = { atrk_acct:"AYqyo1IWx810VR", domain:"medicalbillersandcoders.com",dynamic: true};
(function() { var as = document.createElement('script'); as.type = 'text/javascript'; as.async = true; as.src = "https://d31qbv1cthcecs.cloudfront.net/atrk.js"; var s = document.getElementsByTagName('script')[0];s.parentNode.insertBefore(as, s); })();
</script>
<noscript><img src="https://d5nxst8fruw4z.cloudfront.net/atrk.gif?account=AYqyo1IWx810VR" style="display:none" height="1" width="1" alt="" /></noscript>

  <!-- Facebook Pixel Code -->
<script>
    !function(f, b, e, v, n, t, s) {
        if (f.fbq) return; n = f.fbq = function() {
            n.callMethod ?
n.callMethod.apply(n, arguments) : n.queue.push(arguments)
        }; if (!f._fbq) f._fbq = n;
        n.push = n; n.loaded = !0; n.version = '2.0'; n.queue = []; t = b.createElement(e); t.async = !0;
        t.src = v; s = b.getElementsByTagName(e)[0]; s.parentNode.insertBefore(t, s)
    } (window,
document, 'script', 'https://connect.facebook.net/en_US/fbevents.js');
    fbq('init', '1263221140423553'); // Insert your pixel ID here.
    fbq('track', 'PageView');
</script>
<noscript><img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=1263221140423553&ev=PageView&noscript=1"/></noscript>
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
   
   <script>


        $(function () {
            $('.zoomimg').mouseenter(function ()
        {
            $(this).css("cursor","pointer");
            $(this).animate({width: "43%", height: "25%"}, 'slow');
        });
    
            $('.zoomimg').mouseleave(function ()
            {   
                $(this).animate({ width: "43%" }, 'fast');
                //alert("working");   
            }

            )} );
    </script>

<!--end-->
    <script type="text/javascript">
        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-19703482-3']);
        _gaq.push(['_trackPageview']);
        (function () {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
        })();

        function new_load() {
            //setTimeout(function () {
             //   $('#responsive_request_call_back').modal('show');
           // }, 60000);

        }
        //working


        //var timer;

        //window.onload = function() {        
   

        //        timer = setTimeout(function() {
        //            $('#responsive_request_call_back').modal('show');
        //            new_load();
        //        }, 15000);
               
            
        //};
        //working






//        window.onload = function()
//        {
//            timer = setTimeout(function () {
//             $('#responsive_request_call_back').modal('show');
//                new_load();
//            }, 15000);
//           
//        };
        
          
      
    </script>
  
  
 </head>
  

<body>
 <!-- Slide trigger start here -->
<!--         <div:SlideTrigger ID="oSlideTrigger" runat="server" /> -->
        <!-- Slide trigger end here -->
        
        <jsp:include page="/WEB-INF/views/common/ui/side-trigger.jsp"/>

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












  
  
  
  
  
  
  
  
  
  
  
  
  
  
