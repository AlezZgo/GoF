package wrapper

open class Person(protected val id: Int, protected val name: String, protected val surname: String){

    constructor(person: Person) : this(person.id,person.name,person.surname)

}