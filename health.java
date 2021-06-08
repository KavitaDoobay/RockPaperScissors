/*    */ import java.util.Random;
/*    */ 
/*    */ public class health {
         //This class tracks the health of the player and the computer
/*  4 */   public static int health1 = 2;
/*  5 */   public static int charge1 = 0;
/*  6 */   public static int damage1 = 0;
/*  7 */   public static int health2 = 2;
/*  8 */   public static int charge2 = 0;
/*  9 */   public static int damage2 = 0;
/* 10 */   public static int critHit1 = 0;
/* 11 */   public static int critHit2 = 0;
/* 12 */   static Random random = new Random();
/*    */   public static void updateHealth(int i) {
           //based on who wins, the health of each player is updated, where they wither sustain damage, or gets a random critical hit
/* 14 */     if (i == 1) {
/* 15 */       health1++;
/* 16 */       checkHealth1();
/* 17 */       charge2 += 2;
/* 18 */       checkCharge1();
/* 19 */       specialAttack2();
/* 20 */       if (random.nextInt(7) == 1) {
/* 21 */         critHit1++;
/* 22 */         criticalHit2();
/*    */       } 
/*    */     } 
/* 25 */     if (i == 2) {
/* 26 */       health2++;
/* 27 */       checkHealth2();
/* 28 */       charge1 += 2;
/* 29 */       checkCharge2();
/* 30 */       specialAttack2();
/* 31 */       if (random.nextInt(7) == 1) {
/* 32 */         critHit2++;
/* 33 */         criticalHit1();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   public static void checkCharge1() {
/* 38 */     if (charge1 > 10)
/* 39 */       charge1 = 10; 
/*    */   }
/*    */   
/*    */   public static void checkCharge2() {
/* 43 */     if (charge2 > 10)
/* 44 */       charge2 = 10; 
/*    */   }
/*    */   
/*    */   public static void checkHealth1() {
/* 48 */     if (health1 >= 10) {
/* 49 */       health1 = 10;
/* 50 */       health2 -= health2 * 2;
/* 51 */       if (health2 <= 0)
/* 52 */         health2 = 0; 
/*    */     } 
/*    */   }
/*    */   public static void checkHealth2() {
/* 56 */     if (health2 >= 10) {
/* 57 */       health2 -= health2 * 2;
/* 58 */       if (health2 <= 0)
/* 59 */         health2 = 0; 
/*    */     } 
/*    */   }
/*    */   public static void specialAttack1() {
/* 63 */     damage2 -= damage2 / 3;
/* 64 */     if (damage2 < 0)
/* 65 */       damage2 = 0; 
/*    */   }
/*    */   public static void specialAttack2() {
/* 68 */     if (charge2 == 10) {
/* 69 */       damage1 -= damage1 / 3;
/* 70 */       if (damage1 < 0)
/* 71 */         damage1 = 0; 
/*    */     } 
/*    */   }
/*    */   public static void criticalHit1() {
/* 75 */     damage2 -= damage2 / 2;
/* 76 */     if (damage2 < 0)
/* 77 */       damage2 = 0; 
/*    */   }
/*    */   public static void criticalHit2() {
/* 80 */     damage1 -= damage1 / 2;
/* 81 */     if (damage1 < 0)
/* 82 */       damage1 = 0; 
/*    */   }
/*    */ }
