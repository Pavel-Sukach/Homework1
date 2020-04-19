package Hometask_2;

public class Task5 {
    public static void main(String[] args) {
        task5();
    }
    public static void task5(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for(int j = 0; j < array.length; j++){
            for(int k = 0; k < array.length - 1; k++){
                if(array[k] > array[k + 1]){
                    int temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                }
            }
        }
        for(int l = 0; l < array.length; l++){
            System.out.print(array[l]);
        }
    }
}
