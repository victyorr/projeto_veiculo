package controle;

public class caminhao extends veiculo {

	private boolean freioDeMao;
	private int cambio;

	public caminhao(int motor, int freio, boolean ativacao) {
		super(motor, freio, ativacao, freio);
		this.cambio = 0;
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
		if (estaLigado() && !freioDeMao && cambio > 0) {
			switch (this.cambio) {
			case 1:
				if (this.velocidade < 20) {
					this.velocidade += this.motor;
				}
				break;
			case 2:
				if (this.velocidade < 40) {
					this.velocidade += this.motor;
				}
				break;
			case 3:
				if (this.velocidade < 60) {
					this.velocidade += this.motor;
				}
				break;
			case 4:
				if (this.velocidade < 80) {
					this.velocidade += this.motor;
				}
				break;
			case 5:
				if (this.velocidade < 100) {
					this.velocidade += this.motor;
				}
				break;
			case 6:
				if (this.velocidade < 120) {
					this.velocidade += this.motor;
				}
				break;
			case 7:
				if (this.velocidade < 140) {
					this.velocidade += this.motor;
				}
				break;
			case 8:
				if (this.velocidade < 200) {
					this.velocidade += this.motor;
				}
				break;
			}

		}
		acelerar(tempo - 1);

	}

	@Override
	public void aumentarCambio() {
		if (estaLigado() && this.cambio < 8) {
			this.cambio++;
		} else {
			System.out.println("Você esta no limite de marcha");
		}

	}

	@Override
	public void diminuirCambio() {
		if (estaLigado() && this.cambio > -1) {
			this.cambio -= 1;
		} else {
			System.err.println("Você está na ré");
		}

	}

}
