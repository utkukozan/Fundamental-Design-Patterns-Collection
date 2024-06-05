public class Algorithm { //İletişime geçen sınıf
    private Crypter crypter;
    public Algorithm(Crypter crypter){
        this. crypter = crypter;
        crypter.crypto();
    }

}
