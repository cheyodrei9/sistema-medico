package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificarUsuarios_005frecuperacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_property_disabled;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_select_styleClass_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_property_disabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_select_styleClass_property.release();
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody.release();
    _jspx_tagPool_html_submit_value_styleClass_property_nobody.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_option_value_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.release();
    _jspx_tagPool_html_select_styleClass_property_disabled.release();
    _jspx_tagPool_html_form_styleClass_action.release();
    _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" />\n");
      out.write("        <title>Recuperar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img id=\"logo\" src=\"https://res.cloudinary.com/disputebills/image/upload/v1462474206/blue-mark_cnzgry.png\">\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"btn btn-outline-info\" href=\"inicio.jsp\">Inicio <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <p>  </p>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"btn btn-outline-info\" href=\"#\">Galeria</a>\n");
      out.write("                    </li>\n");
      out.write("                    <p>  </p>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"btn btn-outline-info dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Areas\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu bg-info \" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"iniciomedicamentos.jsp\"><b>Medicamentos</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"iniciomedicos.jsp\"><b>Medicos</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"inicioclinicas.jsp\"><b>Clinicas</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"inicioproveedores.jsp\"><b>Proveedores</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"inicioFarmacias.jsp\"><b>Farmacias</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"inicioconsultorios.jsp\"><b>Consultorios</b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"inicioespecialidades.jsp\"><b>Especialidades</b></a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <p>  </p>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"btn btn-outline-info dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Acciones\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu bg-info \" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"mantenimientoFarmacias.jsp\" ><b>Agregar Farmacias</b></b></a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item bg-info text-white\" href=\"MantenimientoFarmacias.do?action=Consultar_Farmacias\"><b>Consultar Farmacias</b></a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");
      if (_jspx_meth_html_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/AgregarUsuario");
    _jspx_th_html_form_0.setStyleClass("form-inline my-2 my-lg-0");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("<p>  </p>\n");
        out.write("                    ");
        if (_jspx_meth_html_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleClass_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleClass_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("action");
    _jspx_th_html_submit_0.setValue("Configuracion");
    _jspx_th_html_submit_0.setStyleClass("btn btn-outline-info disabled");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_1.setProperty("action");
    _jspx_th_html_submit_1.setValue("Cerrar Sesion");
    _jspx_th_html_submit_1.setStyleClass("btn btn-outline-danger my-2 my-sm-0");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_1);
    return false;
  }

  private boolean _jspx_meth_html_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_1.setPageContext(_jspx_page_context);
    _jspx_th_html_form_1.setParent(null);
    _jspx_th_html_form_1.setAction("/MantenimientoUsuarios");
    int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
    if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <br>\n");
        out.write("            <h4 align=\"center\">Formulario de modificación de Usuarios</h4>\n");
        out.write("            <h4 align=\"center\">Ingrese los nuevos datos del usuario</h4>\n");
        out.write("            <br>\n");
        out.write("            <div class=\"container\">\n");
        out.write("                <div class=\"card-header\">\n");
        out.write("                    <div class=\"row\">\n");
        out.write("                        <div class=\"col-2\"></div>\n");
        out.write("                        <div class=\"col-8\">\n");
        out.write("                            <div class=\"form-row\">\n");
        out.write("                                <div class=\"form-group col-md-5\"></div>\n");
        out.write("                                <div class=\"form-group col-md-2\">\n");
        out.write("                                    <button type=\"button\" class=\"btn btn-info btn-sm\" data-toggle=\"modal\" data-target=\"#Modal\">\n");
        out.write("                                        Información\n");
        out.write("                                    </button>\n");
        out.write("\n");
        out.write("                                    <!-- Modal -->\n");
        out.write("                                    <div class=\"modal fade\" id=\"Modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ModalLabel\" aria-hidden=\"true\">\n");
        out.write("                                        <div class=\"modal-dialog\" role=\"document\">\n");
        out.write("                                            <div class=\"modal-content\">\n");
        out.write("                                                <div class=\"modal-header\">\n");
        out.write("                                                    <h5 class=\"modal-title\" id=\"ModalLabel\">Sobre recuperacion de contraseña</h5>\n");
        out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
        out.write("                                                        <span aria-hidden=\"true\">&times;</span>\n");
        out.write("                                                    </button>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"modal-body\">\n");
        out.write("                                                    Solo podrás modificar tu contraseña para poder acceder de nuevo por lo que los demás datos no podrán ser cambiados a excepción de tu pregunta de seguridad.\n");
        out.write("                                                    <br>\n");
        out.write("                                                    <br>\n");
        out.write("                                                    Recuerda que debe ser una contraseña que puedas recordar fácilmente pero que por seguridad no sea corta u obvia para que sea difícil acceder a tu cuenta por terceros.\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"modal-footer\">\n");
        out.write("                                                    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cerrar</button>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-group col-md-5\"></div>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-row\">\n");
        out.write("                                <div class=\"form-group col-md-5\">\n");
        out.write("                                    <label class=\"font-weight-bold\">Id Usuario:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"form-group col-md-1\"></div>\n");
        out.write("                                    <div class=\"form-group col-md-5\">\n");
        out.write("                                        <label class=\"font-weight-bold\">Nombre Usuario:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>    \n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-row\">\n");
        out.write("                                    <div class=\"form-group col-md-5\">\n");
        out.write("                                        <label class=\"font-weight-bold\">Correo Usuario:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div> \n");
        out.write("                                    <div class=\"form-group col-md-1\"></div>\n");
        out.write("                                    <div class=\"form-group col-md-5\">\n");
        out.write("                                        <label class=\"font-weight-bold\">Contraseña Usuario:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div> \n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-row\">\n");
        out.write("                                <div class=\"form-group col-md-5\">\n");
        out.write("                                    <label class=\"font-weight-bold\">Genero Usuario:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"form-group col-md-1\"></div>\n");
        out.write("                                    <div class=\"form-group col-md-5\">\n");
        out.write("                                        <label class=\"font-weight-bold\">Tipo:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-row\">\n");
        out.write("                                <div class=\"form-group col-md-7\">\n");
        out.write("                                    <label class=\"font-weight-bold\">Pregunta de Seguridad:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div> \n");
        out.write("                                <div class=\"form-group col-md-1\"></div>\n");
        out.write("                                <div class=\"form-group col-md-3\">\n");
        out.write("                                    <label class=\"font-weight-bold\">Respuesta:</label>\n");
        out.write("                                    ");
        if (_jspx_meth_html_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div> \n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-row\">\n");
        out.write("                                    <div class=\"form-group col-md-5\"></div>\n");
        out.write("                                    <div class=\"form-group\"><br>\n");
        out.write("                                    ");
        if (_jspx_meth_html_submit_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-group col-md-1\"></div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <p align=\"center\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertencia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_1);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_1);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_0.setProperty("idUsuario");
    _jspx_th_html_text_0.setSize("5");
    _jspx_th_html_text_0.setMaxlength("");
    _jspx_th_html_text_0.setStyleClass("form-control");
    _jspx_th_html_text_0.setDisabled(true);
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_1.setProperty("nombre");
    _jspx_th_html_text_1.setSize("5");
    _jspx_th_html_text_1.setMaxlength("");
    _jspx_th_html_text_1.setStyleClass("form-control");
    _jspx_th_html_text_1.setDisabled(true);
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_2.setProperty("correo");
    _jspx_th_html_text_2.setSize("5");
    _jspx_th_html_text_2.setMaxlength("");
    _jspx_th_html_text_2.setStyleClass("form-control");
    _jspx_th_html_text_2.setDisabled(true);
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_password_0.setProperty("contra");
    _jspx_th_html_password_0.setSize("5");
    _jspx_th_html_password_0.setMaxlength("");
    _jspx_th_html_password_0.setStyleClass("form-control");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_styleClass_size_property_maxlength_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_3.setProperty("genero");
    _jspx_th_html_text_3.setSize("5");
    _jspx_th_html_text_3.setMaxlength("");
    _jspx_th_html_text_3.setStyleClass("form-control");
    _jspx_th_html_text_3.setDisabled(true);
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_disabled_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_property_disabled.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_0.setProperty("tipo");
    _jspx_th_html_select_0.setStyleClass("form-control");
    _jspx_th_html_select_0.setDisabled(true);
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_styleClass_property_disabled.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_styleClass_property_disabled.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setValue("");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write("Seleccione");
        int evalDoAfterBody = _jspx_th_html_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(_jspx_page_context);
    _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_1.setValue("Admin");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_1);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_1);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(_jspx_page_context);
    _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_2.setValue("Usuario");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_2);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_2);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_1.setProperty("pregunta");
    _jspx_th_html_select_1.setStyleClass("form-control");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_html_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_styleClass_property.reuse(_jspx_th_html_select_1);
      return true;
    }
    _jspx_tagPool_html_select_styleClass_property.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(_jspx_page_context);
    _jspx_th_html_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_3.setValue("");
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_3.doInitBody();
      }
      do {
        out.write("Selecione una pregunta");
        int evalDoAfterBody = _jspx_th_html_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
    return false;
  }

  private boolean _jspx_meth_html_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_4 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_4.setPageContext(_jspx_page_context);
    _jspx_th_html_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_4.setValue("¿Cual es tu animal favorito?");
    int _jspx_eval_html_option_4 = _jspx_th_html_option_4.doStartTag();
    if (_jspx_th_html_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_4);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_4);
    return false;
  }

  private boolean _jspx_meth_html_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_5 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_5.setPageContext(_jspx_page_context);
    _jspx_th_html_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_5.setValue("¿Cual es el nombre de tu mascota?");
    int _jspx_eval_html_option_5 = _jspx_th_html_option_5.doStartTag();
    if (_jspx_th_html_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_5);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_5);
    return false;
  }

  private boolean _jspx_meth_html_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_6 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_6.setPageContext(_jspx_page_context);
    _jspx_th_html_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_6.setValue("¿Cual es tu equipo de futbol favorito?");
    int _jspx_eval_html_option_6 = _jspx_th_html_option_6.doStartTag();
    if (_jspx_th_html_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_6);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_6);
    return false;
  }

  private boolean _jspx_meth_html_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_7 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_7.setPageContext(_jspx_page_context);
    _jspx_th_html_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_7.setValue("¿Cual es el nombre de la primera escuela a la que asististe?");
    int _jspx_eval_html_option_7 = _jspx_th_html_option_7.doStartTag();
    if (_jspx_th_html_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_7);
      return true;
    }
    _jspx_tagPool_html_option_value_nobody.reuse(_jspx_th_html_option_7);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_4.setProperty("respuesta");
    _jspx_th_html_text_4.setSize("5");
    _jspx_th_html_text_4.setMaxlength("");
    _jspx_th_html_text_4.setStyleClass("form-control");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_size_property_maxlength_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_html_submit_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_2 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_2.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_submit_2.setStyleClass("btn btn-success");
    _jspx_th_html_submit_2.setProperty("action");
    _jspx_th_html_submit_2.setValue("Modificar");
    int _jspx_eval_html_submit_2 = _jspx_th_html_submit_2.doStartTag();
    if (_jspx_th_html_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_2);
      return true;
    }
    _jspx_tagPool_html_submit_value_styleClass_property_nobody.reuse(_jspx_th_html_submit_2);
    return false;
  }
}
