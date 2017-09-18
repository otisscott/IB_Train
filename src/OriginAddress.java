public class OriginAddress extends Address {
    private boolean postoffice;
    public OriginAddress(String street, int number, boolean house, boolean postoffice) {
        super(street, number, house);
        this.postoffice = postoffice;
    }
}
