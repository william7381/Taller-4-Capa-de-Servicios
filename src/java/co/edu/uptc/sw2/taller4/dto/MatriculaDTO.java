package co.edu.uptc.sw2.taller4.dto;

import java.util.List;
import java.util.ArrayList;

public class MatriculaDTO {

    public MatriculaDTO() {
        //constructor base
    }

    public MatriculaDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private Integer anio;

    /**
     * @generated
     */
    private Integer semestre;

    /**
     * @generated
     */
    /*private List<MateriaDTO> materias;
    
    public List<MateriaDTO> getMaterias(){
    	if(this.materias==null){
    		materias=new ArrayList<MateriaDTO>();
    	}
    	return materias;
    }
    
    public void setMaterias(List<MateriaDTO> materias){
    	this.materias=materias;
    }
     */
    /**
     * @generated
     */
    private EstudianteDTO estudiante;

    /**
     * @generated
     */
    public Integer getAnio() {
        return this.anio;
    }

    /**
     * @generated
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    /**
     * @generated
     */
    public Integer getSemestre() {
        return this.semestre;
    }

    /**
     * @generated
     */
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    /**
     * @generated
     */
    public EstudianteDTO getEstudiante() {
        return this.estudiante;
    }

    /**
     * @generated
     */
    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

}
