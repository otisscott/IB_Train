public class DestinationAddress extends Address {
    private String instructions;
    public DestinationAddress(String street, int number, boolean house, String instructions) {
        super(street, number, house);
        this.instructions = instructions;
    }
}
