/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package org.uv.rest;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.uv.datos.Empleado;
import org.uv.datos.FactoryDAO;



/**
 * REST Web Service
 *
 * @author pedro
 */
@Path("rest")
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
    @Produces(MediaType.APPLICATION_JSON)
    public Empleado getEmpleado() {
        //TODO return proper representation object
        Empleado emp = (Empleado)FactoryDAO.create(FactoryDAO.DAOType.EMPLEADO).buscarID(2);
        return  emp;
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
}
