class A  
{  
 private String msg="Try to access the private variable outside the class";

public String getMsg() {
    return msg;
}  

       
}  
public class PrivateExample1 {  
public static void main(String[] args) {  
    A a=new A();  
   System.out.println(a.getMsg());  
      
}  
}  