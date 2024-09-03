package business;

public class Carro extends Veiculo {

	// atributos
	private int quantidadePortas;

	// método construtor
	public Carro(String modelo, String fabricante, int ano, int quantidadePortas) {
		super(modelo, fabricante, ano);
		this.quantidadePortas = quantidadePortas;
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
		);
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
