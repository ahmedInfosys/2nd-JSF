/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2015-08-27 17:35:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bullhorn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.js\"></script>\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.min.js\"></script>\r\n");
      out.write("<title>Comments area</title>\r\n");
      out.write("<style>h1{background: black; text:white}</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("    <div>\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("      \t<li><h1><b>Welcome to Bullhorn!</h1></li></b>\r\n");
      out.write("      </ul>\r\n");
      out.write("  <div class=\"col-sm-2 col-sm-offset-10\">\r\n");
      out.write("            <div class=\"account-wall\">\r\n");
      out.write("                <form action= \"SignInJSP.jsp\" class=\"form-signin\">\r\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("            \r\n");
      out.write("              <div class=\"account-wall col-sm-2 col-sm-offset-10\">\r\n");
      out.write("                <form action= \"SignUp\" class=\"form-signin\">\r\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" style=\"background-color:#CC66FF\" type=\"submit\">Create Account</button>\r\n");
      out.write("               </form>\r\n");
      out.write("            </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comments}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\t<form role=\"form\" method=\"post\" action=\"put_comment\">\r\n");
      out.write("\t\t<div \">\r\n");
      out.write("\t\t\t<textarea maxlength=\"5\" class=\"form-control\" rows=\"4\" cols=\"200\" name=\"comment\" placeholder=\"comment\"></textarea><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group col-sm-4 col-sm-offset-8\">\r\n");
      out.write("\t\t\t<button type=\"submit\" value = \"submit\" class= \"button btn-primary form-control \"><span class=\"glyphicon glyphicon-comment\"></span> Comment</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
