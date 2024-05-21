package Soal2;

public class Faculty extends Employee {
    private String JamKerja;
    private String pangkat;
    
    public Faculty(String nama, String alamat, String NoTelp, String email, String kantor, int gaji, MyDate TanggalKerja, String JamKerja, String pangkat){
        super(nama, alamat, NoTelp, email, kantor, gaji, TanggalKerja);
        this.JamKerja = JamKerja;
        this.pangkat = pangkat;
    }
    
    public String getJamKerja(){
        return JamKerja;
    }
    
    public void setJamKerja(String JamKerja){
        this.JamKerja = JamKerja;
    }
    
    public String getPangkat(){
        return pangkat;
    }
    
    public void setPangkat(){
        this.pangkat = pangkat;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nJam Kerja: " + getJamKerja() + ", Pangkat: " + getPangkat();
    }
}
