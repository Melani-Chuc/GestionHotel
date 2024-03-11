class ClienteController {
    private val printer= Printer()
    private val clienteList: MutableList<Cliente> = mutableListOf()

    fun RegisterCliente(){
        println("Ingresa el nombre del cliente")
        val nombre = readln().toString()
        println("Ingresa los apellidos del cliente")
        val apellidos = readln().toString()
        println("Ingrese la direccion del cliente")
        val direccion = readln().toString()
        println("Ingrese el numero de telefono del cliente")
        val telefono = readln().toDouble()
        println("Ingrese el correo del cliente")
        val correo = readln().toString()
        println("Ingrese el metodo de pago del cliente")
        val m_pago = readln().toString()
        println("Ingrese el RFC del cliente")
        val rfc = readln().toString()

        val addedCliente = Cliente(nombre, apellidos, direccion,telefono, correo, m_pago, rfc)

        clienteList.add(addedCliente)
    }
    fun showCliente() {
        if (clienteList.isEmpty()) {
            printer.printMsg("No se encunetra el cliente registrado")
        } else {
            var contador = 1
            for (Cliente in clienteList) {
                printer.printMsg("$contador-" + Cliente.getClienteData())
                contador++
            }

        }

    }
    fun areNotRegisterCliente():Boolean = clienteList.isEmpty()

}