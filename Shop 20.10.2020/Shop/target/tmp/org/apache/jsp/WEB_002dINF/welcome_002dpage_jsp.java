/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.26.v20200117
 * Generated at: 2020-10-27 15:24:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class welcome_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("file:/C:/Users/J-2019/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1601653303914L));
    _jspx_dependants.put("/WEB-INF/style.css", Long.valueOf(1603208719991L));
    _jspx_dependants.put("jar:file:/C:/Users/J-2019/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425967870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("                <html>\r\n");
      out.write("                     <head>\r\n");
      out.write("                        <title>Welcome Page </title>\r\n");
      out.write("                        <meta charset=\"utf-8\">\r\n");
      out.write("                        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("                        <style>\r\n");
      out.write("                           ");
      out.write("form{\r\n");
      out.write("background: rgb(145, 233, 226);\r\n");
      out.write("margin-top: 170px;\r\n");
      out.write("margin-left: 270px;\r\n");
      out.write("width: 300px;\r\n");
      out.write("height: 400px;\r\n");
      out.write("border: 10px;\r\n");
      out.write("font-size: 25px;\r\n");
      out.write("border-radius: 50px;\r\n");
      out.write("padding-left: 50px;\r\n");
      out.write("padding-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("form > span{\r\n");
      out.write("    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".order{\r\n");
      out.write("background: rgb(192, 230, 226);\r\n");
      out.write("margin-top: 170px;\r\n");
      out.write("margin-left: 270px;\r\n");
      out.write("width: 300px;\r\n");
      out.write("height: auto;\r\n");
      out.write("padding-left: 50px;\r\n");
      out.write("padding-top: 30px;\r\n");
      out.write("padding-bottom: 30px;\r\n");
      out.write("font-size: 25px;\r\n");
      out.write("border: 3px red outset;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("                        </style>\r\n");
      out.write("                    </head>\r\n");
      out.write("                    <body>\r\n");
      out.write("\r\n");
      out.write("                        <form action=\"/shop\" method=\"POST\">\r\n");
      out.write("                        <span>Welcome to online-shop</span><br/>\r\n");
      out.write("                            <input name=\"userName\" placeholder=\"Enter your name\"><br/>\r\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Enter password\"><br/>\r\n");
      out.write("                            <button type=\"submit\">Enter</button> </br>\r\n");
      out.write("                             <input type=\"checkbox\" name=\"check\"><span>Accept a licensing agreement </span>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </body>\r\n");
      out.write("                </html>");
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
