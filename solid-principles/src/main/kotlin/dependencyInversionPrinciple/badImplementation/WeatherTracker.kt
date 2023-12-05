package dependencyInversionPrinciple.badImplementation

class WeatherTracker (private var conditions: String,
                      private val messenger1: WeatherMessenger,
                      private val messenger2: WeatherMessenger) {

    fun setCurrentConditions(weatherDescription: String) {
        this.conditions = weatherDescription
        if (weatherDescription === "rainy") {
            val alert: String = messenger1.generateWeatherAlert(weatherDescription)
            print(alert)
        }
        if (weatherDescription === "sunny") {
            val alert: String = messenger2.generateWeatherAlert(weatherDescription)
            print(alert)
        }
    }

}