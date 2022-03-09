package decorator

class Total(private val good: Good): Good {
    override fun sum(): Int {
        return good.sum()
    }

    override fun receipt(): String {
        return good.receipt() + "\nTotal.......${sum()}"
    }
}