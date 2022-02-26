package com.practice.turing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UBS {
    public static void main(String[] args) {
        System.out.println(new PriceCalculator().billing("AAAABBCC"));
    }
}

interface ItemsTotalWithOffer{
    double offerCalculation(int items);

}
class A implements ItemsTotalWithOffer{

    @Override
    public double offerCalculation(int items) {
        double total=0.0;
        int qutient=0;
        if(items >= 5 ){
            qutient= items / 5 ;
        }

        int remainder= items % 5;
        total= qutient * 200+ remainder * 50;
        return total;
    }
}
class B implements ItemsTotalWithOffer{

    @Override
    public double offerCalculation(int items) {
        return items * 65;
    }
}
class C implements ItemsTotalWithOffer{

    @Override
    public double offerCalculation(int items) {
        return items*150;
    }
}
class PriceCalculator{
    public Map<String, Integer> itemCounters(String input){
      return Arrays.stream(input.split("")).
             collect(Collectors.toMap(x->x,y->1, (p,q)-> p+q));
    }

    public double billing(String input){
        double totalBill=0.0;
        Map<String, Integer>items=itemCounters(input);
        for(Map.Entry<String,Integer> entry: items.entrySet()){
            totalBill=totalBill+amountCalculationWithOffer().get(entry.getKey()).offerCalculation(entry.getValue());
        }
        return totalBill;
    }

    Map<String, ItemsTotalWithOffer> amountCalculationWithOffer(){
    Map<String, ItemsTotalWithOffer> map=new HashMap<>();
        map.put("A", new A());
        map.put("B", new B());
        map.put("C", new C());
        return map;
    }



}
    enum UnitPrice{
        A(50), B(65),C(150);


        UnitPrice(int i) {
        }
    }