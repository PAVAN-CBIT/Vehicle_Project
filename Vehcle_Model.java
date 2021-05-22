import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) 
	{
	
      ArrayList<Vehicle>Vehicles=new ArrayList<Vehicle>() ;
      Vehicle.add(new Vehicle("honda","acccord",12000,false));
      for(Vehicle car:Vehicles)
      {
          System.out.println(car.getMake() );
      }
				                                

		
	}
}

public class Vehicle
{
    
    String Make;
    String Model;
    int Price;
    Boolean FourWDrive;
    Public String getMake()
    {
        return Make;
    }
    Public void  setMake(String Make)
    {
        this.Make=Make;
    }
    Public String getModel()
    {
        return Make;
    }
    Public void  setMake(String Model)
    {
        this.Model=Model;
    }
    Public int  getPrice()
    {
        return Price;
    }
    Public void  setMake(int Price)
    {
        this.Price=Price;
    }
    Public Boolean is FourWDrive()
    {
        return FourWDrive;
    }
    Public void  setFourWDrive(Boolean FourWDrive)
    {
        this.FourWDrive=FourWDrive;
    }
    
    
}
