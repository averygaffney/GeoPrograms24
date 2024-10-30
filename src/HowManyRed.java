public class HowManyRed extends World {
    public int red;
    public int blue;
    public int green;
    public int count;
    public int total;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();


    }
}