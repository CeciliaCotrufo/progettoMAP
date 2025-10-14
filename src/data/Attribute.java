package data;

import java.io.Serializable;

/**
 * Modella l'entità dell'attributo.
 */
abstract class Attribute implements Serializable {

    private String name; //nome simbolico dell'attributo
    private int index; //identificativo numerico dell'attributo

    /**
     * Costruttore che inizializza i valori dei membri name e index.
     * @param name
     * @param index
     */
    Attribute(String name, int index){
        this.name = name;
        this.index = index;
    }

    /**
     * Metodo che restituisce name.
     * @return
     */
    String getName(){
        return name;
    }

    /**
     * Metodo che restituisce index.
     * @return
     */
    int getIndex(){
        return index;
    }

    /**
     * Metodo che restituisce la stringa name rappresentante lo stato dell'oggetto.
      * @return
     */
    public String toString(){
        return name;
    }

}
