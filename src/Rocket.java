public class Rocket implements SpaceShip {

    private int rocketCost;

    private int cargoCarried;

    private int cargoLimit;


    public int getCargoCarried() {
        return cargoCarried;
    }


    public int getCargoLimit() {
        return cargoLimit;
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }


    public void setRocketCost(int rocketCost) {
        this.rocketCost = rocketCost;
    }

    public int getRocketCost() {
        return rocketCost;
    }


    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }


    public boolean canCarry(Item item) {
        return this.cargoCarried + item.getWeight() <= this.cargoLimit;
    }

    public void carry(Item item) {
        this.cargoCarried += item.getWeight();
    }

}
