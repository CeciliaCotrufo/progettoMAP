package defaultpackage;

import data.*;
import mining.*;
import keyboardinput.*;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws EmptyDatasetException {
		
		//int numIter=0;
        double radius = 0.0;
        Data data = new Data();
        QTMiner qt = null;
		System.out.println(data);
        do{
            do{
                System.out.println("Insert radius (>0)= ");
                radius =Keyboard.readDouble() ;
                qt = new QTMiner(radius);
            }while(radius<=0);// aggiungere controllo se maggiore di 4

            try{
                int numIter=qt.compute(data);
                System.out.println("Number of clusters:"+numIter);
            }catch(ClusteringRadiusException e){
                System.out.println(e.getMessage());
            }


            System.out.println(qt.getC().toString(data));
            System.out.println("New execution?(y/n)");
        }while(Keyboard.readChar()=='y');


    }

}
/**
 * metodo che dice che cecilia è scema.
*/
/*
public cecilia getScema() {
    return scema;
}
*/