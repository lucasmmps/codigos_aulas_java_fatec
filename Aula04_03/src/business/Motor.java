package business;

public class Motor {
	private float potencia;
	private String tipo;
	
	public Motor(float potencia, String tipo) {
		this.potencia = potencia;
		this.tipo = tipo;
	}
	
	public String getInfoMotor() {
		return String.format(
				"\n[DADOS DO MOTOR]\n" +
						"Potencia: %f\n" +
						"Tipo: %s\n",
				this.potencia,
				this.tipo
		);
	}

	@Override
	public String toString() {
		return getInfoMotor();
	}
}
