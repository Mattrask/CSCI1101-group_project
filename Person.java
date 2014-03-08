public class Person
{
	private String name,profession;
	private int health,strength,defense;
	//private Item weapon;
	
	public Person(String name,String profession,int health,int strength,int defense/*,Item weapon*/)
	{
		this.name=name;
		this.profession=profession;
		this.health=health;
		this.strength=strength;
		this.defense=defense;
		/*this.weapon=new Item(weapon.getName() etc...*/
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int health)
	{
		this.health=health;
	}
	
	public int getStrength()
	{
		return strength;
	}
	
	public void setStrength(int strength)
	{
		this.strength=strength;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public void setDefense(int defense)
	{
		this.defense=defense;
	}
	
	/*
	public Item getWeapon()
	{
		return weapon;
	}
	 
	public void setWeapon(Item weapon)
	{
		this.weapon=weapon;
	}
	*/
	
	public String getProfession()
	{
		return profession;
	}
	
	public void setProfession(String profession)
	{
		this.profession=profession;
	}
	
	public void takeDamage(int damage)
	{
		health-=damage;
	}
	
	/*
	public double dealDamage(int damage)
	{
		return weapon.getWeight()+(.1*strength)...whatever damage formula ends up being
	}
	*/
	
	public String toString()
	{
		return "\nStatus:\nHealth:\t"+health+"\nStrength:\t"+strength
				+"\nDefense:\t"+defense+"\nWeapon name:\t"+/*weapon.getName()+*/
					"\nWeapon strength:\t"/*+weapon.getStrength()*/;
	}
}
