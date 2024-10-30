public class B2_TeachMeNestedLoops extends World {

   public void go() {
      plane.pausetime = 1;
      plane.teleport(0,0);
// i made a change
      for(int y=0; y<300; y=y+1){
         for(int x=0; x<1000; x=x+1){
            plane.teleport(x, y);
            plane.setPixelColor(2, 10, 112);
         }
      }
      for(int y=300; y<500; y=y+1){
         for(int x=0; x<1000; x=x+1){
            plane.teleport(x, y);
            plane.setPixelColor(0,y/2,0);
         }
      }
      for(int y=500; y<800; y=y+1){
         for(int x=0; x<1000; x=x+1){
            plane.teleport(x, y);
            plane.setPixelColor(50, 130, 220);
         }
      }

      for (int x = 100; x < 801; x = x + 200) {
         plane.teleport(x+50,100);
         star();
      }

      for (int x = 100; x < 1001; x = x + 200) {
         plane.teleport(x-20,400);
         house();
      }


      for (int x = 0; x < 801; x = x + 300) {
         plane.teleport(x+100,600);
         fish();
      }

      for (int y = 1; y < 800; y = y + 1) {
         for (int x = 1; x < 1000; x = x + 1) {
            plane.teleport(x,y);

               if(y<300) {
                  plane.setPixelColor(0, 150, 250);
               }
         }
      }
      plane.teleport(800,50);
      sun();
   }


   public void star() {
      plane.startingAngle(90);
      plane.isTrail = true;
      plane.trailWidth = 5;
      plane.setColor(plane.random(175,255),plane.random(175,255),plane.random(175,255));
      plane.move(100);
      plane.turn(144);
      plane.move(100);
      plane.turn(144);
      plane.move(100);
      plane.turn(144);
      plane.move(100);
      plane.turn(144);
      plane.move(100);
      plane.turn(144);



   }

   public void house() {
      plane.startingAngle(90);
      plane.isTrail = true;
      plane.trailWidth = 5;
      plane.setColor(plane.random(0,150),plane.random(0,150),plane.random(0,150));
      plane.move(50);
      plane.turn(90);
      plane.move(50);
      plane.turn(90);
      plane.move(50);
      plane.turn(90);
      plane.move(50);
      plane.turn(225);
      plane.move(35);
      plane.turn(270);
      plane.move(35);


   }

   public void fish() {
      plane.startingAngle(90);
      plane.isTrail = true;
      plane.trailWidth = 5;
      plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
      plane.move(100);
      plane.turn(120);
      plane.move(100);
      plane.turn(120);
      plane.move(100);
      plane.turn(120);
      plane.move(100);
      plane.turn(120);
      plane.move(100);
      plane.turn(280);
      plane.move(100);
      plane.turn(90);
      plane.move(100);
      plane.turn(90);
      plane.move(100);
      plane.turn(90);
      plane.move(100);
      plane.turn(90);


   }
   public void sun() {
      plane.startingAngle(90);
      plane.isTrail = true;
      plane.trailWidth = 50;
      plane.setColor(250,250,0);
      plane.move(150);
      plane.turn(144);
      plane.move(150);
      plane.turn(144);
      plane.move(150);
      plane.turn(144);
      plane.move(150);
      plane.turn(144);
      plane.move(150);
      plane.turn(144);


   }

   public int red;
   public int green;
   public int blue;


}

