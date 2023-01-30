package rspievakc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/123")
    @Produces(MediaType.APPLICATION_JSON)
    public Book hello() {
        return Book.builder()
                .name("Hello World")
                .description("Test 456")
                .build();
    }

    @Data
    @Builder(toBuilder=true)
    @AllArgsConstructor
    public static class Book {

        private String name;
        private String description;

    }
}

