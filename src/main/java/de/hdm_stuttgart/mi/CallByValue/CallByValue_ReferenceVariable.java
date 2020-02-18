package de.hdm_stuttgart.mi.CallByValue;

public class CallByValue_ReferenceVariable {

    public static void main(String[] args) {

        CallByValue_ReferenceVariable obj = new CallByValue_ReferenceVariable();

        // Edit actual obj -> change IS reflected afterwards
        System.out.println("Before (outside method): " + obj.a);
        obj.changeObj(obj);         // When we pass an object, we don't pass the actual object, but the reference to it
        System.out.println("After (outside method): " + obj.a);  // Therefore, output 100
        // Changed! Because of changed obj on the heap persists even after the end of the method

        System.out.println();
        obj.a = 0;

        // Edit reference -> change ISN'T reflected afterwards
        System.out.println("Before (outside method): " + obj.a);
        obj.changeReference(obj);   // When we pass an object, we don't pass the actual object, but the reference to it
        System.out.println("After (outside method): " + obj.a); // ATTENTION! Resulting output: 0
        // Not changed! Because of changes to a reference after the end of the method are deleted
    }

    // https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?page=1&tab=votes#tab-top

    /** Java is ALWAYS PASS-BY-VALUE
     * Unfortunately, when we pass an object,
     * we don't pass the actual object,
     * but the reference to it
     * This is confusing to beginners!
     */
    private int a;

    // Constructors
    public CallByValue_ReferenceVariable(){}

    public CallByValue_ReferenceVariable(int a){
        this.a = a;
    }

    // Edit actual obj -> change IS reflected afterwards
    private void changeObj (CallByValue_ReferenceVariable obj){
        System.out.println("\tBefore (within method): " + obj.a);
        obj.a = a + 100; // The actual Object on the heap is changed
        System.out.println("\tAfter (within method): " + obj.a); // Resulting output: 100
        /* The changes to the object on the heap cannot be reverted,
         * thereby the change persists even after the method in call by value
         */
    }

    // Edit reference -> change ISN'T reflected afterwards
    private void changeReference (CallByValue_ReferenceVariable obj){
        System.out.println("\tBefore (within method): " + obj.a);
        obj = new CallByValue_ReferenceVariable(30);   // Reference on the stack is changed
        System.out.println("\tAfter (within method): " + obj.a); // Resulting output: 30
        /* BUT the changes to the reference on the Stack are deleted
         * after the end of the method
         * in call by value
         */
    }
}
