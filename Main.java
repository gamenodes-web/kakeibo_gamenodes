public class Main {
    public static void main(String[] args) {
        int[] sunyuu = {243000, 243000, 243000};
        int[] shishutsu = {41000, 50000, 60000};

        for (int i = 0; i < 3; i++) {
            int chokin = sunyuu[i] - shishutsu[i];
            System.out.println((i + 1) + "月の貯金：" + chokin);
        }
    }
}
