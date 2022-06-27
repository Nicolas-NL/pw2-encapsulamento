public class TestaCaixa {
	public static void main(String[] args) {
		int diametro;
		Caixa cai = new Caixa();
		diametro = 9;
		cai.setAltura(15);
		cai.setLargura(9);
		cai.setProfundidade(10);
		
		
		System.out.println(cai.cabeDentro(diametro));
	}

}
