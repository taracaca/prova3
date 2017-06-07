package utfpr.ct.dainf.pratica;

import java.util.ArrayList;
import java.util.List;
import utfpr.ct.dainf.pratica.Ponto2D;
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <T> Tipo do ponto
 */
public class Poligonal {
    private Ponto2D[] vertices;
    
    public Poligonal(int vertices) {
        
        if(vertices < 2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        
        this.vertices = new Ponto2D[vertices];
        
        for(int i = 0; i < vertices; i++)
            this.vertices[i] = new Ponto2D() {};
        
    }
    
    public int getN() {
        return vertices.length;
    }
    
    public Ponto2D get(int posicao) {
        if(posicao < 0 || posicao >= vertices.length)
            return null;
        return vertices[posicao];
    }
    
    public void set(int posicao, Ponto2D ponto) {
        Ponto2D primeiro = new Ponto2D() {};
        int i, achou = 0;
        
        
        for(i = 0; i < this.vertices.length; i++) {
            if(this.vertices[i].getX() != 0 || this.vertices[i].getY() != 0 ||
                    this.vertices[i].getZ() != 0) {
                primeiro = this.vertices[i];
                achou = 1;
            }
            if(achou == 1)
                break;
        }
        
        
        
        if(achou == 1){
            if(posicao > 0 && posicao < vertices.length) {
                if(primeiro.getX() == 0) {
                    if(ponto.getX() != 0)
                        throw new RuntimeException("Vértices devem estar no mesmo plano");
                }
                else if(primeiro.getY() == 0) {
                    if(ponto.getY() != 0)
                        throw new RuntimeException("Vértices devem estar no mesmo plano");
                }
                else if(primeiro.getY() == 0) {
                    if(ponto.getY() != 0)
                        throw new RuntimeException("Vértices devem estar no mesmo plano");
                }
            }
        } 
        if(posicao > 0 && posicao < vertices.length)
            vertices[posicao] = ponto;
    }
    
    public double getComprimento() {
        int i;
        double comprimento = 0;
        
        for(i = 0; i < vertices.length -1; i++)
            comprimento = comprimento + this.get(i).dist(this.get(i+1));

        return comprimento;
    }
    
}