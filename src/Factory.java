/*HIDING INTERNAL IMPLEMENTATION OF CONSTRUCTOR*/
public class Factory {
    public  static Website getWebsiteInstance(ClassType classType){
        switch (classType){
            case ShoppingWebsite:{
                return new Shop();
            }
            case BlogWebsite:{
                return new Blog();
            }
            default:{
                return null;
            }
        }
    }
}
