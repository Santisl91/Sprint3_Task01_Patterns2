# Observer Pattern Example

Este proyecto de ejemplo demuestra la implementación del patrón Observer en Java utilizando un proyecto Gradle. En este escenario, creamos un sistema donde un Agente de Bolsa (Observable) notifica a varias agencias de Bolsa (Observers) sobre cambios en el mercado de valores.

## Ejecución

Asegúrate de tener Gradle y Java instalados en tu sistema. Desde la raíz del proyecto, ejecuta el siguiente comando:

gradle run

Esto compilará y ejecutará el proyecto, simulando cambios en el mercado de valores y notificando a los corredores de bolsa.

## Detalles de Implementación

StockMarket.java: Clase Observable que representa el mercado de valores. Mantiene una lista de observadores y notifica cambios a estos observadores.
StockBroker.java: Clase Observer que representa un corredor de bolsa. Recibe notificaciones sobre cambios en el mercado.
StockObserver.java: Interfaz que define el método update que los observadores implementan para recibir notificaciones.
Main.java: Clase principal con el método main que configura el mercado de valores, los corredores de bolsa y simula cambios en el mercado.

## Configuración de Gradle

El archivo build.gradle especifica la configuración del proyecto y las dependencias necesarias.

## Notas

Puedes personalizar y expandir este ejemplo según tus necesidades.
Verifica la compatibilidad de las versiones de JDK y Gradle con las bibliotecas que estás utilizando en tu proyecto.

## Estructura del Proyecto

```plaintext
observer-pattern-example
|-- src
|   |-- main
|       |-- java
|           |-- com
|               |-- example
|                   |-- observer
|                       |-- StockMarket.java
|                       |-- StockBroker.java
|                       |-- StockObserver.java
|                       |-- Main.java
|-- build.gradle





