public class User {
    private String username;
    private String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.role.equals(user.role);
    }

    @Override
    public String toString() {
        return String.format("%s:%s", username, role);
    }
}
