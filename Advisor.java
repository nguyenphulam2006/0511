public class Advisor implements IGuide {
    String fullname;
    String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    @Override
    public String getFullname() { return fullname; }

    @Override
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Advisor: " + fullname;
    }
}