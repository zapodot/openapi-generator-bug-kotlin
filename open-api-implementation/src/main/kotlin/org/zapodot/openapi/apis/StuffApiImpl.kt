package org.zapodot.openapi.apis

import org.zapodot.openapi.models.Stuff

/**
 * Implementation of the StuffApi interface
 */
class StuffApiImpl : StuffApi {
    override fun findStuff(): List<Stuff> = emptyList()
}