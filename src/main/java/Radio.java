public class Radio {

    private int numberStation;
    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;

    public int getNumberStation() {

        return numberStation;
    }
    public void setNumberStation(int numberStation) {
        if (numberStation > maxStation){
            this.numberStation = minStation;
            return;
        }
        if (numberStation < minStation) {
            this.numberStation = maxStation;
            return;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }
    public void increaseStation() {
        if (numberStation > maxStation) {
            numberStation = minStation;
        }
        numberStation++;
    }

    public void decreaseStation() {
        if (numberStation < minStation) {
            numberStation = maxStation;
        }
        numberStation--;
    }

    public void increaseVolume() {
        if (volume > maxVolume) {
            return;
        }
        volume++;
    }
    public void decreaseVolume() {
        if (volume < minVolume) {
            return;
        }
        volume--;
    }

}
