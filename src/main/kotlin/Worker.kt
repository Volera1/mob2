class Worker {
    var machine:Tecnology = Machine()
    fun go() {
        println("Введите:")
        println("1. Сделать заготовку")
        println("2. Сделать болт")
        println("3. Сделать гайку")
        println("4. Сделать крепеж")
        println("Любое значение. Выход")

        when(readLine()) {
            1.toString() -> doBillet()

            2.toString() -> doBolt()

            3.toString() -> doGaika()

            4.toString() -> doKrepeg()

            else-> return
        }
        go()
    }
    fun doBillet() {
        val billet= Billet()
        billet.inform()
    }
    fun doBolt() {
        machine.frezirovanie()
        machine.rezba()
        machine.shlofovanie()
        //billet.name="Болт"
        machine.getBillet().inform()
    }
    fun doGaika() {
        machine.sverlenie()
        frezirovanie(billet)
        rezba(billet)
        shlofovanie(billet)
        //billet.name="Гайка"
        billet.inform()
    }
    fun doKrepeg() {
        val billet = Billet()
        frezirovanie(billet)
        for (i in 1..4){
            sverlenie(billet)
        }
        shlofovanie(billet)
        //billet.name="Крепеж"
        billet.inform()
    }
}