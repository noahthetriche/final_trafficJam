public class pathGen
{
    public int pathGen;

    public int getPathGen()
    {
        return pathGen;
    }

    public void setPathGen(int newPathGen)
    {
        pathGen = newPathGen;
    }

    //
    public pathGen(int pathGen)
    {
        this.pathGen = pathGen;
    }

    //method to randomize pathways/road situations
    public int generatePaths()
    {
        int x = 3; //when using random numbers like this, always use a higher number than your intended max
        double y = Math.random();
        int z =  (int) (x * y);

        pathGen = z;
        return pathGen;
    }
}
