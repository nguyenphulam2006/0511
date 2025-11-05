public class Teacher implements IGuide {
    String fullname;
    String ID;
    String email;
    String title;

    public Teacher(String fullname, String ID, String email, String title) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    @Override
    public String getFullname() { return fullname; }

    @Override
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Teacher " + fullname + ", " + title;
    }
}