
public class main {

	public static void main(String[] args) {
		
		Piedra p1=new Piedra(100,5,3);
		Piedra p2=new Piedra(1000,25,5);
		Piedra p3=new Piedra(30,2,2);
		Piedra p4=new Piedra(40,45,1);
		
		Mochila conjunto=new Mochila(10000,100);
		
		conjunto.addPiedra(p1, 0);
		conjunto.addPiedra(p2, 1);
		conjunto.addPiedra(p3, 2);
		conjunto.addPiedra(p4, 3);
		
		Mochila mochila=new Mochila(50,100);
		
		mochila=LlenarMochila.Greedy(conjunto);
		
		for (int i = 0; i < mochila.getCantPiedrasAgregadas(); i++) {
			System.out.println(mochila.getPiedra(i).getPeso());
			System.out.println(mochila.getPiedra(i).getRelacion());
			System.out.println(mochila.getPiedra(i).getCantidad());
			System.out.println("--------------");
			
		}
		
		
	}

}
