public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstName("Sharan");
        p1.setLastName("K");
        p1.setAge((byte) 16);
        System.out.println(p1.getFullName());
        System.out.println(p1.isTeen());

        Person p2 = new Person();
        System.out.println(p2.getFullName());
        System.out.println(p2.isTeen());
    }
}