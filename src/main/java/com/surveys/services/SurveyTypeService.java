package com.surveys.services;

import com.surveys.models.SurveyType;

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
@Path("/survey/")
public class SurveyTypeService {

    /**
     * Create a return of list of Survey Types (id, name)
     */

    private static Map<Long, SurveyType> surveyTypes = new HashMap<>();

    static {
        SurveyType surveyType1 = new SurveyType(1L, "Example1");
        SurveyType surveyType2 = new SurveyType(2L, "Example2");
        surveyTypes.put(surveyType1.getId(), surveyType1);
        surveyTypes.put(surveyType2.getId(), surveyType2);
    }

    public SurveyTypeService() {

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List surveyTypeValues = new ArrayList(surveyTypes.values());
        return Response.status(Response.Status.OK).entity(surveyTypeValues).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response get(@PathParam("id") Long id) {
        SurveyType surveyType = surveyTypes.get(id);
        return Response.status(Response.Status.OK).entity(surveyType).build();
    }
}
