class InsertionSort
{
  
static void insert(int arr[],int i)
  {

       int key = arr[i];

       int j = i - 1;
       
       while(j >= 0 && arr[j] > key){

           arr[j+1] = arr[j];

           j--;

       }

       arr[j + 1] = key;

  }
}