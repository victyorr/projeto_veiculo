package controle;

public class caminhao extends veiculo {

	private boolean freioDeMao;

	public caminhao(int motor, int freio, boolean ativacao, int cambio) {
		super(motor, freio, ativacao, cambio);
		// TODO Auto-generated constructor stub
	}

	public void freioDeManoAtivado() {
		this.freioDeMao = true;
		this.velocidade = 0;
	}

	public void freioDeManoDesativado() {
		this.freioDeMao = true;
		this.velocidade = 0;
	}

	public boolean freioDeMao() {
		if (this.freioDeMao == true) {
			return true;
		}
		return false;

	}

	public void re(int tempo) {
		if (estaLigado() && tempo > 0 && !freioDeMao()) {
			this.velocidade -= this.motor;
			re(tempo - 1);

		}

	}

	@Override
	public void acelerar(int tempo) {
		if (estaLigado() && !freioDeMao) {
			this.velocidade += this.motor * 1;
		}

	}

}
