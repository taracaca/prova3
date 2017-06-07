/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author Ayrton
 */
public class PoligonalFechada extends Poligonal {
    
    public PoligonalFechada(int v){
        super(v);
    }
    
    @Override
    public double getComprimento(){
        int tam = getN();
        double comprimento1 = super.getComprimento();
        double comprimento2 = get(tam-1).dist(get(0));
        
    return comprimento1+comprimento2;
    }
}