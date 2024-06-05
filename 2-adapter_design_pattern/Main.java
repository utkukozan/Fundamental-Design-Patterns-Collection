public class Main {
    public static void main(String[] args) {
        // This design pattern allows an existing interface to be used by another object.
        
        // Create instances of CryptA and CryptB
        Crypt cryptA = new CryptA();
        Crypt cryptB = new CryptB();
        
        // Decrypt using CryptA
        cryptA.decrypt("Utku");
        
        // Decrypt using CryptB
        cryptB.decrypt("Hasan");
        
        // Create an instance of BlowFish
        BlowFish blowFish = new BlowFish();
        
        // Create an adapter for BlowFish and use it to decrypt
        Crypt analyzeBlow = new BlowFishAdapter(blowFish);
        analyzeBlow.decrypt("Ali");
    }
}
