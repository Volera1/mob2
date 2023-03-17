import java.sql.DriverManager

class Machine : Tecnology {
    override fun doBolt() {
        TODO("Not yet implemented")
    }

    override fun doGaika() {
        TODO("Not yet implemented")
    }

    override fun doKrepeg() {
        TODO("Not yet implemented")
    }



    fun sverlenie(billet: Billet) {
        billet.countOfHole+=1
        billet.shlofovana = false
        DriverManager.println("В детали просверлено отверстие")
    }
    fun frezirovanie(billet: Billet){
        billet.form = true
        billet.shlofovana=false
        DriverManager.println("Деталь отфрезирована, теперь имеет форму")
    }
    fun rezba(billet: Billet,left: Boolean =true){ //по умолчанию левая (наиболее популярная), резьба не влияет на шлифовку
        when (left) {
            true -> {
                billet.countOfLeftRezba+=1
                DriverManager.println("Добавлена левая резьба")
            }
            false -> {
                billet.countOfRightRezba+=1
                DriverManager.println("Добавлена правая резьба")
            }
        }
    }
    fun shlofovanie(billet: Billet){
        if (billet.shlofovana) {
            DriverManager.println("Деталь уже отшлифована")
        }
        else {
            billet.shlofovana=true
            DriverManager.println("Деталь отшлифована")
        }
    }
}