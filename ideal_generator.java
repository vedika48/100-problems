import java.util.*;
public class ideal_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for(int i=0;i<t;i++){
            int k = sc.nextInt();
            if(k%2==0){
                arr.add("NO");
            }
            else{
                arr.add("YES");
            }
        }
        for(String val:arr){
            System.out.println(val);
        }
        sc.close();
    }
}
