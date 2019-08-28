
public class NavigatorApp {

	public static void main(String[] args) {
		try {
		     Navigator n = new Navigator();
		     // Auckland, OGG Building
		     n.setOriginLongitude(174.77095);
		     n.setOriginLatitude(-36.85292);
		     // New York, Times Square
		     n.setDestinationLongitude(-73.98513);
		     n.setDestinationLatitude(40.75889);
		     System.out.println("The distance between ");
		     System.out.println("Auckland and New York is ");
		     System.out.print(n.distanceInKm() + " km or ");
		     System.out.print(n.distanceInNM() + " nautical miles.");
		}
		catch (Exception e) {}
	}

}
