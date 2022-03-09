package decorator

interface Good {

    fun sum(): Int

    fun receipt(): String

    class Empty: Good{
        override fun sum(): Int = 0


        override fun receipt(): String = "Receipt"
    }

    abstract class Base(private val name: String,private val price: Int): Good{
        override fun sum(): Int {
            return price
        }

        override fun receipt(): String {
            return "$name.....$$price"
        }

    }
}