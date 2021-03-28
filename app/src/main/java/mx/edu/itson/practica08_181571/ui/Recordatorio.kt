package mx.edu.itson.practica08_181571.ui
import java.io.Serializable

data class Recordatorio(var dias: String,
                        var tiempo: String,
                        var nombre: String) : Serializable