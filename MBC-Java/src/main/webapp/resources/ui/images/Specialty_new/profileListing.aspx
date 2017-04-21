<%@ Page Language="C#" MasterPageFile="~/MasterPageServices.master" AutoEventWireup="true"
    CodeFile="profileListing.aspx.cs" Inherits="profileListing" MaintainScrollPositionOnPostback="true"
    EnableViewState="true" %>

<asp:Content ID="Content1" runat="server" ContentPlaceHolderID="head"><asp:Literal ID='ltr_metatitle' runat='server'></asp:Literal></asp:Content>
<asp:Content ID="Content4" ContentPlaceHolderID="headMeta" runat="Server">
    <meta name="description" content="<asp:Literal ID='ltr_metadesc1' runat='server'></asp:Literal>" />
    <meta name="keywords" content="<asp:Literal ID='ltr_CityDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc7' runat='server'></asp:Literal> Medical Billing, medical coding, medical billing coding, <asp:Literal ID='ltr_CityDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc8' runat='server'></asp:Literal> medical billing companies, medical billing services, <asp:Literal ID='ltr_CityDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc9' runat='server'></asp:Literal> medical billing service, medical coding, medical billing Agencies, medical coding services, medical billing company, online medical billing, <asp:Literal ID='ltr_CityDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc10' runat='server'></asp:Literal> Medical Billers and Coders Medical Billing Association." />
</asp:Content>
<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="ContentPlaceHolder1">
    <!-- Main about us content start-->
  <%-- <asp:Literal ID='ltr_metatitle' runat='server'></asp:Literal>

    <meta name="description" content="<asp:Literal ID='ltr_metadesc1' runat='server'></asp:Literal>" />
    <meta name="keywords" content="<asp:Literal ID='ltr_CityDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc7' runat='server'></asp:Literal> Medical Billing, medical coding, medical billing coding, <asp:Literal ID='ltr_CityDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc8' runat='server'></asp:Literal> medical billing companies, medical billing services, <asp:Literal ID='ltr_CityDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc9' runat='server'></asp:Literal> medical billing service, medical coding, medical billing Agencies, medical coding services, medical billing company, online medical billing, <asp:Literal ID='ltr_CityDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc10' runat='server'></asp:Literal> Medical Billers and Coders Medical Billing Association." />--%>

    <div class="container">
    <div:Navigation ID="oNavigation" runat="server" />
        </div>
    <!-- breadcrumb -->
    <div class="breadcrumbs">
        <a href="<%= string.Concat(Request.ApplicationPath,ConfigurationManager.AppSettings["Slash"], "") %>">
           <%-- <img src='<%= new CR_Common().ImagePath("images/bc_home_icon.jpg") %>' class="bc_home_icon" />--%></a>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypStatename" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypCityname" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="HypCategoryName" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypProfile" runat="server" Text=""> </asp:HyperLink></div>
    </div>
    <!-- breadcrumb ends-->
   
      <div class="banner-inner baner-bg-blue-light">
        	<div class="container">
            	<div class="col-sm-7" runat="server" id="Categorydesc">
               	   <%--<h1 ID="lblCatName" runat="server" ></h1>--%>
                    <asp:Literal ID="lblCatDescription" runat="server" Text=""></asp:Literal>
                </div>
                <div class="row">
                    <div class="col-sm-5">
                       <%-- <div class="banner-img-specailties">&nbsp;</div>--%>
                         <div class="city_state_img" runat="server" id="divMain"></div>
                    </div>
            	</div>
            </div>
        
        </div>

    <div class="two-colomn-temp">
        <div class="container">
            <div class="row">
            
            	<div class="col-sm-7">
<!-- Left section start -->
    <%--<h4 class="text-blue">Our expertise includes-</h4>--%>
                    <h1 ID="lblCatName" runat="server" ></h1>
                    <asp:Literal ID="lblCatDescription2" runat="server" Text=""></asp:Literal>
<!--
<p>Devising technology interface in billing and coding -- proficiency in using billing software such as such as Next Gen, Medisoft, Eclipse, Lytec, Inception, and Misys; and encoding diagnosis and treatment procedures documents into compliant codes (ICD-9-CM, CPT &amp; HCPCS codes) on advanced technology platforms such as EncoderPro, FLashcode and CodeLink – has been the key to our billers and coders’ impressive conversion rates. Outsourcing your Internal Medicine billing and coding needs to our tech-savvy billers and coders’ can ensure error-free coding, faster submission of bills, and speedier and denial free realization of bills.</p>    
-->
<!-- Left section end -->
                </div>
                
                <div class="col-sm-5 right-sidebar">
                <!-- Right section start -->
                	<div class="right-gray-panel">
                    	      


                            <div class="category_box" id="stateListing" runat="server" visible="True">
        <CP:State1 ID="stateListing00" runat="server" />
    </div>
    <div class="category_box" runat="server" id="Div2" visible="true">
        <CP:CategoryList1 ID="catListing" runat="server" />
    </div>
                        
                        
                        

                          
                        <%--<frm:centerleadform runat="server" ID="register" />--%>
                          
        <%--<CP:State1 ID="statelist1" runat="server" />--%>
    
                        <%--<div class="category_box" runat="server" id="catListing" visible="false">
        <CP:CategoryList1 ID="catList" runat="server" />
    </div>--%>
                        <%-- <div class="pop-states">
                           	<div class="col-xs-4"><p><a href="#">Florida</a></p></div>
                            <div class="col-xs-4"><p>Ohio</p></div>
                            <div class="col-xs-4"><p>Texas</p></div>
                           <div class="right-dashesh-ghr"> </div>
                           
                           <div class="col-xs-4"><p>New York</p></div>
                           <div class="col-xs-4"><p>New Jersey</p></div>
                           <div class="col-xs-4"><p>Maryland</p></div>
                           <div class="right-dashesh-ghr"> </div>
                           
                           <div class="col-xs-4">Virginia</div>
                           <div class="col-xs-4">Pennsylvania</div>
                           <div class="clearfix"></div>
                           <div class="we-serve-in" runat="server" id="catListing" visible="true"><a href="#">We also Serve in<%--<i class="fa fa-caret-right pull-right">--%>
        <%--<CP:CategoryList1 ID="catList" runat="server" />--%>
                             <%-- <CP:State1 ID="statelist1" runat="server" class="fa fa-caret-right pull-right" />--%>
    <%--</i>--%><%--</a></div>--%>
                          <%-- <div class="we-serve-links"><a href="#"><img src="images/icons/menu-tile.jpg" alt="links"></a></div>
                     </div> --%>
                  
                                                  
                    <div id="stateListing001" runat="server" visible="false"></div>
                        <asp:Label ID="Label1" runat="server" Text="Label" Visible="false"></asp:Label>
                    </div>
                    
                    
                    <div class="right-blue-panel">
                    	<div class="row">
                            <div class="col-xs-3">
                                <div class="whitecircle-right-panel text-blue"><a href="medical-billing-bytes.aspx" style="color:#00B1BA"> I</a> </div>
                            </div>
                            <div class="col-xs-9">
                             <a href="medical-billing-bytes.aspx">  <h3>Infograph </h3></a> 
                                <p>Billing and Coding in a nutshell- The pictorial section will help you understand the ‘this and that’ of billing and management. Go through the infographs for an understanding of process, in short.
</p>
                            </div>
                        </div>
                    </div>
                    
                    <div class="right-green-panel">
                    	<div class="row">
                            <div class="col-xs-3">
                                <div class="whitecircle-right-panel text-green"><a href="blog" style="color:#B1CD6F">B</a></div>
                            </div>
                            <div class="col-xs-9">
                           <a href="blog" style="color:white" >     <h3 style="color:"#FFFFFF">Blog </h3></a>
                                <p>Our blog section can help you with information, experiences and opinions pertaining to the medical and medical billing industry. 
</p>
                            </div>
                        </div>
                    </div>
                    
                     <div class="right-dgray-panel">
                    	<div class="row">
                            <div class="col-xs-3">
                                <div class="whitecircle-right-panel text-dgray"><a href="articles.aspx" style="color:#515252">A</a> </div>
                            </div>
                            <div class="col-xs-9">
                              <a href="articles.aspx" style="color:white" > <h3 style="color:"#FFFFFF">Article </h3></a> 
                                <p>Understand the billing and coding processes ranging through various specialties and states along with a plethora of healthcare related information.
</p>
                            </div>
                        </div>
                    </div>
                    
                    
                <!-- Right section end -->
                </div>
                
            
            </div>
        
        </div>
       </div>
    
   <%-- <div class="city_state_img" runat="server" id="divMain">
        <div class="img_blank">
        </div>
        <div runat="server" id="Categorydesc">
            <h1 ID="lblCatName1" runat="server" ></h1>
            <asp:Literal ID="lblCatDescription" runat="server" Text=""></asp:Literal>
            <asp:Literal ID="lblCatDescription2" runat="server" Text=""></asp:Literal>
        </div>
    </div>--%>
    
   <%-- <frm:centerleadform runat="server" ID="register" />--%>
    

    <!-- Category box -->
    <%--<div class="category_box" id="stateListing" runat="server" visible="false">
        <CP:State1 ID="statelist1" runat="server" />
    </div>--%>
    <%--<div class="category_box" runat="server" id="catListing" visible="false">
        <CP:CategoryList1 ID="catList" runat="server" />
    </div>--%>


</asp:Content>
<%--<asp:Content ID="Content1" runat="server" ContentPlaceHolderID="head"><asp:Literal ID='ltr_metatitle' runat='server'></asp:Literal></asp:Content>
<asp:Content ID="Content4" ContentPlaceHolderID="headMeta" runat="Server">
    <meta name="description" content="<asp:Literal ID='ltr_metadesc1' runat='server'></asp:Literal>" />
    <meta name="keywords" content="<asp:Literal ID='ltr_CityDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc7' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc7' runat='server'></asp:Literal> Medical Billing, medical coding, medical billing coding, <asp:Literal ID='ltr_CityDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc8' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc8' runat='server'></asp:Literal> medical billing companies, medical billing services, <asp:Literal ID='ltr_CityDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc9' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc9' runat='server'></asp:Literal> medical billing service, medical coding, medical billing Agencies, medical coding services, medical billing company, online medical billing, <asp:Literal ID='ltr_CityDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_StateDesc10' runat='server'></asp:Literal><asp:Literal ID='ltr_CatDesc10' runat='server'></asp:Literal> Medical Billers and Coders Medical Billing Association." />
</asp:Content>
<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="ContentPlaceHolder1">
    <!-- breadcrumb -->
    <div class="breadcrumbs">
        <a href="<%= string.Concat(Request.ApplicationPath,ConfigurationManager.AppSettings["Slash"], "") %>">
            <img src='<%= new CR_Common().ImagePath("images/bc_home_icon.jpg") %>' class="bc_home_icon" /></a>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypStatename" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypCityname" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="HypCategoryName" runat="server" Text=""> </asp:HyperLink></div>
        <div class="bc_other_links">
            <asp:HyperLink ID="hypProfile" runat="server" Text=""> </asp:HyperLink></div>
    </div>
    <!-- breadcrumb ends-->
    <div class="city_state_img" runat="server" id="divMain">
        <div class="img_blank">
        </div>
        <div runat="server" id="Categorydesc">
            <h1 ID="lblCatName" runat="server" ></h1>
            <asp:Literal ID="lblCatDescription" runat="server" Text=""></asp:Literal>
            <asp:Literal ID="lblCatDescription2" runat="server" Text=""></asp:Literal>
        </div>
    </div>
    
    <frm:centerleadform runat="server" ID="register" />
    
</asp:Content>
<asp:Content ID="Content3" runat="server" ContentPlaceHolderID="ContentPlaceHolder2">
    <!-- Category box -->
    <div class="category_box" id="stateListing" runat="server" visible="false">
        <CP:State1 ID="statelist1" runat="server" />
    </div>
    <div class="category_box" runat="server" id="catListing" visible="false">
        <CP:CategoryList1 ID="catList" runat="server" />
    </div>
</asp:Content>--%>
