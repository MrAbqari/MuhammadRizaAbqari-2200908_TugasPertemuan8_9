package Soal2;

public class Student extends Person {
    private String status;
    public static final String MABA = "Mahasiswa Baru";
    public static final String Tahun2 = "Mahasiswa Tahun Kedua";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";
    
    public Student(String nama, String alamat, String NoTelp, String email, String status){
        super(nama, alamat, NoTelp, email);
        this.status = status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nStatus: " + getStatus();
    }
}
