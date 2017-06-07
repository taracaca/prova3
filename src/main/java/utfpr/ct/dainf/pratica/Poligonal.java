package utfpr.ct.dainf.pratica;

import java.util.ArrayList;
import java.util.List;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <T> Tipo do ponto
 */
 
public class Poligonal {
    private Ponto2D[] vertices;
    private Ponto2D plano = null;
    
    public Poligonal(int v){
        if(v < 2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        vertices = new Ponto2D[v];
    }
    
    public int getN(){
    
    return vertices.length;
    }
    
    public Ponto2D get(int n){
    Ponto2D p = null;
        if(n >= 0 && n < vertices.length)
            p = vertices[n];
        else
            throw new RuntimeException("get(i) índice inválido");
    return p;
    }
    
    public void set(int n, Ponto2D p){
        if(plano == null){
            plano = p;
        }
        if(plano.getClass()!=p.getClass()){
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        }
        if(n >= 0 && n < vertices.length)
            vertices[n] = p;
        else
           throw new RuntimeException("get(i) índice inválido");
    }
    
    public double getComprimento(){
        double comprimento=0;
        int n;
        for(n=0; n<getN()-1; n++){
            comprimento = vertices[n].dist(vertices[n+1]) + comprimento;
        }
    return comprimento;
    }
    
}