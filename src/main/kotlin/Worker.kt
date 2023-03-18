class Worker {
    var machine:Tecnology = Machine()
    fun doBillet() {
        println("Введите:")
        println("1. Сделать заготовку")
        println("2. Сделать болт")
        println("3. Сделать гайку")
        println("4. Сделать крепеж")
        println("Любое значение. Выход")

        when(readLine()) {
            1.toString() -> machine.doBillet()

            2.toString() -> machine.doBolt()

            3.toString() -> machine.doGaika()

            4.toString() -> machine.doKrepeg()

            else-> return
        }
        doBillet()
    }
}