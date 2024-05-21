package Soal2;

public class Employee extends Person {
    private String kantor;
    private int gaji;
    private MyDate TanggalKerja;
    
    public Employee(String nama, String alamat, String NoTelp, String email, String kantor, int gaji, MyDate TanggalKerja){
        super(nama, alamat, NoTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.TanggalKerja = TanggalKerja;
    }
    
    public String getKantor(){
        return kantor;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    public String getTanggalKerja(){
        return TanggalKerja.getTanggal() + "-" + TanggalKerja.getBulan() + "-" + TanggalKerja.getTahun();
    }
    
    public void setKantor(String kantor){
        this.kantor = kantor;
    }
    
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    public void setTanggalKerja(){
        TanggalKerja = new MyDate();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nkantor: " + getKantor() + ", Gaji: " + getGaji() + ", Tanggal dipekerjakan: " + getTanggalKerja();
    }
}
