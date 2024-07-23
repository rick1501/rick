package com.demo.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebTables {

    public static final Target ABRIRWEBTABLES = Target.the("ABRIR WEB TABLE")
            .located(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));

    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.xpath("//button[@id='addNewRecordButton']"));
    public static final Target FIRST_NAME_FIELD = Target.the("First name field")
            .located(By.xpath("(//input[@id='firstName'])[1]"));
    public static final Target LAST_NAME_FIELD = Target.the("Last name field")
            .located(By.xpath("(//input[@id='lastName'])[1]"));
    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.xpath("//input[@id='userEmail']"));
    public static final Target AGE_FIELD = Target.the("Age field")
            .located(By.xpath("(//input[@id='age'])[1]"));
    public static final Target SALARY_FIELD = Target.the("Salary field")
            .located(By.xpath("(//input[@id='salary'])[1]"));
    public static final Target DEPARTMENT_FIELD = Target.the("Department field")
            .located(By.xpath("//input[@id='department']"));
    public static final Target SUBMIT_BTN = Target.the("Submiton")
            .located(By.xpath("(//button[normalize-space()='Submit'])[1]"));

    // Editar y borrar botones en la tabla
    //public static final Target EDIT_BUTTON = Target.the("Edit button")
           // .locatedBy("//span[contains(text(),'{0}')]/ancestor::div[@class='rt-tr-group']//span[@title='Edit']");
    //public static final Target DELETE_BUTTON = Target.the("Delete button")
            //.locatedBy("//span[contains(text(),'{0}')]/ancestor::div[@class='rt-tr-group']//span[@title='Delete']");

    // Verificación
    public static final Target TABLE_CELL = Target.the("Table cell")
            .locatedBy("//div[@class='rt-td' and text()='{0}']");
}
