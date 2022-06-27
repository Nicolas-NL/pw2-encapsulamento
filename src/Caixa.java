
public class Caixa {
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	public int altura;
	public int largura;
	public int profundidade;
    public String cabeDentro(int diametro) {
       if(diametro <= largura && diametro <= altura && diametro <= profundidade) {
    	   return "Cabe";
       }
       else
       {
	     return "Não Cabe";
       }
   }
}
