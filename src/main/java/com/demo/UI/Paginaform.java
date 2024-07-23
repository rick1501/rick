package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Paginaform {
    public static final Target FORM_SECTION = Target.the("Form section")
            .located(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']"));
    public static final Target FORM_PRACTIC = Target.the("Form Practic")
            .located(By.xpath("(//li[@id='item-0'])[2]"));

    public static final Target FIRST_NAME_FIELD = Target.the("First Name field")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the("Last Name field")
            .located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("userEmail"));
    public static final Target GENDER_OPTION = Target.the("Gender option")
            .locatedBy("//label[contains(text(), '{0}')]");
    public static final Target MOBILE_FIELD = Target.the("Mobile field")
            .located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH_FIELD = Target.the("Date of Birth field")
            .located(By.id("dateOfBirthInput"));
    public static final Target SUBJECTS_FIELD = Target.the("Subjects field")
            .located(By.id("subjectsInput"));
    public static final Target HOBBIES_OPTION = Target.the("Hobbies option")
            .locatedBy("//label[contains(text(), '{0}')]");
    public static final Target PICTURE_UPLOAD_FIELD = Target.the("Picture upload field")
            .located(By.id("uploadPicture"));
    public static final Target ADDRESS_FIELD = Target.the("Address field")
            .located(By.id("currentAddress"));
    public static final Target STATE_DROPDOWN = Target.the("State dropdown")
            .located(By.id("state"));
    public static final Target CITY_DROPDOWN = Target.the("City dropdown")
            .located(By.id("city"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .located(By.id("submit"));
    public static final Target SUCCESS_MESSAGE = Target.the("Success message")
            .located(By.id("example-modal-sizes-title-lg"));
}
