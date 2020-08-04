public class Shop extends Website{
    public Shop() {
    }

    @Override
    protected void createPages() {
        pages.add(new SearchPage());
        pages.add(new PricePage());
    }
}
