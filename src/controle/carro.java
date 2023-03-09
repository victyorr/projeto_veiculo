package controle;

public class carro extends veiculo {

	private boolean freioDeMao;
	
	public carro(int motor, int freio, boolean ativacao, int cambio) {
		super(motor, freio, ativacao, cambio);
		// TODO Auto-generated constructor stub
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
		if(this.freioDeMao == true) {
			return true;
		} return false;
		
	
	}
	
	public void re(int tempo) {
		if(estaLigado() && tempo > 0 && !freiodeMao()) {
			this.velocidade -= this.motor;
			re(tempo -1);
			
			
		}
		
		
	}

	@Override
	public void acelerar(int tempo) {
		if(estaLigado() && !freioDeMao) {
			this.velocidade += this.motor * 2;
		}
	}

}
