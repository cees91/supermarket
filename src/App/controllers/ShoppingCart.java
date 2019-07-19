package App.controllers;

import App.models.Product;
import App.repositories.ProductsRepository;

import java.util.ArrayList;

public class ShoppingCart {
    ProductsRepository repo = ProductsRepository.getInstance();

    public void addProduct(Product product){
        if(product !=null) {
            repo.addProduct(product);
            System.out.println("Successfully added product " + product.getName());
        }
    }
    public void removeProduct(Product product){
        try {
            repo.removeProduct(product);
            System.out.println("Successfully removed product " + product.getName());
        }catch(Exception e){
            System.out.println("Product could not be removed" + product.getName() +", error: " + e);
        }
    }
    public ArrayList<Product> listProducts(){
        ArrayList<Product> list = repo.listProducts();
        return list;
    }

}
