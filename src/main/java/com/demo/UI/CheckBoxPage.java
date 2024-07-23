package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckBoxPage {
    public static final Target ABRIRCHECKBOX = Target.the("ABRIRCHECKBOX")
            .located(By.xpath("//*[@id=\"item-1\"]"));

    public static final Target BTNMAS = Target.the("BTNMAS")
            .located(By.xpath("//button[@aria-label='Toggle']\n"));
    public static final Target DESKTOP = Target.the("DESKTOP")
            .located(By.xpath("//span[contains(text(), 'Desktop')]/../../button"));

    public static final Target NOTES_CHECKBOX = Target.the("Notes checkbox ")
            .located(By.xpath("//span[contains(text(), 'Notes')]/ancestor::label/span[@class='rct-checkbox']\n"));

    public static final Target DOCUMENTS = Target.the("Documents")
            .located(By.xpath("//span[contains(text(), 'Documents')]/../../button"));

    public static final Target WORKSPACE_CHECKBOX = Target.the("WorkSpace checkbox")
            .located(By.xpath("//span[contains(text(), 'WorkSpace')]/ancestor::label/span[@class='rct-checkbox']\n"));
    public static final Target OFFICE_CHECKBOX = Target.the("Office checkbox")
            .located(By.xpath("//span[contains(text(), 'Office')]/ancestor::label/span[@class='rct-checkbox']\n"));

    public static final Target DOWNLOADS = Target.the("DOWNLOADS")
            .located(By.xpath("//span[contains(text(), 'Downloads')]/../../button"));

    public static final Target WORD_FILE_CHECKBOX = Target.the("Word File.doc checkbox")
            .located(By.xpath("//span[contains(text(), 'Word File.doc')]/ancestor::label/span[@class='rct-checkbox']"));

    public static final Target VALIDATION = Target.the("Word File.doc checkbox")
            .located(By.id("result"));
}
