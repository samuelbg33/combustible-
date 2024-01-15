package org.example;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        double distanciaViajeKm;
        double consumoCombustibleLitrosPor100Km;
        double precioLitroCombustible;
        double consumoTotalCombustible;
        double costoTotalCombustible;

        // Solicitar al usuario que ingrese los valores
        System.out.print("Ingrese la distancia total del viaje en kilómetros: ");
        distanciaViajeKm = scanner.nextDouble();

        System.out.print("Ingrese el consumo de combustible del carro (litros por cada 100 km): ");
        consumoCombustibleLitrosPor100Km = scanner.nextDouble();

        System.out.print("Ingrese el precio por litro de combustible: ");
        precioLitroCombustible = scanner.nextDouble();

        // Calcular el total de litros de combustible necesarios para el viaje
        consumoTotalCombustible = (distanciaViajeKm / 100) * consumoCombustibleLitrosPor100Km;

        // Calcular el costo total del combustible necesario
        costoTotalCombustible = consumoTotalCombustible * precioLitroCombustible;

        // Imprimir en consola la información relevante
        System.out.println("\nResumen del Viaje:");
        System.out.println("Distancia del viaje: " + distanciaViajeKm + " kilómetros");
        System.out.println("Consumo de combustible: " + consumoCombustibleLitrosPor100Km + " litros por cada 100 km");
        System.out.println("Precio por litro de combustible: $" + precioLitroCombustible);
        System.out.println("Consumo total de combustible: " + consumoTotalCombustible + " litros");
        System.out.println("Costo total del combustible: $" + costoTotalCombustible);



    }
}