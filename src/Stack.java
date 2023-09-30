public class Stack {
    int size;
    float[] stackArr;
    int top;

    public Stack(int size) {
        
        this.size = size;
        stackArr = new float[size];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(top >= size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Push(float x){
        if (isFull()) {
            System.out.println("Stack is full");
        }
        else{
            stackArr[++top] = x;
        }
    }
    
    public void Pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            
        }
    }
    
    public void DisplayStack(){
        for(int i=top;i>=0;i--){
            
            System.out.print(stackArr[i]+", ");
        }
    }
    
    public float Peek(){
        return stackArr[top];
    }
}
