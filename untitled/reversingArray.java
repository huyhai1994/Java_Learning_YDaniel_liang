import java.util.Arrays;

public class reversingArray {


    public static int[] reverse(int[] list) {

        int [] result = new int[list.length];

        for (int i = 0, j = result.length-1; i < list.length; i++,j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6};
        int[] list2 = reverse(list1);
        System.out.println("Array before reversing is : ");
        System.out.println(Arrays.toString(list1));
        System.out.println("Array after reversing is : ");
        System.out.println(Arrays.toString(list2));
    }
}
