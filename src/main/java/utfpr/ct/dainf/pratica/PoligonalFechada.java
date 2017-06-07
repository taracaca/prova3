/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

import java.util.Iterator;

/**
 *
 * @author Ayrton
 */
public class PoligonalFechada<T extends Ponto2D> extends Poligonal {
   @Override
    public double getComprimento()
    {
        Iterator<T> it = vertices.iterator();
        double d, s = 0;
        T p, q = it.next();
        while(it.hasNext())
        {
            p = q;
            q = it.next();
            d = Math.sqrt(Math.pow(p.getX()-q.getX(), 2)+Math.pow(p.getY()-q.getY(), 2)+Math.pow(p.getZ()-q.getZ(), 2));
            s += d;
        }
        it = vertices.iterator();
        p = it.next();
        d = Math.sqrt(Math.pow(p.getX()-q.getX(), 2)+Math.pow(p.getY()-q.getY(), 2)+Math.pow(p.getZ()-q.getZ(), 2));
        s += d;
        return s;
    }
}