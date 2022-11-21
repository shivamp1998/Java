package Java;
class Test 
{
    static int a = 10; 
    int b = 20; 
    static void fun1() 
    { 
        a = 20;                             //Line 1
    } 
    void fun2() 
    {     
        System.out.println("from m2"); 
    }
}
class MCQ{    
    public static void main(String[] args) 
    { 
        Test.fun1(); 
    } 
} 