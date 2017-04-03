package com.surveys.services;

import com.surveys.models.Subscription;

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
@Path("/subscription/")
public class SubscriptionService {

    private static Long id = 0L;
    private static Map<Long, Subscription> subscriptions = new HashMap<>();

    /**
     * Create a subscription (requester, provider, related survey data (filters))
     * Return a subscription
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Subscription subscription) {
        id++;
        subscriptions.put(id, subscription);
        subscription.setId(id);
        return Response.status(Response.Status.OK).entity(subscription).build();
    }

    /**
     * Get all subscriptions
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List subscriptionValues = new ArrayList(subscriptions.values());
        return Response.status(Response.Status.OK).entity(subscriptionValues).build();
    }
}
