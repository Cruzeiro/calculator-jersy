package com.calculator.rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/calc")
public class HelloWorldService {

    @GET
    @Path("/add")
    public Response add(@MatrixParam("number1") Integer number1,
                        @MatrixParam("number2") Integer number2 ) {

        Integer result = number1 + number2;

        return Response.status(200).entity(result.toString()).build();

    }

    @GET
    @Path("/sub")
    public Response sub(@MatrixParam("number1") Integer number1,
                        @MatrixParam("number2") Integer number2 ) {

        Integer result = number1 - number2;

        return Response.status(200).entity(result.toString()).build();

    }

}