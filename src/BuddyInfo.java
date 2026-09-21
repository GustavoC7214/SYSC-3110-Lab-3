public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public BuddyInfo() {
        this("Default");
    }

    public String getName() {
        return name;
    }

    static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo();

        System.out.println("Hello World!");
    }
}
