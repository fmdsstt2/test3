class Dog
{
  private String name;
  private int age;
  
  public Dog (String n,int a)
  {
   name = n;
   age =a;
   System.out.print("���̖��O��"+ name +"�ł��B");
   System.out.println("�N���"+ age +"�΂ł��B");
  }
  public Dog (String n)
  {
   name = n;
   System.out.print("���̖��O��"+name+"�ł��B");
   System.out.println("�N��͂킩��܂���ł����B");
  }
}

class Test3
{
  public static void main (String[] aegs)
  {
    
    Dog dog1 = new Dog("�V��",3);
    Dog dog2 = new Dog("�z���C�g");
    
  }
}
