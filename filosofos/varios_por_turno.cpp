#include<bits/stdc++.h>// libreria todo poderosa que tiene todas las librerias
using namespace std;
mutex mtx;
int ficha=0;
void come(int  x, int a[]) { 
    int count=0;
    while(true){  
        mtx.lock();
        for(int i=0;i<x/2;i++){  // simula las personas q tienen la ficha y que podrian comer
        cout<< a[i] <<" filosofo comio"<<endl;
        system("pause") ;
		a[i]++;
        if(a[i]>x) a[i]=1;// para cambiar el turno de las personas
        ; }
        mtx.unlock();}
}
int main(){
   
    thread filo[10];
    int a[10];
    a[0]=1;
    for(int i=1; i<10;i++){
        a[i]=a[i-1]+2;
    }
    for (int i=0; i< 2 ; ++i)
        filo[i] = thread(come,10,a );

    for (auto& th : filo) th.join();
}
