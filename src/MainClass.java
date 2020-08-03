public class MainClass {
    public  static  void  main(String ...args)
    {
        System.out.println("Omm Nama Shivaya");
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        if(singleton1==singleton2)
        {
            System.out.println("Singleton" + singleton1+"---"+singleton2);
        }
    }
}
