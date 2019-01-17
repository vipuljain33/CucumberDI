package stepDefs;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionality.Cart;

public class AddingProductsToCartStepDefs {

    TestContext testContext;

    public AddingProductsToCartStepDefs(TestContext context)
    {
        testContext = context;

    }



    @Given("^User successfully logs in$")
    public void user_successfully_logs_in() throws Exception {

        System.out.println("User is able to login");

    }

    @When("^User selects a product$")
    public void user_selects_a_product() throws Exception {
        System.out.println("User selects a product");
    }

    @When("^user clicks on Add to cart button$")
    public void user_clicks_on_Add_to_cart_button() throws Exception {

        System.out.println("USer clicks on add to cart button");

        testContext.getCart().setProductId("AD123");

        System.out.println(testContext);

    }

    @Then("^a product gets added to the cart$")
    public void a_product_gets_added_to_the_cart() throws Exception {

        System.out.println(testContext);
        if(testContext.getCart().getProductId() != null)
        {
            System.out.println("Product is added to the cart and the product id is " + testContext.getCart().getProductId());



        }else
        {
            System.out.println("Product is not added to the cart");
        }


    }
}
