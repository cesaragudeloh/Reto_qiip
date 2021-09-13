# Automatización de la APP Swag Labs

Se realiza la automatización del escenario exitoso (happy path) de compra de un producto de la APP Swag Labs. Adicionalmente se documentan en Gherkin 3 escenarios adicionales, los cuales se proponen para la experiencia de compra de productos.

### Escenario automatizado:

	•   Buying a product


### Escenarios propuestos para la experiencia de compra:

	•   Buying the cheapest product
    •   Buying the most expensive product
    •   Buying many products

## Estrategia de automatización

Se identifica como parte de la ruta crítica de la aplicación, el escenario de compra de un producto, para el cual se han propuesto los siguientes pasos:

    •   Autenticación del usuario
    •   Selección de un producto
    •   Verificación del carrito de compras
    •   Ingreso de la información de contacto del cliente
    •   Verificación del proceso de compra 

# Patrón Screenplay

## BDD

Se utiliza BDD como framework para la automatización de los escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente,  lo que haremos será escribir pruebas que verifiquen que el comportamiento del código es correcto desde el punto de vista de negocio. Partimos de historias de usuario, siguiendo el modelo “Como [rol ] quiero [ característica ] para que [los beneficios]”. A partir de aquí, en lugar de describir en 'lenguaje natural' lo que tiene que hacer esa nueva funcionalidad, vamos a usar un lenguaje que nos va a permitir describir todas nuestras funcionalidades de una misma forma, un lenguaje específico para BDD.

## Gherkin

Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible por humanos y por ordenadores, con el vamos a definir el comportamiento de la aplicación que vamos a automatizar.
Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio.
Lo bueno de Gherkin es que para empezar a hacer BDD sólo nos hace falta conocer 5 palabras, con las que construiremos sentencias con las que vamos a describir las funcionalidades:
- Feature: Indica el nombre de la funcionalidad que vamos a probar. Debe ser un título claro y explícito. Incluimos aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.
- Scenario: Describe cada escenario que vamos a probar.
-	Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
-	When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
-	Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados.

## Cucumber

Se utiliza cucumber como herramienta para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.

## Compilación

Se crea el proyecto sobre Gradle, que es una herramienta de automatización de la construcción de nuestro código, es la versión mejorada de Maven, pero intenta llevarlo todo un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java. Dispone por otro lado de un sistema de gestión de dependencias sólido.

## Detalles generales de la implementación

La estructura completa del proyecto es la siguiente:

	exceptions: clases que controlan las posibles excepciones técnicas y del negocio que se presentan durante la ejecución de pruebas

	tasks: clases que representan tareas que realiza el actor a nivel de proceso de negocio

	interactions: clases que representan las interacciones directas con la interfaz de usuario

	userinterfaces: mapean los objetos de la interfaz de usuario

	questions: donde se verifican los resultados de las operaciones realizadas en la aplicación
	
	utils: clases de propósito general dentro de la automatización

	runners: clases que permiten ejecutar los tests

	stepdefinitions: clases que mapean las líneas Gherkin a código java

	features: la representación de las historias de usuario en lenguaje Gherkin

## Requerimientos
Para ejecutar el proyecto de automatización se requiere:

 	•   Java JDK 1.8 
 	•   Gradle versión 6.10 o superior (No se ha probado en la versión 7)
 	•   Appium versión 1.21.0
    •   SDK Android (Preferiblemente Android Studio)
    •   Un smartphone con Android 9 o superior (o un emulador)

## Capabilities de Android
Con el fin de ejecutar correctamente nuestra automatización, es necesario parametrizar nuestro archivo _serenity.properties_ con la siguiente información

    •   appium.deviceName = UID-DISPOSITIVO
    •   appium.platformVersion = ANDROID_VERSION
    •   appium.platformName = Android
    •   appium.hub= http://127.0.0.1:4723/wd/hub
    •   appium.app = https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk
    •   appium.appPackage = com.swaglabsmobileapp
    •   appium.appActivity = com.swaglabsmobileapp.MainActivity

Los 2 últimos valores, se puede obtener con la herramienta [Apk Info](https://play.google.com/store/apps/details?id=com.wt.apkinfo).

## Ejecución del proyecto

Normalmente el proyecto se puede ejecutar desde cualquier IDE que soporte JAVA (Intellij IDEA, Eclipse, Netbeans, etc), desde las opciones de ejecución que éste posea. Sin embargo, si se desea ejecutar
desde un pipeline RM o desde una línea de comandos, podemos usar las siguientes instrucciones:

	•	gradlew clean test aggregate (1)
	•	gradlew clean test --tests NOMBRE_RUNNEER aggregate (2)

Nota: el servidor de appium debe estar corriendo al momento de ejecutar los runners.

Al ejecutar los tests, las evidencias de la ejecución de las pruebas quedarán en el directorio:

	•	$(Repository.Name)/SauceLabsAutomation/target/site/serenity