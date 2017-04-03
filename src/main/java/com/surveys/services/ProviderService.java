package com.surveys.services;

import com.surveys.models.Provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by filipecouto on 25/03/2017.
 */
@Path("/provider/")
public class ProviderService {

    /**
     * TODO
     * Create a return of a list of Providers
     */

    private static Map<Long, Provider> providers = new HashMap<>();

    static {
        Provider provider1 = new Provider(1L, "Example Provider");
        providers.put(provider1.getId(), provider1);
    }

    public ProviderService() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List providerValues = new ArrayList(providers.values());
        return Response.status(Response.Status.OK).entity(providerValues).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response get(@PathParam("id") Long id) {
        Provider provider = providers.get(id);
        return Response.status(Response.Status.OK).entity(provider).build();
    }
}
