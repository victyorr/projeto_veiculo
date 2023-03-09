package controle;

public abstract class veiculo {

	protected int motor;
	protected int freio;
	protected boolean ativacao;
	protected int cambio;

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	protected int velocidade;

	public veiculo(int motor, int freio, boolean ativacao, int cambio) {
		super();
		this.motor = motor;
		this.freio = freio;
		this.ativacao = false;
		this.cambio = 0;
		this.velocidade = 0;
	}

	public boolean estaLigado() {
		if (this.ativacao == true) {
			return true;
		} else {
			return false;
		}

	}

	public void ligar() {
		if (estaLigado()) {
			this.ativacao = true;
		} else {
			System.out.println("O carro já esta ligado");
		}
	}

	public void desligar() {
		if (estaLigado()) {
			this.ativacao = false;
		} else {
			System.out.println("O carro já esta desligado");
		}

	}

	public abstract void acelerar(int tempo);

	public void freiar(int tempo) {
		if (estaLigado() && tempo > 0 && this.velocidade > 0) {
			if (this.velocidade < this.freio) {
				this.velocidade = 0;
				return;
			}
			this.velocidade -= this.freio;
			freiar(tempo - 1);
		}

	}
	
	public void aumentarCambio(){
		cambio++;
		
		
	}

}
