package com.demo.stepDefinitions;

import com.demo.questions.Validate;
import com.demo.questions.ValidateText;
import com.demo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import static com.demo.UI.CheckBoxPage.VALIDATION;
import static com.demo.UI.TextBoxPage.TXTVALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.containsString;
import static com.demo.util.Data.*;

public class elements {



    private static EnvironmentVariables environmentVariables;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Dado("que el usuario abre el navegador en la página de DemoQA")
    public void queElUsuarioAbreElNavegadorEnLaPáginaDeDemoQA() {
        theActorCalled("actor").wasAbleTo(
                Open.url(URL)
        );

    }
    @Cuando("el usuario interactua la sección textbox")
    public void elUsuarioInteractuaLaSecciónTextbox() {
        theActorInTheSpotlight().attemptsTo(
                AbrirElementTask.on(),
                TextBox.on()
        );
    }

    @Entonces("el usuario valida la informacion ingresada")
    public void elUsuarioValidaLaInformacionIngresada() {
        theActorInTheSpotlight().should(seeThat(Validate.text(TXTVALIDATION), containsString("Name:ricardo")));
    }

    @Dado("que el usuario abre y selecciona checkbox de la seccion elements")
    public void queElUsuarioAbreYSeleccionaCheckboxDeLaSeccionElements() {
        theActorCalled("actor").attemptsTo(Open.url(URL),AbrirElementCheckbox.on());
    }
    @Cuando("el usuario interactua la sección checkbox")
    public void elUsuariointeractualaseccióncheckbox() {
        theActorInTheSpotlight().attemptsTo(CheckBoxTask.on());
    }
    @Entonces("el usuario se crea de forma correcta")
    public void elUsuarioSeCreaDeFormaCorrecta() {
        theActorInTheSpotlight().should(seeThat(ValidateText.text(VALIDATION), containsString("You have selected :\n" +
                "notes\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "wordFile")));
    }


    @Dado("que el usuario ingresa a la seccion radio button")
    public void queelusuarioingresaalaseccionradiobutton() {
        theActorCalled("actor").attemptsTo(Open.url(URL)
        );

        
    }

    @Cuando("este seleciona una de las opciones")
    public void esteselecionaunadelasopciones() {
        theActorInTheSpotlight().attemptsTo(
                AbrirElementTask.on(),
                MarcarRadio.on()
        );
        
    }

    @Entonces("este se marca de forma correcta")
    public void estesemarcadeformacorrecta() {
    }

    @Dado("que el usuario ingresa a la seccion webelement")
    public void queElUsuarioIngresaALaSeccionWebelement() {
        theActorCalled("actor").attemptsTo(Open.url(URL)
        );

    }

    @Cuando("este ingresa un nuevo dato y le de click en agregar")
    public void esteIngresaUnNuevoDatoYLeDeClickEnAgregar() {
        theActorInTheSpotlight().attemptsTo(
                AbrirElementTask.on(),
                AddRecord.on()
        );

    }

    @Entonces("este se guarda de forma correcta")
    public void esteSeGuardaDeFormaCorrecta() {
    }
}
