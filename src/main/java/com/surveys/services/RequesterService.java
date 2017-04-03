package com.surveys.services;

import com.surveys.models.Requester;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by filipecouto on 25/03/2017.
 */
@Path("/requester/")
public class RequesterService {

    /**
     * Create a register of Requesters (id, name, http endpoint for delivery)
     * Create a get of Requester (id)
     */

    private static Long id = 0L;
    private static Map<Long, Requester> requesters = new HashMap<>();

    public RequesterService() {

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List requesterValues = new ArrayList(requesters.values());
        return Response.status(Response.Status.OK).entity(requesterValues).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Requester requester) {
        id++;
        requester.setId(id);
        requesters.put(id, requester);
        return Response.status(Response.Status.OK).entity(requester).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response get(@PathParam("id") Long id) {
        Requester requester = requesters.get(id);
        return Response.status(Response.Status.OK).entity(requester).build();
    }
}
