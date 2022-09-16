//Given two sorted arrays, the task is to merge them in a sorted manner.
//Examples:
//Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
//Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
//Output: arr3[] = {4, 5, 7, 8, 8, 9}
//

public class MergeTwoSortedArrays {
    public static int[] mergesort(int[] arr1, int[] arr2){ //passing the 2 arguments
        int len1 = arr1.length;  // length of arr1
        int len2 = arr2.length;  // length of arr2

        int[] result = new int[len1 + len2];   //arr3/result array is created with length of arr1+arr2
        //declaring 3 variables and initializing to 0
        int i=0;   //i represent arr1
        int j=0;   //j represent arr2
        int k=0;   //k represent arr3/result

        while(i< len1 && j< len2){           //current index value is less than Len(arr)
            if (arr1[i]<arr2[j]){              //arr1 value is less than arr2 value
                result[k++] = arr1[i++];       //result array = value of arr1 in current index; increment arr1 index and result arr index
            }
            else{
                result[k++] = arr2[j++];
            }
        }
        while(i<len1){
            result[k++] = arr1[i++];
        }
        while(j<len2){
            result[k++] = arr2[j++];
        }

        return result;
    }
    public static void main(String[] args){
        int [] arr1 = {1,4,7,9};
        int [] arr2 = {3,4,5,6,8};
        int [] result = mergesort(arr1,arr2);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
