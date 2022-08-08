public class Radio {
// flexiable

    public int getNumberStation() {
        return numberStation;
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



    private int numberStation;
    private int maxNumberStation = 10;
    private int minNumberStation;
    private int volume;

    // как бы константа значения звука
    private final int maxVolume = 100;
    private final int minVolume = 0;


    public void increaseVolume() {
        if (volume < maxVolume) {
            volume += 1;
        }else {
            volume = minVolume;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume -= 1;
        }else {
            volume = maxVolume;
        }
    }

    public void nextNumberStation() {
        if (numberStation >= maxNumberStation) {
            setNumberStation(minNumberStation);
        } else {
            numberStation = numberStation + 1;
        }
    }


    public void prevNumberStation() {
        if (numberStation <= minNumberStation) {
            setNumberStation(maxNumberStation);
        } else {
            numberStation = numberStation - 1;
        }
    }


    public void setNumberStation(int numberStation) {

        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }

        this.numberStation = numberStation;
    }

    public void megaSetVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > minVolume) {
            return;
        }
        this.volume = volume;
    }


}
