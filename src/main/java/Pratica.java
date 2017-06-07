
import utfpr.ct.dainf.pratica.PoligonalFechada;
import utfpr.ct.dainf.pratica.Ponto2D;
import utfpr.ct.dainf.pratica.PontoXZ;
import utfpr.ct.dainf.pratica.PontoYZ;
import utfpr.ct.dainf.pratica.PontoXY;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica {

    public static void main(String[] args) {
        PoligonalFechada pf = new PoligonalFechada();
        pf.set(0, new PontoXZ(3, -2));
        pf.set(1, new PontoXZ(-3, 6));
        pf.set(2, new PontoXZ(0, 2));
        System.out.println("Comprimento da poligonal = " + pf.getComprimento());
    }

}
