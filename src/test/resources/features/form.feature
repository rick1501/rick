#language: es

@testcases
Característica:Navegación exitosa apartado form

  @testcase1
  Escenario:Interacción exitosa con el módulo form
    Dado que el usuario abre el navegador en la página qa
    Cuando el usuario interactua la sección form
    Entonces este permite ingresar la informacion y crear un registro
