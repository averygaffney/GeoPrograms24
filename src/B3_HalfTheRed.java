public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();


        for (int y = 1; y < 330; y = y + 1) {
            for (int x = 1; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                    if (red>165&&green>165&&blue>165){

                   plane.setPixelColor(0, 150, 250);

                }
            }
        }
    }
}

