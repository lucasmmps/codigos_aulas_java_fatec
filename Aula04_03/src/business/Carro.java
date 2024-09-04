package business;

public class Carro extends Veiculo {

	// atributos
	private int quantidadePortas;
	private Motor motor;
	private Manutencao manutencao;

	// método construtor
	public Carro(String modelo, String fabricante, int ano, int quantidadePortas, Motor motor, Manutencao manutencao) {
		super(modelo, fabricante, ano);
		this.quantidadePortas = quantidadePortas;
		this.motor = motor;
		this.manutencao = manutencao;
	}

	// métodos getters e setters
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public String getInfoVeiculo() {
		return String.format(
				"\n[DADOS DO VEICULO]\n" +
						"%s %s %d, %d portas\n",
				this.fabricante,
				this.modelo,
				this.ano,
				this.quantidadePortas
		) + motor.toString() + manutencao.toString();
		
		
	}

	// métodos de direção
	@Override
	public int acelerar() {
		return velocidadeAtual += velocidadeAtual < VELOCIDADE_MAX ? 10 : 0;
	}
	
	@Override
	public int desacelerar() {
		return velocidadeAtual -= velocidadeAtual > VELOCIDADE_MIN ? 10 : 0;
	}
}
