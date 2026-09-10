
public abstract class SmartDevice {
    int id;
    String nama;
    int daya;
    String status;

    public SmartDevice(int id, String nama, int daya, String status){
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this.status = status;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getDaya(){
        return daya;
    }

    public void setDaya(int daya){
        this.daya = daya;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String printData(){
        return "ID: " + id + "Nama: " + nama + "Daya: " + daya + "Status" + status;
    }
}
