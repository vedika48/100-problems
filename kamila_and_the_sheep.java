import java.util.*;
public class kamila_and_the_sheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<t;i++){
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
            list.add(sc.nextInt());
            }
            int max = Collections.max(list);
            int min = Collections.min(list);
            arr.add(max-min);
        }
        for(int val: arr){
            System.out.println(val);
        }
        sc.close();
    }
}
