<%-- 
    Document   : consultarCitas
    Created on : 10-05-2018, 01:39:44 PM
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
        <title>Consultar Citas</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="favicon.ico" />
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
                            <a class="dropdown-item bg-info text-white" href="iniciocitas.jsp"><b>Citas</b></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item bg-info text-white" href="iniciopacientes.jsp"><b>Pacientes</b></a>
                            <div class="dropdown-divider"></div>
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
                            <a class="dropdown-item bg-info text-white" href="MantenimientoCitas.do?action=irAgregar" ><b>Agregar Cita</b></b></a>
                        </div>
                    </li>
                </ul>
                <html:form action="/AgregarUsuario" styleClass="form-inline my-2 my-lg-0">

                    <html:submit property="action" value="Configuracion" styleClass="btn btn-outline-info disabled"/><p>  </p>
                    <html:submit property="action" value="Cerrar Sesion" styleClass="btn btn-outline-danger my-2 my-sm-0"/>
                </html:form>
            </div>
        </nav>

        <%--inicia el formulario de consulta--%>
        <br>
        <br>
        <h1 align="center">Citas</h1>
        <h3 align="center">Lista de citas por cubrir</h3> 
        <br>
        <br>
        <div class="container">
            <div class="row scroll">
                <div class="col-12">           
                    <table class="table table-striped">
                        <thead>
                            <tr align="center">
                                <th>Id Cita</th>
                                <th>Id Paciente</th>
                                <th>Id Consultorio</th>
                                <th>Id Medico</th>
                                <th>Fecha Cita</th>
                                <th>Hora Cita</th>
                                <th ${message}>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>

                            <logic:notEmpty name="ActionFormCitas" property="listaCitas" >
                                <logic:iterate id="ver" name="ActionFormCitas" property="listaCitas">
                                    <tr align="center">
                                        <html:form action="/MantenimientoCitas">
                                            <td>
                                                <bean:write name="ver" property="idCita"/>
                                                <div readonly="true" hidden="hidden"><html:text name="ver" property="idCita" styleClass="hidden"/></div>
                                            </td>
                                            <td>
                                                <bean:write name="ver" property="pacientes.apellido"/>
                                            </td>
                                            <td>
                                                <bean:write name="ver" property="consultorios.area"/>
                                            </td>
                                            <td>
                                                <bean:write name="ver" property="medicos.apellido"/>
                                            </td>
                                            <td>
                                                <bean:write name="ver" property="fechaCita"/>
                                            </td>
                                            <td>
                                                <bean:write name="ver" property="horaCita"/>
                                            </td>
                                            <td ${message}>
                                                <a class="btn btn-success" href="MantenimientoCitas.do?action=BuscarId&id=<bean:write name="ver" property="idCita"/>">Modificar</a>
<<<<<<< Updated upstream
                                                <a class="btn btn-danger" onclick="return confirm('¿seguro que desea eliminar?')" href="MantenimientoCitas.do?action=Eliminar&id=<bean:write name="ver" property="idCita"/>">Eliminar</a>
=======
                                                <a class="btn btn-danger" onclick="return confirm('¿Seguro que desea eliminar el registro?')" href="MantenimientoCitas.do?action=Eliminar&id=<bean:write name="ver" property="idCita"/>">Eliminar</a>
>>>>>>> Stashed changes
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
        <div class="container"  align="center">
            <div class="row">
                <div class="col-12">
                    <p>${advertencia}</p>      
                </div>  
            </div>
        </div>
    </body>
</html>
