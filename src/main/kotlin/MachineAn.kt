class MachineAn  : Tecnology {
    private var billet = Billet()
    override fun newBillet() {
        billet = Billet()
        billet.name+=" An"
    }

    override fun sverlenie() {
        billet.countOfHole+=1
        println("В детали An просверлено отверстие")
    }

    override fun frezirovanie() {
        billet.form = true
        println("Деталь An отфрезирована, теперь имеет форму")
    }

    override fun rezba(left: Boolean) {
        when (left) {
            true -> {
                billet.countOfLeftRezba+=1
                println("Добавлена левая резьба An")
            }
            false -> {
                billet.countOfRightRezba+=1
                println("Добавлена правая резьба An")
            }
        }
    }

    override fun shlofovanie() {
        billet.shlofovana=true
        println("Деталь отшлифована")
    }

    override fun getBillet(): Billet {
        return billet
    }

    override fun renameBillet(name: String) {
        billet.name=name+" An"
    }
}