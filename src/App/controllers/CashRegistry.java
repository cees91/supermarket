package App.controllers;

import App.models.Product;
import App.repositories.ProductsRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CashRegistry {
    ProductsRepository repo = ProductsRepository.getInstance();
    public double showCosts(){
        ArrayList<Product> productList = repo.listProducts();
        double totalCosts = 0.0;
        Set set = new HashSet();
        set.addAll(productList);
        for(Object object:set){
            Product product = (Product) object;
            int count = repo.countProductType(product);
            totalCosts += product.calculateDiscount(count);
        }
        return totalCosts;
    }
    public double showTotalDiscount(){
        ArrayList<Product> productList = repo.listProducts();
        double totalDiscount = 0.0;
        Set set = new HashSet();
        set.addAll(productList);
        for(Object object:set){
            Product product = (Product) object;
            int count = repo.countProductType(product);
            totalDiscount += (product.getPrice() * count) - product.calculateDiscount(count);
        }
        return totalDiscount;
    }
    public double payAndgiveChange(double amount){
        double costs = showCosts();
        double change = amount - costs;
        return change;
    }
}
