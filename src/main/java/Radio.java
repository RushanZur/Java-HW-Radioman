public class Radio {
    private int numberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int volume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio () {
    }

    public Radio(int numberStation, int maxNumberStation) {
        this.numberStation = numberStation;
        this.maxNumberStation = maxNumberStation;
    }

    public Radio(int volume) {
        this.volume = volume;
    }
    public int getNumberStation() {

        return numberStation;
    }

    public void setNumberStation(int numberStation) {

        if (numberStation < minNumberStation) {
            this.numberStation = maxNumberStation;
            return;
        }
        if (numberStation > maxNumberStation) {
            this.numberStation = minNumberStation;
            return;
        }

        this.numberStation = numberStation;
    }

    public int getMaxNumberStation() {

        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {

        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {

        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {

        this.minNumberStation = minNumberStation;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume > maxVolume) {
            volume = maxVolume - 1;
        }
        volume++;
    }

    public void decreaseVolume() {
        if (volume <= minVolume) {
            volume = minVolume + 1;
        }
        volume--;
    }

    public void nextNumberStation() {
        if (numberStation < maxNumberStation) {
            numberStation++;
        } else {
            numberStation = minNumberStation;
        }
    }


    public void prevNumberStation() {
        if (numberStation > minNumberStation) {
            numberStation--;
        } else {
            numberStation = maxNumberStation;
        }
    }

}
