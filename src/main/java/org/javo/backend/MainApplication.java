package org.javo.backend;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import com.google.gson.JsonObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/run")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MainApplication {

    @POST
    public Response hello() {
        JsonObject response = new JsonObject();
        response.addProperty("greeting", "Hello, " + "Jerson" + "!");
        return Response.ok(response).build();
    }

}