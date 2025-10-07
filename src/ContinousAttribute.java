public class ContinousAttribute extends Attribute{

    double max;
    double min;

    ContinousAttribute(String name, int index, double max, double min){

        super(name, index);

        this.max = max;
        this.min = min;
    }
    public double getMax(){return max;}
    public double getMin(){return min;}

    double getScaledValue(double v){
        double v1 =0.0;

        if(v>=getMin() && v<=getMax()){
            v1=(v-getMin())/(getMax()-getMin());
        }

        return v1;
    }





}
