public class Kakeibo {
    int sunyuu;
    int shishutsu;

    Kakeibo(int sunyuu, int shishutsu) {
        this.sunyuu = sunyuu;
        this.shishutsu = shishutsu;
    }

    int chokinKeisan() {
        return sunyuu - shishutsu;
    }
}
