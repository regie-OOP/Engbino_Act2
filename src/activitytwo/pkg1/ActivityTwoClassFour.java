
package activitytwo.pkg1;


public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int size) {
        super(size);
    }
     public double peekTop(){
       if(!isEmpty()){
           return stackArray[top];
       }else{
           System.out.println("WOIIII BAYOTTTT EMPTY IMUHANG JUSKET MADAM!!");
           return -1;
       }
}
      public double peekBottom(){
       if(!isEmpty()){
           return stackArray[0];
       }else{
           System.out.println("WOIIII BAYOTTTT EMPTY IMUHANG JUSKET MADAM!!");
           return -1;
       }
}
}