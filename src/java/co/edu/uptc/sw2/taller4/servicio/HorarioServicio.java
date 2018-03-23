package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.HorarioDTO;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Horario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HorarioServicio {

    /**
     * retorna una lista con los Horario que se encuentran en la base de datos
     *
     * @return retorna una lista de HorarioDTO
     * @generated
     */
    @GET
    public List<HorarioDTO> obtenerTodosHorarios() {
        return ProveedorInformacion.instance().obtenerTodos(HorarioDTO.class);
    }

    /**
     * @param id identificador del elemento Horario
     * @return Horario del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public HorarioDTO obtenerHorario(@PathParam("id") Long id) {
        return (HorarioDTO) ProveedorInformacion.instance().obtener(HorarioDTO.class, id);
    }

    /**
     * almacena la informacion de Horario
     *
     * @param dto Horario a guardar
     * @return Horario con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public HorarioDTO guardarHorario(HorarioDTO dto) {
        return (HorarioDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Horario con el identificador dado
     *
     * @param id identificador del Horario
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarHorario(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(HorarioDTO.class, id);
    }

}
