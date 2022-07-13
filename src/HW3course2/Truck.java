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
            System.out.println("Обслуживаем " + getModelName());
            checkEngine();
            checkTrailer();
            for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();

            }
        }

    }

