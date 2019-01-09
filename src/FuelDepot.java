import java.util.List;

public class FuelDepot
{
    private FuelDepot filler;
    private List<FuelTank> tanks;

    public int nextTankToFill(int threshold)
    {
        for(int i = 0;i<tanks.size();i++)
        {
            if(tanks.get(i).getFuelLevel() <= threshold);
            {
                return i;
            }
        }

        return filler.getCurrentIndex();
    }

    public void moveToLocation(int locIndex)
    {

    }
}
