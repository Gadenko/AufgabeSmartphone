package Model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    protected String modell;
    protected String manufacturer;
    protected Contact[] contactArray;

    public Smartphone(){}

    public Smartphone(String modell, String manufacturer, Contact[] contactArray){
        this.contactArray = contactArray;
        this.modell = modell;
        this.manufacturer = manufacturer;
    }
    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Contact[] getContactArray() {
        return contactArray;
    }
    public void setContactArray(Contact[] contactArray) {
        this.contactArray = contactArray;
    }
    @Override
    public String getPosition() {
        return "Hamburg";
    }
    @Override
    public boolean startRadio() {
        System.out.println("Radio starting");
        return true;
    }
    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modell='" + modell + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactArray=" + Arrays.toString(contactArray) +
                '}';
    }
}
