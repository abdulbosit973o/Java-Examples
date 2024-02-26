package anonymous;

public class CustomStringBuilder {
    private final StringBuilder stringBuilder;

    public CustomStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public CustomStringBuilder add(String str) {
        stringBuilder.append(str);
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();

        String result = customStringBuilder
                .add("Hello, ")
                .add("world!")
                .toString();

        System.out.println(result);  // Output: Hello, world!
    }
}
