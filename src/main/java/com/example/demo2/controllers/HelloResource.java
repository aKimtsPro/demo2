package com.example.demo2.controllers;

import com.example.demo2.service.StupidService;
import com.example.demo2.service.StupidServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

    private final StupidService stupidService;
    @Inject
    public HelloResource(StupidService service) {
        this.stupidService = service;
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return stupidService.getThing();
    }


}
