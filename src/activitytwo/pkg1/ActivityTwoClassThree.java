
package activitytwo.pkg1;

import java.util.Set;
import java.util.HashSet;

public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    
    public ActivityTwoClassThree(int size) {
        super(size);
    }
    
    public void toDuplicate(){
        Set<Double> distinct = new HashSet<>();
        int freshTop = -1;
        boolean duplicated = false;
        
        for(int i = 0; i <= top; i++){
            if (!distinct.contains(stackArray[i])){
                System.out.println("\nDuplicate Detected! " + stackArray[i]);
                stackArray[++freshTop] = stackArray[i];
                top = freshTop;
                duplicated = true;
            }else{
                System.out.println(stackArray[i]);
                duplicated = true;
            }
            
            distinct.add(stackArray[i]);
        } 
            if(!duplicated){
                System.out.println("\nWala juyyyyy nag Duplicate Manang!!");
            }
        }
    }

