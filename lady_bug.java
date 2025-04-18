import java.util.*;
public class lady_bug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> result = new ArrayList<>();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            int count0_a=0;
            int count1_b=0;
            String str_a = sc.next();
            for(int j=0;j<n;j++){
                int val = str_a.charAt(j) - '0';
                a.add(val);
                if(val==0){
                    count0_a++;
                }
            }
            String str_b = sc.next();
            for(int j=0;j<n;j++){
                int val = str_b.charAt(j) - '0';
                b.add(val);
                if(val==1){
                    count1_b++;
                }
            }
            if(count0_a==n) result.add("YES");
            else{
                if(count0_a==count1_b){
                    for(int val : a){
                        if(val==1){
                            int index_a=a.indexOf(val);
                            int index_b= index_a-1;
                            Collections.swap(b, index_a, index_b);
                        }
                    }
                }
                else result.add("NO");
            }
        }
        for(String val: result){
            System.out.println(val);
        }
        sc.close();
    }
}
