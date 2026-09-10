
interface Lockable{
    void lock();
    void unlock();
}

public class SmartDoor extends SmartDevice implements Lockable{
    int pin;

    public SmartDoor(int id, String nama, int daya, String status, int pin){
        super(id, nama, daya, status);
        this.pin = pin;
    }

    @Override 
    public void lock(){
        status = "kekunci";
    }

    @Override 
    public void unlock(){
        status = "Kebuka";
    }
    @Override
    public String printData(){
        return super.printData() + "Pin: " + pin;
    }
}