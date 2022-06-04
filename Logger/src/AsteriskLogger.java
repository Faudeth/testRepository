	public class AsteriskLogger implements Logger {

		@Override
		public void log(String logString) {
			System.out.println("***" + logString.toString() + "***");
			
		}

		@Override
		public void error(String errorString) {
			System.out.println("******************" +
							   "\n***Error: " + errorString.toString() + "***" +
							   "\n******************");
			
		}
		
	
	

}
