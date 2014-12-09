class Video extends Conteudo implements Redimenciona{
	private int Largura;
	private int Altura;
	
	public Video(int Largura, int Altura){
		this.setRedimenciona(Largura, Altura);
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
	public void setRedimenciona(int l, int a){
		this.setLargura(l);
		this.setAltura(a);
	}
}
