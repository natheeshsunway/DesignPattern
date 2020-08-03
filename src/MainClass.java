public class MainClass {
    public  static  void  main(String ...args)
    {
        System.out.println("Omm Nama Shivaya");

        System.out.println("-------------------------SINGLETON----------------------------");
        /*SINGLETON*/
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        if(singleton1==singleton2)
        {
            System.out.println("Singleton" + singleton1+"---"+singleton2);
        }

        System.out.println("--------------------------TELESCOPIC---------------------------");
        /*TELESCOPIC*/
        Telescoping telescoping=new Telescoping("arg1");
        System.out.println(telescoping.getArg1());
        telescoping=new Telescoping("agr1","arg2","arg3");
        System.out.println(telescoping.getArg1()+telescoping.getArg2()+telescoping.getArg3()+telescoping.getArg4());

        System.out.println("---------------------------BUILDER--------------------------");
        /*BUILDER*/
        BuilderClassOuter.Builder builder =new BuilderClassOuter.Builder();
        builder.arg1("arg1").arg2("arg2").arg3("arg3").arg4("arg4");
        BuilderClassOuter builderClassOuter= builder.build();
        System.out.println(builderClassOuter.getArg1());
        System.out.println(builderClassOuter.getArg2());
        System.out.println(builderClassOuter.getArg3());
        System.out.println(builderClassOuter.getArg4());

    }
}
