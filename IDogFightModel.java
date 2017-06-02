
public interface IDogFightModel {
	public IArea getArea();
	
	public void buildArea(Dimension:dimension);

	public void addMobile(IMobile:Mobile);
	
	public void removeMobile(Mobile:IMobile);
	
	public ArrayList<IMobile> getMobiles();
	
	public IMobile getMobileByPlayer(int player)
	
	public void setMobileHavesMoved();
	
}
