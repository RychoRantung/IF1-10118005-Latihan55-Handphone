    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan55.handphone;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan data-data handphone
 */
public class Android extends Handphone {
    private String keyStore;

    public Android(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
   
    }
    

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
}
