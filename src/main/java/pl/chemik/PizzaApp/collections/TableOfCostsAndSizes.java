package pl.chemik.PizzaApp.collections;

import java.util.*;

public class TableOfCostsAndSizes {

    private Map<Integer, Float> tableOfCostsAndSizes;

    public TableOfCostsAndSizes(Map<Integer, Float> tableOfCostsAndSizes) {
        this.tableOfCostsAndSizes = tableOfCostsAndSizes;
    }

    public Float get(Integer integer){
        return this.tableOfCostsAndSizes.get(integer);
    }

    public void put(Integer size, Float cost){
        tableOfCostsAndSizes.put(size,cost);
    }

    public float remove(Integer size){
        return tableOfCostsAndSizes.remove(size);
    }

    public Set<Integer> keySet(){
        return tableOfCostsAndSizes.keySet();
    }

    public String toString(){
        String name = "";
        StringBuffer stringBuffer = new StringBuffer(name);
        List<Integer> keys = new ArrayList<>(tableOfCostsAndSizes.keySet());
        Collections.sort(keys);
        for (int i : keys){
            stringBuffer.append(i);
            stringBuffer.append("cm = ");
            stringBuffer.append(tableOfCostsAndSizes.get(i));
            stringBuffer.append("zł | ");
        }
        tableOfCostsAndSizes.forEach((integer, aFloat) -> {

        });
        return stringBuffer.toString();
    }


}
