package AdvancedDataStructureInJava;

public class FindDuplicateArrays {
    public static void main(String args[]){
        int arr[]=new int []{1,2,3,4,5,6,7,3,2};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
