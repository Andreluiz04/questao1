class Figura extends Conteudo implements Redimenciona, Rotaciona{
	private int Altura;
	private int Largura;
	private int RotacaoAngulo;
	
	public Figura(int A, int L){
		this.setRedimenciona(A,L);
		this.setRotacaoAngulo(0);
	}	
	public int getAltura(){
		return this.Altura;
	}
	public void setAltura(int a){
		this.Altura = a;
	}
	public int getLargura(){
		return this.Largura;
	}
	public void setLargura(int l){
		this.Largura = l;
	}
	public int getRotacaoAngulo(){
		return this.RotacaoAngulo;
	}
	public void setRotacaoAngulo(int r){
		this.RotacaoAngulo = r;
	}
	public void setRedimenciona(int a, int l){
		this.setAltura(a);
		this.setLargura(l);
	}
}
