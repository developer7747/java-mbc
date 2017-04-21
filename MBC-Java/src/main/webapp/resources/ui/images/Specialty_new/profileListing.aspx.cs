using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.IO;

public partial class profileListing : System.Web.UI.Page
{
    CategoryObject category = new CategoryObject();
    CityOperations cityOperation = new CityOperations();
    string strcategoryID = "0";
    string strStateID = "0";
    string strCityID = "0";
    string state_name = string.Empty;
    string cat_name = string.Empty;
    string City_name = string.Empty;
    Speciality sp_list = new Speciality();
    static string staticCategory;
    static string staticCity;
    string strheadingmed = " Medical Billing Services";

    string medEndhtml = "-medical-billing.html";

    Profile ObjProfile = new Profile();

    PagedDataSource pds = new PagedDataSource();
    PagedDataSource _PageDataSource = new PagedDataSource();

    //for paging
    string strCategoryName = "0";
    string strCityName = "0";
    string strStateName = "0";
    DataSet DResult = new DataSet();
    Profile prof_obj = new Profile();

    protected void Page_Load(object sender, EventArgs e)
     {

        # region  Fill data when No postback And No refersh made on  paging page
        if (!IsPostBack)
            new CR_Common().NotWWW(Request, Response, "");
        if (!IsPostBack && Request.QueryString["page"] == null)
        {

            if (Request.QueryString["category"] != null && Request.QueryString["city"] != null && Request.QueryString["state"] != null)
            {


                strcategoryID = Request.QueryString["category"];
                strCityID = Request.QueryString["city"];

                strStateID = Request.QueryString["state"];

                if (strStateID != "0")
                {
                    if (strcategoryID != "0")
                    {
                        stateListing.Visible = false;
                        catListing.Visible = true;
                    }
                    else
                    {
                        catListing.Visible = true;
                        stateListing.Visible = false;

                    }
                }
                if (strcategoryID != "0")
                {
                    if (strStateID != "0")
                    {
                        catListing.Visible = true;
                        stateListing.Visible = false;
                    }
                    else
                    {
                        ////Expertise in
                        //TranscriptionDetails.Visible = true;

                        catListing.Visible = false;
                        stateListing.Visible = true;
                    }

                }

                BindGrid();


                if (Request.QueryString["city"] != "0" && Request.QueryString["state"] != "0" && Request.QueryString["category"] == "0")
                {
                    Response.Status = "404 Not Found";
                    Server.Transfer("/error.aspx", false);
                    Response.End();
                }



                if (Request.QueryString["city"] != "0" && Request.QueryString["state"] != "0" && Request.QueryString["category"] != "0")
                {
                    hypProfile.Text = lblCatName.InnerText.Length > 34 ? lblCatName.InnerText.Substring(0, 34) : lblCatName.InnerText + " ";
                    hypProfile.Visible = true;
                }
                if (Request.QueryString["city"] == "0" && Request.QueryString["state"] != "0" && Request.QueryString["category"] != "0")
                {
                    HypCategoryName.Text += " ";
                    hypProfile.Text = lblCatName.InnerText.Length > 34 ? lblCatName.InnerText.Substring(0, 34) : lblCatName.InnerText;
                    hypProfile.Visible = true;
                }
                else if (Request.QueryString["city"] == "0" && Request.QueryString["state"] != "0" && Request.QueryString["category"] == "0")
                {
                    hypStatename.Text = lblCatName.InnerText;
                }
                else if (Request.QueryString["city"] == "0" && Request.QueryString["state"] == "0" && Request.QueryString["category"] != "0")
                {
                    HypCategoryName.Text = lblCatName.InnerText;
                }
            }
        }
        #endregion

        # region  Fill data for Paging

        if (Request.QueryString["page"] != null)
        {
            Paging_OnPostback();
        }
        else
        {
        }

        #endregion
        ShowHideBreadcumbs();
        SetFontSize(25);
    }

    private void Paging_OnPostback()
    {
        // This code is used to Do Paging on Postbacks.....

        if (Request.QueryString["page"] != null)
        {
            //Set the Page Number comming from Querystring 
            string strProfilepage = Convert.ToString(Request.QueryString["page"]);

            if (strProfilepage == "1")
            {
                //Redirect to 1st page when Page one is selected...
                if (Request.QueryString["category"] != null)
                {
                    strcategoryID = Request.QueryString["category"];
                    strCityID = Request.QueryString["city"];
                }
                Response.Redirect("/profileListing.aspx?category=" + strcategoryID + "&city=" + strCityID, false);
            }
            else
            {
                //Select The Category  name comming from Querystring 

                if (Request.QueryString["category"] != null && Request.QueryString["city"] != null && Request.QueryString["state"] != null)
                {
                    strcategoryID = Request.QueryString["category"];
                    strCityID = Request.QueryString["city"];
                    strStateID = Request.QueryString["state"];
                }
                else
                {
                    if (Request.QueryString["state"] != null || Request.QueryString["category"] != null || Request.QueryString["city"] != null)
                    {
                        if (Request.QueryString["category"] != null)
                        {
                            this.strcategoryID = Request.QueryString["category"];
                        }
                        else
                        {
                            this.strcategoryID = "0";
                        }
                        if (Request.QueryString["state"] != null)
                        {
                            this.strStateID = Request.QueryString["state"];
                        }
                        else
                        {
                            this.strStateID = "0";
                        }
                        if (Request.QueryString["city"] != null)
                        {
                            this.strCityID = Request.QueryString["city"];
                        }
                        else
                        {
                            this.strCityID = "0";
                        }
                    }

                }

                //Set The Page Number  
                //CurrentPage = Convert.ToInt16(strProfilepage) - 1;

                //Bind the Dataset With new paging data    
                if (strStateID != "0")
                {
                    if (strcategoryID != "0")
                    {
                        //ShowHideMasterPageControls("catListing", true);
                        catListing.Visible = true;
                        //ShowHideMasterPageControls("stateListing", false);
                        stateListing.Visible = false;
                    }
                    else
                    {
                        //ShowHideMasterPageControls("stateListing", false);
                        stateListing.Visible = false;
                    }
                }
                if (strcategoryID != "0")
                {
                    if (strStateID != "0")
                    {
                        //ShowHideMasterPageControls("catListing", true);
                        catListing.Visible = true;
                        //ShowHideMasterPageControls("stateListing", false);
                        stateListing.Visible = false;
                    }
                    else
                    {
                        ////Expertise in
                        //TranscriptionDetails.Visible = true;

                        //ShowHideMasterPageControls("catListing", false);
                        catListing.Visible = false;
                        //ShowHideMasterPageControls("stateListing", true);
                        stateListing.Visible = true;
                    }

                }
                this.BindGrid();


            }
        }
    }

    private void BindGrid()
    {
        this.strcategoryID = Request.QueryString["category"];
        this.strStateID = Request.QueryString["state"];
        this.strCityID = Request.QueryString["city"];

        //for paging purpose

        if (this.strcategoryID != "0" || this.strStateID != "0" || this.strCityID != "0")
        {
            if (this.strcategoryID != "0")
            {
                DResult = prof_obj.GetCategoryDetails(int.Parse(this.strcategoryID));
                this.strCategoryName = DResult.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace(" ", "");
            }
            if (this.strStateID != "0")
            {
                DResult = prof_obj.GetStateDetails(int.Parse(this.strStateID));
                this.strStateName = DResult.Tables[0].Rows[0]["stateName"].ToString().ToLower().Replace(" ", "");
            }
            if (this.strCityID != "0")
            { }
        }

        ObjProfile.SetProfileData(strcategoryID, strCityID, strStateID);
        ShowCategory();

    }

    public void ShowCategory()
    {
        string urlCat = null;

        #region Only for State
        if (((!string.IsNullOrEmpty(strStateID) && strStateID != "0") || (Request.QueryString["state"] != null)) && (!(!string.IsNullOrEmpty(strCityID) && strCityID != "0") || !(Request.QueryString["city"] != null)) && (!(!string.IsNullOrEmpty(strcategoryID) && strcategoryID != "0") || !(Request.QueryString["category"] != null)))
        {
            if (!string.IsNullOrEmpty(strStateID) && strStateID != "0" && strStateID == "4")
            {
                urlCat = null;
                int stateid = Convert.ToInt32(strStateID);
                DataSet Dset_state = ObjProfile.GetStateDetails(stateid);
                if (Dset_state.Tables[0].Rows.Count > 0)
                {
                    //divMain.Style["background"] = File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString()) ? "url('images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent" : "url('images/state_city_banner_img.jpg') no-repeat scroll right top transparent";
                    hypStatename.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString();
                    urlCat = Dset_state.Tables[0].Rows[0]["url"].ToString();
                    hypStatename.NavigateUrl = "/" + urlCat + medEndhtml;
                    ltr_StateDesc7.Text = ltr_StateDesc8.Text = ltr_StateDesc9.Text = ltr_StateDesc10.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + " ";

                    //user control
                    //register.stateName = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString();
                    this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + ", " + Dset_state.Tables[0].Rows[0]["initials"].ToString() + " ";
                    lblCatDescription2.Text +=  " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString()+" " + (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0 ? Dset_state.Tables[0].Rows[0]["stateDesc"].ToString() : templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString())) ; //lblCatDescription2.Text += " " + (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0 ? Dset_state.Tables[0].Rows[0]["stateDesc"].ToString() : templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString()));
                    lblCatDescription.Text += "";//" " + (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0 ? Dset_state.Tables[0].Rows[0]["stateDesc"].ToString() : templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString())) +" " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                }
            }
            else
            {
                #region State
                //for state
                if (!string.IsNullOrEmpty(strStateID) && strStateID != "0")
                {
                    urlCat = null;
                    int stateid = Convert.ToInt32(strStateID);
                    DataSet Dset_state = ObjProfile.GetStateDetails(stateid);
                    if (Dset_state.Tables[0].Rows.Count > 0)
                    {

                        if (
                            File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/state/" +
                                        Dset_state.Tables[0].Rows[0]["Image"].ToString()))
                        {
                            divMain.Style["background"] = "url('images/state/" +
                                                          Dset_state.Tables[0].Rows[0]["Image"].ToString() +
                                                          "') no-repeat scroll right top transparent";
                            divMain.Style["height"] = "300px";
                        }
                        else
                        {
                            divMain.Style["background"] =
                                "url('images/state_city_banner_img.jpg') no-repeat scroll right top transparent";
                            divMain.Style["height"] = "300px";
                        }
                        hypStatename.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString();
                        urlCat = Dset_state.Tables[0].Rows[0]["url"].ToString();
                        hypStatename.NavigateUrl = "/" + urlCat + medEndhtml;

                        ltr_StateDesc7.Text = ltr_StateDesc8.Text = ltr_StateDesc9.Text = ltr_StateDesc10.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + " ";

                        //user control
                        //register.stateName = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString();

                        this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + ", " + Dset_state.Tables[0].Rows[0]["initials"].ToString() + " ";

                        //this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + " (" + Dset_state.Tables[0].Rows[0]["initials"].ToString() + ") ";

                        string strcitydesc = "";
                        if (lblCatDescription.Text.Length > 0)
                        {

                            if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                            {
                                strcitydesc += Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                            }
                            else
                            {
                                strcitydesc += templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                            }

                            //lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                            lblCatDescription2.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();

                        }
                        else
                        {
                            if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                            {
                                strcitydesc = Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                            }
                            else
                            {
                                strcitydesc = templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                            }


                            //lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                            lblCatDescription2.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                        }
                        lblCatDescription2.Text += " " + strcitydesc;
                    }
                }
                else if (Request.QueryString["state"] != null)
                {
                    urlCat = null;
                    strStateID = Request.QueryString["state"].ToString();
                    int stateid = Convert.ToInt32(strStateID);
                    DataSet Dset_state = ObjProfile.GetStateDetails(stateid);
                    if (Dset_state.Tables[0].Rows.Count > 0)
                    {
                        //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString()))
                        //    divMain.Style["background"] = "url('images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                        //else
                        //    divMain.Style["background"] = "url('images/state_city_banner_img.jpg') no-repeat scroll right top transparent";
                        hypStatename.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString();
                        urlCat = Dset_state.Tables[0].Rows[0]["url"].ToString();
                        hypStatename.NavigateUrl = "/" + urlCat + medEndhtml;

                        //user control
                        //register.stateName = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString();

                        this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString() + " ";

                        string strcitydesc = "";
                        if (lblCatDescription.Text.Length > 0)
                        {
                            if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                            {
                                strcitydesc += Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                            }
                            else
                            {
                                strcitydesc += templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                            }
                        }
                        else
                        {
                            if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                            {
                                strcitydesc = Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                            }
                            else
                            {
                                strcitydesc = templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                            }
                        }

                        lblCatDescription.Text += "";// lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();

                        lblCatDescription2.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString()+ " " + strcitydesc;
                    }
                }
                #endregion State
            }
        }
        #endregion Only for State

        #region Only for Specialty
        else if ((!(!string.IsNullOrEmpty(strStateID) && strStateID != "0") || !(Request.QueryString["state"] != null)) && (!(!string.IsNullOrEmpty(strCityID) && strCityID != "0") || !(Request.QueryString["city"] != null)) && ((!string.IsNullOrEmpty(strcategoryID) && strcategoryID != "0") || (Request.QueryString["category"] != null)))
        {
            if (!string.IsNullOrEmpty(strcategoryID) && strcategoryID != "0" && strcategoryID == "9")
            {
                urlCat = null;
                int catid = Convert.ToInt32(strcategoryID);
                DataSet Dset_Category = ObjProfile.GetCategoryDetails(catid);
                if (Dset_Category.Tables[0].Rows.Count > 0)
                {
                    if (
                        File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/Specialty_new/" +
                                    Dset_Category.Tables[0].Rows[0]["Image"].ToString()))
                    {
                        divMain.Style["background"] = "url('images/Specialty_new/" +
                                                      Dset_Category.Tables[0].Rows[0]["Image"].ToString() +
                                                      "') no-repeat scroll right top transparent";
                        divMain.Style["height"] = "300px";
                    }
                    else
                    {
                        divMain.Style["background"] =
                            "url('images/Specialty_new/default-medical-billing-services.jpg') no-repeat scroll right top transparent";
                        divMain.Style["height"] = "300px";
                    }
                    this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                    this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                    urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                    HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;
                    ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                    this.cat_name = ltr_CatDesc7.Text;

                    //user control
                    //register.categoryName = Dset_Category.Tables[0].Rows[0]["catName"].ToString();

                    string cat_name1 = Dset_Category.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace("&", "and");
                    HypCategoryName.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                    string strcatdesc = Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();
                    lblCatDescription.Text += ""; //" " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString();
                    lblCatDescription2.Text = " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString() +lblCatDescription2.Text + " " + Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();
                }
            }
            else
            {
                #region Specialty
                if (!string.IsNullOrEmpty(strcategoryID) && strcategoryID != "0")
                {
                    urlCat = null;
                    int catid = Convert.ToInt32(strcategoryID);
                    DataSet Dset_Category = ObjProfile.GetCategoryDetails(catid);
                    if (Dset_Category.Tables[0].Rows.Count > 0)
                    {
                        if (
                            File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/Specialty/" +
                                        Dset_Category.Tables[0].Rows[0]["Image"].ToString()))
                        {
                            divMain.Style["background"] = "url('images/Specialty/" +
                                                          Dset_Category.Tables[0].Rows[0]["Image"].ToString() +
                                                          "') no-repeat scroll right top transparent";
                            divMain.Style["height"] = "300px";
                        }
                        else
                        {
                        divMain.Style["background"] =
                            "url('images/Specialty/default-medical-billing-services.jpg') no-repeat scroll right top transparent";
                        divMain.Style["height"] = "300px";
                    }
                    this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                        if (Request.QueryString["city"] != null)
                        {
                            this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                            urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                            HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                            ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                            this.cat_name = ltr_CatDesc7.Text;
                        }
                        else
                        {
                            this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                            urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                            HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                            ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                            this.cat_name = ltr_CatDesc7.Text;

                        }

                        //user control
                        //register.categoryName = Dset_Category.Tables[0].Rows[0]["catName"].ToString();


                        string cat_name1 = Dset_Category.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace("&", "and");

                        HypCategoryName.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                        string strcatdesc = Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();

                        lblCatDescription.Text += "";// lblCatDescription.Text += " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString();

                        //added by savitri
                        //string temp1 = lblCatDescription.Text.Split(new string[] { "<div" }, StringSplitOptions.None)[1];
                        //string temp2 = lblCatDescription.Text.Split(new string[] { "<div" }, StringSplitOptions.None)[0];

                        //lblCatDescription.Text = temp2;

                        lblCatDescription2.Text =" " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString()+ lblCatDescription2.Text + " " + Dset_Category.Tables[0].Rows[0]["catDesc"].ToString(); //"<div" + temp1 +
                    }
                }
                else if (Request.QueryString["category"] != null)
                {
                    urlCat = null;
                    strcategoryID = Request.QueryString["category"];
                    int catid = Convert.ToInt32(strcategoryID);
                    DataSet Dset_Category = ObjProfile.GetCategoryDetails(catid);
                    if (Dset_Category.Tables[0].Rows.Count > 0)
                    {
                        //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString()))
                        //    divMain.Style["background"] = "url('images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                        //else
                        //    divMain.Style["background"] = "url('images/Specialty/default-medical-billing-services.jpg') no-repeat scroll right top transparent";
                        this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                        if (Request.QueryString["city"] != null)
                        {
                            this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                            urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                            HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                            ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                        }
                        else
                        {
                            this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                            urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                            HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                            ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                            this.cat_name = ltr_CatDesc7.Text;

                        }
                        HypCategoryName.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();

                        //user control
                        //register.categoryName = Dset_Category.Tables[0].Rows[0]["catName"].ToString();

                        string cat_name1 = Dset_Category.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace("&", "and");

                        string strcatdesc = Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();
                        lblCatDescription.Text += "";//  lblCatDescription.Text += " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString();
                        lblCatDescription2.Text =" " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString()+ lblCatDescription2.Text + " " + strcatdesc;
                    }
                }

                #endregion Specialty
            }
        }
        #endregion Only for Specialty

        else
        {
            #region City
            if (!string.IsNullOrEmpty(strCityID) && strCityID != "0")
            {
                int catid = Convert.ToInt32(strCityID);
                DataSet Dset_City = ObjProfile.GetCityDetails(catid);
                urlCat = null;

                if (Dset_City.Tables[0].Rows.Count > 0)
                {
                    if (Request.QueryString["category"] != null)
                    {
                        urlCat = Dset_City.Tables[0].Rows[0]["url"].ToString();
                        ltr_CityDesc7.Text = ltr_CityDesc8.Text = ltr_CityDesc9.Text = ltr_CityDesc10.Text = Dset_City.Tables[0].Rows[0]["Cities"].ToString().Split(',')[0].ToString();
                        try
                        {
                            if (this.Page.Title != null)
                                this.Page.Title.Remove(0);
                        }
                        catch (Exception ex)
                        {

                        }
                    }
                    string urlextn = "-medical-billing-specialist.html";
                    string city = Dset_City.Tables[0].Rows[0]["url"].ToString();
                    string url = city.ToString().Split('-')[0] + "-" + city.ToString().Split('-')[1] + urlextn;
                    hypCityname.NavigateUrl = string.Concat(Request.ApplicationPath, ConfigurationManager.AppSettings["Slash"], "city/" + url);
                    this.City_name = Dset_City.Tables[0].Rows[0]["Cities"].ToString() + " ";
                    hypCityname.Text = Dset_City.Tables[0].Rows[0]["Cities"].ToString();
                    string strcitydesc = "";
                    if (Dset_City.Tables[0].Rows[0]["cityDesc"].ToString().Length > 0)
                    {
                        strcitydesc = Dset_City.Tables[0].Rows[0]["cityDesc"].ToString();
                    }
                    else
                    {
                        strcitydesc = templatedcitydata(Dset_City.Tables[0].Rows[0]["Cities"].ToString());
                    }
                    if (Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString().Length > 0)
                    {
                        //lblCatDescription.Text += " " + Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString();
                         lblCatDescription2.Text+=" " + Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString();
                    }
                    else
                    {
                        //lblCatDescription.Text += " " + templatedcitydata(Dset_City.Tables[0].Rows[0]["Cities"].ToString());
                        lblCatDescription2.Text += " " + templatedcitydata(Dset_City.Tables[0].Rows[0]["Cities"].ToString());
                    }
                    lblCatDescription2.Text += " " + strcitydesc;

                    //user control
                    //register.cityName = Dset_City.Tables[0].Rows[0]["Cities"].ToString().Split(',')[0].ToString();

                }
            }
            else if (Request.QueryString["city"] != null)
            {
                urlCat = null;
                strcategoryID = Request.QueryString["city"];
                int catid = Convert.ToInt32(strcategoryID);
                DataSet Dset_City = ObjProfile.GetCityDetails(catid);
                if (Dset_City.Tables[0].Rows.Count > 0)
                {
                    if (Request.QueryString["category"] != null)
                    {

                        urlCat = Dset_City.Tables[0].Rows[0]["url"].ToString();
                    }
                    else
                    { }
                    string urlextn = "-medical-billing-specialist.html";
                    string city = Dset_City.Tables[0].Rows[0]["url"].ToString();
                    string url = city.ToString().Split('-')[0] + "-" + city.ToString().Split('-')[1] + urlextn;
                    hypCityname.NavigateUrl = string.Concat(Request.ApplicationPath, ConfigurationManager.AppSettings["Slash"], "city/" + url);

                    this.City_name = Dset_City.Tables[0].Rows[0]["Cities"].ToString() + " ";
                    hypCityname.Text = Dset_City.Tables[0].Rows[0]["Cities"].ToString();
                    string strcitydesc = "";
                    if (Dset_City.Tables[0].Rows[0]["cityDesc"].ToString().Length > 0)
                    {
                        strcitydesc = Dset_City.Tables[0].Rows[0]["cityDesc"].ToString();
                    }
                    else
                    {
                        strcitydesc = templatedcitydata(Dset_City.Tables[0].Rows[0]["Cities"].ToString());
                    }
                    if (Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString().Length > 0)
                    {
                        //lblCatDescription.Text += " " + Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString();
                        lblCatDescription2.Text += " " + Dset_City.Tables[0].Rows[0]["cityShortDesc"].ToString();
                    }

                    lblCatDescription2.Text += " " + strcitydesc;

                    //register.cityName = Dset_City.Tables[0].Rows[0]["Cities"].ToString().Split(',')[0].ToString();

                }
            }
            #endregion City

            #region State
            //for state
            if (!string.IsNullOrEmpty(strStateID) && strStateID != "0")
            {
                urlCat = null;
                int stateid = Convert.ToInt32(strStateID);
                DataSet Dset_state = ObjProfile.GetStateDetails(stateid);
                if (Dset_state.Tables[0].Rows.Count > 0)
                {

                    //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString()))
                    //    divMain.Style["background"] = "url('images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                    //else
                    //    divMain.Style["background"] = "url('images/state_city_banner_img.jpg') no-repeat scroll right top transparent";
                    hypStatename.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString();
                    urlCat = Dset_state.Tables[0].Rows[0]["url"].ToString();
                    hypStatename.NavigateUrl = "/" + urlCat + medEndhtml;

                    ltr_StateDesc7.Text = ltr_StateDesc8.Text = ltr_StateDesc9.Text = ltr_StateDesc10.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + " ";

                    //user control
                    //register.stateName = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString();

                    this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + ", " + Dset_state.Tables[0].Rows[0]["initials"].ToString() + " ";

                    //this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + " (" + Dset_state.Tables[0].Rows[0]["initials"].ToString() + ") ";

                    string strcitydesc = "";
                    if (lblCatDescription.Text.Length > 0)
                    {

                        if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                        {
                            strcitydesc += Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                        }
                        else
                        {
                            strcitydesc += templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                        }

                        //lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                        lblCatDescription2.Text+= " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();

                    }
                    else
                    {
                        if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                        {
                            strcitydesc = Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                        }
                        else
                        {
                            strcitydesc = templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                        }


                        //lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                        lblCatDescription2.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();
                    }
                    lblCatDescription2.Text += " " + strcitydesc;
                }
            }
            else if (Request.QueryString["state"] != null)
            {
                urlCat = null;
                strStateID = Request.QueryString["state"].ToString();
                int stateid = Convert.ToInt32(strStateID);
                DataSet Dset_state = ObjProfile.GetStateDetails(stateid);
                if (Dset_state.Tables[0].Rows.Count > 0)
                {
                    //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString()))
                    //    divMain.Style["background"] = "url('images/state/" + Dset_state.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                    //else
                    //    divMain.Style["background"] = "url('images/state_city_banner_img.jpg') no-repeat scroll right top transparent";
                    hypStatename.Text = Dset_state.Tables[0].Rows[0]["stateName"].ToString();
                    urlCat = Dset_state.Tables[0].Rows[0]["url"].ToString();
                    hypStatename.NavigateUrl = "/" + urlCat + medEndhtml;

                    //user control
                    //register.stateName = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString();

                    this.state_name = Dset_state.Tables[0].Rows[0]["stateName"].ToString() + "," + Dset_state.Tables[0].Rows[0]["initials"].ToString() + " ";

                    string strcitydesc = "";
                    if (lblCatDescription.Text.Length > 0)
                    {
                        if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                        {
                            strcitydesc += Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                        }
                        else
                        {
                            strcitydesc += templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                        }
                    }
                    else
                    {
                        if (Dset_state.Tables[0].Rows[0]["stateDesc"].ToString().Length > 0)
                        {
                            strcitydesc = Dset_state.Tables[0].Rows[0]["stateDesc"].ToString();
                        }
                        else
                        {
                            strcitydesc = templatedstatedata(Dset_state.Tables[0].Rows[0]["stateName"].ToString());
                        }
                    }

                    lblCatDescription.Text += "";//lblCatDescription.Text += " " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString();

                    lblCatDescription2.Text +=" " + Dset_state.Tables[0].Rows[0]["stateShorDesc"].ToString()+ " " + strcitydesc;
                }
            }
            #endregion State

            #region Specialty
            if (!string.IsNullOrEmpty(strcategoryID) && strcategoryID != "0")
            {
                urlCat = null;
                int catid = Convert.ToInt32(strcategoryID);
                DataSet Dset_Category = ObjProfile.GetCategoryDetails(catid);
                if (Dset_Category.Tables[0].Rows.Count > 0)
                {
                    //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString()))
                    //    divMain.Style["background"] = "url('images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                    //else
                    //    divMain.Style["background"] = "url('images/Specialty/default-medical-billing-services.jpg') no-repeat scroll right top transparent";
                    this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                    if (Request.QueryString["city"] != null)
                    {
                        this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                        urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                        HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                        ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                        this.cat_name = ltr_CatDesc7.Text;
                    }
                    else
                    {
                        this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                        urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                        HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                        ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                        this.cat_name = ltr_CatDesc7.Text;

                    }

                    //user control
                    //register.categoryName = Dset_Category.Tables[0].Rows[0]["catName"].ToString();


                    string cat_name1 = Dset_Category.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace("&", "and");

                    HypCategoryName.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                    string strcatdesc = Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();

                    lblCatDescription.Text += "";//" " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString();

                    lblCatDescription2.Text = " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString()+lblCatDescription2.Text + " " + Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();
                }
            }
            else if (Request.QueryString["category"] != null)
            {
                urlCat = null;
                strcategoryID = Request.QueryString["category"];
                int catid = Convert.ToInt32(strcategoryID);
                DataSet Dset_Category = ObjProfile.GetCategoryDetails(catid);
                if (Dset_Category.Tables[0].Rows.Count > 0)
                {
                    //if (File.Exists(AppDomain.CurrentDomain.BaseDirectory + "images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString()))
                    //    divMain.Style["background"] = "url('images/Specialty/" + Dset_Category.Tables[0].Rows[0]["Image"].ToString() + "') no-repeat scroll right top transparent";
                    //else
                    //    divMain.Style["background"] = "url('images/Specialty/default-medical-billing-services.jpg') no-repeat scroll right top transparent";
                    this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";

                    if (Request.QueryString["city"] != null)
                    {
                        this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                        urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                        HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                        ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                    }
                    else
                    {
                        this.cat_name = Dset_Category.Tables[0].Rows[0]["catName"].ToString() + " ";
                        urlCat = Dset_Category.Tables[0].Rows[0]["url"].ToString();
                        HypCategoryName.NavigateUrl = "/" + urlCat + medEndhtml;

                        ltr_CatDesc7.Text = ltr_CatDesc8.Text = ltr_CatDesc9.Text = ltr_CatDesc10.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();
                        this.cat_name = ltr_CatDesc7.Text;

                    }
                    HypCategoryName.Text = Dset_Category.Tables[0].Rows[0]["catName"].ToString();

                    //user control
                    //register.categoryName = Dset_Category.Tables[0].Rows[0]["catName"].ToString();

                    string cat_name1 = Dset_Category.Tables[0].Rows[0]["catName"].ToString().ToLower().Replace("&", "and");

                    string strcatdesc = Dset_Category.Tables[0].Rows[0]["catDesc"].ToString();
                    lblCatDescription.Text += "" ;//lblCatDescription.Text += " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString();
                    lblCatDescription2.Text = " " + Dset_Category.Tables[0].Rows[0]["catShortDesc"].ToString()+lblCatDescription2.Text + " " + strcatdesc;
                }
            }

            #endregion Specialty
        }
        if (string.IsNullOrEmpty(this.cat_name) && string.IsNullOrEmpty(this.City_name) && !string.IsNullOrEmpty(this.state_name))
        {
            lblCatName.InnerText = this.cat_name.Trim() + " " + strheadingmed.Trim() + " " + this.state_name.Trim();
        }
        else if (!string.IsNullOrEmpty(this.cat_name) || !string.IsNullOrEmpty(this.City_name) || !string.IsNullOrEmpty(this.state_name))
        {
            if (this.cat_name.ToLower().Contains("medical"))
            {
                if (!string.IsNullOrEmpty(this.City_name))
                    lblCatName.InnerText = this.City_name.Split(',')[0].ToString() + " " + this.state_name.Replace(",", ", ") + this.cat_name + " Billing Services";
                else
                    lblCatName.InnerText = this.state_name.Replace(",", ", ") + this.cat_name + " Billing Services";
            }
            else
            {
                if (!string.IsNullOrEmpty(this.City_name))
                    lblCatName.InnerText = this.cat_name + " Billing Services in " + this.City_name.Trim().Split(',')[0].ToString() + ", " + this.state_name.Trim().Split(',')[0].ToString() + " (" + this.state_name.Trim().Split(',')[1].ToString().Trim() + ")";
                else
                    lblCatName.InnerText = this.cat_name.Trim() + " " + strheadingmed.Trim().Replace("Medical ", "") + " " + this.state_name.Trim();
            }
            if (lblCatName.InnerText.Contains("Billing Billing Services"))
                lblCatName.InnerText = lblCatName.InnerText.Replace("Billing Billing Services", "Billing Services");
        }

        if (string.IsNullOrEmpty(lblCatName.InnerText))
        {
            Categorydesc.Visible = false;
            Categorydesc.Style.Add("display", "none");
        }


        if (!string.IsNullOrEmpty(this.cat_name) && string.IsNullOrEmpty(this.state_name) && string.IsNullOrEmpty(this.City_name))
        {
            //Category _ Only
            ltr_metadesc1.Text = "Outsource your Medical Billing services for " + this.cat_name.Trim() + " practices. Enjoy hassle free cash flow from streamlined " + this.cat_name.Trim() + " billing services. Results Guaranteed – Call 8883573226";
            ltr_metatitle.Text = "Leading " + this.cat_name.Trim() + " Billing Services Provider Nationally";
        }
        else if (string.IsNullOrEmpty(this.cat_name) && !string.IsNullOrEmpty(this.state_name) && string.IsNullOrEmpty(this.City_name))
        {
            //State _ Only
            ltr_metadesc1.Text = "Market leaders of Medical Billing Services in " + this.state_name.Trim() + ". 16+ years experienced quality services provider for  Medical Billing in " + this.state_name.Trim().Replace(", ", " (") + ").";
            ltr_metatitle.Text = "Most Preferred Medical Billing Services in " + this.state_name.Trim().Replace(", ", " (") + ")";
        }
        else if (!string.IsNullOrEmpty(this.cat_name) && !string.IsNullOrEmpty(this.state_name) && string.IsNullOrEmpty(this.City_name))
        {
            //Category + State _ Combination
            ltr_metadesc1.Text = "Most accurate and cost effective " + this.cat_name.Trim() + " Billing in " + this.state_name.Trim().Replace(", ", " (") + ")" + ". Outsource your Medical Billing services for better revenue.";
            //ltr_metatitle.Text = "Experts in " + this.cat_name.Trim() + " Billing Services for " + this.state_name.Trim();

        }
        else if (!string.IsNullOrEmpty(this.cat_name) && !string.IsNullOrEmpty(this.state_name) && !string.IsNullOrEmpty(this.City_name))
        {
            //Category + State + City (Old) _Combination
            ltr_metadesc1.Text = "We are the most preferred medical billing service provider in " + this.City_name.Trim().Split(',')[0].ToString() + ", " + this.state_name.Trim().Split(',')[0].ToString() + " (" + this.state_name.Trim().Split(',')[1].ToString().Trim() + "). Contact us today to streamline your " + this.cat_name.Trim() + " Billing Services & to improve the cash flow.";
            //ltr_metatitle.Text = "Expert " + this.cat_name.Trim() + " Billing Services in " + this.City_name.Trim().Split(',')[0].ToString() + ", " + this.state_name.Trim().Split(',')[0].ToString() + " (" + this.state_name.Trim().Split(',')[1].ToString().Trim() + ")";
        }

        ///to do: Mandar
        lblCatDescription.Text = new Speciality().Remove_inlinestyle(lblCatDescription.Text, false); 
        lblCatDescription2.Text = new Speciality().Remove_inlinestyle(lblCatDescription2.Text, false);

        //Remove Tags
        //string keywords = this.City_name.Trim().Split(',')[0].ToString() + " " + this.state_name.Trim().Split(',')[0].ToString() + " " + this.cat_name.Trim() + " Medical Billing, medical coding, medical billing coding, ";
        //keywords += this.City_name.Trim().Split(',')[0].ToString() + " " + this.state_name.Trim().Split(',')[0].ToString() + " " + this.cat_name.Trim() + " medical billing companies, medical billing services,  ";
        //keywords += this.City_name.Trim().Split(',')[0].ToString() + " " + this.state_name.Trim().Split(',')[0].ToString() + " " + this.cat_name.Trim() + " medical billing service, medical coding," + " " + this.state_name.Trim().Split(',')[0].ToString() + " medical billing Agencies, medical coding services, medical billing company, online medical billing,";
        //keywords += this.City_name.Trim().Split(',')[0].ToString() + " " + this.state_name.Trim().Split(',')[0].ToString() + " " + this.cat_name.Trim() + " Medical Billers and Coders Medical Billing Association";
        //ltrTags.Text = "<b>Tags:</b> " + keywords;
    }

    #region All about Paging



    # region Properties : get value from ViewState and Put it in Propertiwes




    //protected void dlPaging_ItemDataBound(object sender, DataListItemEventArgs e)
    //{

    //    HyperLink hyp_Link = (HyperLink)e.Item.FindControl("hyp_link_Paging");

    //    if (hyp_Link != null)
    //    {

    //        if (hyp_Link.Text.ToLower().Equals("first") || hyp_Link.Text.ToLower().Equals("last"))
    //        {
    //            //hyp_Link.Style.Add("color", "#000000");  //to increse the font size 

    //            //hyp_Link.Enabled = false;
    //        }
    //        else
    //        {
    //            if (Convert.ToInt32(hyp_Link.Text) == (CurrentPage + 1))
    //            {
    //                hyp_Link.Style.Add("color", "#000000");  //to increse the font size 
    //                hyp_Link.Enabled = false;
    //            }
    //        }
    //    }

    //}

    //private int CurrentPage
    //{
    //    get
    //    {
    //        object objPage = ViewState["_CurrentPage"];
    //        int _CurrentPage = 0;
    //        if (objPage == null)
    //        {
    //            _CurrentPage = 0;
    //        }
    //        else
    //        {
    //            _CurrentPage = (int)objPage;
    //        }
    //        return _CurrentPage;
    //    }
    //    set { ViewState["_CurrentPage"] = value; }


    //}
    //private int fistIndex
    //{
    //    get
    //    {

    //        int _FirstIndex = 0;
    //        if (ViewState["_FirstIndex"] == null)
    //        {
    //            _FirstIndex = 0;
    //        }
    //        else
    //        {
    //            _FirstIndex = Convert.ToInt32(ViewState["_FirstIndex"]);
    //        }
    //        return _FirstIndex;
    //    }
    //    set { ViewState["_FirstIndex"] = value; }
    //}
    //private int lastIndex
    //{
    //    get
    //    {

    //        int _LastIndex = 0;
    //        if (ViewState["_LastIndex"] == null)
    //        {
    //            _LastIndex = 0;
    //        }
    //        else
    //        {
    //            _LastIndex = Convert.ToInt32(ViewState["_LastIndex"]);
    //        }
    //        return _LastIndex;
    //    }
    //    set { ViewState["_LastIndex"] = value; }
    //}

    #endregion

    #endregion

    #region templatedInforamtion
    protected string templatedcitydata(string cityname)
    {
        string templatedInfo = "  <p>Our  medical billers in " + cityname + " have reduced the tedious and" +
" time consuming medical  billing tasks which are responsible for the ultimate" +
" revenue collection. The experience  of our billers and coders in streamlining " + cityname + " provider’s billing procedures  so that they can devote more time, energy and resources in providing the  highest level of patient care. These Biller’s leverage their technology as well  as domain expertise in your specialty to service your practice better. Their  expertise lies in:</p>" +
"<ul>" +
  "<li>Excellent understanding of fee  schedules, Medicaid and commercial payer regulations</li>" +
  "<li>Answering all patient queries regarding  billing appropriately</li>" +
  "<li>Compliance to HIPAA rules and  regulations to ensure accurate billing</li>" +
"</ul>" +
"<p>To get the exact match for your specialty and  practice in " + cityname + ", fill in the form given below:</p>";

        return templatedInfo;
    }
    protected string templatedstatedata(string stateName)
    {
        string templatedInfo = "<p>Our Billers in the state of " + stateName + " are specialized to  service medical practices " +
            "as per the regulations of the state government. Their  knowledge and experience has been acquired by years of efforts " +
            "in perfecting  medical billing procedures which they now leverage to help your practice  collect more revenue.<br />" +
  "The federal government’s effort to reduce healthcare cost  can only be supported by physicians in the state of " + stateName + "by optimizing" +
  "costs and enhancing revenue. Letting a specialist handle your medical billing  can help you improve collections by 20%.<br />" +
  "Accurate Coding and code audit along with timely insurance  follow up and account receivables are the basis on which these" +
  "billers in " + stateName + "  guarantee higher profitability for your clinic. Their experience in  various software and certification " +
  "in the medical billing processes will  support your practice to grow steadily.<br />" +
  "Match the below listed profiles to fulfill your requirement  of Medical billers in your specialty and in your city.</p>";
        return templatedInfo;
    }

    #endregion

    #region removehtml
    protected string RemoveHTML(object value)
    {

        string strDesc = value.ToString().Trim();

        string strReplace = "";

        strReplace = strDesc.Replace("<P>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</P>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<body> <P>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</P> </body>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<BR>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<br/>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<p>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<strong>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</strong>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</p>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<ul>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<li>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</ul>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</li>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<br />", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("&nbsp;", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<I>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</I>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("&ldquo;", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("&quot;", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("&quot;", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<b>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</b>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<i>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</i>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<em>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</em>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<p style=\"text-align: justify;\">", "");

        strDesc = strReplace;
        strReplace = strDesc.Replace("</p>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<p align=\"justify\">", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("</p>", "");

        strDesc = strReplace;

        strReplace = strDesc.Replace("<div style=\"text-align: justify\">", "");
        strDesc = strReplace;
        strReplace = strDesc.Replace("</div>", "");
        strDesc = strReplace;
        strReplace = strDesc.Replace("<strong style=\"text-align: justify\">", "");
        strDesc = strReplace;
        strReplace = strDesc.Replace("</strong>", "");
        strDesc = strReplace;

        return strDesc;



    }
    #endregion

    #region newadditionfunction
    public string getguideline(string strid)
    {
        string strurl = string.Empty;
        DataSet ds = new DataSet();
        backSpguideline objspguideline = new backSpguideline();
        ds = objspguideline.getspguidelines("0", "0", 1, long.Parse(strid));
        if (ds != null && ds.Tables.Count > 0 && ds.Tables[0].Rows.Count > 0)
            strurl = string.Concat(Request.ApplicationPath, ConfigurationManager.AppSettings["Slash"], "Guidelinedetails.aspx?spid=" + strid);
        else
            strurl = string.Concat(Request.ApplicationPath, ConfigurationManager.AppSettings["Slash"], "specialty-guideline.aspx");

        return strurl;
    }
    protected string linkurlProfile(object companyId)
    {
        //change here
        string strReturn = "";
        if (Request.Url.DnsSafeHost == "localhost")
        {
            //return "profile.aspx?city=" + cityId + "&category=" + categoryId + "&state=" + strStateID + "&profile=" + companyId;
            strReturn = "billers/" + companyId + medEndhtml;
        }
        else
        {
            //return "/profile.aspx?city=" + cityId + "&category=" + categoryId + "&state=" + strStateID + "&profile=" + companyId;
            strReturn = "/billers/" + companyId + medEndhtml;
        }
        return strReturn;
    }
    protected string linkurlsimilarProfile(object companyId, object categoryId, object cityId, object stateId)
    {
        if (Request.Url.DnsSafeHost == "localhost")
        {
            return "similarProfiles.aspx?city=" + cityId + "&category=" + categoryId + "&state=" + stateId + "&profile=" + companyId;
        }
        else
        {
            return "/similarProfiles.aspx?city=" + cityId + "&category=" + categoryId + "&state=" + stateId + "&profile=" + companyId;
        }
    }
    protected string linkdisc(object shortdisc)
    {
        return new Speciality().RemoveHTML(shortdisc.ToString(), false, 150);

    }
    #endregion

    //private void ShowHideMasterPageControls(string ControlName, bool IsDisply)
    //{
    //    string DisplayStyle = IsDisply ? "block" : "none";
    //    HtmlGenericControl oHtmlGenericControl = this.FindControl(ControlName) as HtmlGenericControl;
    //    if (oHtmlGenericControl != null)
    //        oHtmlGenericControl.Style.Add("display", DisplayStyle);
    //}

    private void ShowHideBreadcumbs()
    {
        //if (hypStatename.Text == "")
            hypStatename.Visible = false;
        //if (hypCityname.Text == "")
            hypCityname.Visible = false;
        //if (HypCategoryName.Text == "")
            HypCategoryName.Visible = false;
        //if (hypProfile.Text == "")
            hypProfile.Visible = false;

    }

    private void SetFontSize(int FontSize)
    {
        if (lblCatName.InnerText.Length > 45)
            lblCatName.Attributes.Add("style", "font-size: 22px");
    }
}
