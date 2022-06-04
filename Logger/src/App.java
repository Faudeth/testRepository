public class App {
	
	static Logger logger;

	public static void main(String[] args) {
		
		AsteriskLogger myAsteriskLogger = new AsteriskLogger();
		SpacedLogger mySpacedLogger = new SpacedLogger();
		
		myAsteriskLogger.log("Hello");
		myAsteriskLogger.error("Hello");
		mySpacedLogger.log("Error");
		mySpacedLogger.error("Error");

	}
	
	

}
