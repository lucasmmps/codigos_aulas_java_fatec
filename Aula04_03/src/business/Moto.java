package business;

public class Moto extends Veiculo {

	// atributos
	private boolean descancoAcionado;
	private Motor motor;
	private Manutencao manutencao;

	// método construtor
	public Moto(String modelo, String fabricante, int ano, Motor motor, Manutencao manutencao) {
		super(modelo, fabricante, ano);
		this.descancoAcionado = true;
		this.motor = motor;
		this.manutencao = manutencao;
	}

	@Override
	public String getInfoVeiculo() {
		return super.getInfoVeiculo() + motor.toString() + manutencao.toString();
	}

	// métodos getters e setters
	@Override
	public String getEstadoMovimento() {
		String mensagemEstadoMovimento = velocidadeAtual != 0 ? "O veiculo esta em movimento" : "O veículo esta parado";
		String mensagemEstadoDescaco = descancoAcionado ? "Descanso: acionado" : "Descanso: recolhido";
		String avisoLimiteVelocidade = velocidadeAtual >= VELOCIDADE_MAX? "\n\n[AVISO]\nVOCÊ ESTÁ NO LIMITE MÁXIMO DE VELOCIDADE" : "";

		return String.format(
				"\n[ESTADO DO MOVIMENTO]\n" +
						"%s\n" +
						"Velocidade: %d km/h\n" +
						"%s" +
						"%s",
				mensagemEstadoMovimento,
				this.velocidadeAtual,
				mensagemEstadoDescaco,
				avisoLimiteVelocidade
		);
	}

	// métodos de direção
	@Override
	public int acelerar() {
		velocidadeAtual += velocidadeAtual < VELOCIDADE_MAX ? 5 : 0;
		descancoAcionado = velocidadeAtual == VELOCIDADE_MIN;
		return velocidadeAtual;
	}

	@Override
	public int desacelerar() {
		velocidadeAtual -= velocidadeAtual > VELOCIDADE_MIN ? 5 : 0;
		descancoAcionado = velocidadeAtual == VELOCIDADE_MIN;
		return velocidadeAtual;
	}

	@Override
	public int parar() {
		descancoAcionado = true;
		return velocidadeAtual = VELOCIDADE_MIN;
	}
}
