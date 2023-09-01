package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteMeetingPage;


public class DeleteMeetingSteps {
private DeleteMeetingPage deleteMeetingpage=new DeleteMeetingPage();

	@Given ("the user is on the view meeting page")
	public void navigateToeViewMeetingPage() {
		deleteMeetingpage.navigateTo();
	}
		
    @When ("the user click on the delete button")
    public void deleteCMeetingDetails() {
    	deleteMeetingpage.navigatesTo();
    }
    
    @And ("the user click on ok button for confirmation")
    public void confirmMeetingDetails() {
    	deleteMeetingpage.confirmTo();
    }
      
    @Then ("the Meeting deleted successfully message should be on output page")
    public void deleteMeetingSuccessfully() {
    	assertEquals("Meeting deleted successfully",deleteMeetingpage.ismeetingDeleted());
    }

}
