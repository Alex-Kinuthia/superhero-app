public class Hero {

  private String mName;
  private int mAge;
  private String mStrength;
  private String mWeakness;


  public Hero(String name, int age, String strength, String weakness){
    mName = name;
    mAge = age;
    mStrength = strength;
    mWeakness = weakness;
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getStrength() {
    return mStrength;
  }

  public String getWeakness() {
    return mWeakness;
  }
}
