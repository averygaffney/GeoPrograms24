public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.pausetime = 1;
        for (int x = 1; x < 6; x = x + 1) {
            skysquare(plane.random(10,100));
            plane.isTrail = false;
            plane.turn(90);
            plane.move(150);
        }
        plane.isTrail = false;
        plane.turn(270);
        plane.move(200);
        plane.turn(270);
        plane.move(700);
        for (int x = 1; x < 6; x = x + 1) {
            groundtriangle(plane.random(10,150));
            plane.isTrail = false;
            plane.turn(90);
            plane.move(150);
        }
        plane.isTrail = false;
        plane.turn(270);
        plane.move(200);
        plane.turn(270);
        plane.move(700);
        for (int x = 1; x < 6; x = x + 1) {
            waterhexagon(plane.random(10,75));
            plane.isTrail = false;
            plane.turn(90);
            plane.move(150);
        }
    }


    public void skysquare(int size) {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = plane.random(1,20);
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);


    }

    public void groundtriangle(int size) {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = plane.random(1,20);
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);


    }

    public void waterhexagon(int size) {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = plane.random(1,20);
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(size);
        plane.turn(300);
        plane.move(size);
        plane.turn(300);
        plane.move(size);
        plane.turn(300);
        plane.move(size);
        plane.turn(300);
        plane.move(size);
        plane.turn(300);
        plane.move(size);
        plane.turn(300);

    }
}
