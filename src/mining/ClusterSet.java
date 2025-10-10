package mining;
import data.*;
import java.util.*;
public class ClusterSet {

    private Set C = new TreeSet();

    ClusterSet() {
        this.C = new TreeSet();//ricordarsi di controllare la dimensione del cluster
    }

    void add (Cluster c){
        Cluster tempC[] = new Cluster[C.size()+1];
        for(int i=0; i<C.size(); i++)
            tempC[i] =  C[i];
        tempC[C.size()]=c;
        C=tempC;
    }

    Cluster get(int i){
        return C[i];
    }
    //ricontrollare
    public String toString(){
        String str = "";
        for(int i=0; i<C.size(); i++)
             str+= get(i);
        return str;
    }

    public String toString(Data data){
        String str = "";
        for(int i=0; i<C.size(); i++){
            if(C[i]!=null){
                str+=i+": "+C[i].toString(data)+"\n";
            }
        }
        return str;
    }




}
