import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  

        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextLine();
        }        
        
        int q = Integer.parseInt(scn.nextLine());
        String[] query = new String[q];
        for(int j=0;j<q;j++){
            query[j] = scn.nextLine();
        }
        
        for(int k=0;k<q;k++){
            int count = 0;
            for(int m=0;m<n;m++){
                if(query[k].equals(arr[m])){
                    count++;
                }
                
            }
            
            System.out.println(count);
        }
        
}
}