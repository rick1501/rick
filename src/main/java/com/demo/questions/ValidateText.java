package com.demo.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateText implements Question<String> {

    public ValidateText(Target txtValidation) {
        this.txtValidation = txtValidation;
    }

    Target txtValidation;
    public static ValidateText text(Target txtValidation) {
        return Instrumented.instanceOf(ValidateText.class).withProperties(txtValidation);
    }

    @Override
    public String answeredBy(Actor actor) {
        return txtValidation.resolveFor(actor).getText();
    }
}
