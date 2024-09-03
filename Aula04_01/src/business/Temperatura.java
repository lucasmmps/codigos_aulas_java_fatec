package business;

public class Temperatura {
	private float grausCelsius;

	public float getGrausCelsius() { return grausCelsius; }
	public void setGrausCelsius(float grausCelsius) { this.grausCelsius = grausCelsius; }
	
	public float getGrausFarenheit() {
		return grausCelsius * 1.8f + 32;
	}
}
