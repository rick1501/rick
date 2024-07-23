package com.demo.tasks;

import com.demo.UI.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.demo.UI.CheckBoxPage.NOTES_CHECKBOX;
import static com.demo.UI.TextBoxPage.ABRIRTEXTBOX;
import static com.demo.UI.TextBoxPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class  TextBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("ricardo").into(FULL_NAME_FIELD),
                Enter.theValue("ricknc1501@gmail.com").into(EMAIL_FIELD),
                Enter.theValue("calle 5 #20-21").into(CURRENT_ADDRESS_FIELD),
                Enter.theValue("calle 5#20-21").into(PERMANENT_ADDRESS_FIELD),
                Click.on(TextBoxPage.SUBMIT_BUTTON)

        );
    }

    public static TextBox on(){
        return instrumented(TextBox.class);
    }
}
