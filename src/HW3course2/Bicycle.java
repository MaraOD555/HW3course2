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
        Bicycle bicycle = this;
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                bicycle.updateTyre();

            }
        }
    }



