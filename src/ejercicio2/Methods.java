package ejercicio2;

import java.lang.reflect.Array;

public class Methods {


    public int[] subArray10(int[] array, int index){
        int[] nuevoSubArray = new int[10];
        if (index == 1){
            for (int i = 0; i < 10 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 2){
            for (int i = 10; i <21 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 3){
            for (int i = 21; i < 32 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        } else if (index == 4){
            for (int i = 32; i < 43 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 5){
            for (int i = 43; i < 54 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 6){
            for (int i = 54; i < 65 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 7){
            for (int i = 65; i < 76 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        } else if (index == 8){
            for (int i = 76; i < 87 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 9){
            for (int i = 87; i < 98 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }else if (index == 10){
            for (int i = 98; i < 101 ; i++) {
                nuevoSubArray[i] = array[i];
            }
        }
        return nuevoSubArray;


    }



















}
