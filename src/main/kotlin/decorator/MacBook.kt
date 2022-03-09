package decorator

class MacBook(private val good: Good): Good {
    override fun sum(): Int {
        return PRICE + good.sum()
    }

    override fun receipt(): String {
        return good.receipt() + "\nmacbook....${PRICE}"
    }

    companion object{
        private const val PRICE = 2000
    }
}