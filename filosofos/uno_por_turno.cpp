#include<bits/stdc++.h>// libreria todo poderosa que tiene todas las librerias
using namespace std;
mutex mtx;

int come(int i) {  //simula como van comiendo
    while(1){// se repetira infinitamente 
    mtx.lock();// indica que un recurso se usara 
    i++; // para q no salga que 0 comio
    if (i>9){// simula la muerte por excederse en el tiempo
    	cout<<i<<" filosofo murio"<<endl; 
    	return 0;
	}
    cout<<i<<" filosofo comio"<<endl; 
   system("pause") ;// para que se pueda leer como van comiendo 
    mtx.unlock();}// indica que el recurso se termino  de usar
}
int main(){
    thread filo[9];
    for (int i=0; i<9; ++i){

    
        filo[i] = std::thread(come,i);
    for (auto& th : filo) th.join();// sin esto el progrma muere antes	
}	}
