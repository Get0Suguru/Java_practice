public class Fish implements Predator,Prey{


    @Override
    public void fleeing() {
        System.out.println("the fist is try to save her life from the big fish");
    }

    @Override
    public void hunting() {

        System.out.println("the fish is almost gonna kill the smaller fish");
    }
}
