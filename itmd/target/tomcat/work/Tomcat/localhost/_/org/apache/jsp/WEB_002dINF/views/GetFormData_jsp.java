/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-21 07:52:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GetFormData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#background{\r\n");
      out.write("\t background-color:#FFFF00;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>FormValidation</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ValidateInput(){\r\n");
      out.write("\tvar customerName=document.validationform.customerName.value.trim();\r\n");
      out.write("\tvar SSN=document.validationform.socialsecuritynumber.value.trim();\r\n");
      out.write("\tvar regex=\"/^\\(?[0-9]{3}\\)?[-.]?([0-9]{3})+[-.]?([0-9]{4})$/\";\r\n");
      out.write("\tif(customerName.length<4 || customerName.length>50 || customerName==\"\"){\r\n");
      out.write("\t\t//document.write(customerName.length);\r\n");
      out.write("\t\talert('CustomerName should be minimum of length 4');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t//sleep(2000);\r\n");
      out.write("\t\t//document.validationform.customerName.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t if(SSN==\"\"){\r\n");
      out.write("\t\t//document.write(customerName.length);\r\n");
      out.write("\t\talert('SSN Number cannot be left blank');\r\n");
      out.write("\t\t//sleep(2000);\r\n");
      out.write("\t\tdocument.validationform.socialsecuritynumber.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(SSN.match(regex)){\r\n");
      out.write("\t\tdocument.write(\"matched\");\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\talert('ERROR in phone number validation');\r\n");
      out.write("\t\tdocument.validationform.socialsecuritynumber.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//ValidateInput();\r\n");
      out.write("//document.validationform.addEventListener('click', ValidateInput,false);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"background\">\r\n");
      out.write("<div >\r\n");
      out.write("<h1 align=\"center\" font-style=\"bold\" font-size=\"16px\"> Welcome to Registration Form </h1>\r\n");
      out.write("<h1 align=\"center\" font-style=\"italic\" font-size=\"10px\">Registration Form</h1>\r\n");
      out.write("<form name=\"validationform\" method=\"post\" action=\"/login\" onSubmit=\"return ValidateInput()\">\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td><label> CustomerName: </label></td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" id=\"customerName\" name=\"customerName\" placeHolder=\"Vaishnavi\"/>  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td>\r\n");
      out.write("<label> Social Security Number:</label></td> \r\n");
      out.write("<td><input type=\"text\" id=\"socialsecuritynumber\" name=\"socialsecuritynumber\" placeHolder=\"(312)-(987)-(9867)\"/> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<label>Zip code:</label>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" id=\"zipcode\" name=\"zipcode\" placeHolder=\"56789-890\"/> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<label>Email Address:</label>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" id=\"emailAddress\" name=\"emailAddress\" placeHolder=\"emailAddress\"/> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<label>Street Address:</label>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" id=\"streetAddress\" name=\"streetAddress\" placeHolder=\"streetAddress\"/> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<label>City</label>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" id=\"city\" name=\"city\" placeHolder=\"city\"/> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<label>State:</label>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<select id=\"state\" name=\"state\">\r\n");
      out.write("                    <option value=\"01\">IL</option>\r\n");
      out.write("                    <option value=\"02\">OH </option>\r\n");
      out.write("                    <option value=\"03\">CA</option>\r\n");
      out.write("                    <option value=\"04\">TX</option>\r\n");
      out.write("                    <option value=\"05\">FL</option>\r\n");
      out.write("</select> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<div align=\"right\" >\r\n");
      out.write("<input type=\"Submit\" class=\"btn btn-primary\" value=\"Submit\" id=\"submit\"/>\r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
