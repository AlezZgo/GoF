import TryCatchExp.TryCatchTest
import decorator.Good
import decorator.MacBook
import decorator.Smartphone
import decorator.Total
import wrapper.Person
import wrapper.PersonWrapper

fun main() {
    var good : Good = Good.Empty()
    good = buyMacBook(good)
    good = buySmartPhone(good)
    good = finishShopping(good)
    println(good.receipt())

}


fun buyMacBook(good: Good): MacBook{
    return MacBook(good)
}


fun buySmartPhone(good: Good): Smartphone{
    return Smartphone(good)
}


fun finishShopping(good: Good): Good{
    return Total(good)
}


