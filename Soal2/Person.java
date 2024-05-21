package Soal2;

public class Person {
    private String nama;
    private String alamat;
    private String NoTelp;
    private String email;
    
    public Person(){
        nama = "TidakTahu";
        alamat = "TidakTahu";
        NoTelp = "TidakTahu";
        email = "TidakTahu";
    }
    
    public Person(String nama, String alamat, String NoTelp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.NoTelp = NoTelp;
        this.email = email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getNoTelp(){
        return NoTelp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setNoTelp(String NoTelp){
        this.NoTelp = NoTelp;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "nama: " + getNama() + ", alamat: " + getAlamat() + "\nNomor Telpon: " + getNoTelp() + ", email: " + getEmail();
    }
}
