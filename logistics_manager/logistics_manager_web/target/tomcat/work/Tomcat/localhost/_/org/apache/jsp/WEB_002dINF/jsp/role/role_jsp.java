/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-21 08:31:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<link href=\"/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  $(\".click\").click(function(){\r\n");
      out.write("  $(\".tip\").fadeIn(200);\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  $(\".tiptop a\").click(function(){\r\n");
      out.write("  $(\".tip\").fadeOut(200);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("  $(\".sure\").click(function(){\r\n");
      out.write("  $(\".tip\").fadeOut(100);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("  $(\".cancel\").click(function(){\r\n");
      out.write("  $(\".tip\").fadeOut(100);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"place\">\r\n");
      out.write("    <span>位置：</span>\r\n");
      out.write("    <ul class=\"placeul\">\r\n");
      out.write("    <li><a href=\"#\">首页</a></li>\r\n");
      out.write("    <li><a href=\"#\">数据表</a></li>\r\n");
      out.write("    <li><a href=\"#\">基本内容</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"rightinfo\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"tools\">\r\n");
      out.write("    \r\n");
      out.write("    \t<ul class=\"toolbar\">\r\n");
      out.write("        <li class=\"click\"><span><img src=\"/images/t01.png\" /></span>添加</li>\r\n");
      out.write("        <li class=\"click\"><span><img src=\"/images/t02.png\" /></span>修改</li>\r\n");
      out.write("        <li><span><img src=\"/images/t03.png\" /></span>删除</li>\r\n");
      out.write("        <li><span><img src=\"/images/t04.png\" /></span>统计</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <ul class=\"toolbar1\">\r\n");
      out.write("        <li><span><img src=\"/images/t05.png\" /></span>设置</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <table class=\"tablelist\">\r\n");
      out.write("    \t<thead>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("        <th><input name=\"\" type=\"checkbox\" value=\"\" checked=\"checked\"/></th>\r\n");
      out.write("        <th>角色编号<i class=\"sort\"><img src=\"/images/px.gif\" /></i></th>\r\n");
      out.write("        <th>角色名称</th>\r\n");
      out.write("        <th>角色描述</th>\r\n");
      out.write("        <th>操作</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <div class=\"pagin\">\r\n");
      out.write("    \t<div class=\"message\">共<i class=\"blue\">1256</i>条记录，当前显示第&nbsp;<i class=\"blue\">2&nbsp;</i>页</div>\r\n");
      out.write("        <ul class=\"paginList\">\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\"><span class=\"pagepre\"></span></a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\">1</a></li>\r\n");
      out.write("        <li class=\"paginItem current\"><a href=\"javascript:;\">2</a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\">3</a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\">4</a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\">5</a></li>\r\n");
      out.write("        <li class=\"paginItem more\"><a href=\"javascript:;\">...</a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\">10</a></li>\r\n");
      out.write("        <li class=\"paginItem\"><a href=\"javascript:;\"><span class=\"pagenxt\"></span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"tip\">\r\n");
      out.write("    \t<div class=\"tiptop\"><span>提示信息</span><a></a></div>\r\n");
      out.write("        \r\n");
      out.write("      <div class=\"tipinfo\">\r\n");
      out.write("        <span><img src=\"/images/ticon.png\" /></span>\r\n");
      out.write("        <div class=\"tipright\">\r\n");
      out.write("        <p>是否确认对信息的修改 ？</p>\r\n");
      out.write("        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"tipbtn\">\r\n");
      out.write("        <input name=\"\" type=\"button\"  class=\"sure\" value=\"确定\" />&nbsp;\r\n");
      out.write("        <input name=\"\" type=\"button\"  class=\"cancel\" value=\"取消\" />\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t$('.tablelist tbody tr:odd').addClass('odd');\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/role/role.jsp(80,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/role/role.jsp(80,8) '${list }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/role/role.jsp(80,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("role");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t        <tr>\r\n");
          out.write("\t        <td><input name=\"\" type=\"checkbox\" value=\"\" /></td>\r\n");
          out.write("\t        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleDesc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t        <td><a href=\"#\" class=\"tablelink\">查看</a>     \r\n");
          out.write("\t        \t<a href=\"#\" class=\"tablelink\"> 删除</a>\r\n");
          out.write("\t        </td>\r\n");
          out.write("\t        </tr> \r\n");
          out.write("      \t ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
