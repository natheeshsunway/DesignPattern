import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List <Page> pages =new ArrayList<Page>();
    public Website(){
        createPages();
    }

    public List<Page> getPages() {
        return pages;
    }

    protected abstract void createPages();
}
