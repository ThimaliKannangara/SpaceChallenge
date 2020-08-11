public class U1 extends Rocket {

    public U1() {
        super.setCargoLimit(8);
        super.setRocketCost(100);
    }

    public boolean launch() {
        double launchExplosionProbability = 5 * (this.getCargoCarried()/this.getCargoLimit());
        double randomValue = Math.random()*100;
        return randomValue > launchExplosionProbability;
    }

    public boolean land() {
        double crashLandProbability = (this.getCargoCarried() / this.getCargoLimit());
        double randomValue = Math.random()*100;
        return randomValue > crashLandProbability;
    }

}


