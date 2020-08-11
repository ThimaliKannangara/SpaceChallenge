public class U2 extends Rocket {

    public U2() {
        super.setCargoLimit(11);
        super.setRocketCost(120);
    }

    public boolean launch() {
        double launchExplosionProbability = 4 * (this.getCargoCarried()/this.getCargoLimit());
        double randomValue = Math.random()*100;
        return randomValue > launchExplosionProbability;
    }

    public boolean land() {
        double crashLandProbability = 8 * (this.getCargoCarried() / this.getCargoLimit());
        double randomValue = Math.random()*100;
        return randomValue > crashLandProbability;
    }

}