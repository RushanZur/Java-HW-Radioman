public class Radio {
// flexiable
private int numberStation;
    private int volume;
    private int maxVolume;
    private int minVolume;
    private int statNumber;
    private int volUp;
    private int volDown;

    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 9) {
            maxVolume = 0;
        }
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMinVolume(int maxVolume) {
        if (minVolume < 1) {
            minVolume = 9;
        }
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getStatNumber() {
        this.statNumber = statNumber;
        return statNumber;
    }
    public void setStatNumber(int statNumber) {
        this.statNumber = statNumber;
    }
    public void setVolUp(int volUp) {
        if (volUp < 10) {
            volUp = volUp + 1;
        }
        if (volUp > 10) {
            volUp = 1;
        }
        this.volUp = volUp;
    }

    public int getVolUp() {
        return volUp;
    }
    public void setVolDown(int volDown) {
        if (volDown < 10) {
            volDown = volDown - 1;
        }
        if (volDown < 1) {
            volDown = 10;
        }
        this.volDown = volDown;
    }

    public int getVolDown() {
        return volDown;
    }
}
