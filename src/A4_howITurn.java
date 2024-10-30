public class A4_howITurn extends World {

    public void go() {
        square();
        square2();
        triangle();
    }


    public void square() {

        plane.trailWidth = 10;
        plane.pausetime = 2;
        plane.isTrail = true;
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);


    }

    public void triangle() {
        plane.trailWidth = 10;
        plane.pausetime = 2;
        plane.isTrail = true;
        plane.setColor(182, 137, 250);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
    }

    public void square2 (){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(100, 100, 250);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
    }
}
