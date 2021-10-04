package TeoriEncapsulation;

public class TeoriEncapsulation {
	
	    private String Nama,NIM;
	    private float nilaiTugas, nilaiUTS, nilaiUAS;
	    private String Kelas;
	    private String Prodi;
	    
	    public String getNama() {
	        return Nama;
	    }
	    public String getNIM() {
	    	return NIM;
	    }
	    public String getKelas() {
	    	return Kelas;
	    }
	    public String getProdi() {
	    	return Prodi;
	    }
	    public float  getSum(float nilaiTugas, float nilaiUTS, float nilaiUAS, float Summary) {
	    	nilaiTugas=nilaiTugas*25/100;
	    	nilaiUTS=nilaiUTS*35/100;
	    	nilaiUAS=nilaiUAS*40/100;
	    	Summary= nilaiTugas+nilaiUTS+nilaiUAS;
	    	return Summary; 	
	    }  
	    public void setNama(String nama) {
	    	Nama = nama;
	    }
	    public void setNIM( String nim) {
	    	NIM = nim;
	    }
	    public void setKelas(String kelas) {
	    	Kelas = kelas;
	    }
	    public void setProdi(String prodi) {
	    	Prodi = prodi;
	    }
	    public String setGrade(float sValue, String Grade) {
	    	if(sValue>85) {
	    		Grade="A";
        	}else if(sValue>=75 && sValue<=84) {
        		Grade="B";
        	}else if(sValue>=65 && sValue<=74) {
        		Grade="C";
        	}else if(sValue>=49 && sValue<=64) {
        		Grade="D";
        	}else if(sValue<50) {
        		Grade="E";
        	}else {
        		System.out.println("Nilai Tidak Ada");
        	}
	    	return Grade;
	    }
}