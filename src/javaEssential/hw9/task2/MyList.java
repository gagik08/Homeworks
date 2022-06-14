package javaEssential.hw9.task2;

import java.util.Arrays;

public class MyList <E>{
    private E[] values;
    private int arrayCapacity = 0;

    public MyList (){
        values = (E[])new Object[1];
    }

    public MyList (int count){
        values = (E[]) new Object[count] ;
    }

    public void add(E newElement){
        capacityExtension();
        values[arrayCapacity++] = newElement;
    }

    public E get(int index){
        if (index > arrayCapacity - 1 || index < 0){
            throw new RuntimeException("Element not found");
        }
        return values[index];
    }
    private void capacityExtension(){
        if (arrayCapacity == values.length){
            values = Arrays.copyOf(values,arrayCapacity+1);
        }
    }

    @Override
    public String toString() {
        if(values[0] == null){
            return "[]";
        }
        return "MyList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
