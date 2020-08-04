public class Blog extends Website {
    @Override
    protected void createPages() {
        pages.add(new CommentPage());
        pages.add(new SearchPage());
    }
}
