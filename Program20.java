// Create an interface that defines a common ability (for example Switchable, Printable, Chargeable, or Playable).
// Declare two methods in the interface (for example turnOn() and turnOff()).
// Create at least three classes that implement it (for example Light, AC, and Fan), each working in its own way.
// In main, store the objects in an array of the interface type and call the methods in a loop.
// Add one more class later and show that main does not need any change.


interface Switchable {

    void turnOn();
    void turnOff();
}

class Light implements Switchable {

    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}


class Fan implements Switchable {

    public void turnOn() {
        System.out.println("Fan is started.");
    }

    public void turnOff() {
        System.out.println("Fan is stopped.");
    }
}

class AC implements Switchable {

    public void turnOn() {
        System.out.println("AC is turned ON.");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class Television implements Switchable {

    public void turnOn() {
        System.out.println("Television is turned ON.");
    }

    public void turnOff() {
        System.out.println("Television is turned OFF.");
    }
}

public class Program20{

    public static void main(String[] args) {

        Switchable devices[] = {
            new Light(),
            new Fan(),
            new AC(),
            new Television()
        };

        for (int i = 0; i < devices.length; i++) {

            System.out.println("\nDevice " + (i + 1));

            devices[i].turnOn();

            devices[i].turnOff();
        }
    }
}
