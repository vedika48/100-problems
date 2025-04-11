import java.util.*;
public class cloudberry_jam {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<x;i++){
            arr.add(sc1.nextInt());
        }
        sc1.close();
        for(int val: arr){
            System.out.println(2*val);
        }
    }
}
