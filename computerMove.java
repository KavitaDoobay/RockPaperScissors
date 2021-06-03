/*   */ import java.util.Random;
/*   */ 
/*   */ public class computerMove
/*   */ {
/*   */   public static int getComputerMove() {
/* 6 */     Random random = new Random();
/* 7 */     int move = random.nextInt(3) + 1;
/* 8 */     return move;
/*   */   }
/*   */ }


/* Location:              /Users/kavitadoobay/Downloads/week3.jar!/computerMove.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */