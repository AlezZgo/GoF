import strategy.CarBookingStrategy
import strategy.Customer
import strategy.TrainBookingStrategy

fun main(args: Array<String>) {

    //CarBooking Strategy
    val cust = Customer(CarBookingStrategy())
    var fare = cust.calculateFare(5)
    println(fare)

    //TrainBooking Strategy
    cust.bookingStrategy = TrainBookingStrategy()
    fare = cust.calculateFare(5)
    println(fare)
}

