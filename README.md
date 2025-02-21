# Aplicación de Operaciones Matemáticas

## Descripción

Esta aplicación de Java proporciona una interfaz de usuario para realizar varias operaciones matemáticas a través de un menú interactivo. Las operaciones incluyen suma, factorial, potencia, suma de listas, media aritmética, desviación típica, suma de números pares, y producto escalar de dos listas.

## Estructura del Proyecto

El proyecto está organizado en tres paquetes principales:

1. **aplicacion**: Contiene la clase principal `Main` que inicia la aplicación.
2. **interfaz**: Contiene la clase `Interfaz` que maneja la interacción con el usuario.
3. **mates**: Contiene la clase `Matematicas` que implementa las operaciones matemáticas.

## Clases y Métodos

### Clase `Main`
La clase principal que inicia la aplicación.

- **Método `main(String[] args)`**: Método principal que crea una instancia de la clase `Interfaz` y llama al método `menu()` para iniciar la interacción con el usuario.

### Clase `Interfaz`
Esta clase maneja la interacción con el usuario a través de la consola.

- **Atributo `Scanner sc`**: Objeto `Scanner` para leer la entrada del usuario.
- **Constructor `Interfaz()`**: Inicializa el objeto `Scanner`.
- **Método `String[] instruccion()`**: Lee una línea de entrada del usuario y la divide en un array de cadenas.
- **Método `void menu()`**: Muestra el menú de opciones y maneja la lógica de las instrucciones ingresadas por el usuario.
- **Método `void help()`**: Muestra las instrucciones disponibles para el usuario.

### Clase `Matematicas`
Esta clase contiene métodos estáticos para realizar diversas operaciones matemáticas.

- **Método `static int suma1n(int n)`**: Calcula la suma de los números del 1 al `n` de forma recursiva.
- **Método `static int factorial(int n)`**: Calcula el factorial de `n` de forma recursiva.
- **Método `static int potencia(int n, int p)`**: Calcula la potencia de `n` elevado a `p` de forma recursiva.
- **Método `static int sumaLista(int[] comandos, int n)`**: Calcula la suma de los elementos de un array de enteros de forma recursiva.
- **Método `static double mediaLista(int[] comandos)`**: Calcula la media aritmética de los elementos de un array de enteros.
- **Método `static double desviacionLista(double[] comandos)`**: Calcula la desviación típica de los elementos de un array de dobles.
- **Método `static int sumaPares(int n)`**: Calcula la suma de los números pares hasta `n` de forma recursiva.
- **Método `static int sumaParesLista(int[] comandos)`**: Calcula la suma de los números pares en un array de enteros de forma recursiva.

## Uso

Para ejecutar la aplicación, simplemente compila y ejecuta la clase `Main`. El menú interactivo te permitirá seleccionar y realizar diferentes operaciones matemáticas.

## Diagrama UML

![UML.png](UML.png)

## Autor
Luis Holgado Arranz y Jesus Alejandro Hernandez Mendez