package interfaceSegregationPrinciple.badImplementation


class Eagle(var numberOfFeathers: Int): FlyingBird {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}