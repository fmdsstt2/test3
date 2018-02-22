class Dog
{
  private String name;
  private int age;
  
  public Dog (String n,int a)
  {
   name = n;
   age =a;
   System.out.print("犬の名前は"+ name +"です。");
   System.out.println("年齢は"+ age +"歳です。");
  }
  public Dog (String n)
  {
   name = n;
   System.out.print("犬の名前は"+name+"です。");
   System.out.println("年齢はわかりませんでした。");
  }
}

class Test3
{
  public static void main (String[] aegs)
  {
    
    Dog dog1 = new Dog("シロ",3);
    Dog dog2 = new Dog("ホワイト");
    
  }
}
