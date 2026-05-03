public class Main {
    public static void main(String[] args) {
        keisan(243000, 41000);
    }

    static void keisan(int sunyuu, int shishutsu) {
        int chokin = sunyuu - shishutsu;
        System.out.println("収入：" + sunyuu);
        System.out.println("支出：" + shishutsu);
        System.out.println("貯金：" + chokin);
    }
}
