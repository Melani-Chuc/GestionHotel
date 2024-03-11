class Reservacion (
    val num_reservacion:Double,
    val fecha_entrada:String,
    val fecha_salida:String,
    val total_noches: Int,
    val cliente:Cliente,
    val habitacion:Habitacion,
    val total_pagar:Double,
    val anticipo:Double,
    val saldo:Double,
)

{
    fun getReservacionData(): String {
        return "numero de reservacion: $num_reservacion fecha de entrega de la habitacion: $fecha_entrada total a pagar: $total_pagar "

    }
}