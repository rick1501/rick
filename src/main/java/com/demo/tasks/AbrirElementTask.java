package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.demo.UI.PaginaInicialUI.ELEMENTS_SECTION;
import static com.demo.UI.TextBoxPage.ABRIRTEXTBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElementTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELEMENTS_SECTION),
                Click.on(ABRIRTEXTBOX)
        );
    }

    public static AbrirElementTask on(){
        return instrumented(AbrirElementTask.class);
    }
}
