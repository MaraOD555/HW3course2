package HW3course2;

public class Car extends WheeledTransport implements Service{
      public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        super.updateTyre();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

        @Override
        public void check () {
                System.out.println("Обслуживаем " + getModelName());
                checkEngine();
                for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();

                }
            }
        }



