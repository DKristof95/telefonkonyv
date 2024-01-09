package org.acme;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Random;

@Path("/hello")
public class GreetingResource {

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Endpoint endpoint = new Endpoint();
        endpoint.name = "valami";
        endpoint.SIP_URI = "adsad";
        endpoint.ZIP = 1234;
        endpoint.city = "random";
        endpoint.coordinates = "dassfdghdfsgds";
        endpoint.type = Type.Type1;
        endpoint.persist();

        return "Hello from RESTEasy Reactive";
    }
}
