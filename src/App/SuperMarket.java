package App;

import App.controllers.CashRegistry;
import App.controllers.ShoppingCart;

public class SuperMarket {
    ShoppingCart cart;
    CashRegistry registry;
    public SuperMarket(){
        this.cart = new ShoppingCart();
        this.registry = new CashRegistry();
    }

}
