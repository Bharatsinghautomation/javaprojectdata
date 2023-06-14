package Classandobjects;

public class Searchproduct {
    //.Method which is having both return type and araguments or paramets
    public String searchProductList(String productName)
    {
        
        System.out.println("Searching the product from the productlist");
        
        switch(productName)
        {
        case "hp":
            System.out.println("List of hp Mobiles");
            break;
        
        case "samsung":
            System.out.println("List of samsung Mobiles");
            break;
        
        case "oneplus":
            System.out.println("List of oneplus Mobiles");
            break;
        
        
        case "mi":
            System.out.println("List of mi Mobiles");
            break;
        
        case "asus":
            System.out.println("List of asus Mobiles");
            break;
            
        case "oppo":
            System.out.println("List of oppo Mobiles");
            break;
        
        case "vivo":
            System.out.println("List of vivo Mobiles");
            break;
    
        case "apple":
            System.out.println("List of apple Mobiles");
            break;
        
        default:
            System.out.println("pass vaild mobile name");
            break;
       
        
        }
        return productName;
        
        
    }
    
    
    
    public static void main(String[] args) {
    	Searchproduct SearchproductObject=new Searchproduct();
        SearchproductObject.searchProductList("apple");
    }


	
	
	
	}


