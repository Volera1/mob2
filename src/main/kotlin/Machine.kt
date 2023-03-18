import java.sql.DriverManager

class Machine : Tecnology {
    //здесь то, что по технологии должна способна сделать модель станка
    override fun doBolt(billet: Billet) {
        frezirovanie(billet)
        rezba(billet)
        shlofovanie(billet)
    }

    override fun doGaika(billet: Billet) {
        sverlenie(billet)
        frezirovanie(billet)
        rezba(billet)
        shlofovanie(billet)
    }

    override fun doKrepeg(billet: Billet) {
        frezirovanie(billet)
        for (i in 1..4){
            sverlenie(billet)
        }
        shlofovanie(billet)
    }

//тут идут далее функции самого (конкретно этого) станка
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