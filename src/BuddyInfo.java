public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo() {
        this("Default", "Unknown", "Unknown");
    }

    public String getName() {
        return name;
    }

    static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo();

        System.out.println("Hello World!");
    }
}
