/**
 * 
 */
package tempv1;

import javax.swing.JOptionPane;

/**
 * @author Rafathullah
 *
 *         Feels like temperature calculator
 */
public class TempV1 {

	/**
	 * @param args
	 * 
	 * Main 
	 */
	public static void main(String[] args) {
		// Taking inputs from user for Actual temperature, wind speed and humidity
		double currentTemp = Double.parseDouble(JOptionPane.showInputDialog("Enter current temperature:"));
		int humidity = Integer.parseInt(JOptionPane.showInputDialog("Enter humidity:"));
		int windSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter windspeed:"));

		double feelsLike = (currentTemp + humidity + windSpeed) * 0.30;

		// Displaying output
		JOptionPane.showMessageDialog(null, feelsLike);
	}



}
