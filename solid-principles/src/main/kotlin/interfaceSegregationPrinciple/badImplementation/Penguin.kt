package interfaceSegregationPrinciple.badImplementation


class Penguin(var numberOfFeathers: Int) : Bird {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    fun swim() {
        currentLocation = "in the water"
    }
}