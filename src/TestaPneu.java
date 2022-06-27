
public class TestaPneu {
	public static void main(String[] args) {
		Bomba bom = new Bomba();
			bom.setPressaoDesejada(27);
			bom.setPressaoLida(30);
			
			bom.obterResultado();
			
	System.out.println(bom.obterResultado());		
	}
  
}

