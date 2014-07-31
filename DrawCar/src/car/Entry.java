package car;

public class Entry {
    private Integer col;
    private Character symbol;
    public Entry(Integer pCol,Character pSymb)
    {
        col=pCol;
        symbol=pSymb;
    }
    public void setCol(Integer pCol)
    {
        col=pCol;
    }
    public void setsymb(Character pSymb)
    {
        symbol=pSymb;
    }
    public Integer getCol()
    {
        return this.col;
    }
    public Character getSymbol()
    {
        return this.symbol;
    }
}
