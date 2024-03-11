class ReservacionController {
    private val printer=Printer()
    private val reservacionList: MutableList<Reservacion> = mutableListOf()

    fun RegisterReservacion(cliente:Cliente, habitacion:Habitacion){
        println("Ingresar el numero de reserva")
        val num_reservacion = readln().toDouble()
        println("Ingrese la fecha de entrega de la reservacion")
        val fecha_entrada = readln().toString()
        println("ingrese la fecha del fin de la reservacion")
        val fecha_salida = readln().toString()
        println("Total a pagar")
        val total_pagar = readln().toDouble()
        println("Total de cantidad antipicada")
        val anticipo = readln().toDouble()
        println("Total del saldo restante")
        val saldo = readln().toDouble()

        val addedReservacion = Reservacion(num_reservacion, fecha_entrada, fecha_salida, Cliente, Habitacion, total_pagar, anticipo, saldo)
        cliente.addReservacion(addedReservacion)
        reservacionList.add(addedReservacion)


        fun showReservacion() {
            if (reservacionList.isEmpty()) {
                printer.printMsg("No hay reservaciones registradas")
            } else {
                var contador=1
                for (Reservacion in reservacionList){
                    printer.printMsg("$contador"+ Reservacion.getReservacionData())
                    contador++
                }
            }
        }
    }
}