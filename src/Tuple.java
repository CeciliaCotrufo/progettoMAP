public class Tuple {
    Item [] tuple;
    Tuple (int size){
        tuple = new Item[size];
    }
    int getLenght(){
        return tuple.length;
    }
    Item get(int i){
        return tuple[i];
    }
    void add(int i,Item c){
        tuple[i] = c;
    }
    double getDistance(Tuple obj){

    }

}
