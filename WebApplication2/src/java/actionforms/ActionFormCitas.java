package actionforms;

import java.util.List;
import persistencia.Citas;
import persistencia.Consultorios;
import persistencia.Medicos;
import persistencia.Pacientes;

public class ActionFormCitas extends org.apache.struts.action.ActionForm {

    private Integer idCita;
    private Integer idPaciente;
    private Integer idConsultorio;
    private Integer idMedico;
    private String fecha_cita;
    private String hora_cita;
    private String action;
    private String error;
    private List<Citas> listaCitas;
    private List<Pacientes> listaPacientes;
    private List<Consultorios> listaConsultorio;
    private List<Medicos> listamedi;

    public List<Pacientes> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Consultorios> getListaConsultorio() {
        return listaConsultorio;
    }

    public void setListaConsultorio(List<Consultorios> listaConsultorio) {
        this.listaConsultorio = listaConsultorio;
    }

    public List<Medicos> getListamedi() {
        return listamedi;
    }

    public void setListamedi(List<Medicos> listamedi) {
        this.listamedi = listamedi;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Citas> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Citas> listaCitas) {
        this.listaCitas = listaCitas;
    }

}
