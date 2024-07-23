package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.demo.UI.PaginaInicialUI.ELEMENTS_SECTION;
import static com.demo.UI.CheckBoxPage.ABRIRCHECKBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElementCheckbox implements Task {

    public static AbrirElementCheckbox on(){
        return instrumented(AbrirElementCheckbox.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELEMENTS_SECTION),
                Click.on(ABRIRCHECKBOX)
        );
    }


}