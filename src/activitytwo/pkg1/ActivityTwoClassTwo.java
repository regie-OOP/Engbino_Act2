
package activitytwo.pkg1;

public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
    public ActivityTwoClassTwo(int size) {
        super(size);
    }
    
    public void stackElements(){
        if(!isEmpty()){
            int numElements = top + 1;
            System.out.println(numElements);
        }else{
            System.out.println("BUSOG NA IMUHANG JUSKET MA!!!!");
        }
    }
}
