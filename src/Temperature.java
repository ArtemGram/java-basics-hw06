public class Temperature {

  /**
   * Converts temperature from Fahrenheit to Celsius degree.
   *
   * @param fahrenheit temperature degree in Fahrenheit
   * @return temperature degree in Celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;
    return celsius;
  }

  /**
   * Converts temperature from Celsiusto Fahrenheit degree.
   *
   * @param celsius temperature degree in Celsius
   * @return temperature degree in Fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
    return fahrenheit;
  }
}
