#Autor: Edi
  #language: es

@HU
Característica: Validacion de PDF Estado de Situacion Financiera
  Como usuario
  Quiero realizar la validaccion del PDF Estado de Situacion Financiera
  Para ver si es el PDF correcto

  @PdfCorrecto
  Escenario: Validacion correcta de PDF

    Dado que entro a la seccion de Estados Financieros

    Cuando consulto el PDF del ultimo mes registrado

    Entonces verifico que sea el pdf correcto
      |titulo|
      |Estado de Situación Financiera a 31 de marzo de 2022.pdf|
