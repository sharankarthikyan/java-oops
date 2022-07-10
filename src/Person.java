public class Person {
    private String firstName = "";
    private String lastName = "";
    private byte age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if(this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if(this.firstName.isEmpty()) {
            return this.lastName;
        } else if(this.lastName.isEmpty()) {
            return this.firstName;
        }
        return this.firstName + this.lastName;
    }
}
