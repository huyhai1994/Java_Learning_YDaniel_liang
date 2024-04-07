public class array_testing {
    public static void main(String[] args) {
        int [] a = {1,2};
        System.out.println("before invoking swap");
        System.out.println("Array is {"+a[0]+ ", "+ a[1] + "}");
        swap(a[0],a[1]);
        System.out.println("after invoking swap");
        System.out.println("array is {"+a[0]+ ", "+ a[1] + "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("Array is {"+a[0]+ ", "+ a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("after invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+ ", "+ a[1] + "}");
    }

    public static void swap(int a, int b) {
        /*The parameter in swap is primitive type
        * The values of a[0] and a[1] are passed to
        * a , b inside the method when invoking swap (a[0],a[1])
        * The memory locations for a , b are independent
        * of the ones for a[0] , a[1];
        * */
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swapFirstTwoInArray(int[] array){
        /*The parameter in the sawpFirstTwoInArray method is an array.
        * The reference of the array is passed to the method. thus the array and variables
        * a (outside the method ) and array(inside the method) both refer to the same
        * array in the same memory location.
        * */
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
