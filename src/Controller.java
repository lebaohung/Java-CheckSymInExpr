import java.util.Stack;

public class Controller {
    private String str;

    public Controller(String str) {
        this.str = str;
    }

    public boolean check() {
        Stack stack = new Stack();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() != 0) return false;
        return true;
    }
}
