
package entities;

public class PilaNums
{
    int cima;
    double[] PilaVector;

    public PilaNums(int tam)
    {
        PilaVector = new double[tam];
        cima = -1;
    }

    public void poner(double dato)
    {
        cima = cima + 1;
        PilaVector[cima] = dato;
    }

    public double sacar()
    {
        double aux;
            
        aux = PilaVector[cima];
        cima = cima - 1;

        return aux;
    }
}
