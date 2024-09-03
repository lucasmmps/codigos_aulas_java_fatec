package business;

public abstract class Veiculo {

	// atributos
	protected String modelo, fabricante;
	protected int ano;
	protected int velocidadeAtual; // em km/h

	// constantes que definem os limites de velocidade dos veículos
	protected static final int VELOCIDADE_MIN = 0, VELOCIDADE_MAX = 180;

	// método construtor
	public Veiculo(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.velocidadeAtual = 0;
	}

	// métodos getters e setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public String getInfoVeiculo() {
		return String.format(
				"\n[DADOS DO VEICULO]\n" +
						"%s %s %d",
				this.fabricante,
				this.modelo,
				this.ano
		);
	}

	public String getEstadoMovimento() {

		String mensagemEstadoMovimento = velocidadeAtual != 0? "O veiculo esta em movimento" : "O veículo esta parado";
		String avisoLimiteVelocidade = velocidadeAtual >= VELOCIDADE_MAX? "\n\n[AVISO]\nVOCÊ ESTÁ NO LIMITE MÁXIMO DE VELOCIDADE" : "";

		return String.format(
				"\n[ESTADO DO MOVIMENTO]\n" +
						"%s\n" +
						"Velocidade: %d km/h" +
						"%s",
				mensagemEstadoMovimento,
				this.velocidadeAtual,
				avisoLimiteVelocidade
		);
	}

	// métodos de direção
	public int acelerar() {
		return velocidadeAtual += velocidadeAtual < VELOCIDADE_MAX ? 5 : 0;
	}
	
	public int desacelerar() {
		return velocidadeAtual -= velocidadeAtual > VELOCIDADE_MIN ? 5 : 0;
	}
	
	public int parar() {
		return velocidadeAtual = 0;
	}
}
