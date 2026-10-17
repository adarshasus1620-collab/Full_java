public class oprat {
    public static void main(String[] args) {
        // bitwise operators
        int a = 2; // 00000000 00000000 00000000 00000010
        int b = 3; // 00000000 00000000 00000000 00000011
        int c = a & b; 
        int d = a | b;
        int e = a ^ b;
        int f = ~a; // 11111111 11111111 11111111 11111101 --->3

        
        System.out.println(c + " , " + d + " , " + e + " , " + f);

        // shift oprration 
        int g = 1;
        g = g << 1;
        System.out.println(g);

        // right shift 

        byte  h = 1;
        h = (byte) (h << 1);  
        System.out.println(h);



    }
}
