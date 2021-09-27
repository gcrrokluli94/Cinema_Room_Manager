class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        } else if (firstName != null && lastName != null) {
            return firstName + " " + lastName;
        } else if (firstName.equals(null) && lastName != null) {
            return lastName;
        } else if (firstName != null && lastName.equals(null)) {
            return firstName;
        }
        return ""; // write your code here
    }
}