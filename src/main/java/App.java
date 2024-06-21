
public class App {
    private String MESSAGE = "Hello, Java app is running!";

    public String greet() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}
