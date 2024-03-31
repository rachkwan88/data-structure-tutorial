
package com.example;

public class Tutorial {
    public void basic1(){
        //void is the type that the function returns
        //test1 is the function name
    }

    public void primitive1(){
        // assigning an integer variable to a primitive type of int
        int x = 1;
        System.out.println(x);

    }

    public void objectInteger1(){
        // assigning an integer variable to a primitive type of int
        Integer y = new Integer(1);
        //every object have functions; for integer, int values will give us the integer value of the integer object
        int z = y.intValue();
        System.out.println(z);
    }

    public void objectBoolean1(){
        // assigning an integer variable to a primitive type of int
        Boolean y = new Boolean(true);
        boolean z = y.booleanValue();
        System.out.println(z);
    }

    public void createBooleanObjects(int num){
        Boolean[] array = new Boolean[num];
        for (int i =0;i<array.length; i++){
            array[i] =  Boolean.valueOf(true);
        }
        for (int j =0; j<array.length;j++){
            System.out.print(array[j]);
        }
    }

}
