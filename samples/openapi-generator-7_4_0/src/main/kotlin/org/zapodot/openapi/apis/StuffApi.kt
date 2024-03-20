package org.zapodot.openapi.apis;

import org.zapodot.openapi.models.Stuff

import jakarta.ws.rs.*
import jakarta.ws.rs.core.Response


import java.io.InputStream
import jakarta.validation.constraints.*
import jakarta.validation.Valid


@Path("/")
@jakarta.annotation.Generated(value = arrayOf("org.openapitools.codegen.languages.KotlinServerCodegen"), comments = "Generator version: 7.4.0")
interface StuffApi {

    @GET
    @Path("/stuff")
    @Produces("application/xml")
    fun findStuff(): Stuff
}
