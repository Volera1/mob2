
fun main() {
    val billet1= Billet()
    val machine1 = Machine()
    machine1.frezirovanie(billet1)
    machine1.sverlenie(billet1)

    println("billet form "+billet1.form+", holes:"+billet1.countOfHole)
}