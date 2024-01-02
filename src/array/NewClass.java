package array;

public class NewClass {

    public static void main(String[] args) {
        int n = 10, i, j, suma;
        int tablica[][] = new int[n][n];

        //wpisywanie liczb do tablicy

        for (i = 0; i < tablica.length; i++)
        {
            for (j = 0; j < tablica.length; j++)
            {
                if (j == 0) tablica[i][j] = i;
                if (j == 1) tablica[i][j] = i * i;
                if (j > 1) tablica[i][j] = 0;

            }
        }

        //wyswietlanie zawartosci tablicy

        for (i = 0; i < tablica.length; i++)
        {
            for (j = 0; j < tablica.length; j++)
            {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }

        //obliczanie sumy
        suma = 0;

        for (i = 0; i < tablica.length; i++)
        {
            suma += tablica[i][0];
        }
        System.out.println("\nsuma liczb znajdujaca sie w pierwszej kolumnie to : " + suma + ".");

        suma = 0;

        for (i = 0; i < tablica.length; i++)
        {
            suma += tablica[i][1];
        }
        System.out.println("suma liczb znajdujaca sie w drugiej kolumnie to : " + suma + ".");


    }
}
