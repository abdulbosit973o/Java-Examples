package builder;

public class Registration {
    // Required parameters
    private final String username;
    private final String email;

    // Optional parameters
    private final String firstName;
    private final String lastName;
    private final int age;

    private Registration(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    // Getter methods for fields

    public static class Builder {
        // Required parameters
        private final String username;
        private final String email;

        // Optional parameters with default values
        private String firstName = "";
        private String lastName = "";
        private int age = 0;

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Registration build() {
            return new Registration(this);
        }
    }

    // Usage example
    public static void main(String[] args) {
        Registration registration = new Registration.Builder("john_doe", "john.doe@example.com")
                .firstName("John")
                .lastName("Doe")
                .age(25)
                .build();

        // Now you have a Registration object with the specified parameters
    }
}

