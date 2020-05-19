package cenaFilosofos;

public class Cena{  
	 Tenedor tenedores[];     
	 public Cena(){  
		 tenedores = new Tenedor[5];  
		 for(int i=0; i<5; i++){  
		  tenedores[i] = new Tenedor(i);  
		 }  
	}  
	public Tenedor getTenedor(int x){  
	 return tenedores[x];  
	 }  
	public int getTenedorDer(int x){  
	 return (x+1)%5;  
	 }  
	public int getTenedorIzq(int x){  
	 return x;  
	 }  
	} 
