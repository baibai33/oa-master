import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = 0;
        int n = s.charAt(s.length() - 1) - '0';
        for (int i = 0; i < s.length() - 1; i++) {
            int m = s.charAt(i) - '0';
            if ((m + n) % 10 % 2 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for(int i = 0; i < n;i++){
//            array[i] = sc.nextInt();
//        }
//        int ans = 0;
//        while(true){
//            int min = Integer.MAX_VALUE;
//            boolean isSame = true;
//            for(int i = 0; i < n;i++){
//                if(array[i] < min){
//                    min = array[i];
//                }
//            }
//            for(int i = 0; i < n;i++){
//                if(array[i] != min){
//                    isSame = false;
//                }
//            }
//            if(isSame){
//                break;
//            }
//            ans ++;
//            for(int i = 0; i < n;i++){
//                if(array[i] != min){
//                    array[i] /=2;
//
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//}

