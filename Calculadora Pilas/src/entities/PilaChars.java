
package entities;

public class PilaChars
{
    int cima;
    char[] PilaVector;

    public PilaChars(int tam)
    {
        PilaVector = new char[tam];
        cima = -1;
    }

    public void poner(char dato)
    {
        cima = cima + 1;
        PilaVector[cima] = dato;
    }

    public char sacar()
    {
        char aux;
            
        aux = PilaVector[cima];
        cima = cima - 1;

        return aux;
    }
    public char verUltimo()
    {
        char aux;
        aux = PilaVector[cima];
        
        return aux;
    }
    public boolean estaVacio(){
        if (cima == -1){
            return true;
        }else{
            return false;
        }
        
    }
}
