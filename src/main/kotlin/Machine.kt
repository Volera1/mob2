
class Machine : Tecnology {
    private var billet = Billet()
    override fun newBillet() {
        billet = Billet()
    }

    //тут идут далее функции самого (конкретно этого) станка
    override fun sverlenie() {
        billet.countOfHole+=1
        billet.shlofovana = false
        println("В детали просверлено отверстие")
    }
    override fun frezirovanie(){
        billet.form = true
        billet.shlofovana=false
        println("Деталь отфрезирована, теперь имеет форму")
    }
    override fun rezba(left: Boolean){ //по умолчанию левая (наиболее популярная), резьба не влияет на шлифовку
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
    override fun shlofovanie(){
        if (billet.shlofovana) {
            println("Деталь уже отшлифована")
        }
        else {
            billet.shlofovana=true
            println("Деталь отшлифована")
        }
    }

    override fun getBillet(): Billet {
        return billet
    }

    override fun renameBillet(name:String) {
        billet.name=name
    }
}