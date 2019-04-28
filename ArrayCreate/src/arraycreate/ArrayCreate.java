
package arraycreate;
public class ArrayCreate {

    public static void main(String[] args) {
      int[] scores = {83, 60, 90, 45, 24, 100, 71};
      
      System.out.println("score[0]:" +  scores[0]);
      System.out.println("score[1]:" +  scores[1]);
      System.out.println("score[2]:" +  scores[2]);
      System.out.println("score[3]:" +  scores[3]);
      System.out.println("score[4]:" +  scores[4]);
      System.out.println("score[5]:" +  scores[5]);
      System.out.println("score[6]:" +  scores[6]);
      
      int  sum=0;
      for(int i=0; i<3; i++)
          sum+=scores[i];
      
      System.out.println("Total:" + sum);
      double avg = (double) sum / 3;
      System.out.println("Average:" + avg);
      
    }
    
}
