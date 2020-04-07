public class Main {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))  ";
        Controller controller = new Controller(str);
        if (controller.check()) {
            System.out.println("The expression is true!");
        } else {
            System.out.println("The expression is false!");
        }
    }
}
