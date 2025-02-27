package stepDefinitions;

import java.util.List;
import java.util.Map;

import commonMethods.commonMethodsMANDM;
import io.cucumber.java.en.*;
import pageObjects.MensClothingPageMANDM;

public class StepsCartAddsUpMANDM extends commonMethodsMANDM {
	

@When("I select the product and size I want")
public void i_select_the_product_and_size_i_want(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
	MensClothingPageMANDM.chooseProduct(data.get(0).get("Product"));
	MensClothingPageMANDM.chooseSize(data.get(0).get("Size"));
}

@When("select the first in the list size {string}")
public void select_the_first_in_the_list_size(String string) throws InterruptedException {
	MensClothingPageMANDM.addToCart(string);
}


@Then("the cart total should be price {int}")
public void the_cart_total_should_be_price(Integer int1) throws InterruptedException {
	MensClothingPageMANDM.checkItemPriceCartTotal();
}







	

}
