package com.surveys.server;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by filipecouto on 25/03/2017.
 */
public class Application extends ResourceConfig {
    public Application() {
        register(JacksonJaxbJsonProvider.class);
    }
}