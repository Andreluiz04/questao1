class Palavra extends Conteudo implements Rotaciona{
		private String st;
		private boolean N;
		private boolean I;
		private boolean S;
		private int RotacaoAngulo;
		
		public Palavra(String st){
			this.setFrase(st);
			this.setNegrito(false);
			this.setItalico(false);
			this.setSublinhado(false);
		}
		public void setFrase(String s){
			this.st = s;
		}
		public 	String getFrase(){
			return this.st;
		}
		public boolean getNegrito(){
			return this.N;
		}
		public void setNegrito(boolean n){
			this.N = n;
		}
		public boolean getItalico(){
			return this.I;
		}
		public void setItalico(boolean i){
			this.I = i;
		}
		public boolean getSublinhado(){
			return this.S;
		}
		public void setSublinhado(boolean s){
			this.S = s;
		}
		public int getRotacaoAngulo(){
			return this.RotacaoAngulo;
	}
	public void setRotacaoAngulo(int r){
		this.RotacaoAngulo = r;
	}
}
