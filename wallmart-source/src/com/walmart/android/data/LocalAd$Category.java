// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            LocalAd

public static class Item
{

    private String id;
    private Item items[];
    private String name;
    private int totalCount;

    public String getId()
    {
        return id;
    }

    public Item[] getItems()
    {
        return items;
    }

    public String getName()
    {
        return name;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setItems(Item aitem[])
    {
        items = aitem;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTotalCount(int i)
    {
        totalCount = i;
    }

    public Item()
    {
    }
}
