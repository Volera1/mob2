import java.sql.DriverManager.println

class Billet {
    var countOfHole = 0
    var form = false
    fun sverlenie() {
        countOfHole+=1
        println("В детали просверлено отверстие")
    }
    fun frezirovanie(){
        form = true
        println("Деталь отфрезирована, теперь имеет форму")
    }
    
}