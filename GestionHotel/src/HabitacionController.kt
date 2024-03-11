class HabitacionController (private val printer: Printer){

    private val habitacionList: MutableList<Habitacion> = mutableListOf()

    fun RegisterHabitacion(){
        println("Ingrese el numero de habitacion")
        val num_habitacion = readln().toInt()
        println("Ingrese el tipo de la habitacion")
        val tipo_habitacion = readln().toString()
        println("Ingrese la capacidad de personas de la habitacion")
        val cap_personas = readln().toInt()
        println("Ingrese el precio de la habitacion")
        val precio_habitacion = readln().toDouble()
        println("Ingrese la descripcion de la habitacion")
        val descripcion = readln().toString()

        val addedHabitacion = Habitacion(num_habitacion, tipo_habitacion, cap_personas, precio_habitacion, descripcion)
        habitacionList.add(addedHabitacion)
    }
    fun showHabitacion() {
        if (habitacionList.isEmpty()) {
            printer.printMsg("No se encontro la habitacion registrada")
        }
        else {
            var contador=1
            for (Habitacion in habitacionList){
                printer.printerMsg("$contador"+ Habitacion.getHabitacionData())
                contador++
            }
        }
    }
    fun areNotRegisterHabitacion():Boolean = habitacionList.isEmpty()
}