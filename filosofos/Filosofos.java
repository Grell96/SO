package cenaFilosofos;
import java.util.Random;

public class Filosofos extends Thread{ 
	  public Thread hilo;  
	  public Cena cena;  
	  public int tizq, tder;  
	  public int numero;  

	  public int comida;
	  
	public Filosofos (int x, Cena cena,int _comida){  
	      this.numero= x;  
	      this.cena= cena;  
	      tizq= cena.getTenedorIzq(numero);  
	      tder= cena.getTenedorDer(numero);  

	      this.comida=_comida;
	   }  
	public void pensar(){  
	     try{  
	        System.out.println ("Filosofo "+numero+" pensando");  
	        int espera = (int)(Math.random()*1000);  
	        hilo.sleep(espera);  
	        System.out.println ("Filosofo "+numero+" tiene hambre");  
	     }catch(InterruptedException e){  
	 e.printStackTrace();  
	     }  
	}  
	
	public void Termino(){  
	    
	        System.out.println ("Filosofo "+numero+" Termino de comer");  
	        int espera = (int)(Math.random()*1000);  
	        hilo.stop();
	    }  
	
	
	
	public void tomarTenedores(){  
	     System.out.println ("Tomando tenedores");  
	     Tenedor t1= cena.getTenedor(tizq);  
	     Tenedor t2= cena.getTenedor(tder);  
	     t1.usar();  
	     t2.usar();  
	}  
	public void comer(){  
	     try{  
	        System.out.println("Filosofo "+numero+" esta comiendo");  
	        comida=comida-25;
	        System.out.println("El Filosofo: "+ numero + " Comida es = " + comida);  
	        int espera= (int)(Math.random()*700); 
	     
	        hilo.sleep(espera);  
	        System.out.println("Filosofo "+numero+" esta satisfecho");  
	     }catch(InterruptedException e){  
	  e.printStackTrace();  
	     } 
	}  
	protected void dejarTenedores(){  
	     System.out.println("Soltando los tenedores.");  
	     Tenedor t1= cena.getTenedor(tizq);  
	     Tenedor t2= cena.getTenedor(tder);  
	     t1.dejar();  
	     t2.dejar();  
	}  
	public void run(){  
	      while(true){  
	         pensar();  
	         tomarTenedores();  
	         comer();  
	         dejarTenedores();  
	         if(this.comida <=0) {
	        	 Termino();
	         }
	      }  
	}  
	}  
