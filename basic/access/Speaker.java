package basic.access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없음. 최대 용량임");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumedown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
