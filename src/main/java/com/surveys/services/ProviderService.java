package com.surveys.services;

import com.surveys.models.Provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipecouto on 25/03/2017.
 */
@Path("/providers/")
public class ProviderService {

    /**
     * TODO
     * Create a return of a list of Providers
     */

    private List<Provider> providers = new ArrayList<>();
    private static ProviderService instance;

    private ProviderService() {

    }

    public static synchronized ProviderService getInstance() {
        if(ProviderService.instance == null) {
            ProviderService.instance = new ProviderService();
        }
        return ProviderService.instance;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        return Response.status(Response.Status.OK).entity(providers).build();
    }
}
