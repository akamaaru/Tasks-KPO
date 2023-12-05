package dependencyInversionPrinciple.badImplementation

class Emailer : WeatherMessenger {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}