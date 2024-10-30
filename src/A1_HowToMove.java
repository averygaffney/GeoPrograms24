public class A1_HowToMove extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        plane.startingAngle(0);
        plane.setColor(78, 73, 242);
        plane.trailWidth = 20;
        plane.isTrail = true;
        plane.move(200);
        plane.turn(270);
        plane.move(200);
        plane.turn(270);
        plane.move(200);
        plane.turn(270);
        plane.move(200);
        plane.isTrail = false;
        plane.turn(270);
        plane.move(125);
        plane.turn(270);
        plane.move(75);
        plane.isTrail = true;
        plane.move(50);
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(50);
        plane.turn(180);

    }

}

