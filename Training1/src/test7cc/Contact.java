package test7cc;

public class Contact {

	 public String name,streetname,address,city,state,phoneNumber,email;

	public Contact(String name, String streetname, String add, String city, String state, String ph, String email)
	{
	 this.name=name;
	 this.streetname=streetname;
	 this.address=add;
	 this.city=city;
	 this.state=state;
	 this.phoneNumber=ph;
	 this.email=email;
	 }
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSname(String streetname)
	{
		this.streetname=streetname;
	}
	public String getSname()
	{
		return streetname;
	}
	public void setAdd(String add)
	{
		this.address=add;
	}
	public String getAdd()
	{
		return address;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	public void setPh(String ph)
	{
		this.phoneNumber=ph;
	}
	public String getPh()
	{
		return phoneNumber;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}



}
