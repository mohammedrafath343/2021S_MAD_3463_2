/**
 * 
 */
package tempv1;

import javax.swing.JOptionPane;

/**
 * @author Rafathullah
 *
 */
public class TempV2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Taking inputs from user for Actual temperature, wind speed and humidity
		double currentTemp= Double.parseDouble(JOptionPane.showInputDialog("Enter current temperature:"));
		int humidity= Integer.parseInt(JOptionPane.showInputDialog("Enter humidity:"));
		int windSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter windspeed:"));
		
		TempV2 v2 = new TempV2();
		double feelsLike = v2.calcFeelsLiketemp(currentTemp, humidity, windSpeed) ;

		// Displaying output
		JOptionPane.showMessageDialog(null, feelsLike);
	}
	
	/**
	 * 
	 * @param currentTemp
	 * @param humidity
	 * @param windSpeed
	 * @return feelsLike temperature
	 * 
	 * Calculates feels like temperature
	 */

	public  double calcFeelsLiketemp(double currentTemp, int humidity, int windSpeed) {
		if (currentTemp == humidity && currentTemp == windSpeed) {
			return currentTemp;
		} else {

			double feelsLike = (currentTemp + humidity + windSpeed) * 0.30;

			return feelsLike;
		}

	}

}
