package defaultpackage;

import data.*;
import mining.*;
import keyboardinput.*;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Data data =new Data();
		System.out.println(data);
        char answer='y';
        do{
            System.out.println("Insert radius (>0)= ");
            QTMiner qt=new QTMiner(Keyboard.readDouble());
            int numIter=qt.compute(data);
            System.out.println("Number of clusters:"+numIter);
            System.out.println(qt.getC().toString(data));
            System.out.println("New execution?(y/n)");
            answer=Keyboard.readChar();
        }while(answer=='y');


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