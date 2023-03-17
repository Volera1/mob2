
fun main() {
    println("Hello World!")
    val billet1= Billet()
    val machine1 = Machine()
    machine1.frezirovanie(billet1)
    machine1.sverlenie(billet1)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("billet form "+billet1.form+", holes:"+billet1.countOfHole)
}