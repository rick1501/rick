#language: es

  @testcases
  Característica:Navegación exitosa a una página en DemoQA

  @testcase1
  Escenario:Interacción exitosa con el módulo textbox
    Dado que el usuario abre el navegador en la página de DemoQA
    Cuando el usuario interactua la sección textbox
    Entonces el usuario valida la informacion ingresada

    @testcase2
    Escenario:Interacción exitosa con el módulo checkbox
      Dado que el usuario abre y selecciona checkbox de la seccion elements
      Cuando el usuario interactua la sección checkbox
      Entonces el usuario se crea de forma correcta

    @testcase3
    Escenario:Interacción exitosa con el módulo radiobutton
      Dado que el usuario ingresa a la seccion radio button
      Cuando este seleciona una de las opciones
      Entonces este se marca de forma correcta

    @testcase4
    Escenario:Interacción exitosa con el módulo weebelements
      Dado que el usuario ingresa a la seccion webelement
      Cuando este ingresa un nuevo dato y le de click en agregar
      Entonces este se guarda de forma correcta



