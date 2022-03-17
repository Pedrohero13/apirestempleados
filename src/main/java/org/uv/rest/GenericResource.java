/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package org.uv.rest;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.uv.datos.Empleado;
import org.uv.datos.FactoryDAO;



/**
 * REST Web Service
 *
 * @author pedro
 */
@Path("empleado")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of org.uv.rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmpleadoDTO obtenerEmpleado(@PathParam("id") Long id) {
        //TODO return proper representation object
        Empleado emp = (Empleado)FactoryDAO.create(FactoryDAO.DAOType.EMPLEADO).buscarID(id);
        
        EmpleadoDTO dto = new EmpleadoDTO(String.valueOf(emp.getClave()), emp.getNombre(), emp.getDireccion(), emp.getTelefono(), emp.getClaveDepartamento().getNombre());
        return dto;
    }

    /**
     * POST method for updating or creating an instance of GenericResource
     * @param emp
     * @return 
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean putEmpleado(Empleado emp) {
        return FactoryDAO.create(FactoryDAO.DAOType.EMPLEADO).guardar(emp);
        
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmpleadoDTO> obtenerEmpleados() {
        //TODO return proper representation object
        List<Empleado> list= FactoryDAO.create(FactoryDAO.DAOType.EMPLEADO).consultar();
        List<EmpleadoDTO> listDTO= new ArrayList<>();
        for(Empleado emp: list){
            listDTO.add(new EmpleadoDTO(String.valueOf(emp.getClave()), 
                    emp.getNombre(), emp.getDireccion(), 
                    emp.getTelefono(), 
                    emp.getClaveDepartamento().getNombre()));
        }
        return listDTO;
    }
}
