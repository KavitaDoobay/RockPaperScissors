/*     */ import javafx.event.ActionEvent;
/*     */ import javafx.geometry.Pos;
/*     */ import javafx.scene.Node;
/*     */ import javafx.scene.Parent;
/*     */ import javafx.scene.Scene;
/*     */ import javafx.scene.control.Button;
/*     */ import javafx.scene.control.Label;
/*     */ import javafx.scene.layout.VBox;
/*     */ import javafx.stage.Stage;
/*     */ 
/*     */ public class score
/*     */ {//This class shows the final score, high score, and keeps track of the overall rounds and winning streaks 
/*     */   public static int p1streak;
/*     */   public static int p2streak;
/*     */   public static int p1rounds;
/*     */   public static int p2rounds;
/*     */   public static int temp;
/*     */   public static int temp1;
/*  19 */   public static int highscore = 0;
/*  20 */   public static int games = 0;
/*     */   public static void update(int w) { //This method updates the score by tracking how many rounds each player has won, and the high score
/*  22 */     games++;
/*  23 */     if (games == 3) {
/*  24 */       if (w == 1) {
/*  25 */         p1streak++;
/*  26 */         temp++;
/*  27 */         if (temp > highscore) {
/*  28 */           highscore = temp;
/*     */         }
/*     */       } 
/*  31 */       if (w == 2) {
/*  32 */         p2streak++;
/*  33 */         temp1++;
/*  34 */         if (temp1 > highscore) {
/*  35 */           highscore = temp1;
/*     */         }
/*     */       } 
/*  38 */       if (p1streak > p2streak) {
/*  39 */         p1rounds++;
/*     */       }
/*  41 */       if (p2streak > p1streak) {
/*  42 */         p2rounds++;
/*     */       }
/*     */       
/*  45 */       games = 0;
/*  46 */       p1streak = 0;
/*  47 */       p2streak = 0;
/*     */     } 
/*  49 */     if (w == 1) {
/*  50 */       p1streak++;
/*  51 */       temp++;
/*  52 */       if (temp > highscore) {
/*  53 */         highscore = temp;
/*     */       }
/*  55 */       health.updateHealth(1);
/*     */     } 
/*  57 */     if (w == 2) {
/*  58 */       p2streak++;
/*  59 */       temp1++;
/*  60 */       if (temp1 > highscore) {
/*  61 */         highscore = temp1;
/*     */       }
/*  63 */       health.updateHealth(2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showScore() {//This class shows the final window with the overall streaks and how many rounds have been won by each player
/*  70 */     Stage window = new Stage();
/*  71 */     window.setTitle("Score");
/*     */     
/*  73 */     Label p1score = new Label("Player one's streak: " + p1streak);
/*  74 */     Label p2score = new Label("Player two's streak: " + p2streak);
/*  75 */     Label p1Rounds = new Label("Player one's rounds: " + p1rounds);
/*  76 */     Label p2Rounds = new Label("Player two's rounds: " + p2rounds);
/*     */     
/*  78 */     Button exit = new Button("Exit");
/*  79 */     exit.setOnAction(e -> window.close());
/*     */ 
/*     */ 
/*     */     
/*  83 */     VBox layout = new VBox(10.0D);
/*  84 */     layout.getChildren().addAll((Object[])new Node[] { (Node)p1score, (Node)p2score, (Node)p1Rounds, (Node)p2Rounds, (Node)exit });
/*  85 */     layout.setAlignment(Pos.CENTER);
/*  86 */     Scene scene = new Scene((Parent)layout, 300.0D, 300.0D);
/*  87 */     scene.getStylesheets().add("game.css");
/*  88 */     window.setScene(scene);
/*  89 */     window.show();
/*     */   }
/*     */   public static void showHighScore() {//THis opens a window that shows the highest score, being the largest amount of rounds won
/*  92 */     Stage window = new Stage();
/*  93 */     window.setTitle("High Score");
/*     */     
/*  95 */     Label p1score = new Label("Highest winning streak: " + highscore);
/*     */     
/*  97 */     Button exit = new Button("exit");
/*  98 */     exit.setOnAction(e -> window.close());
/*     */ 
/*     */ 
/*     */     
/* 102 */     VBox layout = new VBox(10.0);
/* 103 */     layout.getChildren().addAll((Object[])new Node[] { (Node)p1score, (Node)exit });
/* 104 */     layout.setAlignment(Pos.CENTER);
/* 105 */     Scene scene = new Scene((Parent)layout, 300.0D, 300.0D);
/* 106 */     scene.getStylesheets().add("game.css");
/* 107 */     window.setScene(scene);
/* 108 */     window.show();
/*     */   }
/*     */ }
