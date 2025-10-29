/*Calcular el promedio de 3 calificaciones */
import java.util.Scanner;
 public class CalculadoraCalificaciones {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Solicitar al usuario que ingrese las calificaciones
         System.out.print("Ingrese la calificación de los parciales (0-100): ");
         double parciales = scanner.nextDouble();
         while (parciales < 0 || parciales > 100) {
             System.out.println("La calificación debe estar entre 0 y 100. Intente de nuevo:");
             parciales = scanner.nextDouble();
         }
         System.out.print("Ingrese la calificación del proyecto (0-100): ");
         double proyecto = scanner.nextDouble();
         while (proyecto < 0 || proyecto > 100) {
             System.out.println("La calificación debe estar entre 0 y 100. Intente de nuevo:");
             proyecto = scanner.nextDouble();
         }
         System.out.print("Ingrese la calificación del examen final (0-100): ");
         double examenFinal = scanner.nextDouble();
         while (examenFinal < 0 || examenFinal > 100) {
             System.out.println("La calificación debe estar entre 0 y 100. Intente de nuevo:");
             examenFinal = scanner.nextDouble();
         }
         // Calcular la calificación final
         double calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
         // Imprimir la calificación final
         System.out.println("La calificación final es: " + calificacionFinal);
         scanner.close();
     }
 }

/* verifique si una persona es elegible para votar. La edad mínima para votar es de 18 años */
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese su edad: ");
         int edad = scanner.nextInt();
         if (edad >= 18) {
             System.out.println("Usted es elegible para votar.");
         } else {
             System.out.println("Usted no es elegible para votar.");
         }
         scanner.close();
     }
 }

/*evaluacion de calificaciones con letras */
import java.util.Scanner;
 public class EvaluacionCalificaciones {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Solicitar al usuario que ingrese la calificación numérica
         System.out.print("Ingrese la calificación numérica (0-100): ");
         int calificacion = scanner.nextInt();
         // Validar que la calificación esté en el rango de 0 a 100
         if (calificacion < 0 || calificacion > 100) {
             System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
             scanner.close();
             return;
         }
         // Asignar la letra correspondiente a la calificación
         char letra;
         if (calificacion >= 90) {
             letra = 'A';
         } else if (calificacion >= 80) {
             letra = 'B';
         } else if (calificacion >= 70) {
             letra = 'C';
         } else if (calificacion >= 60) {
             letra = 'D';
         } else {
             letra = 'F';
         }
         // Imprimir la calificación con letra
         System.out.println("La calificación " + calificacion + " corresponde a la letra: " + letra);
         scanner.close();
     }
 }

/*Calcular precio con descuento */
import java.util.Scanner;
 public class DescuentoEstacion {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Calcular precio con descuento
         System.out.print("Ingrese el precio del producto: ");
         double precio = scanner.nextDouble();
         double descuento = 0.0;
         if (precio > 100 && precio <= 200) {
             descuento = 0.10; // 10% de descuento
         } else if (precio > 200 && precio <= 500) {
             descuento = 0.20; // 20% de descuento
         } else if (precio > 500) {
             descuento = 0.25; // 25% de descuento
         }
         double precioFinal = precio - (precio * descuento);
         System.out.println("Precio final con descuento: " + precioFinal);
         // Determinar la estación del año
         System.out.print("Ingrese el número del mes (1-12): ");
         int mes = scanner.nextInt();
         String estacion;
         switch (mes) {
             case 12:
             case 1:
             case 2:
                 estacion = "Invierno";
                 break;
             case 3:
             case 4:
             case 5:
                 estacion = "Primavera";
                 break;
             case 6:
             case 7:
             case 8:
                 estacion = "Verano";
                 break;
             case 9:
             case 10:
             case 11:
                 estacion = "Otoño";
                 break;
             default:
                 estacion = "Mes inválido";
         }
         System.out.println("La estación del año es: " + estacion);
         scanner.close();
     }
 }

/*Determinar la estación del año */
import java.util.Scanner;
 public class EstacionDelAnio {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // 1. Pedirle al usuario que ingrese un número de mes (1-12).
         System.out.print("Ingrese el número del mes (1-12): ");
         int mes = scanner.nextInt();
         // 2. Usar switch para determinar la estación del año.
         String estacion;
         switch (mes) {
             case 12:
             case 1:
             case 2:
                 estacion = "Invierno";
                 break;
             case 3:
             case 4:
             case 5:
                 estacion = "Primavera";
                 break;
             case 6:
             case 7:
             case 8:
                 estacion = "Verano";
                 break;
             case 9:
             case 10:
             case 11:
                 estacion = "Otoño";
                 break;
             default:
                 estacion = "Mes inválido";
         }
         // 3. Imprimir la estación correspondiente.
         System.out.println("La estación del año es: " + estacion);
         scanner.close();
     }
 }

/*Convertidor de grados */
import java.util.Scanner;
 public class ConvertidorDeGrados {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // 1. Pedirle al usuario que ingrese la temperatura en grados Celsius.
         System.out.print("Ingrese la temperatura en grados Celsius: ");
         double celsius = scanner.nextDouble();
         // 2. Mostrar un menú con opciones para convertir a Fahrenheit o Kelvin.
         System.out.println("Seleccione la conversión:");
         System.out.println("1. Celsius a Fahrenheit");
         System.out.println("2. Celsius a Kelvin");
         System.out.print("Ingrese su opción (1 o 2): ");
         int opcion = scanner.nextInt();
         // 3. Usar switch para realizar la conversión seleccionada.
         double resultado;
         switch (opcion) {
             case 1:
                 resultado = (celsius * 9 / 5) + 32;
                 break;
             case 2:
                 resultado = celsius + 273.15;
                 break;
             default:
                 resultado = Double.NaN; // Valor no definido
                 System.out.println("Opción inválida.");
         }
         // 4. Imprimir la temperatura convertida.
         if (!Double.isNaN(resultado)) {
             System.out.println(celsius + " grados Celsius son " + resultado + " grados " +
                     (opcion == 1 ? "Fahrenheit." : "Kelvin."));
         }
         scanner.close();
     }
 }

/*Conversor de monedas*/
import java.util.Scanner;
 public class ConversorDeMonedas {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Tasas de cambio (aproximadas) al 14 de junio de 2024
         final double USD = 18.50; // Pesos por dólar
         final double EUR = 20.00; // Pesos por euro
         final double THB = 0.53; // Pesos por baht tailandés
         final double JPY = 0.12; // Pesos por yen japonés
         final double KRW = 0.013; // Pesos por won surcoreano
         final double AUD = 12.30; // Pesos por dólar australiano
         final double PEN = 4.80; // Pesos por sol peruano
         final double CAD = 13.60; // Pesos por dólar canadiense
         final double VES = 0.00051; // Pesos por bolívar venezolano (Tasa no oficial, muy variable)
         final double ARS = 0.020; // Pesos por peso argentino (Tasa no oficial, muy variable)
         // Solicitar al usuario que ingrese la cantidad en pesos mexicanos
         System.out.print("Ingrese la cantidad en pesos mexicanos: ");
         double pesos = scanner.nextDouble();
         // Mostrar las opciones de monedas a convertir
         System.out.println("Monedas a convertir:");
         System.out.println("1. Dólar (USD)");
         System.out.println("2. Euro (EUR)");
         System.out.println("3. Baht (THB)");
         System.out.println("4. Yen (JPY)");
         System.out.println("5. Won (KRW)");
         System.out.println("6. Dólar Australiano (AUD)");
         System.out.println("7. Sol (PEN)");
         System.out.println("8. Dólar Canadiense (CAD)");
         System.out.println("9. Bolívar (VES)");
         System.out.println("10. Peso Argentino (ARS)");
         System.out.print("Seleccione la moneda a la que desea convertir: ");
         int opcion = scanner.nextInt();
         // Realizar la conversión utilizando la estructura switch
         double resultado;
         String moneda;
         switch (opcion) {
             case 1:
                 resultado = pesos / USD;
                 moneda = "dólares estadounidenses";
                 break;
             case 2:
                 resultado = pesos / EUR;
                 moneda = "euros";
                 break;
             case 3:
                 resultado = pesos / THB;
                 moneda = "baht tailandeses";
                 break;
             case 4:
                 resultado = pesos / JPY;
                 moneda = "yenes japoneses";
                 break;
             case 5:
                 resultado = pesos / KRW;
                 moneda = "wones surcoreanos";
                 break;
             case 6:
                 resultado = pesos / AUD;
                 moneda = "dólares australianos";
                 break;
             case 7:
                 resultado = pesos / PEN;
                 moneda = "soles peruanos";
                 break;
             case 8:
                 resultado = pesos / CAD;
                 moneda = "dólares canadienses";
                 break;
             case 9:
                 resultado = pesos / VES;
                 moneda = "bolívares venezolanos";
                 break;
             case 10:
                 resultado = pesos / ARS;
                 moneda = "pesos argentinos";
                 break;
             default:
                 resultado = Double.NaN;
                 moneda = "Moneda inválida";
                 System.out.println("Opción inválida.");
         }
         // Imprimir el resultado de la conversión
         if (!Double.isNaN(resultado)) {
             System.out.println(pesos + " pesos mexicanos son " + resultado + " " + moneda + ".");
         }
         scanner.close();
     }
 }

 /*Brindar informacion*/
 import java.util.Scanner;
 public class BrindarInformacion {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Solicitar al usuario que ingrese el nombre de un artista, película, serie o algo de su preferencia
         System.out.print("Ingrese el nombre de un artista, película, serie o algo de su preferencia: ");
         String nombre = scanner.nextLine();
         // Brindar información sobre lo que eligió utilizando una estructura Switch
         String informacion;
         switch (nombre.toLowerCase()) {
             case "Lady Gaga":
                 informacion = "Es una cantante, compositora, productora, bailarina, actriz, activista y diseñadora de moda estadounidense.";
                 break;
             case "Hombres de honor":
                 informacion = "pelicula estadounidense que narra la vida de un hombre de color que queria estudiar para buzo naval y en esa epoca no era permitido, poniensole obstaculos y al final saliendo victorioso.";
                 break;
             case "Merlina":
                 informacion = "Serie estadounidense que narra las aventuras de una adolescente en la escuela, donde tienen muchas aventuras y misterios por resolver.";
                 break;
             case "java":
                 informacion = "Java es un lenguaje de programación de propósito general, concurrente, basado en clases y orientado a objetos que fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.";
                 break;
             case "ciudad de méxico":
                 informacion = "La Ciudad de México es la capital de México y una de las ciudades más grandes del mundo. Es conocida por su rica historia, cultura y gastronomía.";
                 break;
             default:
                 informacion = "No se encontró información sobre lo que ingresaste.";
         }
         // Imprimir la información sobre lo que eligió
         System.out.println("Información sobre " + nombre + ": " + informacion);
         scanner.close();
     }
 }