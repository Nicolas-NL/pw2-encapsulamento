
public class Bomba {
	private int pressaoDesejada;
	public int getPressaoDesejada() {
		return pressaoDesejada;
	}
	public void setPressaoDesejada(int pressaoDesejada) {
		this.pressaoDesejada = pressaoDesejada;
	}
	public int getPressaoLida() {
		return pressaoLida;
	}
	public void setPressaoLida(int pressaoLida) {
		this.pressaoLida = pressaoLida;
	}
	private int pressaoLida;
		
    public int obterResultado(){
    	int result;
    	result = pressaoDesejada - pressaoLida;
    	return result;
    }

}
    