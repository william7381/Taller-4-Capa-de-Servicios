package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.MatriculaDTO;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Matricula")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MatriculaServicio {

    /**
     * retorna una lista con los Matricula que se encuentran en la base de datos
     *
     * @return retorna una lista de MatriculaDTO
     * @generated
     */
    @GET
    public List<MatriculaDTO> obtenerTodosMatriculas() {
        return ProveedorInformacion.instance().obtenerTodos(MatriculaDTO.class);
    }

    /**
     * @param id identificador del elemento Matricula
     * @return Matricula del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public MatriculaDTO obtenerMatricula(@PathParam("id") Long id) {
        return (MatriculaDTO) ProveedorInformacion.instance().obtener(MatriculaDTO.class, id);
    }

    /**
     * almacena la informacion de Matricula
     *
     * @param dto Matricula a guardar
     * @return Matricula con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public MatriculaDTO guardarMatricula(MatriculaDTO dto) {
        return (MatriculaDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Matricula con el identificador dado
     *
     * @param id identificador del Matricula
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarMatricula(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(MatriculaDTO.class, id);
    }

}
