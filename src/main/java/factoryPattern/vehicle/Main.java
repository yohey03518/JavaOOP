package factoryPattern.vehicle;

public class Main {
    public static void main(String[] args) {
        IElectricVehicle ev = switch ("Model3") {
            case "Model3" -> new Model3();
            case "ModelY" -> new ModelY();
            case "ModelX" -> new ModelX();
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + "Model3");
        };
        ev.Charge();
        ev.Run();
        ev.Stop();
    }
}
