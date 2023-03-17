import java.sql.DriverManager.println

class Billet {
    var countOfHole = 0 //количество просверленных отвестий
    var form = false //придана ли детали форма
    var countOfLeftRezba = 0//количество нарезанной левой резьбы
    var countOfRightRezba = 0//количество нарезанной правой резьбы
    var shlofovana = false //отшлифована деталь, если производится какое-то физическое воздействие, то шлифование уходит
    fun sverlenie() {
        countOfHole+=1
        shlofovana = false
        println("В детали просверлено отверстие")
    }
    fun frezirovanie(){
        form = true
        shlofovana=false
        println("Деталь отфрезирована, теперь имеет форму")
    }
    fun rezba(left: Boolean =true){ //по умолчанию левая (наиболее популярная), резьба не влияет на шлифовку
        when (left) {
            true -> {
                countOfLeftRezba+=1
                println("Добавлена левая резьба")}
            false -> {
                countOfRightRezba+=1
                println("Добавлена правая резьба")
            }
        }
    }

}