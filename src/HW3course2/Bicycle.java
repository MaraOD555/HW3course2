package HW3course2;

public class Bicycle extends WheeledTransport implements Service {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        super.updateTyre();
    }


    @Override
    public void check() {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();

            }
        }
    }



