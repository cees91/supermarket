package App;

import App.controllers.CashRegistry;
import App.controllers.ShoppingCart;
import App.models.Diapers;
import App.models.Kwark;
import App.models.Product;
import App.models.Robijn;
import App.repositories.ProductsRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class SuperMarket {
    private ShoppingCart cart;
    private CashRegistry registry;
    private Product robijn;
    private Product brinta;
    private Product chineseVeg;
    private Product kwark;
    private Product diapers;
    private ArrayList<Product> productList = new ArrayList();
    public SuperMarket(){
        this.cart = new ShoppingCart();
        this.registry = new CashRegistry();

    }
    public void open(){
        addProducts();
        System.out.println("Lets do some shopping!");
        int productNumber = 30;
        for(int i =0; i < productNumber; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
            this.cart.addProduct(productList.get(randomNum));
        }
        System.out.println("What do I have in my shopping cart at the moment? ");
        System.out.println("Total discount: " + this.registry.showTotalDiscount());
        System.out.println(checkCart());
        System.out.println("Total costs: " + this.registry.showCosts());
        System.out.println("AAAH this costs way too much!!!!");
        this.cart.removeProduct(this.diapers);
        this.cart.removeProduct(this.diapers);
        this.cart.removeProduct(this.diapers);
        System.out.println("What do I have in my shopping cart at the moment? ");
        System.out.println(checkCart());
        System.out.println("Total costs: " + this.registry.showCosts());
        System.out.println("Payed with: " + 200 + ", change is:" +  this.registry.payAndgiveChange(200));
        System.out.println("Total discount: " + this.registry.showTotalDiscount());
    }


    private String checkCart(){
        ProductsRepository repo = ProductsRepository.getInstance();
        ArrayList<Product> productList = this.cart.listProducts();
        Set set = new HashSet();
        set.addAll(productList);
        String terminalScreen = "Shopping cart: \n";
        for(Object object:set) {
            Product product = (Product) object;
            int count = repo.countProductType(product);
            terminalScreen += product.getName() + ", amount: " + repo.countProductType(product) + ".\n";
        }
        return terminalScreen;
    }
    private void addProducts(){
        this.robijn = new Robijn("Robijn", 3);
        this.brinta = new Product("Brinta", 2.5);
        this.chineseVeg = new Product("Chinese Groenten", 5);
        this.kwark = new Kwark("Kwark", 2);
        this.diapers = new Diapers("Luiers", 10);
        this.productList.addAll(Arrays.asList(this.robijn, this.brinta,this.chineseVeg, this.kwark, this.diapers));
    }
}
