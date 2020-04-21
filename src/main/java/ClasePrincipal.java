
public class ClasePrincipal {

    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        int matrizResultante[][] = new int[3][3];

        //Llenado primer matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                //Llenado automatico con funcion random
                matriz1[i][j] = (int) (Math.random() * 5); // numeros del 0 al 5
            }
        }

        //Llenado segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                //Llenado automatico con funcion random
                matriz2[i][j] = (int) (Math.random() * 5); // numeros del 0 al 5
            }
        }

        //Suma o resta de matrices
        //como las dimensiones son iguales no importa si uso el largo de la primera o la segunda matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                //Se suman las dos primeras matrices y se guarda el resultado en la matrizResultante
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //imprimiendo las matrices
        //este for es para recorrer las filas
        //este for es para la matriz1
        for (int i = 0; i < matriz1.length; i++) {
            //este for es para la matriz1
            //este for es para las columnas
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }

            System.out.print("   +   ");

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }

            System.out.print("   =   ");

            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.print("[" + matrizResultante[i][j] + "]");
            }

            System.out.println("");

        }

    }
}
