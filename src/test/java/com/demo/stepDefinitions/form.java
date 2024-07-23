package com.demo.stepDefinitions;
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


public class form {
    private static EnvironmentVariables environmentVariables;

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


   // @Dado("que el usuario abre el navegador en la página qa")
   // public void queElUsuarioAbreElNavegadorEnLaPáginaQA() {
      //  theActorCalled("actor").wasAbleTo(
         //       Open.url(URL)
       // );
   // }

    @Cuando("el usuario interactua la sección form")
    public void elUsuarioInteractuaLaSecciónForm() {


    }

    @Entonces("este permite ingresar la informacion y crear un registro")
    public void estePermiteIngresarLaInformacionYCrearUnRegistro() {
    }
}
