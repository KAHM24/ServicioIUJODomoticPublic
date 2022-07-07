package net.kahm.ServiciosIUJOInmoticaWAR.services

import net.kahm.ServiciosIUJOInmoticaWAR.model.constantes.temperaturas
import net.kahm.ServiciosIUJOInmoticaWAR.model.respuestas.ConversionModel


class ConversionService {

    fun getGradosCelsiusF(gradosFarenheit : Float): ConversionModel {
        val conversion = ConversionModel()
        conversion.valorEntrada = "$gradosFarenheit °F"
        conversion.valorSalida = "${(gradosFarenheit*9/5)+32} °C"
        return conversion
    }

    fun getGradosCelsiusK(gradosKelvin : Float): ConversionModel {
        val conversion = ConversionModel()
        conversion.valorEntrada = "$gradosKelvin °K"
        conversion.valorSalida = "${gradosKelvin - 273.15} °C"
        return conversion
    }


    fun getGradosKelvinC(gradosCelsius : Float): ConversionModel {
        val conversion = ConversionModel()
        conversion.valorEntrada = "$gradosCelsius °C"
        conversion.valorSalida = "${gradosCelsius+273.15} °K"
        return conversion
    }

    fun getGradosKelvinF(gradosFarenheit : Float): ConversionModel {
        val conversion = ConversionModel()
        val index = readLine()
        conversion.valorEntrada = "$gradosFarenheit ${temperaturas[1]}"
        conversion.valorSalida = "${(gradosFarenheit-32)*(5/9)+273.15} °K"
        return conversion
    }

    fun getGradosFarenheitC(gradosCelsius : Float): ConversionModel {
        val conversion = ConversionModel()
        conversion.valorEntrada = "$gradosCelsius °C"
        conversion.valorSalida = "${(gradosCelsius-32)*(5/9)} °F"
        return conversion
    }

    fun getGradosFarenheitK(gradosKelvin : Float): ConversionModel {
        val conversion = ConversionModel()
        conversion.valorEntrada = "$gradosKelvin °K"
        conversion.valorSalida = "${(gradosKelvin - 273.15)*(5/9)+32} °F"
        return conversion
    }

}