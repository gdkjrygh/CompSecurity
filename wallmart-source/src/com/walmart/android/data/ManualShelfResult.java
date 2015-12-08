// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class ManualShelfResult
{

    private String id;
    private StoreQueryResult.Item items[];
    private int totalCount;

    public ManualShelfResult()
    {
    }

    public String getId()
    {
        return id;
    }

    public StoreQueryResult.Item[] getItems()
    {
        return items;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setItems(StoreQueryResult.Item aitem[])
    {
        items = aitem;
    }

    public void setTotalCount(int i)
    {
        totalCount = i;
    }
}
