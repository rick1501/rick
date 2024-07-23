package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButtonPage {

    public static final Target ABRIRRADIOBTN = Target.the(" radio button")
            .located(By.xpath("//*[@id=\"item-2\"]"));

    public static final Target RADIO_BUTTON_YES = Target.the("Yes radio button")
            .located(By.xpath("//label[normalize-space()='Yes']"));
}
