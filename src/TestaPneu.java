
public class TestaPneu {
	public static void main(String[] args) {
		Bomba bom = new Bomba();
			bom.setPressaoDesejada(30);
			bom.setPressaoLida(18);
			
			bom.obterResultado();
			
	System.out.println(bom.obterResultado());		
	}
  
}

