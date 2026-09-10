interface Connectable{
    void connect();
    void disconect();
}

interface Switchable{
    void turnOn();
    void turnOff();
}

public class SmartTV extends SmartDevice implements Switchable, Connectable{
    int chanel;
    int volume;
    String koneksi;
    public SmartTV(int id, String nama, int daya,String status, int chanel, int volume, String koneksi){
        super(id, nama, daya, status);
        this.chanel = chanel;
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
        koneksi = "BLUETOOTH";
    }

    @Override 
    public void disconect(){
        koneksi = "-";
    }
    
    @Override
    public String printData(){
        return super.printData() + "Channerl" + chanel;

    }
}


