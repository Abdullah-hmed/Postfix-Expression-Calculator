import java.util.Scanner;
public class Testing {
    public static void main(String[] args){
        Stack mystack = new Stack(100);
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Press 'q' to quit");
            System.out.print("Enter a valid Postfix Expression: ");

            String exp = input.nextLine();

            exp = exp.replaceAll("\\s", "");

            if(exp.equals("q")){
                break;
            }
            
            float var1,var2,result;


            char[] expChar = exp.toCharArray();


            for (int i = 0; i< expChar.length; i++) {
                switch (expChar[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        int value = expChar[i]-'0';
                        mystack.Push(value);
                        break;
                    case '+':
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1+var2;
                        mystack.Push(result);
                        break;
                    case '*':
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1*var2;
                        mystack.Push(result);
                        break;
                    case '-':
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1-var2;
                        mystack.Push(result);
                        break;
                    case '/':
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();
                        result = var1/var2;
                        mystack.Push(result);
                        break;
                    case '^':
                        var2 = mystack.Peek();
                        mystack.Pop();
                        var1 = mystack.Peek();
                        mystack.Pop();

                        result = (int) Math.pow(var1, var2);
                        mystack.Push(result);
                        break;
    //                default:
    //                    if (expChar[i] == '?') {
    //                        break OUTER;
    //                    }
    //                    break;
                }
            }
            System.out.println("The answer is :"+mystack.Peek());
            
        }
    } 
}
