package Constructorconcept;

public class A {

	 A()
	    {
	        System.out.println("this is default");
	        
	    }
	    
	    //single param constructor
	    A(int a)
	    {
	        System.out.println("This is single int param constructor");
	    }
	    
	    
	    A(char a)
	    {
	        System.out.println("This is single char param constructor");
	    }
	    
	    A(char a,int b)
	    {
	        System.out.println("This is 2 param constructor with differenet order");
	    }
	    
	    A(int a,int b)
	    {
	        System.out.println("This is 2 param constructor");
	    }
	    
	    A(int a,int b,int c)
	    {
	        System.out.println("This is 3 param constructor");
	    }
	    
	    void show()
	    {
	        System.out.println("This is Method");
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        //creation of object for class
	        A obj=new A();
	        A obj1=new A(1);
	        
	        A obj2=new A('s');
	        obj.show();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        /*
	        
	        obj.name="nucot";
	        System.out.println(obj.name);
	        A obj1=new A();
	        obj1.name="abc";
	        System.out.println(obj1.name);
	        A obj2=new A();
	        A obj3=new A();
	        A obj4=new A();
	        A obj5=new A();
	        A obj6=new A();
	        */
	        
	        
	    }
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	}


