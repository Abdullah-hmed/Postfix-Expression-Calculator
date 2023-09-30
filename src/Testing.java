import java.util.Arrays;
import java.util.Scanner;
public class Testing {
    public static void main(String[] args){
        Stack mystack = new Stack(100);
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Press 'q' to quit");
            System.out.print("Enter a valid Postfix Expression: ");

            String exp = input.nextLine();

            
            if(exp.equals("q")){ //to quit
                break;
            }
            
            float var1,var2,result;


            String[] expChar = exp.split(" "); //splits user input into individual values


            for (int i = 0; i< expChar.length; i++) {
                switch (expChar[i]) {
                    case "+": 
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1+var2;
                        mystack.Push(result);
                        break;
                    case "*":
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1*var2;
                        mystack.Push(result);
                        break;
                    case "-":
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1-var2;
                        mystack.Push(result);
                        break;
                    case "/":
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1/var2;
                        mystack.Push(result);
                        break;
                    case "^":
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();

                        result = (int) Math.pow(var1, var2);
                        mystack.Push(result);
                        break;
                    default: //handles the numbers inputted by user.
                        float num = Float.parseFloat(expChar[i]);
                        mystack.Push(num);
                        break;
                }
            }
            System.out.println("The answer is :"+mystack.Peek()+"\n");
            
        }
    } 
}
