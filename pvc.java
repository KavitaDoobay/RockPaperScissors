/*    */ import javafx.event.ActionEvent;
/*    */ import javafx.geometry.Pos;
/*    */ import javafx.scene.Node;
/*    */ import javafx.scene.Scene;
/*    */ import javafx.scene.control.Button;
/*    */ import javafx.scene.control.Label;
/*    */ import javafx.scene.image.Image;
/*    */ import javafx.scene.image.ImageView;
/*    */ import javafx.scene.layout.VBox;
/*    */ import javafx.stage.Stage;
/*    */ 
/*    */ public class pvc {//This class runs a PVC game
/* 13 */   public static int p1Counter = 0; public static int p1; public static int comp;
/*    */   
/*    */   public static void getP1Move() {//This method shows the window for player one to pick their move, gets the computer's move and continually updates the game until it ends
/* 16 */     Stage window = new Stage();
/* 17 */     window.setTitle("Player 1");
/*    */     
/* 19 */     Label intro = new Label("Player one- pick your move");
/* 20 */     intro.setFont(Font.font("DIN Alternate", 27.0D));
/* 21 */     Image r = new Image("rock.png", 30.0D, 30.0D, true, true);
/* 22 */     Image p = new Image("paper.png", 30.0D, 30.0D, true, true);
/* 23 */     Image s = new Image("scissors.png", 30.0D, 30.0D, true, true);
/*    */     
/* 25 */     Button rock = new Button();
/* 26 */     rock.setGraphic((Node)new ImageView(r));
/* 27 */     rock.setOnAction(e -> {
/*    */           p1 = 1;
/*    */           comp = computerMove.getComputerMove();
/*    */           window.close();
/*    */           compareMoves.pcScoreShow(p1, comp);
/*    */         });
/* 33 */     Button paper = new Button();
/* 34 */     paper.setGraphic((Node)new ImageView(p));
/* 35 */     paper.setOnAction(e -> {
/*    */           p1 = 2;
/*    */           comp = computerMove.getComputerMove();
/*    */           window.close();
/*    */           compareMoves.pcScoreShow(p1, comp);
/*    */         });
/* 41 */     Button scissors = new Button();
/* 42 */     scissors.setGraphic((Node)new ImageView(s));
/* 43 */     scissors.setOnAction(e -> {
/*    */           p1 = 3;
/*    */           comp = computerMove.getComputerMove();
/*    */           window.close();
/*    */           compareMoves.pcScoreShow(p1, comp);
/*    */         });
/* 49 */     VBox layout = new VBox(15.0D);
/* 50 */     layout.setAlignment(Pos.CENTER);
/* 51 */     layout.getChildren().addAll((Object[])new Node[] { (Node)intro, (Node)rock, (Node)paper, (Node)scissors });
/* 52 */     layout.getStylesheets().add("game.css");
/* 53 */     Scene scene = new Scene((Parent)layout, 500.0D, 500.0D);
/* 54 */     window.setScene(scene);
/* 55 */     window.show();
/*    */   }
/*    */ }
