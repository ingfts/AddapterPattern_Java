public class GameFactory{

    public static SoloGame createSoloGame(){
        System.out.println("Entering solo play mode...");
     return new ConcreteSoloG();

    }

    public static GroupGame createGroupGame(){
        System.out.println("Entering group play mode...");
        return new ConcreteGroupG();
    }


}
