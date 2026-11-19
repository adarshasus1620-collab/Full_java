public class arrary {
    public static void main(String[] args) {
        //multi demesyon arrya

        int[][] marks = new int[3][3];
        marks[0][0] = 23;
        marks[0][1] = 25;
        marks[0][2] = 45;

        marks[1][0] = 92;
        marks[1][1] = 88;
        marks[1][2] = 95;

        marks[2][0] = 80;
        marks[2][1] = 85;
        marks[2][2] = 90;

        for(int row = 0; row < marks.length; row++) {
          for(int col = 0; col < marks[row].length; col++){
            System.out.print(marks[row][col] + " ");
          }   
          System.out.println();
        }
    }
    
}
