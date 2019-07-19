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
    public void removeProduct(Product product) throws Exception{
        this.productList.remove(product);
    }
    public int countProductType(Product product){
        int count = 0;
        for(Product currentProduct: this.productList){
            if(currentProduct.getName().equals(product.getName())){
                count++;
            }
        }
        return count;
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
