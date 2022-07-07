package net.kahm.ServiciosIUJOInmoticaWAR.controller

import com.google.gson.Gson
import net.kahm.ServiciosIUJOInmoticaWAR.model.respuestas.RespuestaModel
import net.kahm.ServiciosIUJOInmoticaWAR.services.ConversionService
import java.util.*
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/conversiones/v1")
class ConversionesController() {

    val gson = Gson()
    var resp = RespuestaModel()


    @GET
    @Path("/celsiusToFarenheit")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun celciusToFarenheit(@QueryParam("grados") gradosC : Float) : Response {
//        val headers = HttpHeaders()
//        headers.add("conversionTemperatura", "CelsiusToFarentheit")
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosCelsiusF(gradosC)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                //.cacheControl(cc)
                .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
                .header("Pragma", "no-cache")
                .build()
    }

    @GET
    @Path("/celsiusToKelvin")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun celciusToKelvin(@QueryParam("grados") gradosC : Float) : Response {
//        val headers = HttpHeaders()
//        headers.add("conversionTemperatura", "CelsiusToFarentheit")
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosCelsiusK(gradosC)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
            .header("Access-Control-Allow-Origin", "*")
            .header("Access-Control-Allow-Credentials", "true")
            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
            //.cacheControl(cc)
            .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
            .header("Pragma", "no-cache")
            .build()
    }

    @GET
    @Path("/FarenheitToCelsius")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun farentheitToCelsius(@QueryParam("grados") gradosF : Float) : Response {
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosFarenheitC(gradosF)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
            .header("Access-Control-Allow-Origin", "*")
            .header("Access-Control-Allow-Credentials", "true")
            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
            //.cacheControl(cc)
            .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
            .header("Pragma", "no-cache")
            .build()
    }

    @GET
    @Path("/FarenheitToKelvin")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun farentheitToKelvin(@QueryParam("grados") gradosF : Float) : Response {
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosFarenheitK(gradosF)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
            .header("Access-Control-Allow-Origin", "*")
            .header("Access-Control-Allow-Credentials", "true")
            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
            //.cacheControl(cc)
            .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
            .header("Pragma", "no-cache")
            .build()
    }

    @GET
    @Path("/KelvinToFarenheit")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun kelvinToFarenheit(@QueryParam("grados") gradosK : Float) : Response {
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosKelvinF(gradosK)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
            .header("Access-Control-Allow-Origin", "*")
            .header("Access-Control-Allow-Credentials", "true")
            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
            //.cacheControl(cc)
            .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
            .header("Pragma", "no-cache")
            .build()
    }

    @GET
    @Path("/KelvinToCelsius")
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes(MediaType.TEXT_PLAIN)
    fun kelvinToCelsius(@QueryParam("grados") gradosK : Float) : Response {
        resp.status = "${Response.Status.OK}"
        val  conver = ConversionService()
        resp.detail = conver.getGradosKelvinC(gradosK)
        val json = gson.toJson(resp)
        return Response.status(Response.Status.OK).entity(json)
            .header("Access-Control-Allow-Origin", "*")
            .header("Access-Control-Allow-Credentials", "true")
            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
            //.cacheControl(cc)
            .header("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate")
            .header("Pragma", "no-cache")
            .build()
    }
}