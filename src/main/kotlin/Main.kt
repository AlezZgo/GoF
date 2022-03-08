import wrapper.Person
import wrapper.PersonWrapper

fun main() {
    val wrapper = PersonWrapper(Person(1,"Mike","Brown"))

    println(wrapper.fullName())
}