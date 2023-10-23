public class Automobile{
	// Declaring private variables
		private String autoMake;
		private String autoModel;
		private String autoColor;
		private int autoYear;		
		// Defining getter methods
		public String getAutoMake() {
			return autoMake;
		}
		public String getAutoModel() {
			return autoModel;
		}
		public String getAutoColor() {
			return autoColor;
		}
		public int getAutoYear() {
			return autoYear;
		}
		// Defining setter methods
		public void setAutoMake(String AutoMake) {
			this.autoMake = AutoMake;
		}
		public void setAutoModel(String AutoModel) {
			this.autoModel = AutoModel;
		}
		public void setAutoColor(String AutoColor) {
			this.autoColor = AutoColor;
		}
		public void setAutoYear(int AutoYear) {
			this.autoYear = AutoYear;
		}
		// Defining a constructor
		public Automobile(String autoMake, String autoModel, String autoColor, int autoYear) {
			this.autoMake = autoMake;
			this.autoModel = autoModel;
			this.autoColor = autoColor;
			this.autoYear = autoYear;
		}
}

