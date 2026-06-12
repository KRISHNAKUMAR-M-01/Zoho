package CustomException;

class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
}

class CheckProduct{
    int[] product={101,102,103};
    void findProduct(int productId) throws ProductNotFoundException {
        boolean isAvailable=false;
        for(int num:product){
            if(num==productId){
                isAvailable=true;
            }
        }
        if(isAvailable){
            System.out.println("Product found");
        }
        else{
            throw new ProductNotFoundException("No Product found");
        }
    }
}


public class Ecommerce {
    public static void main(String[] args) {
        CheckProduct checkProduct = new CheckProduct();
        try {
            checkProduct.findProduct(106);
        }catch (ProductNotFoundException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
