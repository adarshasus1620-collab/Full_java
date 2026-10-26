public class swithch {
    public static void main(String[] args) {
        // Switch stetment 
        int i = 3;

        switch(i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is Grater than 3");
                break;
                 
              

        int j = 5;
        int k = 1;


        switch (j) {
            case 4:
                System.out.println("j is 4")
                break;
            case 5:
                switch(k){
                    case 1:
                        break;
                    case 2:
                        break;
                }
                
            default:
                System.out.println("j is not 4 & 5");
                break;
        }
        }
    }
}        
       