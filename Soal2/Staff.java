package Soal2;

public class Staff extends Employee {
    private String gelar;
    
    public Staff(String nama, String alamat, String NoTelp, String email, String kantor, int gaji, MyDate TanggalKerja, String gelar){
        super(nama, alamat, NoTelp, email, kantor, gaji, TanggalKerja);
        this.gelar = gelar;
    }
    
    public String getGelar(){
        return gelar;
    }
    
    public void setGelar(String gelar){
        this.gelar = gelar;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\ngelar: " + getGelar();
    }
}
