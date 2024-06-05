public class BlowFishAdapter implements Crypt
{
    BlowFish blowFish = new BlowFish();
    BlowFishAdapter(BlowFish blowFish){
        this.blowFish = blowFish;
    }

    @Override
    public void decrypt(String Text)
    {
        blowFish.BlowFishAnalyzer(Text);
    }
}
