package tugasKeempat;

public class Mahasiswa implements Comparable{
    private String nama;
    private int nim;
    private int nilai;

    public Mahasiswa(int nimNya, String namaNya, int nilaiNya){
        this.nama = namaNya;
        this.nim = nimNya;
        this.nilai = nilaiNya;
    }

    public String getNama(){
        return nama;
    }
    public int getNim(){
        return nim;
    }
    public int getNilai(){
        return nilai;
    }

    public void setNilai(int val){
        this.nilai = val;
    }



    @Override
    public int compareTo(Object o) {
        int cmpr = ((Mahasiswa) o).getNilai();
        return this.nilai-cmpr;
    }
}
