/**
 * 
 */
package tempv1;

/**
 * @author Rafathullah
 *
 */
public class TempV4 {
	double temperature; //10
	int humidity; //40
	int windSpeed;// 4


	TempV4(double temperature, int humidity, int windSpeed) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
	}

	/**
	 * @param args
	 */
	public double calcFeelsLike() {
		double feelsLike = (this.temperature + this.humidity + this.windSpeed) * 0.2;
		
		return feelsLike;
	}

}
