import java.util.Scanner;
import java.util.InputMismatchException;

public class EjerciciosT3 {
    public static void main (String[] args){
        int option;
        Scanner teclado = new Scanner(System.in);
        do{

            System.out.println("Elija uno de los siguientes ejercicios.");
            menu();
            option = teclado.nextInt();
            switch(option){
                case 1:
                    tiempo(teclado);
                    break;
                case 2:
                    tiempoMejorado(teclado);
                    break;
                case 3:
                    mesCorrespondiente(teclado);
                    break;
                case 4:
                    tiempoCoccion(teclado);
                    break;
                case 5:
                    mostrarNomina(teclado);
                    break;
                case 6:
                System.out.println("Gracias.");
                break;
                default:
                    System.out.println("El valor introducido no es válido.");
                    break;

            }


        }while(option!=6);
    }
    private static void menu(){
        System.out.println("1. El tiempo.");
        System.out.println("2. El tiempo mejorado.");
        System.out.println("3. Nombre del mes.");
        System.out.println("4. Tiempo de cocción.");
        System.out.println("5. La nómina.");
        System.out.println("6. Salir. ");

    }
    private static void tiempo(Scanner teclado){
        System.out.println("Introduzca una temperatura en grados Celsius: ");
        double temperatura = teclado.nextDouble();
        if(temperatura < 2){
            System.out.println("Riesgo de hielo.");
        }else{
            System.out.println("OK. Ningún riesgo de hielo.");
        }
    }

    private static void tiempoMejorado(Scanner teclado){
        System.out.println("Introduzca una temperatura en grados Celsius: ");
        double temperatura = teclado.nextDouble();
        if(temperatura < 2){
            System.out.println("Riesgo de hielo.");
        }else if (temperatura >= 2 && temperatura < 15){
            System.out.println("Hace frío.");
        }else if(temperatura >= 15 && temperatura < 30){
            System.out.println("Buena temperatura.");
        }else{
            System.out.println("Demasiado calor.");
        }
    }

    private static void mesCorrespondiente(Scanner teclado){
        System.out.print("Introduzca un número entre 1 y 12: ");
        int valorIntroducido = teclado.nextInt();
        switch(valorIntroducido){
            case 1:
                System.out.println("El mes correspondiente es Enero.");
                break;
            case 2:
                System.out.println("El mes correspondiente es Febrero.");
                break;
            case 3:
                System.out.println("El mes correspondiente es Marzo.");
                break;
            case 4:
                System.out.println("El mes correspondiente es Abril.");
                break;
            case 5:
                System.out.println("El mes correspondiente es Mayo.");
                break;
            case 6:
                System.out.println("El mes correspondiente es Junio.");
                break;
            case 7:
                System.out.println("El mes correspondiente es Julio.");
                break;
            case 8:
                System.out.println("El mes correspondiente es Agosto.");
                break;
            case 9:
                System.out.println("El mes correspondiente es Septiembre.");
                break;
            case 10:
                System.out.println("El mes correspondiente es Octubre.");
                break;
            case 11:
                System.out.println("El mes correspondiente es Noviembre.");
                break;
            case 12:
                System.out.println("El mes correspondiente es Diciembre.");
                break;
            default:
                System.out.println("El valor introducido no es válido.");
                break;
        }
    }

    private static void tiempoCoccion(Scanner teclado){
        int tipo;
        int modo;
        int resultado = 0;
        System.out.println("Tipo de carne: ");
        teclado.nextLine();

        System.out.println("1. Vacuno \n2. Cordero ");
        tipo = teclado.nextInt();

        System.out.println("Modo de cocción: ");
        System.out.println("1. Casi crudo \n2. Al punto\n3. Bien hecho");
        modo = teclado.nextInt();

        System.out.print("Introduzca el peso en gramos: ");
        int peso = teclado.nextInt();

        if(tipo == 1){
            switch (modo){
                case 1:
                    resultado = peso*10*60/500;
                    break;
                case 2:
                    resultado = peso*17*60/500;
                    break;
                case 3:
                    resultado = peso*25*60/500;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado + " segundos.") ;
        }
        else if (tipo == 2){
            switch (modo){
                case 1:
                    resultado = peso*15*60/400;
                    break;
                case 2:
                    resultado = peso*25*60/400;
                    break;
                case 3:
                    resultado = peso*40*60/400;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado + " segundos.") ;
        }
        else{
            System.out.println("El tipo de carne introducido no es correcto.");
        }



    }
private static void mostrarNomina(Scanner teclado) {
        double bruto;
        int horas60 = 0;
        int horas50 = 0;
        String estado;
        int puesto = 0;
        teclado.nextLine();
        System.out.print("Apellido de la persona: ");
        String apellido = teclado.nextLine();

        System.out.print("Nombre de la persona: ");
        String nombre = teclado.nextLine();
        do {
            try {

            System.out.println("Puesto: \n1. Agente de servicio.\n2. Empleado de oficina.\n3. Directivo");
            puesto = teclado.nextInt();
            teclado.nextLine();
            }catch (InputMismatchException e){
                System.out.println("La opción introducida no es correcta");
            }
          if (puesto == 1){
            estado = "Agente de servicio";
        }else if (puesto == 2){
            estado = "Empleado de oficina";
        }else {
            estado = "Directivo";
        }
        }while (puesto != 1 && puesto !=2 && puesto != 3);
        System.out.print("Número de horas trabajadas: ");
        int horas = teclado.nextInt();
        System.out.print("Tarifa horaria: ");
        double tarifa = teclado.nextDouble();
        System.out.print("Número de hijos: ");
        int hijos = teclado.nextInt();

        if(horas>180){
            horas60 = horas - 180;
            horas = horas - horas60;
        }
        if(horas > 169){
            horas50 = horas - 169;
            horas = horas - horas50;
        }



        bruto = ((tarifa*horas)+(tarifa*1.5*horas50)+(tarifa*1.6*horas60));

        System.out.println("************************************");

        System.out.print("Nómina de " + nombre + " " + apellido + "\nEstado: " + estado);
        System.out.println("\nSalario bruto: " + Math.round(bruto*100.0)/100.0 + "€");

        System.out.println("Cálculo de deducciones: \n" +
                "");

        double deudaSocial = bruto * 3.49/100;
        System.out.println("- Contribución para el pago de la deuda social y contingencias comunes imponible:\n" + Math.round(deudaSocial*100.0)/100.0 + "€" );

        double contNoImp = bruto * 6.15/100;
        System.out.println("- Contribución de contingencias comunes no imponible: \n" + Math.round(contNoImp*100.0)/100.0 + "€");

        double seguroMedico = bruto * 0.95/100;
        System.out.println("- Seguro médico: \n" + Math.round(seguroMedico*100.0)/100.0 + "€");

        double fondoPensiones = bruto * 8.44/100;
        System.out.println("- Fondo de pensiones: \n" + Math.round(fondoPensiones*100.0)/100.0 + "€" );

        double seguroDesempleo = bruto * 3.05/100;
        System.out.println("- Seguro de desempleo: \n" + Math.round(seguroDesempleo*100.0)/100.0 + "€" );

        double pensionComplementaria = bruto * 3.81/100;
        System.out.println("- Pensión complementaria (Entidad privada): \n" + Math.round(pensionComplementaria*100.0)/100.0 + "€" );

        double contribJubilacion = bruto * 1.02/100;
        System.out.println("- Contribución de jubilación anticipada: \n" + Math.round(contribJubilacion*100.0)/100.0 + "€" );

        double deduccionesTotales = deudaSocial+contNoImp+seguroMedico+fondoPensiones+seguroDesempleo+pensionComplementaria+contribJubilacion;
        System.out.println("- Deducciones totales de los empleados: \n" + Math.round(deduccionesTotales*100.0)/100.0 + "€" );

        double neto = bruto - deduccionesTotales;
        System.out.println("\nSalario neto: \n" + Math.round(neto*100.0)/100.0 + "€" );

  int primaFamiliar = 0;
        if(hijos == 1){
            primaFamiliar = 20;
        }else if (hijos == 2){
            primaFamiliar = 50;
        }else if (hijos>2){
            primaFamiliar = 70 + (((hijos-2)*20));
        }

        System.out.println("- Prima familiar: " + Math.round(primaFamiliar*100.0)/100.0 + "€");

        double netoAPagar = neto + primaFamiliar;
        System.out.println("\nSalario neto a pagar: \n" + Math.round(netoAPagar*100.0)/100.0 + "€" );

        System.out.println("************************************");




    }

}