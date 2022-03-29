package Model;

public class Friend extends Contact{

    protected String telefonNumber;

    public Friend(String name, String telefonNumber) {
        super(name);
        this.telefonNumber = telefonNumber;
    }
    public Friend() {}
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", telefonNumber=" + telefonNumber +
                '}';
    }
}
