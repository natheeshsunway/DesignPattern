//Handle unordered or different different arrangement of Constructor to create instance.
public class BuilderClassOuter {
    public static class Builder {
        private String arg1;
        private String arg2;
        private String arg3;
        private String arg4;

        public Builder() {

        }

        public BuilderClassOuter build() {
            return new BuilderClassOuter(this);
        }

        public Builder arg1(String arg1) {
            this.arg1 = arg1;
            /*RETURNING THIS FOR APPENDING UPCOMMING DATA LIKE builder.arg1("arg1").arg2("arg2")*/
            return this;
        }

        public Builder arg2(String arg2) {
            this.arg2 = arg2;
            return this;
        }

        public Builder arg3(String arg3) {
            this.arg3 = arg3;
            return this;
        }

        public Builder arg4(String arg4) {
            this.arg4 = arg4;
            return this;
        }
    }

    private final String arg1, arg2, arg3, arg4;

    private BuilderClassOuter(Builder builder) {
        this.arg1 = builder.arg1;
        this.arg2 = builder.arg2;
        this.arg3 = builder.arg3;
        this.arg4 = builder.arg4;
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
