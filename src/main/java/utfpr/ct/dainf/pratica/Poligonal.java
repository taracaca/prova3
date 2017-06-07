package utfpr.ct.dainf.pratica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <T> Tipo do ponto
 */

public class Poligonal<T extends Ponto2D> {

    final List<T> vertices = new ArrayList<>();
    int j;

    /**
     *
     * @return
     */
    public int getN() {

        return vertices.size();
    }

    /**
     *
     * @param i
     * @return
     */
    public T get(int i) {
        if (i > vertices.size() || i < 0) {
            throw new RuntimeException("get(" + i + "): indice invalido");
        }
        return vertices.get(i);
    }

    /**
     *
     * @param i
     * @param p
     */
    public void set(int i, T p) {
        if (i < 0 || i > vertices.size()) {
            throw new RuntimeException("set(" + i + "): indice invalido");
        } else if (vertices.size() == i) {
            vertices.add(p);
        } else {
            vertices.set(i, p);
        }

    }

    public double getComprimento() {
        Iterator<T> it = vertices.iterator();
        double d, s = 0;
        T p, q = it.next();
        while (it.hasNext()) {
            p = q;
            q = it.next();
            d = Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2));
            s += d;
        }
        return s;

    }

}
