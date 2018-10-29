public class pernyataanReturn {
    void perkalian(int i,int j) {
        int hasil = i*j;
        System.out.println("Hasil Perkalian : " + hasil);
        return;
    }

    public static void main(String[] args){
        pernyataanReturn a = new pernyataanReturn();
        a.perkalian(5,6);
    }
}