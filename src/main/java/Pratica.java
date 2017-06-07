
import utfpr.ct.dainf.pratica.PoligonalFechada;
import utfpr.ct.dainf.pratica.Ponto2D;
import utfpr.ct.dainf.pratica.PontoXZ;
import utfpr.ct.dainf.pratica.PontoYZ;
import utfpr.ct.dainf.pratica.PontoXY;




/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica {

    public static void main(String[] args) {
        PoligonalFechada p = new PoligonalFechada(3);
        PontoXZ p1 = new PontoXZ(-3,2);
        PontoXZ p2 = new PontoXZ(-3,6);
        PontoXZ p3 = new PontoXZ(0,2);
        p.set(0, (Ponto2D)p1);
        p.set(1, (Ponto2D)p2);
        p.set(2, (Ponto2D)p3);
        
        System.out.println("Comprimento da Poligonal = " + p.getComprimento());
    }
    
}
