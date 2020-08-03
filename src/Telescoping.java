public class Telescoping {
    private String arg1,arg2,arg3,arg4;
    public Telescoping(String arg1)
    {
        this.arg1=arg1;
    }
    public Telescoping(String arg1,String arg2){
        this(arg1);
        this.arg2=arg2;
    }
    public Telescoping(String arg1,String arg2,String arg3){
        this(arg1,arg2);
        this.arg3=arg3;
    }
    public Telescoping(String arg1,String arg2,String arg3,String arg4){
        this(arg1,arg2,arg3);
        this.arg4=arg4;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public String getArg4() {
        return arg4;
    }
}
