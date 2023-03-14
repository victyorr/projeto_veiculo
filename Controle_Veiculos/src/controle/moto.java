package controle;
	
public class moto extends veiculo {

	private int cambio;
	
	public moto(int motor, int freio, boolean ativacao) {
		super(motor, freio, ativacao, freio);
		this.cambio = 0;
	}

	@Override
	public void acelerar(int tempo) {
		if (estaLigado() && cambio > 0) {
			switch (this.cambio) {
			case 1:
				if (this.velocidade < 40) {
					this.velocidade += this.motor *3;
				}
				break;
			case 2:
				if (this.velocidade < 80) {
					this.velocidade += this.motor * 3;
				}
				break;
			case 3:
				if (this.velocidade < 120) {
					this.velocidade += this.motor * 3;
				}
				break;
			case 4:
				if (this.velocidade < 160) {
					this.velocidade += this.motor * 3;
				}
				break;
			case 5:
				if (this.velocidade < 200) {
					this.velocidade += this.motor * 3;
				}
				break;
			case 6:
				if (this.velocidade < 250) {
					this.velocidade += this.motor * 3;
				} break;
			}

		}
		acelerar(tempo - 1);

	}

	@Override
	public void aumentarCambio() {
		if (estaLigado() && this.cambio < 6) {
			this.cambio++;
		} else {
			System.out.println("Você esta no limite da marcha");
		}
	}

	public void diminuirCambio() {
		if (estaLigado() && this.cambio > 0) {
			this.cambio--;

		} else {
			System.out.println("Voce esta no minimo da marcha");
		}

	}

}
