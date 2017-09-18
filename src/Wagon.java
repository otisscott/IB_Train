public class Wagon extends RollingStock
{
    private Parcel[] mParcels;
    private int mParcelCount;
    private int weight;
    public Wagon(int ID)
    {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }

    // Accessor methods
    public int getWagonID() { return this.getID(); }
    public double getWeight() {
        for(int i = 0; i < mParcelCount; i++) {
            weight += mParcels[i].getWeight();
        }
        weight = weight + 32000;
        return weight;
    }
// Other methods
}

