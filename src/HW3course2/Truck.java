package HW3course2;

public class Truck extends WheeledTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        super.updateTyre();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check () {
        Truck truck = this;
            System.out.println("Обслуживаем " + this.getModelName());
            truck.checkEngine();
            truck.checkTrailer();
            for (int i = 0; i < this.getWheelsCount(); i++) {
                truck.updateTyre();

            }
        }

    }

