package com.surveys.server;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.model.ResourceModel;
import org.glassfish.jersey.server.monitoring.ApplicationEvent;
import org.glassfish.jersey.server.monitoring.ApplicationEventListener;
import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.glassfish.jersey.server.monitoring.RequestEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.ext.Provider;
import java.util.Set;

/**
 * Created by filipecouto on 25/03/2017.
 */
@Provider
public class ProviderLoggingListener implements ApplicationEventListener {

    Logger logger = LoggerFactory.getLogger(ProviderLoggingListener.class);

    @Override
    public void onEvent(ApplicationEvent event) {
        switch (event.getType()) {
            case INITIALIZATION_FINISHED: {
                Set<Class<?>> providers = event.getProviders();
                ResourceConfig immutableConfig = event.getResourceConfig();
                ResourceModel resourcesModel = event.getResourceModel();
                for(Class<?> clazz : providers) {
                    this.logger.info("Provider registered: " + clazz.getName());
                }
                break;
            }
        }
    }

    @Override
    public RequestEventListener onRequest(RequestEvent requestEvent) {
        return null;
    }
}
