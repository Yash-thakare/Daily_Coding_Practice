
class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
    int largest = arr[0];
    int secondlargest =arr[0];
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]>secondlargest){
            secondlargest = largest;
            largest =arr[i];
        }
        else if(arr[i]>largest){
            secondlargest =arr[i];
        }
    }
    System.out.println(secondlargest);
    
    }
}