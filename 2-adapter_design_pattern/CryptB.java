public class CryptB implements Crypt
{
    @Override
    public void decrypt(String Text)
    {
        System.out.println(Text + " decrypted with crypter B");
    }
}
