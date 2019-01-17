package stepDefs;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionality.Cart;
import functionality.Product;
import gherkin.lexer.Ca;

import java.util.List;

public class CheckoutFeatureSteps {


    TestContext testContext;

    public CheckoutFeatureSteps(TestContext context)
    {
        testContext = context;
    }


    @When("^user clicks on cart icon$")
    public void user_clicks_on_cart_icon() throws Exception {

        System.out.println("User clicks on cart icon");
         testContext.getCart().setProductId("NI123");
        System.out.println(testContext);



    }

    @When("^user click on Proceed to Checkout$")
    public void user_click_on_Proceed_to_Checkout() throws Exception {

        System.out.println(testContext);
        if(testContext.getCart().getProductId() != null)
        {
            System.out.println("There are some products to be checked out");
        }else
        {
            System.out.println("There is nothing present in cart");
        }

    }

    @Then("^User can select address where product is delivered$")
    public void user_can_select_address_where_product_is_delivered() throws Exception {
       System.out.println("USer is able to select address");
    }


}
