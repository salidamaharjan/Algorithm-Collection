import java.util.Arrays;

public class A007ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] listOfProduct = new int[nums.length];
        int prefix = 1;
        int suffix  = 1;

        for(int i = 0; i < nums.length; i++){
            listOfProduct[i] = prefix;
            prefix *= nums[i];
        }
        for(int i = nums.length-1; i >=0 ; i--){
            listOfProduct[i] *= suffix;
            suffix *= nums[i];
        }
        return listOfProduct;
    }

    public static void main(String[] args) {
        int[] list1 = {1,2,3,4};
        int[] list2 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(list1)));
        System.out.println(Arrays.toString(productExceptSelf(list2)));
    }
}
