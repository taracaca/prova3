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
    
    public PoligonalFechada(int vertices) {
        super(vertices);
    }
    
    @Override
    public double getComprimento() {
        int i;
        double comprimento = 0;
        
        for(i = 0; i < this.getN(); i++) {
            if(i == this.getN() - 1)
                comprimento = comprimento + this.get(this.getN() - 1).dist(this.get(0));
            else
                comprimento = comprimento + this.get(i).dist(this.get(i+1));
        }
        
        return comprimento;
    }
    
}