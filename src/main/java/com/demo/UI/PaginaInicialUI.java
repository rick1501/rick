package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialUI {
    public static final Target ELEMENTS_SECTION = Target.the("Elements section")
            .located(By.xpath("//h5[contains(text(),'Elements')]/../.."));
}
