public class Hello {
    public static void main(String[] args) {
        String whoToGreet = System.getenv("WHO_TO_GREET");
        if (whoToGreet == null) whoToGreet = "World";
        System.out.println("Hello, " + whoToGreet + "!");
    }
}
