package factoryPattern.vehicle;

public class Main {
    public static void main(String[] args) {
        IElectricVehicle ev = TelsaFactory.Create("Model3");
        ev.Charge();
        ev.Run();
        ev.Stop();
    }
}
