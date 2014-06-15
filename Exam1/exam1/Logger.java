package exam1;

public class Logger {
    protected int level;
    public Logger(){
        this.level=3;
    }
    public Logger(int lvl)
    {
        this.level=lvl;
    }
    public void log(int lvl, String massage)
    {
        
        if(lvl<=this.level)
        {
            System.out.println(massage);
        }
        else System.out.println("not be logged");
    }
    public void log(String massage)
    {
        System.out.println(massage);
    }
 
}
