package RawData;

 class Engine {
     private int engineSpeed;
     private int enginePower;

     Engine(int engineSpeed, int enginePower) {
         this.engineSpeed = engineSpeed;
         this.enginePower = enginePower;
     }

     int getPower() {
         return this.enginePower;
     }
 }