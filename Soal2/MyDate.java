package Soal2;

import java.util.Calendar;

public class MyDate {
    private int tahun;
    private int bulan;
    private int tanggal;
    
    MyDate(){
        Calendar kalender = Calendar.getInstance();
        tahun = kalender.get(Calendar.YEAR);
        bulan = kalender.get(Calendar.MONTH);
        tanggal = kalender.get(Calendar.DAY_OF_MONTH);
    }
    
    MyDate(long WaktuBerlalu){
        setDate(WaktuBerlalu);
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public String getBulan(){
        String b = String.valueOf(bulan + 1);
        return (bulan < 10 ? "0" + b : b);
    }
    
    public String getTanggal(){
        String t = String.valueOf(tanggal);
        return (tanggal < 10 ? "0" + t : t);
    }
    
    public void setDate(long WaktuBerlalu){
        Calendar kalender = Calendar.getInstance();
        kalender.setTimeInMillis(WaktuBerlalu);
        tahun = kalender.get(Calendar.YEAR);
        bulan = kalender.get(Calendar.MONTH);
        tanggal = kalender.get(Calendar.DAY_OF_MONTH);
    }
}
