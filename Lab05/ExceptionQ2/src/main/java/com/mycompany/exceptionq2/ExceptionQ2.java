

package com.mycompany.exceptionq2;

public class ExceptionQ2 {

    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5};
        
        try{
            int value=numbers[10];
            //int result=value/0
            System.out.println("Value: "+value);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is out of bounds.");
        }catch(java.lang.Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+"");
            }
        }
    }
}
