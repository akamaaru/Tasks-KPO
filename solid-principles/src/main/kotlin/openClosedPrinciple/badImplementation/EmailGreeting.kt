package openClosedPrinciple.badImplementation

abstract class EmailGreeting {
    abstract val greeting: String

//    val greeting: String = when(formality) {
//        "formal" -> "Good evening, sir."
//        "casual" -> "Sup bro?"
//        "intimate" -> "Hello Darling!"
//        else -> "Hello!"
//    }
}