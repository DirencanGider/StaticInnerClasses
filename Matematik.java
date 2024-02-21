public class Matematik {

    private static double PI = Math.PI;  //  9

    public static class Alan {  // 1

        public static void daire_alan (int yaricap) {  //  2  //  Metodu static yaptık. Şimdi Main.java da tekrar çağıralım.  //  6

            //System.out.println("Dairenin Alanı : " + (yaricap * yaricap * Math.PI));

            System.out.println("Dairenin Alanı : " + (yaricap * yaricap * PI));  /* Yukarıda Matematik çerçeve class'ında
                                                                                    tanımlamış olduğumuz static PI'yi direkt
                                                                                    olarak bu inner class'ta obje oluşturmadan
                                                                                    kullanabiliyoruz. private erişim belirleyici
                                                                                    olsa bile problem çıkmadan inner class
                                                                                    olduğu için çağırarak kullanabiliyoruz. */  //  10

        }


    }

}
