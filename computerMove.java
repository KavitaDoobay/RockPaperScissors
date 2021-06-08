/*   */ import java.util.Random;
/*   */ 
/*   */ public class computerMove{
        //This class gets a random move that the computer will play
/*   */   public static int getComputerMove() {
/* 6 */     Random random = new Random();
/* 7 */     int move = random.nextInt(3) + 1;
/* 8 */     return move;
/*   */   }
/*   */ }
