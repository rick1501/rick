package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demo.UI.RadioButtonPage.ABRIRRADIOBTN;
import static com.demo.UI.RadioButtonPage.RADIO_BUTTON_YES;

public class MarcarRadio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIRRADIOBTN),
                Click.on(RADIO_BUTTON_YES) // Selecciona el botón de radio "Yes"
        );
    }

    public static MarcarRadio on() {
        return new MarcarRadio();
    }
}
