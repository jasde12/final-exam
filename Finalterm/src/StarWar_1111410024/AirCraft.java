package StarWar_1111410024;

public class AirCraft {
	private String manufacturer;
	private String Model;
	private double Length ;
	private double  AirSpeed;
	private String SpaceSpeed ;
	private String StdandardEngine;
	private String HyperSpaceEngine;
	private String[]  Weapon={ 
			"Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮", 
			"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮", 
			"Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"
			};
	private double[] Weapon_power={1000,1000,1000,1000,5,5};
	private int Passenger;
	private String[] Shield = {"防禦者型偏轉幕發射器","偏轉防盾投射器",
	 "鈦合金加勁外殼"
	};
	double[] ShieldPower = {2000,3000,1000};
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	public double[] getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double[] weapon_power) {
		Weapon_power = weapon_power;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}
	
}
