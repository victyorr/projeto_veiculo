package controle;

public class carro extends veiculo {

	private boolean freioDeMao;
	private int cambio;

	public carro(int motor, int freio, boolean ativacao, int cambio) {
		super(motor, freio, ativacao, cambio);
		this.cambio = 0;
	}

	public void freioDeMaoAtivado() {
		this.freioDeMao = true;
		this.velocidade = 0;
	}

	public void freioDeMaoDesativado() {
		this.freioDeMao = true;
		this.velocidade = 0;
	}

	public boolean freiodeMao() {
		if (this.freioDeMao == true) {
			return true;
		}
		return false;

	}

	public void re(int tempo) {
		if (estaLigado() && tempo > 0 && !freiodeMao()) {
			this.velocidade -= this.motor;
			re(tempo - 1);

		}

	}

	@Override
	public void acelerar(int tempo) {
		if (estaLigado() && !freioDeMao && cambio > 0) {
			switch (this.cambio) {
			case 1:
				if (this.velocidade < 30) {
					this.velocidade += this.motor *2;
				}
				break;
			case 2:
				if (this.velocidade < 60) {
					this.velocidade += this.motor * 2;
				}
				break;
			case 3:
				if (this.velocidade < 90) {
					this.velocidade += this.motor * 2;
				}
				break;
			case 4:
				if (this.velocidade < 120) {
					this.velocidade += this.motor * 2;
				}
				break;
			case 5:
				if (this.velocidade < 150) {
					this.velocidade += this.motor * 2;
				}
				break;
			case 6:
				if (this.velocidade < 180) {
					this.velocidade += this.motor * 2;
				}
				break;
			case 7:
				if (this.velocidade < 240) {
					this.velocidade += this.motor * 2;
				}
				break;
			}

		}
		acelerar(tempo - 1);

	}

	public void aumentarCambio() {
		if (estaLigado() && this.cambio < 5) {
			this.cambio++;
		} else {
			System.out.println("Você esta no limite da marcha");
		}
	}

	public void diminuirCambio() {
		if (estaLigado() && this.cambio > -1) {
			this.cambio--;

		} else {
			System.out.println("Voce esta no minimo da marcha");
		}

	}
}
