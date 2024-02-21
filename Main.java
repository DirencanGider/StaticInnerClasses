public class Main {

    public static void main(String[] args) { //  3

        Matematik.Alan alan = new Matematik.Alan(); /* Bu sefer Matematiği oluşturmadan direkt Matematik içerisindeki
                                                       Alan class'ının objesini oluşturabiliyoruz.  */  //  4

        alan.daire_alan(5);

        //  Şimdi metodu da static yapıp öyle deneyelim.  //  5

        //  Metodu static yaptıktan sonra da herhangi bir problem çıkmadı.  //  7

        Matematik.Alan.daire_alan(6); /* Metodu statik yaptıktan sonra bu şekilde de obje oluşturmadan direkt
                                                medotu çağırabiliyoruz. */  //  8



    }

}
