package factoryPattern.vehicle;

public class TelsaFactory {
    public static IElectricVehicle Create(String type) {
        return switch (type) {
            case "Model3" -> new Model3();
            case "ModelY" -> new ModelY();
            case "ModelX" -> new ModelX();
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + type);
        };
    }
}
