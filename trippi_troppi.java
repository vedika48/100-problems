import java.util.*;
public class trippi_troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for(int i=0;i<t;i++){
                String str  = sc.nextLine();
                String[] words = str.split(" ");
                StringBuilder build = new StringBuilder();
                for(String letter: words){
                    build.append(letter.charAt(0));
                }
                list.add(build.toString().toLowerCase());
        }
        for(String val:list){
        System.out.println(val);
    }
        sc.close();
    }
}
