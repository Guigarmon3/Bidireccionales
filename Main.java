import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Valores
        Scanner sc = new Scanner(System.in);

        // Codigo
        System.out.print("Cuantos alumnos tienes? ");
        int alumnos = sc.nextInt();

        String[][] array = new String[alumnos+1][7];

        for (int i=1; i<=alumnos;i++) {
            System.out.println("Nombre alumno");
            String nombre = sc.next();
            array[i][0] = nombre;
        }

        notas(array);
        signatures(array);
        tabla(array);
        estrellicademadrugada(array);
        mediaalumno(array);
        busqueda(array);
    }
    public static void busqueda(String[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Lista de alumnos");
        System.out.println("------------------");
        for(int i=1;i<array.length;i++){
            System.out.println(array[i][0]);
        }
        System.out.println("------------------");
        System.out.println("De que usuario quieres buscar?");
        String nombre = sc.next();
        for(int i=1;i<array.length;i++){
            if (array[i][0].toUpperCase().equals(nombre.toUpperCase())) {
                System.out.println("---------------------");
                System.out.println("Lista de asignaturas");
                System.out.println("---------------------");
                for(int j = 1;j==1;j++) {
                    for (int k=1;k<array[i].length;k++) {
                        System.out.println(array[0][k]);
                    }
                }
                System.out.println("---------------------");
                String asignatura = sc.next();
                for(int j = 1;j==1;j++) {
                    for (int k=1;k<array[i].length;k++) {
                        if (asignatura.toUpperCase().equals(array[0][k].toUpperCase())){
                            System.out.println("La nota de " + array[i][0] + " en " + array[0][k] + " es -> " + array[i][k]);
                        }
                    }
                }
            }
        }
    }

    public static void estrellicademadrugada(String[][] array) {
        for(int i=1; i<array.length;i++){
            double resultado = 0;
            System.out.println("Calificaciones de " + array[i][0].toUpperCase());
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            for (int j=1;j<array[i].length;j++) {
                String estrellas = "";
                resultado = Double.parseDouble(array[i][j]);
                resultado = Math.round(resultado);
                for(int k=0;k<resultado;k++){
                    estrellas+="*";
                }
                System.out.println(array[0][j] + ":" + estrellas);
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void mediaalumno(String[][] array) {
        for(int i=1; i<array.length;i++){
            float total = 0;
            for (int j=1;j<array[i].length;j++) {
            total += Float.parseFloat(array[i][j]);
            }
            float totalmedia = total/7;
            float resultado = Math.round(totalmedia * 100f) / 100f;
            System.out.println("Media de " + array[i][0] + ":" + resultado);
        }
    }

    public static void notas(String[][] array) {
        for(int i=1;i<array.length;i++) {
            for(int j=1;j<array[i].length;j++) {
                double numero = Math.random() * 10.0;
                double nota = Math.round(numero * 100.0) / 100.0;
                String numeros = String.valueOf(nota);
                array[i][j] = numeros;
            }
        }
    }

    public static void signatures(String[][] array) {
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (j == 1) {
                    array[0][j] = "Matematicas";
                } else if (j==2) {
                    array[0][j] = "Tecnologia";
                } else if (j==3) {
                    array[0][j] = "Informatica";
                } else if (j==4) {
                    array[0][j] = "Ingles";
                } else if (j==5) {
                    array[0][j] = "Lengua";
                } else if (j==6) {
                    array[0][j] = "LLengua";
                }
            }
        }
    }

    public static void tabla(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String cellValue = (array[i][j] != null) ? array[i][j] : "---";
                if (i == 0 && j == 0) {
                    System.out.printf("| %-15s", "");
                }
                else if (j == 0) {

                    System.out.printf("| %-15s", cellValue);
                }
                else {

                    System.out.printf("| %-10s", cellValue);
                }
            }
            System.out.println(" |");
            if (i == 0) {
                System.out.println("--------------------------------------------------------------------------------------------------------------------");
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
