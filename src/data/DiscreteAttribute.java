package data;

/**
 * Classe che estende la classe Attribute e rappresenta un attributo discreto (categorico).
 */
public class DiscreteAttribute extends Attribute {

    String [] values;

    /**
     * Costruttore che inizializza i valori di name, index e values.
     * @param name
     * @param index
     * @param values
     */
    public DiscreteAttribute(String name, int index, String[] values) {

        super(name, index);
        this.values = values;
    }

    /**
     * Metodo che restituisce la dimensione di value.
     * @return
     */

    int getNumberOfDistinctValues() {
        return values.length;
    }

    /**
     * Metodo che restituisce il valore nella posizione i.
     * @param i
     * @return
     */
    String getValue(int i){
        return values[i];
    }

}