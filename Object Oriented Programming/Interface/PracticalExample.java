public class PracticalExample {
    public static void main(String[] args) {
        Remote remote = new Televison();
        remote.powerOn();
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOff();
    }
}
interface Remote{
//    abstract public void volumeUp();
//    abstract public void volumeDown();
//    abstract public void powerOff();
//    abstract public void powerOn();
        void volumeUp();
        void volumeDown();
        void powerOff();
        void powerOn();
// Both are Same
}
class Televison implements Remote{

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On");
    }
}