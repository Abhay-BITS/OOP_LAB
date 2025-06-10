package lab2;

public class Address {
    private String addressLine;
    private String pinCode;
    private String district;
    private String state;

    public Address(String adL, String pC, String dst, String st) {
        this.addressLine = adL;
        this.pinCode = pC;
        this.district = dst;
        this.state = st;
    }

    public void setAddressLine(String adL) {
        this.addressLine = adL;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public String getPinCode() {
        return this.pinCode;
    }
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
