import java.util.*;
public class Problem4 {  
      
    public static void main(String[] args) {  
          Scanner sc=new Scanner(System.in);
        //Initialize array  
        System.out.println("Enter the index");
        int n=sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        //Displays the frequency of each element present in array  
        System.out.println("---------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("---------------------");  
    }  
}  