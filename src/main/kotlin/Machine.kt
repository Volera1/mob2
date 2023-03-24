
class Machine : Tecnology {
    override fun doBillet() {
        val billet= Billet()
        billet.inform()
    }

    //здесь то, что по технологии должна способна сделать модель станка
    override fun doBolt() {
        val billet = Billet()
        frezirovanie(billet)
        rezba(billet)
        shlofovanie(billet)
        billet.name="Болт"
        billet.inform()
    }

    override fun doGaika() {
        val billet = Billet()
        sverlenie(billet)
        frezirovanie(billet)
        rezba(billet)
        shlofovanie(billet)
        billet.name="Гайка"
        billet.inform()
    }

    override fun doKrepeg() {
        val billet = Billet()
        frezirovanie(billet)
        for (i in 1..4){
            sverlenie(billet)
        }
        shlofovanie(billet)
        billet.name="Крепеж"
        billet.inform()
    }

//тут идут далее функции самого (конкретно этого) станка
    fun sverlenie(billet: Billet) {
        billet.countOfHole+=1
        billet.shlofovana = false
        println("В детали просверлено отверстие")
    }
    fun frezirovanie(billet: Billet){
        billet.form = true
        billet.shlofovana=false
        println("Деталь отфрезирована, теперь имеет форму")
    }
    fun rezba(billet: Billet,left: Boolean =true){ //по умолчанию левая (наиболее популярная), резьба не влияет на шлифовку
        when (left) {
            true -> {
                billet.countOfLeftRezba+=1
                println("Добавлена левая резьба")
            }
            false -> {
                billet.countOfRightRezba+=1
                println("Добавлена правая резьба")
            }
        }
    }
    fun shlofovanie(billet: Billet){
        if (billet.shlofovana) {
            println("Деталь уже отшлифована")
        }
        else {
            billet.shlofovana=true
            println("Деталь отшлифована")
        }
    }
}