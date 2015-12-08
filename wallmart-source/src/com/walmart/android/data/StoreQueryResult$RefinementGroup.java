// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            StoreQueryResult

public static class 
{

    private String browseToken;
    private boolean isDepartment;
    private String name;
    private totalCount refinements[];
    private int totalCount;

    public String getBrowseToken()
    {
        return browseToken;
    }

    public String getName()
    {
        return name;
    }

    public name[] getRefinements()
    {
        return refinements;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public boolean isDepartment()
    {
        return isDepartment;
    }

    public void setBrowseToken(String s)
    {
        browseToken = s;
    }

    public void setIsDepartment(boolean flag)
    {
        isDepartment = flag;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setRefinements(name aname[])
    {
        refinements = aname;
    }

    public void setTotalCount(int i)
    {
        totalCount = i;
    }


    public ()
    {
    }
}
