package threesolid;
// interface Segregation principle, only Robot needs to be maintained.
interface IMaintainable{
	public void processMaintainWeekly();
  
  public void processMaintainMonthly();
  
  public void processMaintainYearly();
}
