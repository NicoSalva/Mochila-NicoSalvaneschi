
public class Piedra {
	private int pi;
	private int vi;
	private int ci;
	
	public Piedra(int p, int v, int c){
		pi=p;
		vi=v;
		ci=c;
	}
	
	public Piedra(){
		pi=0;
		vi=0;
		ci=0;
	}
	
	public int getPeso(){
		return pi;
	}
	
	public int getValor(){
		return vi;
	}
	
	public int getCantidad(){
		return ci;
	}
	
	public double getRelacion(){
		return vi/(pi*1.0);
	}
	
	public void restarPiedra(){
		ci--;
	}
	
	public void sumarPiedra(){
		ci++;
	}
	
	public void resetCantidad(){
		ci=0;		
	}

}
