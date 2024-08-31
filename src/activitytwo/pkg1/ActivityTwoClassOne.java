
package activitytwo.pkg1;


public class ActivityTwoClassOne { 
    int maxSize;              //so bali diria nga side kay nag instantiate lang ta ug mga variabless
    double[] stackArray;
    int top;
    
    public ActivityTwoClassOne(int size) {  // diria nga part of the story kay constructors
      maxSize = size;
      stackArray = new double[maxSize];
      top = -1;
    }
          
  public boolean isEmpty(){
      return(top == -1);
  }
  
  public boolean isFull(){
      return(top == maxSize -1);
  }
  
  public void push(double numValue){
      if(!isFull()){
       stackArray[++top] = numValue;
      } else{
          System.out.println("Full Naka Madam, Perfect Ka!!!!");
      }
 

  }
   public double pop(){
      if(!isEmpty()){
         return stackArray[top--];
                  
      }else{
          System.out.println("WOII BAYOTTTTT EMPTY IMUHANG JUSKET MADAM!!");
          return -1;
      }  
}
   
//   public double peek(){
//       if(!isEmpty()){
//           return stackArray[top];
//       }else{
//           System.out.println("WOIIII BAYOTTTT EMPTY IMUHANG JUSKET MADAM!!");
//           return -1;
//       }
//   }
   
   public void verification(){
       if(!isEmpty()){
           for(int i = top; i>=0; --i){
               System.out.println(stackArray[i]);
           }
       }
   }
   
}
