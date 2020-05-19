package cenaFilosofos;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
	
	public static Queue<Filosofos> queue;
	
	public static void main(String[] args) {
		
		queue = new LinkedList<Filosofos>();
		
		 System.out.println("Cena de los Filosofos");  
		 int comida=200;
		 Cena cena = new Cena();  
		 for(int i=0; i<5; i++){  
			 Filosofos pensante = new Filosofos(i, cena,comida); 
			 queue.add(pensante);
		 } 
		 
		 while( !queue.isEmpty() ) {
	            if( !queue.element().isAlive() ) {
	            	queue.element().start();
	            	queue.remove();
	            }
		}
		 
	}

}
