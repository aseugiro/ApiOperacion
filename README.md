# Operaciones-Calculadora

Realiza operaciones de suma, resta, multiplicación y división

## Requisitos Previos

Antes de ejecutar esta aplicación, asegúrate de tener instalados los siguientes programas:

* **Java Development Kit (JDK):** Versión 18 o superior. Puedes descargarlo desde [enlace de descarga de JDK 18 o un proveedor como Adoptium](aquí_va_el_enlace).
* **Apache Maven:** Versión 3.8.6 o superior. Puedes descargarlo e instalarlo siguiendo las instrucciones en [enlace a la página de descarga/instalación de Maven](https://maven.apache.org/download.cgi).

## Configuración

1.  **Clonar el repositorio (si aplica):**
    ```bash
    git clone [https://github.com/sindresorhus/del](https://github.com/sindresorhus/del)
    cd [nombre del directorio del repositorio]
    ```

2.  **Construir la aplicación con Maven:**
    Asegúrate de estar en el directorio raíz del proyecto (donde se encuentra el archivo `pom.xml`) y ejecuta el siguiente comando:
    ```bash
    mvn clean install
    ```
    Este comando descargará las dependencias, compilará el código fuente y empaquetará la aplicación.

## Ejecución

Una vez que la aplicación se haya construido exitosamente, puedes ejecutarla de las siguientes maneras:

**Opción 1: Ejecutar el JAR empaquetado**

1.  Después de la construcción con Maven, se habrá generado un archivo JAR ejecutable en el directorio `target`. El nombre del archivo será similar a `target/Operaciones-1.0-SNAPSHOT.jar` (la versión puede variar).

2.  Abre una terminal o símbolo del sistema, navega hasta el directorio `target` y ejecuta el siguiente comando:
    ```bash
    java -jar target/Operaciones-1.0-SNAPSHOT.jar
    ```
   
**Opción 2: Ejecutar directamente con Maven (para desarrollo)**

Para un desarrollo más rápido, puedes ejecutar la aplicación directamente utilizando el plugin de Spring Boot Maven:

1.  Asegúrate de estar en el directorio raíz del proyecto.

2.  Ejecuta el siguiente comando:
    ```bash
    mvn spring-boot:run
    ```
    Esto iniciará la aplicación directamente desde tu entorno de desarrollo.

## Endpoints y Uso (si aplica)


* **API REST:** Los endpoints de la API REST están disponibles en `http://localhost:8080/api/arithmetic/sum`, `http://localhost:8080/api/arithmetic/subtract`, `http://localhost:8080/api/arithmetic/multiply`, `http://localhost:8080/api/arithmetic/divide`. 
* **Parametros** `operador1=8&operador2=1`
* **Ejemplo** `http://localhost:8080/api/arithmetic/sum?operador1=8&operador2=1`

## Construido con

* **Java:** Versión 18
* **Maven:** Versión 3.8.6
* **Spring Boot:** Versión 3.4.3

---