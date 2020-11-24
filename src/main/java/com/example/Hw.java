package com.example;

/*
 * Reference: 
 * 
 * https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/jaxrs-resources.html
 * https://www.vogella.com/tutorials/REST/article.html
 * https://developer.ibm.com/technologies/web-development/articles/wa-aj-tomcat/
 * 
 */

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("hw")
public class Hw {
    public static final String CLICHED_MESSAGE = "Hello World!";
 
@GET
@Produces(" application/json")
    public String getHello() {
        return "{\"message\":\"" + CLICHED_MESSAGE + "\",\"now\":\"" + new Date() + "\"}"; 
    }
}