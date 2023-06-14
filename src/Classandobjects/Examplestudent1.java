package Classandobjects;

public class Examplestudent1 {

	  
    public void launchBrowser(String browser)
    {
    
        if(browser.equals("chrome"))
        {
            System.out.println("Enter the url in chrome browser");
            
        }else if(browser.equals("firefox"))
        {
            System.out.println("Enter the url in firefox browser");
            
        }else if(browser.equals("ie"))
        {
            System.out.println("Enter the url in ie browser");
            
        }else if(browser.equals("safari"))
        {
            System.out.println("Enter the url in safari browser");
            
        }
        else
        {
            System.out.println("Please pass the vaild browser");
        }
        
    }
    
    
    public static void main(String[] args) {
        
    	Examplestudent1 Examplestudent1=new Examplestudent1();
    	Examplestudent1.launchBrowser("safari");
        
        
        
        
    }
	
	
	
	

}
