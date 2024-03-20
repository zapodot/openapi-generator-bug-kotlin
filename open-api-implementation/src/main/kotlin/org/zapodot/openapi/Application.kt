package org.zapodot.openapi

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.jakarta.rs.json.JacksonJsonProvider
import org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.server.ServerProperties
import org.glassfish.jersey.server.validation.ValidationFeature
import org.zapodot.openapi.apis.StuffApiImpl
import java.net.URI

internal val BASE_URI = URI.create("http://0.0.0.0:8080/")
val objectMapper: ObjectMapper = ObjectMapper().findAndRegisterModules()

object Application: ResourceConfig() {
    init {
        this.property(ServerProperties.WADL_FEATURE_DISABLE, true)
        this.register(StuffApiImpl::class.java)
        this.register(ValidationFeature())
        this.register(JacksonJsonProvider(objectMapper))
    }


}

fun main() {
    NettyHttpContainerProvider.createServer(BASE_URI, Application, false)
}
