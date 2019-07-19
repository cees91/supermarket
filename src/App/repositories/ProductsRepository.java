package App.repositories;

import App.models.Product;

import java.util.ArrayList;

public class ProductsRepository {
    private static ProductsRepository instance = null;
    private ArrayList<Product> productList = new ArrayList<>();
    private ProductsRepository(){

    }
    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void removeProduct(Product product){
        this.productList.remove(product);
    }
    public ArrayList<Product> listProducts(){
        return this.productList;
    }

    public static ProductsRepository getInstance(){
        if(instance == null){
            instance = new ProductsRepository();
        }
        return instance;
    }
}
