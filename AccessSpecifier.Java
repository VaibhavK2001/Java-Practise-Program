// Class in the same package
class Class2 {
    public void accessTest() {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Same Package Class");
        
        // Public access
        System.out.println("Public: " + obj.publicVar);
        
        // Protected access
        System.out.println("Protected: " + obj.protectedVar);
        
        // Default access
        System.out.println("Default: " + obj.defaultVar);
        
        // Private access - Not accessible
        // System.out.println("Private: " + obj.privateVar); // This will cause an error
    }
}

// Class in a different package
// package anotherpackage;

// import AccessSpecifier;

class DifferentPackageClass extends AccessSpecifier {
    public void accessTest() {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Different Package Class");

        // Public access
        System.out.println("Public: " + obj.publicVar);
        
        // Protected access - Accessible through inheritance
        System.out.println("Protected: " + this.protectedVar);
        
        // Default access - Not accessible
        // System.out.println("Default: " + obj.defaultVar); // This will cause an error
        
        // Private access - Not accessible
        // System.out.println("Private: " + obj.privateVar); // This will cause an error
    }
}

// Main class demonstrating access specifiers
public class AccessSpecifier {
    // Access specifiers
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";
    private String privateVar = "Private Variable";
    
    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Main Class");
    
        // Public access
        System.out.println("Public: " + obj.publicVar);
        
        // Protected access
        System.out.println("Protected: " + obj.protectedVar);
        
        // Default access
        System.out.println("Default: " + obj.defaultVar);
        
        // Private access
        System.out.println("Private: " + obj.privateVar);
        
        // Accessing from the same package
        SamePackageClass samePackageObj = new SamePackageClass();
        samePackageObj.accessTest();
        
        // Accessing from a different package
        // anotherpackage.DifferentPackageClass differentPackageObj = new anotherpackage.DifferentPackageClass();
        // differentPackageObj.accessTest();
    }
}
