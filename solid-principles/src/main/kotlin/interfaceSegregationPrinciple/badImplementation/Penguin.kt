package interfaceSegregationPrinciple.badImplementation


class Penguin(var numberOfFeathers: Int) : SwimmingBird {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    override fun swim() {
        currentLocation = "in the water"
    }
}