public class Equals {
    
    /**
     * Equals Method
     * Comparing Objects
     * IMPORTANT NOTE: the parameter of the .equals method must be of type Object, not the class name (ex: Color), because we want to be able to compare any two objects, not just objects of the same class
     * If you use the class name as the parameter, then you can only compare objects of that class, and you would have to create multiple .equals methods for each class you want to compare, which * is not efficient 
     * That would be an example of method overloading, which is when you have multiple methods with the same name but different parameters (ex: public boolean equals(Color o) and public boolean equals(TransparentColor o)) but we want method overriding, which is when you have a method in the child class that has the same signature as a method in the parent class (ex: public boolean * equals(Object obj)) 
     * @param Object
     */

    public boolean equals(Object obj) {
        // Check if the current object (using the this keyword) is being compared to itself
        // If the objects are the same instance, they are equal
        // This means that both objects point to the same memory location

        // OBJECT A ---------------> MEMORY LOCATION 1
        // OBJECT B ---------------> MEMORY LOCATION 1
        // In this case, OBJECT A and OBJECT B are in the same memory location, so they are considered equal
        // So in the code below, you can pretend that this is OBJECT A and obj is OBJECT B, and we are checking if they point to the same memory location

        if (this == obj){
            return true;
        }

        // Check if the object being compared is null (has not assigned attributes) or (||) if it belongs to a different class
        // If either condition is true, the objects cannot be considered equal

        // getClass() is a method that returns the class of an object at runtime, which occurs after compilation
        // At compile time, the data-type of the object is determined, but at runtime, the actual class of the object can be checked using getClass()
        // EX: Animal dog = new Dog();
        // At compile time, the data-type of the object is Animal, but at runtime, getClass() would return Dog, which is the actual class of the object
        // An object is created by using the new keyword, followed by the class name. (ex: new Dog();)
        // So this statement is used to check if two objects belong to the same class

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        // Cast the object to the correct type (like how we cast int to double) and compare attributes
        // Attributes are the fields we create using private (ex: private int red;)
        // We need to cast the object (obj) to the correct type (in this case, Equals) in order to access its attributes for comparison

        Equals other = (Equals) obj;


        // Compare relevant attributes here 
        // EX: return this.attribute.equals(other.attribute); 
        // This is to compare attributes that are objects (like Strings)
        // OR
        // EX: return this.red == other.red && this.green == other.green && this.blue == other.blue; 
        // This is to compare attributes that are primitive data types (like int)

        // OR
        // if(this.attribute.equals(other.attribute)){
        //     return true;
        // }

        return false;
    }
   
    /**
     * Equals method without comments
     * This is just to show what the .equals method would look like without the comments, so you can see the structure of the method more clearly
     * The method signature should be the same as the .equals method above (public boolean equals(Object obj)), but I am naming it equalsWithoutComments to avoid confusion with the .equals method above
     * @param Object to compare
     * @return true if objects are equal, false otherwise
     */

    public boolean equalsWithoutComments(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Equals other = (Equals) obj;

        // Compare relevant attributes here

        return false;
    }   

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    // Now lets pretend we are in the child class and we want to compare the attributes of the parent class and the child class in the .equals method of the child class

    /**
     * Equals method in the Child Class
     * it would normally be written like this: public boolean equals(Object obj) but I am writing it like this (equalsInChildClass) to avoid confusion with the .equals method in the parent class 
     * @param Object
     */

    public boolean equalsInChildClass(Object obj){
        // Compare the attributes of the parent class
        // In this .equals method, we are in the child class, so we need to call the .equals method of the parent class (using super.equals(obj)) 
        // This will use the equals method above (public boolean equals(Object obj)) that is inside the Parent class (again, lets pretend we have two classes, a Parent class and a Child class)
        // It is going to run through all the checks in the Parent class (like checking if the objects are the same instance, if the object is null, if they belong to different classes, and comparing the attributes of obj to the attributes of the parent class)
        // If any of those checks fail, then the objects are not equal, so we can return false immediately without needing to compare the attributes of the child class

        if(super.equals(obj) == false){
            return false;
        }
        // If it doesn't fail, then we can continue to compare the attributes of the child class (which are attributes that are only in the child class and not in the parent class) to the object being compared (obj) by first casting obj to the correct type (the child class) and then comparing the attributes of the child class to the attributes of obj (which is now casted to the child class)
        
        // Cast the object to the correct type (the child class) in order to access its attributes for comparison
        // EX: ChildClass other = (ChildClass) obj;
        // EX: return this.childAttribute.equals(other.childAttribute);
        // OR
        // EX: ChildClass other = (ChildClass) obj;
        //     return this.childRed == other.childRed && this.childGreen == other.childGreen
        
        return false;
        
    }

}