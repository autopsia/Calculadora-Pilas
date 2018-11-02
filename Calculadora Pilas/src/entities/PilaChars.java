
package entities;

public class PilaChars
{
    int cima;
    String[] PilaVector;

    public PilaChars(int tam)
    {
        PilaVector = new String[tam];
        cima = -1;
    }

    public void poner(String dato)
    {
        cima = cima + 1;
        PilaVector[cima] = dato;
    }

    public String sacar()
    {
        String aux;
            
        aux = PilaVector[cima];
        cima = cima - 1;

        return aux;
    }
}
