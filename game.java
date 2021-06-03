/*    */ import javafx.application.Application;
/*    */ import javafx.event.ActionEvent;
/*    */ import javafx.geometry.Pos;
/*    */ import javafx.scene.Node;
/*    */ import javafx.scene.Parent;
/*    */ import javafx.scene.Scene;
/*    */ import javafx.scene.control.Button;
/*    */ import javafx.scene.image.Image;
/*    */ import javafx.scene.image.ImageView;
/*    */ import javafx.scene.layout.VBox;
/*    */ import javafx.stage.Stage;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class game
/*    */   extends Application
/*    */ {
/*    */   Stage window;
/*    */   public static int pChoice;
/*    */   
/*    */   public static void main(String[] args) {
/* 22 */     launch(args);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean play = true;
/*    */ 
/*    */   
/*    */   public void start(Stage primaryStage) throws Exception {
/* 31 */     this.window = primaryStage;
/* 32 */     this.window.setTitle("Rock Paper Scissors");
/*    */     
/* 34 */     Image banner = new Image("banner.png", 453.0D, 104.0D, true, true);
/*    */     
/* 36 */     Button cp = new Button("PLAYER V. COMPUTER");
/* 37 */     cp.setOnAction(e -> {
/*    */           pvc.getP1Move();
/*    */           
/*    */           this.window.close();
/*    */         });
/* 42 */     VBox vlayout = new VBox(10.0D);
/* 43 */     vlayout.getChildren().addAll((Object[])new Node[] { (Node)new ImageView(banner), (Node)cp });
/* 44 */     vlayout.setAlignment(Pos.CENTER);
/*    */ 
/*    */ 
/*    */     
/* 48 */     Scene scene = new Scene((Parent)vlayout, 500.0D, 500.0D);
/* 49 */     scene.getStylesheets().add("game.css");
/* 50 */     this.window.setScene(scene);
/* 51 */     this.window.show();
/*    */   }
/*    */ }


/* Location:              /Users/kavitadoobay/Downloads/week3.jar!/game.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */