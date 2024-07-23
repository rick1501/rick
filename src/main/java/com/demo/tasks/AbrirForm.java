package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.targets.Target;

import java.nio.file.Paths;

import static com.demo.UI.PaginaInicialUI.ELEMENTS_SECTION;
import static com.demo.UI.Paginaform.FORM_PRACTIC;
import static com.demo.UI.Paginaform.FORM_SECTION;
import static com.demo.UI.TextBoxPage.ABRIRTEXTBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demo.UI.Paginaform.*;

public class AbrirForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Define SUBJECTS_INPUT as a local variable
        Target SUBJECTS_INPUT = Target.the("Subjects input field")
                .locatedBy("#subjectsInput"); // Actualiza el selector según sea necesario

        actor.attemptsTo(
                Click.on(FORM_SECTION),
                Click.on(FORM_PRACTIC),
                Enter.theValue("ricardo").into(FIRST_NAME_FIELD),
                Enter.theValue("narvaez").into(LAST_NAME_FIELD),
                Enter.theValue("rickcnc1501@gmail.com").into(EMAIL_FIELD),
                Click.on(GENDER_OPTION),
                Enter.theValue("3162187478").into(MOBILE_FIELD),
                Enter.theValue("12-12-2015").into(DATE_OF_BIRTH_FIELD).thenHit(Keys.ENTER),
                Enter.theValue("vuelo").into(SUBJECTS_INPUT),
                Click.on(HOBBIES_OPTION),
                Upload.theFile(Paths.get("path/to/your/file")).to(PICTURE_UPLOAD_FIELD),
                Enter.theValue("calle5#20-20").into(ADDRESS_FIELD),
                SelectFromOptions.byVisibleText("Haryana").from(STATE_DROPDOWN),
                SelectFromOptions.byVisibleText("Karlnal").from(CITY_DROPDOWN),
                Click.on(SUBMIT_BUTTON)
        );
    }

    public static AbrirForm on(){
        return instrumented(AbrirForm.class);
    }
}
