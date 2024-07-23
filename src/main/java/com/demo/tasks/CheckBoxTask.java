package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demo.UI.CheckBoxPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckBoxTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTNMAS),
                Click.on(DESKTOP),
                WaitUntil.the(NOTES_CHECKBOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NOTES_CHECKBOX),
                Click.on(DOCUMENTS),
                WaitUntil.the(WORKSPACE_CHECKBOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(WORKSPACE_CHECKBOX),
                WaitUntil.the(OFFICE_CHECKBOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OFFICE_CHECKBOX),
                Click.on(DOWNLOADS),
                WaitUntil.the(WORD_FILE_CHECKBOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(WORD_FILE_CHECKBOX)
        );
    }

    public static CheckBoxTask on() {
        return instrumented(CheckBoxTask.class);
    }
}
