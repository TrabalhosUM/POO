
/**
 * Escreva a descrição da classe TesteContribuinteInd aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
import java.util.List;

public class TesteContribuinteInd
{
    public static void Teste() {
        ContribuinteInd i1 = new ContribuinteInd();
        List<String> nifAgreg = new ArrayList<>();
        nifAgreg.add("111111111");
        nifAgreg.add("222222222");
        i1.setNifAgreg(nifAgreg);
        System.out.println(i1.toString());
    }
}
