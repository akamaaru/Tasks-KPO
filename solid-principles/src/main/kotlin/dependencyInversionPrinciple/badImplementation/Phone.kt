package dependencyInversionPrinciple.badImplementation

class Phone : WeatherMessenger {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}