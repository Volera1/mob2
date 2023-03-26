class Worker {
    var machine:Tecnology = Machine()
    fun go() {
        println("Введите:")
        println("1. Сделать заготовку")
        println("2. Сделать болт")
        println("3. Сделать гайку")
        println("4. Сделать крепеж")
        println("5. Поменять станок (Текущий: "+machine.javaClass.kotlin.java.simpleName+")")
        println("Любое значение. Выход")

        when(readLine()) {
            1.toString() -> doBillet()

            2.toString() -> doBolt()

            3.toString() -> doGaika()

            4.toString() -> doKrepeg()

            5.toString() -> {
                changeTecnology(if (machine.javaClass.kotlin.java.simpleName == "Machine")  MachineAn() else Machine())
            }
    else-> return
        }
        go()
    }
    fun doBillet() {
        machine.newBillet()
        machine.getBillet().inform()
    }
    fun doBolt() {
        machine.newBillet()
        machine.frezirovanie()
        machine.rezba()
        machine.shlofovanie()
        machine.renameBillet("Болт")
        machine.getBillet().inform()
    }
    fun doGaika() {
        machine.newBillet()
        machine.sverlenie()
        machine.frezirovanie()
        machine.rezba()
        machine.shlofovanie()
        machine.renameBillet("Гайка")
        machine.getBillet().inform()
    }
    fun doKrepeg() {
        machine.newBillet()
        machine.frezirovanie()
        for (i in 1..4){
            machine.sverlenie()
        }
        machine.shlofovanie()
        machine.renameBillet("Крепеж")
        machine.getBillet().inform()
    }

    fun changeTecnology(tech:Tecnology) {
        machine = tech
    }
}