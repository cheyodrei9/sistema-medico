<%-- 
    Document   : consultarFarmaciaporId
    Created on : 08-30-2018, 11:40:03 AM
    Author     : david.floresusam
--%>
<%-- 
    Document   : eliminarFarmacia
    Created on : 08-28-2018, 04:42:47 PM
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
                            Opciones
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="inicioproveedores.jsp">Proveedores</a>
                            <a class="dropdown-item" href="inicioFarmacias.jsp">Farmacias</a>
                            <a class="dropdown-item" href="inicioconsultorios.jsp">Consultorios</a>
                            <a class="dropdown-item" href="inicioespecialidades.jsp">Especialidades</a>
                            <%--<div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Configuración</a>--%>
                        </div>
                    </li>
                    <p>  </p>
                    <li class="nav-item">
                        <a class="btn btn-outline-info" href="mantenimientoFarmacias.jsp">Agregar Farmacia</a>
                    </li>
                    <p>  </p>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <a href="mantenimientoMedicamentos.jsp" class="btn btn-outline-info my-2 my-sm-0" margin="2px">Medicamentos</a>
                    <p>   </p>
                    <a href="mantenimientoUsuarios.jsp" class="btn btn-outline-info my-2 my-sm-0" margin="2px">Agregar Usuario</a>
                    <p>   </p>
                    <a class="btn btn-outline-info disabled" href="#">Configuracion</a>
                    <p>  </p>
                    <a href="loginStruts.jsp" class="btn btn-outline-danger my-2 my-sm-0">Salir</a>
                </form>
            </div>
        </nav>
        <html:form action = "/MantenimientoFarmacias">
            <br>
            <br>
            <br>
            <br> 
            <br>
            <br> 
            <br>
            <h4 align="center">Formulario de modificación de farmacias</h4>
            <h4 align="center">Ingrese la nueva dirección de la farmacia</h4>
            <br>
            <br>
            <br>
            <br>
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <table class="table table-stripped"> 
                            <thead>
                                <tr align="center">
                                    <th>Id Farmacia</th>
                                    <th>Nueva Direccion</th>
                                    <th>Acciones</th>
                                    <th>Extra</th>
                                </tr>
                            </thead>
                            <tbody align="center">
                                <tr>
                                    <td>
                                        <html:text readonly="true" property="idFarmacia" size="10" maxlength="" ></html:text>
                                        </td>
                                        <td>
                                        <html:text property="direccion" size="60" maxlength="" ></html:text>
                                        </td>
                                        <td>
                                        <html:submit styleClass="btn btn-success" property="action" value="Modificar"/>
                                    </td>
                                    <td>
                                        <html:submit styleClass="btn btn-outline-success" property="action" value="Consultar_Farmacias"/>
                                    </td>
                                </tr>
                            <br>
                            <tr colspan="3">
                                <bean:write name="ActionFormFarmacias" property="error" filter="false"/>
                            </tr>
                            </tbody>
                        </table>
                        <p align="center">${advertencia}</p>
                    </div>
                </div>
            </div>
            <br>
            <%-- <html:submit property="action" value="ConsultarId"/>--%>
        </html:form>
    </body>
</html>