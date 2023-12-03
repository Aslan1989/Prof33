package lesson3.homework;

public enum Champagne {
    AUTRE(80), PREMIER(90),GRAND(100);

    private int quality;

    Champagne(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
}
