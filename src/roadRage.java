public class roadRage
{
    private int rageCount;

    public int getRageCount()
    {
        return rageCount;
    }

    public void setPathGen(int newRageCount)
    {
        rageCount = newRageCount;
    }

    public roadRage()
    {
        this.rageCount = rageCount;
    }

    public int rageMeter()
    {
        rageCount = rageCount++;
        return rageCount;
    }

    public String checkRage()
    {
        return "The road-rage level is currently: " + rageCount;
    }

}
