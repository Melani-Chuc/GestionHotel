class Habitacion (
    val num_habitacion: Int,
    val tipo_habitacion: String,
    val cap_personas: Int,
    val precio_habitacion: Double,
    val descripcion: String,
)
{
    fun getHabitacionData():String{
        return "num_habitacion:$num_habitacion tipo_habitacion:$tipo_habitacion cap_personas:$cap_personas precio_habitacion:$precio_habitacion descripcion:$descripcion"
    }
}