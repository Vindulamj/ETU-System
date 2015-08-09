/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalComponents;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author padmni
 */
public class Searchable<E, V> {

    private ArrayList<String> terms = new ArrayList<String>();

    /**
     *
     * Constructs a new object based upon the parameter terms.      *
     * @param terms The inventory of terms to search.
     *
     */
    public Searchable(ArrayList<String> terms) {

        this.terms.addAll(terms);

    }

    public Collection<String> search(String value) {

        ArrayList<String> founds = new ArrayList<String>();

        for (String s : terms) {

            if (s.toLowerCase().indexOf(value.toLowerCase()) == 0) {

                founds.add(s);

            }

        }

        return founds;

    }

}
