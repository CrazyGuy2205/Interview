package Interview;

public class Kadens {

    public static void main(String[] args) {
        int arr[]= { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max_value =0, max_here = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            max_value = max_value + arr[i];
            if(max_here < max_value){
                max_here = max_value;
            }
            if(max_value < 0){
                max_value =0;
            }
        }

        System.out.println(max_here);
    }
}
