public class GameAdapter implements SoloGame{

 private Game game;

 public GameAdapter (Game game){
     this.game = game;

 }


 @Override

 // Call the startSoloGame method internally
    public void playSoloGame(){
     game.playGame();

 }
}
