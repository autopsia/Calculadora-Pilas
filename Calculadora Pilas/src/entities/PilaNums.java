
package entities;
import java.math.BigDecimal;

public class PilaNums
{
    int cima;
    BigDecimal[] PilaVector;

    public PilaNums(int tam)
    {
        PilaVector = new BigDecimal[tam];
        cima = -1;
    }

    public void poner(BigDecimal dato)
    {
        cima = cima + 1;
        PilaVector[cima] = dato;
    }

    public BigDecimal sacar()
    {
        BigDecimal aux;
            
        aux = PilaVector[cima];
        cima = cima - 1;

        return aux;
    }
}
