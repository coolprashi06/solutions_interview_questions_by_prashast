package prashastsaxena;

public class MoveZerosToEnd {

    public int[] moveZeroesToEnd(int[] arr){

        int k = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }

        while (k<arr.length){
            arr[k++] = 0;
        }
        return arr;
    }
}
