package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import actionforms.ActionFormUsuarios;
import java.util.List;
import mantenimiento.MantenimientoUsuarios;
import persistencia.Usuarios;

public class ActionUsuarios extends org.apache.struts.action.Action {
    
    private static final String Confirmar = "confirmacionNuevoUsuario";
    private static final String Eliminar = "confirmacionEliminarUsuario";
    private static final String Error = "errorMantenimientoUsuario";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {
        
        ActionFormUsuarios formBean = (ActionFormUsuarios) form;
        Integer idUsuario = formBean.getIdUsuario();
        String nombre = formBean.getNombre();
        String correo = formBean.getCorreo();
        String contra = formBean.getContra();
        String genero = formBean.getGenero();
        String tipo = formBean.getTipo();
        String action = formBean.getAction();
        
        if (formBean == null || action == null) {
            return mapping.findForward(Error);
        }
        
        if (action.equals("Agregar")) {
            String advertencia = "";
            
            if (nombre == null || nombre.equals("")) {
                advertencia = "*Es necesario ingresar nombre<br>";
            }
            
            if (correo == null || correo.equals("")) {
                advertencia += "*Se necesita un correo<br>";
            }
            
            if (contra == null || contra.equals("")) {
                advertencia += "*Es necesaria una contraseña<br>";
            }
            
            if (genero == null || genero.equals(nombre)) {
                advertencia += "*Definir genero del usuario<br>";
            }
            
            if (tipo == null || tipo.equals("")) {
                advertencia = "*Definir si es administrador o usuario<br>";
            }
            
            if (!advertencia.equals("")) {
                formBean.setError("<span style='color:red'> Complete los campos sin rellenar" + "<br>" + advertencia + "</span>");
                return mapping.findForward(Error);
            }
            MantenimientoUsuarios usuarios = new MantenimientoUsuarios();
//            List<Usuarios> lista = usuarios.consultarTodoUsuario();
//            if (lista != null){
//                formBean.setError("<span style='color:red'>Usuario ya esta registrado..."+"<br></span>");
//                return mapping.findForward(Error);
//            }
            int respuesta=usuarios.guardarUsuario(idUsuario, nombre, correo, contra, genero, tipo);
            if(respuesta==1){
                return mapping.findForward(Confirmar);
            }else{
                formBean.setError("Ocurrio un error al insertar.");
                return mapping.findForward(Error);
            }
            
        }
        
        if (action.equals("Consultar")) {
            MantenimientoUsuarios usuarios = new MantenimientoUsuarios();
            List<Usuarios> lista = usuarios.consultarTodoUsuario();
            if (lista == null) {
                formBean.setError("<span style='color:white'>Usuario ya existente" + "<br></span>");
                return mapping.findForward(Error);
            } else {
                formBean.setListaUsuarios(lista);
                return mapping.findForward(Error);
            }
        }
        
        if (action.equals("Eliminar")) {
            MantenimientoUsuarios usuarios = new MantenimientoUsuarios();
            usuarios.eliminarUsuario(idUsuario);
            return mapping.findForward(Eliminar);
        }
        
                   if (action.equals("ConsultarId")) {
            MantenimientoUsuarios usuarios = new MantenimientoUsuarios();
            Usuarios usuario = usuarios.consultarId(idUsuario);
            if (usuarios == null) {
                formBean.setError("<spam style='color:red'> El registro no existe" + "<br></spam>");
                return mapping.findForward(Error);
            } else {
                formBean.setIdUsuario(usuario.getIdUsuario());
                formBean.setNombre(usuario.getNombre());
                formBean.setCorreo(usuario.getCorreo());
                formBean.setContra(usuario.getContra());
                formBean.setGenero(usuario.getGenero());
                formBean.setTipo(usuario.getTipo());
                return mapping.findForward(Confirmar);
            }
        }

        if (action.equals("modificar")) {
            MantenimientoUsuarios usuarios = new MantenimientoUsuarios();
            usuarios.modificar(idUsuario,nombre, correo, contra, genero, tipo);
            System.out.println("error al modificar");
        }
        
        return mapping.findForward(Confirmar);
    }
    
}