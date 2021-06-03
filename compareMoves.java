/*     */ import javafx.event.ActionEvent;
/*     */ import javafx.geometry.Pos;
/*     */ import javafx.scene.Node;
/*     */ import javafx.scene.Scene;
/*     */ import javafx.scene.control.Button;
/*     */ import javafx.scene.control.Label;
/*     */ import javafx.scene.layout.VBox;
/*     */ import javafx.scene.text.Font;
/*     */ import javafx.stage.Stage;
/*     */ 
/*     */ public class compareMoves {
/*     */   public static void pcScoreShow(int p, int c) {
/*  13 */     p1 = p;
/*  14 */     p2 = c;
/*  15 */     String s = "";
/*  16 */     if (p2 == 1) {
/*  17 */       s = s + "ROCK";
/*     */     }
/*  19 */     else if (p2 == 2) {
/*  20 */       s = s + "PAPER";
/*     */     }
/*  22 */     else if (p2 == 3) {
/*  23 */       s = s + "SCISSORS";
/*     */     } 
/*  25 */     if (p1 == p2) {
/*  26 */       Stage window = new Stage();
/*  27 */       window.setTitle("Score");
/*  28 */       score.update(0);
/*     */       
/*  30 */       Label intro = new Label(" COMPUTER CHOSE: " + s + "\nDRAW");
/*  31 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/*  33 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/*  34 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/*  35 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/*  36 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/*  38 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/*  39 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/*  40 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/*  41 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/*  43 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/*  44 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/*  45 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/*  46 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/*  48 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/*  49 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/*  50 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/*  51 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/*  53 */       Button cont = new Button("continue game");
/*  54 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/*  58 */       Button end = new Button("END GAME");
/*  59 */       end.setOnAction(e -> window.close());
/*  60 */       Button showScore = new Button("SHOW SCORE");
/*  61 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/*  65 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/*  66 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/*  70 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/*  71 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/*  77 */       VBox layout = new VBox(10.0D);
/*  78 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/*  79 */       layout.setAlignment(Pos.CENTER);
/*  80 */       layout.setAlignment(Pos.CENTER);
/*     */       
/*  82 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/*  83 */       scene.getStylesheets().add("game.css");
/*  84 */       window.setScene(scene);
/*  85 */       window.show();
/*     */     
/*     */     }
/*  88 */     else if (p1 == 1 && p2 == 2) {
/*  89 */       Stage window = new Stage();
/*  90 */       window.setTitle("Score");
/*  91 */       score.update(2);
/*     */       
/*  93 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 2 WINS!");
/*  94 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/*  95 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/*  96 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/*  97 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/*  98 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 100 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 101 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 102 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 103 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 105 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 106 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 107 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 108 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 110 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 111 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 112 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 113 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 115 */       Button cont = new Button("continue game");
/* 116 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 120 */       Button end = new Button("END GAME");
/* 121 */       end.setOnAction(e -> window.close());
/* 122 */       Button showScore = new Button("SHOW SCORE");
/* 123 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 127 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 128 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 132 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 133 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 139 */       VBox layout = new VBox(10.0D);
/* 140 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 141 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 143 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 144 */       scene.getStylesheets().add("game.css");
/* 145 */       window.setScene(scene);
/* 146 */       window.show();
/*     */     }
/* 148 */     else if (p2 == 1 && p1 == 2) {
/* 149 */       Stage window = new Stage();
/* 150 */       window.setTitle("Score");
/* 151 */       score.update(1);
/*     */       
/* 153 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 1 WINS!");
/* 154 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 155 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/* 156 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/* 157 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/* 158 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 160 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 161 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 162 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 163 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 165 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 166 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 167 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 168 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 170 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 171 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 172 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 173 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 175 */       Button cont = new Button("continue game");
/* 176 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 180 */       Button end = new Button("END GAME");
/* 181 */       end.setOnAction(e -> window.close());
/* 182 */       Button showScore = new Button("SHOW SCORE");
/* 183 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 187 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 188 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 192 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 193 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 199 */       VBox layout = new VBox(10.0D);
/* 200 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 201 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 203 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 204 */       scene.getStylesheets().add("game.css");
/* 205 */       window.setScene(scene);
/* 206 */       window.show();
/*     */     }
/* 208 */     else if (p2 == 1 && p1 == 3) {
/* 209 */       Stage window = new Stage();
/* 210 */       window.setTitle("Score");
/* 211 */       score.update(2);
/*     */       
/* 213 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 2 WINS!");
/* 214 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 215 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/* 216 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/* 217 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/* 218 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 220 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 221 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 222 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 223 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 225 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 226 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 227 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 228 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 230 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 231 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 232 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 233 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 235 */       Button cont = new Button("continue game");
/* 236 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 240 */       Button end = new Button("END GAME");
/* 241 */       end.setOnAction(e -> window.close());
/* 242 */       Button showScore = new Button("SHOW SCORE");
/* 243 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 247 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 248 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 252 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 253 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 259 */       VBox layout = new VBox(10.0D);
/* 260 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 261 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 263 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 264 */       scene.getStylesheets().add("game.css");
/* 265 */       window.setScene(scene);
/* 266 */       window.show();
/*     */     }
/* 268 */     else if (p2 == 3 && p1 == 1) {
/* 269 */       Stage window = new Stage();
/* 270 */       window.setTitle("Score");
/* 271 */       score.update(1);
/*     */       
/* 273 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 1 WINS!");
/* 274 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 275 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/* 276 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/* 277 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/* 278 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 280 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 281 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 282 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 283 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 285 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 286 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 287 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 288 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 290 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 291 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 292 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 293 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 295 */       Button cont = new Button("continue game");
/* 296 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 300 */       Button end = new Button("END GAME");
/* 301 */       end.setOnAction(e -> window.close());
/* 302 */       Button showScore = new Button("SHOW SCORE");
/* 303 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 307 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 308 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 312 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 313 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 319 */       VBox layout = new VBox(10.0D);
/* 320 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 321 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 323 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 324 */       scene.getStylesheets().add("game.css");
/* 325 */       window.setScene(scene);
/* 326 */       window.show();
/*     */     }
/* 328 */     else if (p2 == 2 && p1 == 3) {
/* 329 */       Stage window = new Stage();
/* 330 */       window.setTitle("Score");
/* 331 */       score.update(1);
/*     */       
/* 333 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 1 WINS!");
/* 334 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 335 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/* 336 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/* 337 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/* 338 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 340 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 341 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 342 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 343 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 345 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 346 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 347 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 348 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 350 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 351 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 352 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 353 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 355 */       Button cont = new Button("continue game");
/* 356 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 360 */       Button end = new Button("END GAME");
/* 361 */       end.setOnAction(e -> window.close());
/* 362 */       Button showScore = new Button("SHOW SCORE");
/* 363 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 367 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 368 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 372 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 373 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 379 */       VBox layout = new VBox(10.0D);
/* 380 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 381 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 383 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 384 */       scene.getStylesheets().add("game.css");
/* 385 */       window.setScene(scene);
/* 386 */       window.show();
/*     */     }
/* 388 */     else if (p2 == 3 && p1 == 2) {
/* 389 */       Stage window = new Stage();
/* 390 */       window.setTitle("Score");
/* 391 */       score.update(2);
/*     */       
/* 393 */       Label intro = new Label("COMPUTER CHOSE: " + s + "\nPLAYER 2 WINS!");
/* 394 */       intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 395 */       Label health1 = new Label(" P1 HEALTH: " + health.health1 + "/10");
/* 396 */       health1.setFont(Font.font("DIN Alternate", 27.0D));
/* 397 */       Label health2 = new Label(" P1 HEALTH: " + health.health2 + "/10");
/* 398 */       health2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 400 */       Label charge1 = new Label(" P1 CHARGE: " + health.charge1 + "/10");
/* 401 */       charge1.setFont(Font.font("DIN Alternate", 27.0D));
/* 402 */       Label charge2 = new Label(" P1 CHARGE: " + health.charge2 + "/10");
/* 403 */       charge2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 405 */       Label damage1 = new Label(" P1 DAMAGE: " + health.damage1 + "/10");
/* 406 */       damage1.setFont(Font.font("DIN Alternate", 27.0D));
/* 407 */       Label damage2 = new Label(" P1 DAMAGE: " + health.damage2 + "/10");
/* 408 */       damage2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 410 */       Label crithit1 = new Label(" P1 SUFFERED " + health.critHit1 + " CRITICAL HITS");
/* 411 */       crithit1.setFont(Font.font("DIN Alternate", 27.0D));
/* 412 */       Label crithit2 = new Label(" P2 SUFFERED " + health.critHit2 + " CRITICAL HITS");
/* 413 */       crithit2.setFont(Font.font("DIN Alternate", 27.0D));
/*     */       
/* 415 */       Button cont = new Button("continue game");
/* 416 */       cont.setOnAction(e -> {
/*     */             pvc.getP1Move();
/*     */             window.close();
/*     */           });
/* 420 */       Button end = new Button("END GAME");
/* 421 */       end.setOnAction(e -> window.close());
/* 422 */       Button showScore = new Button("SHOW SCORE");
/* 423 */       showScore.setOnAction(e -> score.showScore());
/*     */ 
/*     */ 
/*     */       
/* 427 */       Button showhighScore = new Button("SHOW HIGH SCORE");
/* 428 */       showhighScore.setOnAction(e -> score.showHighScore());
/*     */ 
/*     */ 
/*     */       
/* 432 */       Button specialAttack = new Button("SPECIAL ATTACK (if charge is 10)");
/* 433 */       specialAttack.setOnAction(e -> {
/*     */             if (health.charge1 == 10) {
/*     */               health.specialAttack1();
/*     */             }
/*     */           });
/*     */       
/* 439 */       VBox layout = new VBox(10.0D);
/* 440 */       layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)health1, (Node)health2, (Node)charge1, (Node)charge2, (Node)damage1, (Node)damage2, (Node)crithit1, (Node)crithit2, (Node)specialAttack, (Node)cont, (Node)end, (Node)showScore, (Node)showhighScore });
/* 441 */       layout.setAlignment(Pos.CENTER);
/*     */       
/* 443 */       Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 444 */       scene.getStylesheets().add("game.css");
/* 445 */       window.setScene(scene);
/* 446 */       window.show();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int p1;
/*     */   public static int p2;
/*     */ }


/* Location:              /Users/kavitadoobay/Downloads/week3.jar!/compareMoves.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */