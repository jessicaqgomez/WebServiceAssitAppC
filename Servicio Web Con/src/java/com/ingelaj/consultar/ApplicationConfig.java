/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingelaj.consultar;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Usuario
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources){
        resources.add(com.ingelaj.consultar.ServicioResource.class);
        resources.add(org.glassfish.jersey.server.wadl.internal.WadlResource.class);
    }
}
