
public class LlenarMochila {	
	
	public  static Mochila Greedy(Mochila conjunto){
		
		BurbujeoConjunto(conjunto);
		
		Mochila resultado=new Mochila(conjunto.getPesoLimite(),conjunto.getCantPiedrasAgregadas());
		
		
		resultado=CopiarYresetearConjunto(conjunto);
				
		int pesoParcial=0;
		int indice=0;
		
		while(pesoParcial<conjunto.getPesoLimite()&&indice<conjunto.getCantPiedrasAgregadas()){
			
			if(conjunto.getPiedra(indice).getPeso()<=(conjunto.getPesoLimite()-pesoParcial)){
				resultado.getPiedra(indice).sumarPiedra();
				pesoParcial+=resultado.getPiedra(indice).getPeso();				
			}
			else
			{indice++;
				
			}
			
		}
		return resultado;
		
	}
	
	static Mochila CopiarYresetearConjunto(Mochila m){
		
		Mochila r=new Mochila(m.getPesoLimite(),m.getSizePiedras());
		
		for (int k = 0; k < m.getCantPiedrasAgregadas(); k++) {
			r.addPiedra(m.getPiedra(k), k);			
		}
		
		for (int k = 0; k < r.getCantPiedrasAgregadas(); k++) {//reseteo la cantidad;
			r.getPiedra(k).resetCantidad();			
		}
		return r;
	}
	
	static void BurbujeoConjunto(Mochila conjunto){
		
		double beneficio1,beneficio2;
		Piedra pAux=new Piedra();
		for (int i = 0; i < conjunto.getCantPiedrasAgregadas(); i++) {
			for (int j = i+1; j <conjunto.getCantPiedrasAgregadas(); j++) {
				beneficio1=conjunto.getPiedra(i).getRelacion();
				beneficio2=conjunto.getPiedra(j).getRelacion();
				if(beneficio1<=beneficio2){
					pAux=conjunto.getPiedra(j);
					conjunto.setValor(j, conjunto.getPiedra(i));
					conjunto.setValor(i, pAux);
				}				
			}			
		}
		
	}
	

}
