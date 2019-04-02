public class quicksort {
    public static int[] quickSort(int[] array) {
      if(array == null || array.length == 0){
        return array;
    }
      quickSort(array, 0 ,array.length-1);
      return array;
  }
    public static void quickSort(int[]array, int left,int right){
      if(left >=right)
      {
        return;
      }
      int pivotnewIndex = partition(array,left,right);
      quickSort(array, left, pivotnewIndex -1);
      quickSort(array,pivotnewIndex+1,right);
    
    }
    public static int partition(int[]array, int left,int right){
      int pivotIndex = right;
      right--;
      while(left<=right){
        if(array[left]<=array[pivotIndex]){
          left++;
        }else if(array[right]>array[pivotIndex]){
          right--;
        }else{
          swap(array,left,right);
               left++;
               right--;
              }
    }
        swap(array,left,pivotIndex);
        return left;
     }
      public static void swap(int[] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
      public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String[] args) 
    { 
        int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
        quickSort(array);
        printArray(array);
    } 
  }