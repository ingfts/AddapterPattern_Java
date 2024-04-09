public class GameAddapter implements SoloGame{

 private Game game;

 public GameAddapter (Game game){
     this.game = game;

 }


 @Override

 // Call the startSoloGame method internally
    public void playSoloGame(){
     game.playGame();

 }
}
