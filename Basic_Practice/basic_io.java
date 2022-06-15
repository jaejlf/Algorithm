import java.io.*;
import java.util.*;

public class basic_io {
    public static void main(String[] args) throws IOException {

        /*
         * Scanner Class
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        String s = sc.next();
        // String sl = sc.nextLine();

        System.out.println(n);
        System.out.println(l);
        System.out.println(s);

        sc.close();

        /*
         * BufferdReader
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] br_s = br.readLine().split(" ");
        System.out.println(br_s[0]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        String st_s = st.nextToken();
        System.out.println(st_s);

    }
}
