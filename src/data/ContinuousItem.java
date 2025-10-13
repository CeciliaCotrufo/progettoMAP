package data;

import java.lang.Math;
public class ContinuousItem extends Item{

    ContinuousItem(Attribute attribute, Double value){
        super(attribute, value);
    }



    double distance (Object  a){

        Item item = (Item) a;

        ContinuousAttribute attributeItem = (ContinuousAttribute) item.getAttribute();
        double sv = attributeItem.getScaledValue((double) item.getValue());
        ContinuousAttribute attributeThis = (ContinuousAttribute) this.getAttribute();
        double dv = attributeThis.getScaledValue((double) this.getValue());
        if(dv == sv){
            return 0;
        }else{
            return Math.abs(dv - sv);
        }
    }

    /*
    double distance (Object a){
        Item item = (Item) a;
        if (this.getValue().equals(item.getValue())){
            return 0;
        }else{
            return 1;
        }
    }*/

}
