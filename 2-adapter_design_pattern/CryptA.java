public class CryptA implements Crypt
{
    @Override
    public void decrypt(String Text)
    {
        System.out.println(Text + " decrypted with crpyter A");
    }
}
