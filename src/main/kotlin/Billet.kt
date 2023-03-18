
class Billet {
    var countOfHole = 0 //количество просверленных отвестий
    var form = false //придана ли детали форма
    var countOfLeftRezba = 0//количество нарезанной левой резьбы
    var countOfRightRezba = 0//количество нарезанной правой резьбы
    var shlofovana = false //отшлифована деталь, если производится какое-то физическое воздействие, то шлифование уходит

    fun inform(){
        println(if(form) "Придали форму" else "Без формы")
        if (countOfHole>0) println("Количестово отвестий:"+countOfHole)
        if (countOfLeftRezba>0)println("Количестово левой резьбы:"+countOfLeftRezba)
        if (countOfRightRezba>0) println("Количестово правой резьбы:"+countOfRightRezba)
        println(if(shlofovana) "Отшлифована" else "Не отшлифована")
    }
}