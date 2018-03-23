package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.EstudianteDTO;
import co.edu.uptc.sw2.taller4.dto.FacultadDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/BuscarEstudiante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BuscarEstudianteServicio {

    /**
     * retorna una lista con los Estudiante que se encuentran en la base de datos
     *
     * @return retorna una lista de EstudianteDTO
     * @generated
     */
    @GET
    public List<EstudianteDTO> obtenerTodosEstudiantes() {
        return ProveedorInformacion.instance().obtenerTodos(EstudianteDTO.class);
    }

    @GET
    @Path("/consulta")
    public List<EstudianteDTO> consultarFacultades(@QueryParam("nombres") String nombres/*, @QueryParam("apellidos") String apellidos*/){
        List<EstudianteDTO> listaEstudiantes = obtenerTodosEstudiantes();
        List<EstudianteDTO> respuesta = new ArrayList<>();
//        if (listaEstudiantes != null) {
//            return listaEstudiantes;
//        }
        for(EstudianteDTO estudiante : listaEstudiantes){
            if (estudiante.getNombres().concat(" "+estudiante.getApellidos()).toUpperCase().contains(nombres.toUpperCase())) {
                respuesta.add(estudiante);
            }
        }
        return respuesta;
    }
    
}
