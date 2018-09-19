<%-- 
    Document   : consultarFarmacias
    Created on : 08-30-2018, 03:24:52 PM
    Author     : david.floresusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Especialidades</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
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
                    <p> </p>
                    <p> </p>
                    <li class="nav-item">
                        <a class="btn btn-outline-info" href="#">Galeria</a>
                    </li>
                    <p> </p>
                    <p> </p>
                    <li class="nav-item dropdown">
                        <a class="btn btn-outline-info dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Opciones
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="inicioproveedores.jsp">Proveedores</a>
                            <a class="dropdown-item" href="inicioFarmacias.jsp">Farmacias</a>
                            <a class="dropdown-item" href="inicioconsultorios.jsp">Consultorios</a>
                            <a class="dropdown-item" href="inicioespecialidades.jsp">Especialidades</a>
                        </div>
                    </li>
                    <p> </p>
                    <li class="nav-item">
                        <a class="btn btn-outline-info" href="mantenimientoEspecialidades.jsp">Agregar Especialidad</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <a href="mantenimientoUsuarios.jsp" class="btn btn-outline-info my-2 my-sm-0" margin="2px">Agregar Usuario</a>
                    <p>   </p>
                    <a href="loginStruts.jsp" class="btn btn-outline-danger my-2 my-sm-0">Salir</a>
                </form>
            </div>
        </nav>

        <%--inicia el formulario de consulta--%>
        <br>
        <br>
        <h1 align="center">Especialidades</h1>
        <h3 align="center">Lista de Especailidades disponibles en nuestro hospital</h3> 
        <br>
        <br>
        <div class="container">
            <div class="row scroll">
                <div class="col-12">           
                    <table class="table table-striped">
                        <thead>
                            <tr align="center">
                                <th>Id Especialidad</th>
                                <th>Tipo</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>

                        <logic:notEmpty name="ActionFormEspecialidades" property="listaEspe" >
                            <logic:iterate id="ver" name="ActionFormEspecialidades" property="listaEspe">
                                <tr align="center">
                                <html:form action="/MantenimientoEspecialidades">
                                    <td>
                                    <bean:write name="ver" property="idEspecialidad"/>
                                    <div hidden="hidden"><html:text name="ver" property="idEspecialidad" styleClass="hidden"/></div>
                                    </td>
                                    <td>
                                    <bean:write name="ver" property="tipo"/>
                                    </td>
                                    <td>
                                        <a class="btn btn-success" href="MantenimientoEspecialidades.do?action=irModificar&id=<bean:write name="ver" property="idEspecialidad"/>">Modificar</a>
                                        <a class="btn btn-danger" href="MantenimientoEspecialidades.do?action=Eliminar&id=<bean:write name="ver" property="idEspecialidad"/>">Eliminar</a>

                                        <%--<html:link styleClass="btn btn-danger" page="/eliminarFarmacia.jsp">Eliminar</html:link>--%>
                                    </td>
                                </html:form>
                                </tr>
                            </logic:iterate>
                        </logic:notEmpty>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>