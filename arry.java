public class arry {
    public static void main(String[] args) {
       int[] rollnums = new int[3];
    //    // 101, 102, 103


    //    rollnums[0] = 101;
    //    rollnums[1] = 102;
    //    rollnums[2] = 103;

    //    System.out.println(rollnums[0]);
    //    System.out.println(rollnums[1]);
    //    System.out.println(rollnums[2]);


    //    System.out.println(rollnums.length);


      int x = 101;
      for(int i=0; i < rollnums.length; i++){
        rollnums[i] = x;
        x++;
      }

      for(int i=0; i < rollnums.length; i++){
       System.out.println(rollnums[i]);
      }
    }

}
