package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteClientPage;


public class DeleteClientSteps {
private DeleteClientPage deleteClientpage=new DeleteClientPage();

	@Given ("the user is on the view client page")
	public void navigateToeViewClientPage() {
		deleteClientpage.navigateTo();
	}
		
    @When ("the user click on the delete button")
    public void deleteClientDetails() {
    	deleteClientpage.navigatesTo();
    }
    
    @And ("the user click on ok button for confirmation")
    public void confirmClientDetails() {
    	deleteClientpage.confirmTo();
    }
      
    @Then ("the Client deleted successfully message should be on output page")
    public void deleteClientSuccessfully() {
    	assertEquals("Client deleted successfully",deleteClientpage.isclientDeleted());
    }

}
