interface Tecnology {
    fun newBillet() //обновить деталь
    fun sverlenie()
    fun frezirovanie()
    fun rezba(left: Boolean = true)
    fun shlofovanie()
    fun getBillet(): Billet
    fun renameBillet(name:String)

}