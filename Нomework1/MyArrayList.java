package Lesson9Нomework.Нomework1;

import java.util.Arrays;

public class MyArrayList {

        int [] array={1,2,3,4,5};
        int dateAdd=6;

    public void add(int values){
        values=array.length+values;
        int [] arrayCopy= Arrays.copyOf(array,values);
        arrayCopy[arrayCopy.length-1]=dateAdd;
        System.out.println("launch.add = "+Arrays.toString(arrayCopy));
    }
    public int[] remove(int index){
        int [] arrayCopy=new int[array.length-1];
        int number=0;
        if (index<0 || index>array.length-1) {
            return array;
        }
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    arrayCopy[number] = array[i];
                    number++;
                }
            }
        return arrayCopy;
    }
    public int[] clear(){
        int [] arrayCopy=new int[array.length];
        return arrayCopy;
    }
    public int size(){
     return array.length;
    }

    public int get(int index){

        if (index<0 || index>array.length-1) {
            return 0;
        }
        return array[index];
    }

    public static void main(String[] args) {
    MyArrayList launch=new MyArrayList();
    launch.add(1);
    System.out.println("launch.remove = " + Arrays.toString(launch.remove(12)));
    System.out.println("launch.clear = " + Arrays.toString(launch.clear()));
    System.out.println("launch.size = " + launch.size());
    System.out.println("launch.get = " + launch.get(1));
    }
}
