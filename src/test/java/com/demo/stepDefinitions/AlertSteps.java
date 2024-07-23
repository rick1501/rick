package com.demo.stepDefinitions;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class AlertSteps {

    @Dado("que el usuario abre el navegador en la página qa")
    public void elUsuarioAbreElNavegadorEnLaPaginaQA() {
        OnStage.theActorCalled("User").attemptsTo(
                Open.url("https://demoqa.com/alerts")
        );
    }

    @Cuando("el usuario interactua la sección alert")
    public void elUsuarioInteractuaLaSecciónAlert() {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }

    @Entonces("este permite ingresar la informacion y seleccionar")
    public void estePermiteIngresarLaInformacionYSeleccionar() {
        OnStage.theActorInTheSpotlight().should(

        );
    }
}
