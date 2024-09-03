import java.io.*;

public class HP35 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Dynamic<Integer>();
        System.out.println("HP-35 pocket calculator");

        boolean run = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(run) {
            System.out.print(" > ");
            String input = br.readLine();

            switch (input) {
                case "+":
                // pop two numbers, add and push result
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(b + a);
                break;

                case "-":
                // pop two numbers, subtract and push result
                Integer c = stack.pop();
                Integer d = stack.pop();
                stack.push(d - c);
                break;

                case "*":
                // pop two numbers, multiply and push result
                Integer e = stack.pop();
                Integer f = stack.pop();
                stack.push(f * e);
                break;

                case "":
                run = false;
                break;

                default:
                Integer nr = Integer.parseInt(input);
                // push the number on the stack
                stack.push(nr);
                break;
            }
        }
        System.out.printf("the result is: %d\n\n", stack.pop());
        System.out.printf("I love reversed polish notation, don't you?\n");
        }
        
}
