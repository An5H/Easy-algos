import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	      BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
	      int t = Integer.parseInt(ob.readLine());
	      while(t-- > 0){
	          String [] str = ob.readLine().trim().split(" ");
	          int size = Integer.parseInt(str[0]);
	          int amount = Integer.parseInt(str[1]);
	          String [] money = ob.readLine().trim().split(" ");
	          int arr[] = new int[size];
	          for(int i = 0; i < size; i++){
	              arr[i] = Integer.parseInt(money[i]);
	          }
	          new check().compute(arr, amount);
	          System.out.println();
	      }
	 }
}
class check{
    static void compute(int arr[], int amount){
        int sum=  0, count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] <= amount){
                sum += arr[i];
                count++;
            }
        }
        System.out.print(count);
    }
}





