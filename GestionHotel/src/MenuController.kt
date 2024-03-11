class MenuController {
    private val printer= Printer()
    private val reservacionController=ReservacionController()
    private val clienteController=ClienteController()
    private val habitacionController=HabitacionController(printer)

    fun showmenu(){
        printer.apply{
            printMsg("Ingrese una opcion")
            printMsg("1. Mostrar habitaciones")
            printMsg("2. Mostrar clientes")
            printMsg("1. Mostrar reservaciones")

            val seleccion_opciones=readln().toInt()
            validaOpcion(seleccion_opciones)


        }
    }
    private fun validaOpcion(seleccion_opciones:Int){
        when(seleccion_opciones){
            1->{
                habitacionController.showHabitacion()
                showmenu()
            }
            2->{
                clienteController.showCliente()
                showmenu()
            }
            3->{
                reservacionController.showReservacion()
                showmenu()
            }
        }
    }
    private fun Seleccionhabitacionycliente(){
        if (clienteController.areNotRegisterCliente()){
            printer.printMsg("No se encuentra el cliente registrado")
            showmenu()
            return
        }
        if (habitacionController.areNotRegisterHabitacion()){
            printer.printMsg("No se encuentra la habitacion registrada")
            showmenu()
            return
        }
    }
}