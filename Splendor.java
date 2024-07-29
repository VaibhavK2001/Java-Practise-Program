class Bike{  
    void run(){System.out.println("running");}  
  }  


  public class Splendor extends Bike{  
    public void break12(){
    
    }
    public static void main(String args[]){  
      Bike b = new Splendor();//upcasting  
      b.run();
    }  
  }  