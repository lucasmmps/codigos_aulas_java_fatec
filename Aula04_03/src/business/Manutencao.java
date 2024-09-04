package business;

public class Manutencao {
	private String dataUltimaManutencao;
	private String tipoServico;
	
	public Manutencao(String dataUltimaManutencao, String tipoServico) {
		this.dataUltimaManutencao = dataUltimaManutencao;
		this.tipoServico = tipoServico;
	}
	
	public String getInfoManutecao() {
		return String.format(
				"\n[DADOS DA MANUTENCAO]\n" +
						"Data: %s\n" +
						"Servico: %s",
				this.dataUltimaManutencao,
				this.tipoServico
		);
	}

	@Override
	public String toString() {
		return getInfoManutecao();
	}
}
