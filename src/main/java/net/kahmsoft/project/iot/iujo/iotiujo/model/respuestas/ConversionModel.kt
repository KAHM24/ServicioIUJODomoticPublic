package net.kahm.ServiciosIUJOInmoticaWAR.model.respuestas

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ConversionModel {

    @SerializedName("valor_entrada")
    @Expose
    var valorEntrada: String? = null
    @SerializedName("valor_salida")
    @Expose
    var valorSalida : Any? = null

}