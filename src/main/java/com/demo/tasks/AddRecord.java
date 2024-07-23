package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demo.UI.WebTables.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddRecord implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIRWEBTABLES),
                Click.on(ADD_BUTTON),
                Enter.theValue("Ricardo").into(FIRST_NAME_FIELD),
                Enter.theValue("Narvaez").into(LAST_NAME_FIELD),
                Enter.theValue("ricknc1501@gmail.com").into(EMAIL_FIELD),
                Enter.theValue(String.valueOf("18")).into(AGE_FIELD),
                Enter.theValue(String.valueOf("300000")).into(SALARY_FIELD),
                Enter.theValue("Cordoba").into(DEPARTMENT_FIELD),
                Click.on(SUBMIT_BTN)
        );
    }

    public static AddRecord on(){
        return instrumented(AddRecord.class);
}
}

