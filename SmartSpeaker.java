interface Connectable{
    void connect();
    void disconect();
}

interface Switchable{
    void turnOn();
    void turnOff();
}
public class SmartSpeaker extends SmartDevice implements Switchable, Connectable{
    int volume;
    String koneksi;
    public SmartSpeaker(int id, String nama, int daya, String status, int volume, String koneksi){
        super(id, nama, daya, status);
        this.volume = volume;
        this.koneksi = "-";
    }


    @Override
    public void turnOn(){
        status = "ON";
    }
    @Override 
    public void turnOff(){
        status = "OFF";
    }

    @Override
    public void connect(){
        koneksi = "blutut";
    }

    @Override 
    public void disconect(){
        koneksi = "-";
    }

    @Override
    public String printData(){
        return super.printData() + "volume" + volume + "koneksi" + koneksi;
    }
    

}
