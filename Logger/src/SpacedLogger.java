	public class SpacedLogger implements Logger {

		@Override
		public void log(String log) {
			
			int input = log.length();
			int i;
			
			for (i = 0; i < input; i++) {
				System.out.print(" " + log.charAt(i));
			}
		}

		@Override
		public void error(String error) {
			
			int input = error.length();
			int i;
			System.out.print("\nERROR: ");
			
			for (i = 0; i < input; i++) {
				System.out.print(" " + error.charAt(i));
			}
			
		}

}
