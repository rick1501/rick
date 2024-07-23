# language: es
@qa
Característica: Navegación exitosa a una página en DemoQA

  Antecedentes:
    Dado que el usuario abre el navegador en la página de DemoQA

  @moduloElements
  Esquema del escenario : Interacción exitosa con el módulo Elements
    Cuando el usuario navega a Elements seccion TextBox
    Y interactúa con los elementos de la sección
      |fullname|email|currentAddress|permanentAddress|
    Entonces validamos la información ingresada <mensaje>
    Ejemplos:
      |fullname|email|currentAddress|permanentAddress|mensaje|
      |Ricardo|ricardo@gmail.com|Cra 34 # 23 -34|Cra 34 # 23 -34|Name: Ricardo|

  @moduloCheckBox
  Esquema del escenario: Interacción exitosa con el módulo Check Box
    Cuando el usuario navega a Elements sección CheckBox
    Y selecciona las siguientes opciones en CheckBox
      |opciones|
      |Notes|
      |WorkSpace|
      |Office|
      |Word File.doc|
    Entonces validamos que las opciones seleccionadas son correctas
    Ejemplos:
      |opciones|
      |Notes|
      |WorkSpace|
      |Office|
      |Word File.doc|

  @moduloRadioButton
  Esquema del escenario: Interacción exitosa con el módulo Radio Button
    Cuando el usuario navega a Elements sección RadioButton
    Y selecciona la opción <opcion>
    Entonces validamos que la opción seleccionada es <opcion>
    Ejemplos:
      |opcion|
      |Yes|
      |Impressive|
      |No|

  @moduloWebTables
  Esquema del escenario: Interacción exitosa con el módulo Web Tables
    Cuando el usuario navega a Elements sección WebTables
    Y crea un nuevo registro con la siguiente información
      |fullName|email|age|salary|department|
    Entonces validamos que el nuevo registro se ha creado correctamente <mensaje>
    Ejemplos:
      |fullName|email|age|salary|department|mensaje|
      |Ricardo|ricardo@gmail.com|30|50000|IT|Registro creado correctamente|

    Cuando el usuario edita el registro con la siguiente información
      |fullName|email|age|salary|department|
    Entonces validamos que el registro se ha editado correctamente <mensaje>
    Ejemplos:
      |fullName|email|age|salary|department|mensaje|
      |Ricardo|ricardo@gmail.com|31|55000|HR|Registro editado correctamente|

    Cuando el usuario elimina el registro con el nombre "Ricardo"
    Entonces validamos que el registro se ha eliminado correctamente <mensaje>
    Ejemplos:
      |mensaje|
      |Registro eliminado correctamente|
