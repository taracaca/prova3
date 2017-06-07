
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
       
        PoligonalFechada poligonal = new PoligonalFechada(3);
        PontoXZ zero = new PontoXZ(-3,2);
        PontoXZ um = new PontoXZ(-3,6);
        PontoXZ dois = new PontoXZ(0,2);
        double comprimento;
        
        poligonal.set(0, zero);
        poligonal.set(1, um);
        poligonal.set(2, dois);

        comprimento = poligonal.getComprimento();
        
        System.out.println("Comprimento da poligonal = " + comprimento);
    }
    
}
