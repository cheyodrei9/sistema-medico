<%-- 
    Document   : modificarUsuarios
    Created on : 10-02-2018, 02:39:21 PM
    Author     : david.floresusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="favicon.ico" />
        <title>Modificar Farmacia</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img id="logo" src="https://res.cloudinary.com/disputebills/image/upload/v1462474206/blue-mark_cnzgry.png">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="btn btn-outline-info" href="inicio.jsp">Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <p>  </p>
                    <li class="nav-item">
                        <a class="btn btn-outline-info" href="#">Galeria</a>
                    </li>
                    <p>  </p>
                    <li class="nav-item dropdown">
                        <a class="btn btn-outline-info dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Areas
                        </a>
                        <div class="dropdown-menu bg-info " aria-labelledby="navbarDropdown">
                            <a class="dropdown-item bg-info text-white" href="iniciomedicamentos.jsp"><b>Medicamentos</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="iniciomedicos.jsp"><b>Medicos</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="inicioclinicas.jsp"><b>Clinicas</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="inicioproveedores.jsp"><b>Proveedores</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="inicioFarmacias.jsp"><b>Farmacias</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="inicioconsultorios.jsp"><b>Consultorios</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="inicioespecialidades.jsp"><b>Especialidades</b></a>
                        </div>
                    </li>
                    <p>  </p>
                    <li class="nav-item dropdown">
                        <a class="btn btn-outline-info dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Acciones
                        </a>
                        <div class="dropdown-menu bg-info " aria-labelledby="navbarDropdown">
                            <a class="dropdown-item bg-info text-white" href="mantenimientoFarmacias.jsp" ><b>Agregar Farmacias</b></b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="MantenimientoFarmacias.do?action=Consultar_Farmacias"><b>Consultar Farmacias</b></a>
                        </div>
                    </li>
                </ul>
                <html:form action="/AgregarUsuario" styleClass="form-inline my-2 my-lg-0">
                    <html:submit property="action" value="Configuracion" styleClass="btn btn-outline-info disabled"/><p>  </p>
                    <html:submit property="action" value="Cerrar Sesion" styleClass="btn btn-outline-danger my-2 my-sm-0"/>
                </html:form>
            </div>
        </nav>
        <html:form action = "/MantenimientoUsuarios">
            <br>
            <h4 align="center">Formulario de modificación de Usuarios</h4>
            <h4 align="center">Ingrese los nuevos datos del usuario</h4>
            <br>
            <div class="container">
                <div class="card-header">
                    <div class="row">
                        <div class="col-4"></div>
                        <div class="col-8">
                            <div class="form-group col-md-2">
                                <label class="font-weight-bold">Id Usuario:</label>
                                <html:text readonly="true" property="idUsuario" size="5" maxlength="" styleClass="form-control"></html:text>
                                </div>
                                <div class="form-group col-md-5">
                                    <label class="font-weight-bold">Nombre Usuario:</label>
                                <html:text property="nombre" size="5" maxlength="" styleClass="form-control"></html:text>
                                </div> 
                                <div class="form-group col-md-5">
                                    <label class="font-weight-bold">Correo Usuario:</label>
                                <html:text property="correo" size="5" maxlength="" styleClass="form-control"></html:text>
                                </div> 
                                <div class="form-group col-md-5">
                                    <label class="font-weight-bold">Contraseña Usuario:</label>
                                <html:password property="contra" size="5" maxlength="" styleClass="form-control"/>
                                </div> 
                                <div class="form-group col-md-5">
                                    <label class="font-weight-bold">Genero Usuario:</label>
                                <html:text property="genero" size="5" maxlength="" styleClass="form-control"></html:text>
                                </div> 
                                <div class="form-group col-md-5">
                                    <label class="font-weight-bold">Tipo:</label>
                                <html:select property="tipo" styleClass="form-control">
                                    <html:option value="">Seleccione</html:option>
                                    <html:option value="Admin"/>
                                    <html:option value="Usuario"/>
                                </html:select>
                            </div> 
                            <div class="form-group col-md-7">
                                <label class="font-weight-bold">Pregunta de Seguridad:</label>
                                <html:select property="pregunta" styleClass="form-control">
                                    <html:option value="">Selecione una pregunta</html:option>
                                    <html:option value="¿Cuál es tu fecha de nacimiento?"/>
                                    <html:option value="¿Cuál es el nombre de tu mascota?"/>
                                    <html:option value="¿Cuál es tu equipo de futbol favorito?"/>
                                    <html:option value="¿Cuál es el nombre de la primera escuela a la que asististe?"/>
                                </html:select>
                            </div> 
                            <div class="form-group col-md-7">
                                <label class="font-weight-bold">Respuesta:</label>
                                <html:text property="respuesta" size="5" maxlength="" styleClass="form-control"></html:text>
                                </div> 
                                <div class="form-group col-md-7">
                                <html:submit styleClass="btn btn-success" property="action" value="Modificar"/>
                            </div> 
                            <p align="center">${advertencia}</p>
                        </div>
                    </div>
                </div>
            </div>
        </html:form>
    </body>
</html>

