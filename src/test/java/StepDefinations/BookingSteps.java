package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps {
	
	@Given("User wants to select the car {string} from uber application")
	public void user_wants_to_select_the_car_from_uber_app(String carType) {
	    System.out.println("step 1: "+carType);
	}

	@When("user select car {string} and pick up point {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation) {
	    System.out.println("step 2:"+carType+ " "+ pickUpLocation+" "+dropLocation);
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
	    System.out.println("step 3");
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("step 4");
	}

	@Then("user pays {int} dollars")
	public void user_pays_dollars(Integer price) {
	    System.out.println("step 5");
	}

}
