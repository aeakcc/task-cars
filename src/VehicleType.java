public class VehicleType {
    public VehicleType(String attribute){
        this.attribute = attribute;
    }
    protected String attribute;
    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Some vehicle type name";
    }
}
