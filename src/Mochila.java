
public class Mochila {
	private Piedra piedras[];
	private int pesoLimite;
	private int cantPiedras;
	
	public Mochila(int peso, int large){
		piedras=new Piedra[large];
		pesoLimite =peso;
		cantPiedras=0;
		
	}
		
	public int getPesoLimite(){
		return pesoLimite;
	}
		
	public void addPiedra(Piedra p, int pos){
		piedras[pos]=p;
		cantPiedras++;
		
	}
	
	public int getCantPiedrasAgregadas(){
		return cantPiedras;
	}
	
	public int getSizePiedras(){
		return piedras.length;
	}
	
	
	public Piedra getPiedra(int i){
		return piedras[i];
	}
	
		
	public void setValor(int i, Piedra p){
		piedras[i]=p;
	}
	
	
		
}
