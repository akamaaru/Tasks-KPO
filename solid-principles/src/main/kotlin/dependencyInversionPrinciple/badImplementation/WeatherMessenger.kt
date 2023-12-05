package dependencyInversionPrinciple.badImplementation

interface WeatherMessenger {
    fun generateWeatherAlert(weatherConditions: String): String
}