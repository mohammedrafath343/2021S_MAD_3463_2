package tempv1;

import javax.swing.JOptionPane;

public class TempV3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Taking inputs from user for Actual temperature, wind speed and humidity
		double currentTemp = Double.parseDouble(JOptionPane.showInputDialog("Enter current temperature:"));
		int humidity = Integer.parseInt(JOptionPane.showInputDialog("Enter humidity:"));
		int windSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter windspeed:"));

		TempV4 v4 = new TempV4(currentTemp, humidity, windSpeed);
		double feelsLike = v4.calcFeelsLike();

		// Displaying output
		JOptionPane.showMessageDialog(null, feelsLike);
	}
}
