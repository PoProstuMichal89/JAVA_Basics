public class Tablice_wielowymiarowe {

    public static void main(String[] args) {

            String strArr[][] ={ //2 wiesze, trzy kolumny

                    {"1","2","3"},
                    {"4","5","6"}

            };

        System.out.println(strArr[0][1]); //wiersz pierwszy, kolumna 2
        System.out.println(strArr[1][2]); //wiersz 2, kolumna 3

        int numAr[][]= new int[3][4];
        numAr[1][2]=100;
        System.out.println(numAr[1][2]);// stworzenie trzech wierszy i kolumn oraz przypisanie liczby 100

        //inicjalizacja tablicy poprzez wcześnej zdefiniowane zmienne
        int numRows = 10;
        int numCols = 15;
        int arr[][]=new int[numRows][numCols];
        arr[9][14]=110;
        System.out.println(arr[9][14]);

    }

}
