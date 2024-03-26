package bookpack;

public class Book
{
    private String title;
    private String author;
    private int pudDate;

    public Book(String t, String a, int d)
    {
        title = t;
        author = a;
        pudDate = d;
    }
    public void show()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pudDate);
        System.out.println();
    }
}
