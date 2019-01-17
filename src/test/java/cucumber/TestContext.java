package cucumber;

import functionality.Cart;
import gherkin.lexer.Ca;

public class TestContext {

    private Cart cart;

    public TestContext()
    {
        cart = new Cart();

    }

    public Cart getCart()
    {
        return cart;
    }



}
