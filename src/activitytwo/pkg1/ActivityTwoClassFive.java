
package activitytwo.pkg1;

import java.util.Stack;


public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int size) {
        super(size);
    }
   
    Stack<Double> newStack = new Stack<>();
    
    public void addStack(){
        for(int i = 0; i <= top; i++){

                System.out.println("\nAdded Stack to new Stack:" + stackArray[i]);
                newStack.push(stackArray[i]);
        }
    }
    
     public void newVerification(){
       if(isEmpty()){
           System.out.println("empty");
       }else{
           for(int i = 0; i <newStack.size(); ++i){
               System.out.println(newStack.get(i));
           }
       }
   }
}
