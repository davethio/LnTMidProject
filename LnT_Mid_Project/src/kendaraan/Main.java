package kendaraan;

import java.util.ArrayList;
import java.util.Scanner;

abstract class kendaraan {
	private String merek;
	private String nama; 
	private String nomorLisensi; 
	private int kecepatanMaksimum; 
	private int kapasitasGas; 
	private int jumlahRoda; 
	private String jenisTipeKendaraan; 
	private String jenisTipe; 
	private String dataKhusus;
	
	

	public kendaraan(String merek, String nama, String nomorLisensi, int kecepatanMaksimum, int kapasitasGas,
			int jumlahRoda, String jenisTipeKendaraan, String jenisTipe, String dataKhusus) {
		super();
		this.merek = merek;
		this.nama = nama;
		this.nomorLisensi = nomorLisensi;
		this.kecepatanMaksimum = kecepatanMaksimum;
		this.kapasitasGas = kapasitasGas;
		this.jumlahRoda = jumlahRoda;
		this.jenisTipeKendaraan = jenisTipeKendaraan;
		this.jenisTipe = jenisTipe;
		this.dataKhusus = dataKhusus;
	}

	public String getMerek() {
		return merek;
	}

	public void setMerek(String merek) {
		this.merek = merek;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNomorLisensi() {
		return nomorLisensi;
	}

	public void setNomorLisensi(String nomorLisensi) {
		this.nomorLisensi = nomorLisensi;
	}

	public int getKecepatanMaksimum() {
		return kecepatanMaksimum;
	}

	public void setKecepatanMaksimum(int kecepatanMaksimum) {
		this.kecepatanMaksimum = kecepatanMaksimum;
	}

	public int getKapasitasGas() {
		return kapasitasGas;
	}

	public void setKapasitasGas(int kapasitasGas) {
		this.kapasitasGas = kapasitasGas;
	}

	public int getJumlahRoda() {
		return jumlahRoda;
	}

	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}

	public String getJenisTipeKendaraan() {
		return jenisTipeKendaraan;
	}

	public void setJenisTipeKendaraan(String jenisTipeKendaraan) {
		this.jenisTipeKendaraan = jenisTipeKendaraan;
	}

	public String getJenisTipe() {
		return jenisTipe;
	}

	public void setJenisTipe(String jenisTipe) {
		this.jenisTipe = jenisTipe;
	}

	public String getDataKhusus() {
		return dataKhusus;
	}

	public void setDataKhusus(String dataKhusus) {
		this.dataKhusus = dataKhusus;
	}
	
	abstract void hasilInput();
	
}

class mobil extends kendaraan{
	private int jumlahSistemEntertainment;


	public mobil(String merek, String nama, String nomorLisensi, int kecepatanMaksimum, int kapasitasGas,
			int jumlahRoda, String jenisTipeKendaraan, String jenisTipe, String dataKhusus,
			int jumlahSistemEntertainment, String tipeJenisKendaraan) {
		super(merek, nama, nomorLisensi, kecepatanMaksimum, kapasitasGas, jumlahRoda, jenisTipeKendaraan, jenisTipe,
				dataKhusus);
		this.jumlahSistemEntertainment = jumlahSistemEntertainment;
	}



	@Override
	void hasilInput() {
		System.out.println("Merek: " + getMerek());
		System.out.println("Nama: " + getNama());
		System.out.println("Plat Lisensi: " + getNomorLisensi());
		System.out.println("Tipe: " + getJenisTipeKendaraan());
		System.out.println("Kapasitas Gas: " + getKapasitasGas());
		System.out.println("Kecepatan Maksimum: " + getKecepatanMaksimum());
		System.out.println("Jumlah Roda: " + getJumlahRoda());
		System.out.println("Sistem Entertainment: " + jumlahSistemEntertainment);
		System.out.println("Turning on entertainment system...");
		if(getJenisTipeKendaraan().toLowerCase().equals("Supercar")) {
			System.out.println("Boosting!");
		}
	}

	
}

class motor extends kendaraan {
	Scanner scan = new Scanner(System.in);
	private int jumlahHelm;

	public motor(String merek, String nama, String nomorLisensi, int kecepatanMaksimum, int kapasitasGas,
			int jumlahRoda, String jenisTipeKendaraan, String jenisTipe, String dataKhusus, int jumlahHelm) {
		super(merek, nama, nomorLisensi, kecepatanMaksimum, kapasitasGas, jumlahRoda, jenisTipeKendaraan, jenisTipe,
				dataKhusus);
		this.jumlahHelm = jumlahHelm;
	}

	@Override
	void hasilInput() {
		System.out.println("Merek: " + getMerek());
		System.out.println("Nama: " + getNama());
		System.out.println("Plat Lisensi: " + getNomorLisensi());
		System.out.println("Tipe: " + getJenisTipeKendaraan());
		System.out.println("Kapasitas Gas: " + getKapasitasGas());
		System.out.println("Kecepatan Maksimum: " + getKecepatanMaksimum());
		System.out.println("Jumlah Roda: " + getJumlahRoda());
		System.out.println("Jumlah Helm: " + jumlahHelm);
		System.out.println(getNama() + "is standing!");
		
		System.out.println("Masukkan harga: ");
		int harga = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Price: " + harga);
	}
	
	
	
}




public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<ArrayList> listKendaraan = new ArrayList<ArrayList>();
	public static ArrayList<String> type = new ArrayList<String>();
	public static ArrayList<String> brand = new ArrayList<String>();
	public static ArrayList<String> name = new ArrayList<String>();
	public static ArrayList<String> license = new ArrayList<String>();
	public static ArrayList<Integer> topSpeed = new ArrayList<Integer>();
	public static ArrayList<Integer> gasCap = new ArrayList<Integer>();
	public static ArrayList<Integer> wheel = new ArrayList<Integer>();
	public static ArrayList<Integer> entertainmentSystem = new ArrayList<Integer>();
	public static ArrayList<Integer> helmet = new ArrayList<Integer>();

	
	public static void memintaInput(Scanner sc) {
		String tipe;
		String merek;
		String nama;
		String lisensi;
		int kecepatanMaksimum;
		int kapasitasGas;
		int jumlahRoda;
		int sistemEntertainment;
		int jumlahHelm;
		
		
		do {
			System.out.println("Masukkan tipe [mobil | motor]: ");
			tipe = sc.nextLine();	
		} while (!tipe.toLowerCase().equals("mobil") && !tipe.toLowerCase().equals("motor"));
		type.add(tipe);
		
		do {
			System.out.println("Masukkan merek[>=5]: ");
			merek = sc.nextLine();	
		} while (merek.length() < 5);
		brand.add(merek);
		
		do {
			System.out.println("Masukkan nama[>=5]: ");
			nama = sc.nextLine();	
		} while (nama.length() < 5);
		name.add(merek);
		
		System.out.println("Masukkan lisensi: ");
		lisensi = sc.nextLine();
		license.add(lisensi);
		
		do {
			System.out.println("Masukkan kecepatan maksimum [100 <= kecepatanMaksimum <= 250]: ");
			kecepatanMaksimum = sc.nextInt();
		} while (kecepatanMaksimum < 100 || kecepatanMaksimum > 250);
		topSpeed.add(kecepatanMaksimum);
		
		do {
			System.out.println("Masukkan kapasitas gas [3 <= kapasitasGas <= 60]: ");
			kapasitasGas = sc.nextInt();
		} while (kapasitasGas < 3 || kapasitasGas > 60);
		gasCap.add(kapasitasGas);
		
		do {
			System.out.println("Masukkan jumlah roda [4 <= jumlahRoda <= 6]: ");
			jumlahRoda = sc.nextInt();	
		} while (jumlahRoda < 4 || jumlahRoda > 6);
		wheel.add(jumlahRoda);
		
		if(tipe.toLowerCase().equals("mobil")) {
			do {
				System.out.println("Masukkan jumlah sistem entertainment [>= 1]: ");
				sistemEntertainment = sc.nextInt();
				sc.nextLine();
			} while (sistemEntertainment < 1);
			entertainmentSystem.add(sistemEntertainment);
			
			
			
		} else if (tipe.toLowerCase().equals("motor")) {
			do {
				System.out.println("Masukkan jumlah helm [>= 1]: ");
				jumlahHelm = sc.nextInt();
				sc.nextLine();	
			} while (jumlahHelm < 1);
			helmet.add(jumlahHelm);
				
		}
		
		listKendaraan.add(type);
		listKendaraan.add(brand);
		listKendaraan.add(name);
		listKendaraan.add(license);
		listKendaraan.add(topSpeed);
		listKendaraan.add(gasCap);
		listKendaraan.add(wheel);
		listKendaraan.add(entertainmentSystem);
		listKendaraan.add(helmet);
		
		
		System.out.println("Tekan ENTER untuk kembali");
		sc.nextLine();	
	}
	
	public static void menunjukkanList() {
		System.out.println("No. " + "Tipe" + "	" + "Nama");
		for(int i=0; i < listKendaraan.size(); i++) {
			System.out.println(i + ". " + listKendaraan.get(0).get(i) + "	" + listKendaraan.get(2).get(i));
		}
		
		int input;
		do {
			System.out.println("Pilihlah kendaraan untuk uji coba berkendara[Enter '0' untuk keluar]");
			input = sc.nextInt();
		} while(input != 0 || input > listKendaraan.size());
		
		for(int i = 0; i < listKendaraan.size(); i++) {
			System.out.println(listKendaraan.get(i).get(input - 1));
		}
		
		
	}
	
	 
	
	public Main() {
		System.out.println("PT Meksiko");
		System.out.println("1. Kendaraan Baru");
		System.out.println("2. Melihat List Kendaraan");
		System.out.println("3. Exit");
		System.out.println("Masukkan pilihan [1-3]: ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			memintaInput(sc);
			break;
		case 2:
			menunjukkanList();
			break;
		case 3:
			System.out.println("Terima kasih!");
			break;
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
