package guru.qa.tests;

import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static guru.qa.tests.TestData.*;

public class RegistrationFormWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(userEmail)
                .setRadioButtonGender(gender)
                .typePhone(phone)
                .calendar.setDate(day, month, year);

        registrationPage.typeSubject(subject)
                .setCheckBoxHobbies(hobby)
                .uploadImage(fileName)
                .typeCurrentAddress(currentAddress)
                .selectStateDropdownItem(state)
                .selectCityDropdownItem(city)
                .clickButtonSubmit();

        registrationPage.assertModalTitleShouldHaveValueMODALTITLE()
                .checkResultsValue("Student Name", firstName + " " + lastName)
                .checkResultsValue("Student Email", userEmail)
                .checkResultsValue("Mobile", phone)
                .checkResultsValue("Date of Birth", day + " " + month + "," + year)
                .checkResultsValue("Subjects", subject)
                .checkResultsValue("Hobbies", hobby)
                .checkResultsValue("Picture", fileNameShort)
                .checkResultsValue("Address", currentAddress)
                .checkResultsValue("State and City", state + " " + city);

    }
}
