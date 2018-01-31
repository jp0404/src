package day;

public class Cat {
    private String name;
    private int age;
    private String sex;
    private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
   public void move(){
      System.out.println(name+"正在走猫步");	   
   }

  public int add(int a){
	  return a;
  }
  public int add(int a,int b){
	 
	return a+b;
	 
  }
 public float add(float a,float b){
       return a+b;
       }
  }
