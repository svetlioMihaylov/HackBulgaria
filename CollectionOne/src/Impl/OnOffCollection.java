package Impl;

import java.util.ArrayList;

public class OnOffCollection extends ArrayList<Object>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
@Override
public boolean add(Object what)
{
    if(what==null)
        return false;
    else if (this.contains(what))
    {
        return this.remove(what);
    }
    else return super.add(what);
}
}
