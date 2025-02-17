import dependencyInversionPrinciple.badImplementation.Emailer
import dependencyInversionPrinciple.badImplementation.Phone
import dependencyInversionPrinciple.badImplementation.WeatherTracker
import interfaceSegregationPrinciple.badImplementation.Eagle
import interfaceSegregationPrinciple.badImplementation.Penguin
import openClosedPrinciple.badImplementation.EmailGreeting
import openClosedPrinciple.badImplementation.FormalEmailGreeting


fun main() {
    // ЗАДАНИЕ 1: Приветствие

//    val greeting: EmailGreeting = EmailGreeting("formal")
    val greeting: EmailGreeting = FormalEmailGreeting()
    require(greeting.greeting == "Good evening, sir.") {
        "Wrong message intro"
    }

    // ЗАДАНИЕ 2: Уведомления о погоде
    val tracker = WeatherTracker(messenger1 = Phone(), messenger2 = Emailer(), conditions = "sunny")

    // let's get a phone notification
    tracker.setCurrentConditions("rainy")

    // ЗАДАНИЕ 3: Птицы бывают разные (но не все всё умеют)
    val eagle = Eagle(150)
    eagle.fly()

    val penguin = Penguin(0)

    // Пингвин не хочет чувствовать себя ущербным:(
    // А мы не хотим видеть исключения в коде...

    // Теперь тут будет ошибка компиляции
    //penguin.fly()
    penguin.swim()
}