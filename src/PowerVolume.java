public class PowerVolume {
    private int power;
    private int volume;

    public PowerVolume() {
    }

    public PowerVolume(int power, int volume) {
        this.power = power;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "{" +
                "power=" + power +
                ", volume=" + volume +
                '}';
    }
}
