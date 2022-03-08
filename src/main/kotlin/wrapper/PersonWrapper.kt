package wrapper

class PersonWrapper(person: Person) : Person(person) {

    fun fullName() = "$name $surname"

}