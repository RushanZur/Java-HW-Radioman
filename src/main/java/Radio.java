public class Radio {

    private int numberStation;
    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    public Radio() {
    }

    public Radio(int numberStation) {

        numberStation = numberStation + 1;
        if (numberStation > maxStation) {
            numberStation = minStation;
        }
        if (numberStation < minStation) {
            numberStation = maxStation;
        }
        this.numberStation = numberStation;

        //Для звука нужно отдельно создавать?
        volume = volume + 1;
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        if (volume < minVolume) {
            volume = minVolume;
        }
        this.volume = volume;
    }

    public void setNumberStation(int numberStation) {
        // сеттер для выбора станции пользателем
        if (numberStation <= maxStation) {
            this.numberStation = numberStation;
        } else {
            System.out.println("Такой станции не существует");
        }
        // если номер станции меньше или равно 10, то номер станции вводится как есть?
        if (numberStation >= minStation) {
            this.numberStation = numberStation;
        } else {
            System.out.println("Такой станции не существует");
        }
    }

    public int getNumberStation() {
        return numberStation;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
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

}
