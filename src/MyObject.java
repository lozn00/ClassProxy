public class MyObject
{
    private String name;

    public MyObject(String name)
    {
        this.name = name;
    }
    public String getMsg()
    {
        return String.format("%slove you.", name);
    }
}
