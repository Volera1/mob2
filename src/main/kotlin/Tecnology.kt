abstract class Tecnology {
    abstract fun newBillet() //обновить деталь
    abstract fun sverlenie()
    abstract fun frezirovanie()
    abstract fun rezba(left: Boolean = true)
    abstract fun shlofovanie()
    abstract fun getBillet(): Billet
    abstract fun renameBillet(name:String)

}