<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<jsp:include page="/WEB-INF/views/common/leftside.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      
      
      <script src="resources/admin/plugins/jQuery/jquery-2.2.3.min.js"></script>     
       <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/jquery.jqGrid.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/ui.jqgrid-bootstrap.css"/>
     
     <script>
     function AddState() {
        // $('#UserForm').get(0).reset();
      
         $('#AddEditStateModal').modal('show');
     }
     </script>
<!-- Modal -->
<div id="AddEditStateModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">User Information</h4>
        </div>
        <form id="person" action="person/add" method="post">
        <div class="modal-body">
               
            
            
            <div class="form-group">
                <div class="col-sm-4">
                    name
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="name" name="name" value=""/>
                </div>
            </div>
            
             <div class="form-group">
                <div class="col-sm-4">
                    country
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="country" name="country" value=""/>
                </div>
            </div>          
            

        </div>
            <div class="modal-footer">
                <button class="btn btn-theme" type="submit">Submit</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
       </form>
    </div>

  </div>
</div>
<!--  End Bootstrap modal -->
     
      <button type="button" onclick="AddState()" class="btn btn-default" data-dismiss="modal">New User</button>
      <div style="margin-left:20px">
    <table id="multiple37"></table> <div id="pmultiple37" ></div>
</div>
    <script type="text/javascript"> 
        $(document).ready(function () {
			
            $("#multiple37").jqGrid({
                url: 'http://localhost:8080/MBC-Java/hi',
                	//	url: 'http://localhost:8080/MBC-Java/persons',
                		
                mtype: "GET",
				styleUI : 'Bootstrap',
                datatype: "json",
                colModel: [
                    { label: 'name', name: 'id', key: true, width: 75 },
                    { label: 'name', name: 'name', width: 150 },
                    { label: 'country', name: 'country', width: 150 }, 
                ],
				viewrecords: true,
                height: 250,
                rowNum: 20,
                pager: "#pmultiple37"
            });
        });
 
   </script>
      
      
     
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>