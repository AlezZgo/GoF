package decorator

class Smartphone(private val good: Good) : Good {
    override fun sum(): Int {
        return PRICE + good.sum()
    }

    override fun receipt(): String {
        return good.receipt() + "\nsmartphone....$PRICE"
    }

    companion object {
        private const val PRICE = 500
    }
}

class GooglePixel: Good.Base("Google Pixel",1000)