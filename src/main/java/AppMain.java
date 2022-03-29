import Model.BuisnessContact;
import Model.Contact;
import Model.Friend;
import Model.Smartphone;

public class AppMain {

    public static void main(String[] args) {

        Contact[] contacts = new Contact[]{
                new Friend("David","+49015705666789"),
                new Friend("Shu","+4915894215"),
                new BuisnessContact("Yang","Huawei")};

        Smartphone huawei = new Smartphone();
        huawei.setManufacturer("Huawei");
        huawei.setModell("P1");
        huawei.setContactArray(contacts);

        System.out.println(huawei);
        System.out.println(huawei.getManufacturer());
    }
}
