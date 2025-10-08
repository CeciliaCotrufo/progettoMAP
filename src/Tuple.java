public class Tuple extends Item {

    Item[] tuple;

    Tuple(int size, Attribute attribute, String value) { //vedi bene dopo che se qualcosa va tolto
        super(attribute, value);
        tuple = new Item[size];
    }


    int getLenght() {
        return tuple.length;
    }

    Item get(int i) {
        return tuple[i];
    }

    void add(int i, Item c) {
        tuple[i] = c;
    }

    double distance(Object a) {
        if (this.getValue().equals(a)) {
            return 0;
        } else {
            return 1;
        }
    }

    double getDistance(Tuple obj) {
        double sum = 0.0;
        for (int i = 0; i < obj.getLenght(); i++) {
            //if(this.getValue().equals(obj.get(i))){}
            sum = sum + this.distance(obj);
        }
        return sum;
    }

    double avgDistance(Data data, int clusteredData[]) {
        double p = 0.0, sumD = 0.0;
        for (int i = 0; i<clusteredData.length; i++) {
            double d = getDistance(data.getItemSet(clusteredData[i]));
            sumD += d;
        }
        p = sumD / clusteredData.length;
        return p;
    }



}

